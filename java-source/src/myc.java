/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 */
import java.awt.Component;
import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DropTargetContext;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.util.List;

public class myc
implements DropTargetListener {
    @Override
    public void dragEnter(DropTargetDragEvent dropTargetDragEvent) {
    }

    @Override
    public void dragOver(DropTargetDragEvent dropTargetDragEvent) {
    }

    @Override
    public void dragExit(DropTargetEvent dropTargetEvent) {
    }

    @Override
    public void dropActionChanged(DropTargetDragEvent dropTargetDragEvent) {
        lfn.print("SFObjectDropListener: dropActionChanged");
        if (!this.a(dropTargetDragEvent)) {
            dropTargetDragEvent.rejectDrag();
            return;
        }
    }

    @Override
    public void drop(DropTargetDropEvent dropTargetDropEvent) {
        lfn.b(0, this.getClass().getName(), "Drop incoming.");
        if (!this.a(dropTargetDropEvent)) {
            dropTargetDropEvent.rejectDrop();
            return;
        }
        DropTargetContext dropTargetContext = dropTargetDropEvent.getDropTargetContext();
        Component component = dropTargetContext.getComponent();
        if (dropTargetDropEvent.getSource().equals(component)) {
            dropTargetDropEvent.rejectDrop();
            lfn.print("SFObjectDropListener: Drop not accepted. Same component!");
            return;
        }
        lfn.b(0, this.getClass().getName(), "drop() : Source = " + dropTargetDropEvent.getSource() + ", Target=" + component);
        dropTargetDropEvent.acceptDrop(1);
        Transferable transferable = dropTargetDropEvent.getTransferable();
        DataFlavor[] dataFlavorArray = transferable.getTransferDataFlavors();
        for (int i = 0; i < dataFlavorArray.length; ++i) {
            DataFlavor dataFlavor = dataFlavorArray[i];
            try {
                Object object;
                Object object2;
                if (dataFlavor.getHumanPresentableName().equals(myh.EUa.getHumanPresentableName())) {
                    object2 = transferable.getTransferData(dataFlavor);
                    object = dropTargetDropEvent.getLocation();
                    if (component instanceof mxv) {
                        this.a((mxv)((Object)component), (btk)object2, ((Point)object).getX(), ((Point)object).getY());
                    } else {
                        lfn.b(4, this.getClass().getName(), "Wrong type of (WorldObject) Drop Target! [" + component + "}");
                    }
                    dropTargetDropEvent.dropComplete(true);
                    break;
                }
                if (dataFlavor.getHumanPresentableName().equals(myh.EUe.getHumanPresentableName())) {
                    lfn.b(0, this.getClass().getName(), "(ObjectSpace)Drop accepted. For DataType [" + dataFlavor.getHumanPresentableName() + "]");
                    object2 = transferable.getTransferData(dataFlavor);
                    object = dropTargetDropEvent.getLocation();
                    lfn.print("SFObjectDropListener: The drop object is: " + object2 + ", at point: " + ((Point)object).getX() + " , " + ((Point)object).getY());
                    if (component instanceof mxx) {
                        this.a((mxx)((Object)component), (dta)object2, ((Point)object).getX(), ((Point)object).getY());
                    } else {
                        lfn.b(4, this.getClass().getName(), "Wrong type of (ObjectSpace) Drop Target for [" + myh.EUe + "]");
                    }
                    dropTargetDropEvent.dropComplete(true);
                    break;
                }
                if (dataFlavor.getHumanPresentableName().equals(myh.EUb.getHumanPresentableName())) {
                    lfn.b(0, this.getClass().getName(), "(LogicObject)Drop accepted. For DataType [" + dataFlavor.getHumanPresentableName() + "]");
                    object2 = transferable.getTransferData(dataFlavor);
                    object = dropTargetDropEvent.getLocation();
                    lfn.print("SFObjectDropListener: The drop object is: " + object2 + ", at point: " + ((Point)object).getX() + " , " + ((Point)object).getY());
                    if (component instanceof mxv) {
                        this.a((mxv)((Object)component), (btk)object2, ((Point)object).getX(), ((Point)object).getY());
                    } else {
                        lfn.b(4, this.getClass().getName(), "Wrong type of (LogicObject) Drop Target for  [" + myh.EUb + "]");
                    }
                    dropTargetDropEvent.dropComplete(true);
                    break;
                }
                if (dataFlavor.getHumanPresentableName().equals(myh.EUd.getHumanPresentableName())) {
                    lfn.b(0, this.getClass().getName(), "(Object Array)Drop accepted. For DataType [" + dataFlavor.getHumanPresentableName() + "]");
                    object2 = transferable.getTransferData(dataFlavor);
                    object = dropTargetDropEvent.getLocation();
                    lfn.print("SFObjectDropListener: The drop object is: " + object2 + ", at point: " + ((Point)object).getX() + " , " + ((Point)object).getY());
                    if (component instanceof mxw) {
                        this.a((mxw)((Object)component), (amf[])object2, ((Point)object).getX(), ((Point)object).getY());
                    } else {
                        lfn.b(4, this.getClass().getName(), "Wrong type of Drop Target for FLAVOR_OBJECT_ARRAY. DropTarget is: " + component);
                    }
                    dropTargetDropEvent.dropComplete(true);
                    break;
                }
                if (dataFlavor.equals(DataFlavor.stringFlavor)) {
                    object2 = dropTargetDropEvent.getLocation();
                    if (component instanceof mxy) {
                        lfn.b(0, this.getClass().getName(), "(String) Drop accepted. For DataType [" + dataFlavor.getHumanPresentableName() + "]");
                        this.a((mxy)((Object)component), (String)transferable.getTransferData(dataFlavor), ((Point)object2).getX(), ((Point)object2).getY());
                    } else {
                        lfn.b(4, this.getClass().getName(), "Wrong type of (String) Drop Target! [" + component.getClass().getName() + "}");
                    }
                    dropTargetDropEvent.dropComplete(true);
                    break;
                }
                if (dataFlavor.equals(DataFlavor.javaFileListFlavor)) {
                    object2 = (List)transferable.getTransferData(DataFlavor.javaFileListFlavor);
                    object = transferable.getTransferData(dataFlavor);
                    Point point = dropTargetDropEvent.getLocation();
                    if (component instanceof mxu) {
                        lfn.b(0, this.getClass().getName(), "drop() : TransData = " + object.getClass().getName());
                        lfn.b(0, this.getClass().getName(), "drop() : Comp = " + component.getClass().getName());
                        this.a((mxu)((Object)component), (List)object, point.getX(), point.getY());
                        dropTargetDropEvent.dropComplete(true);
                        break;
                    }
                    lfn.b(4, this.getClass().getName(), "Wrong type of (FileList) Drop Target! [" + component + "}");
                    continue;
                }
                lfn.b(4, this.getClass().getName(), "No correct DropFlavor for (" + dataFlavor.getHumanPresentableName() + ") Recognized!");
                continue;
            }
            catch (Exception exception) {
                lfn.print("SFObjectDropListener: Exception.: " + exception);
                exception.printStackTrace();
            }
        }
    }

    public void a(mxy mxy2, String string, double d2, double d3) {
        mxy2.a(string, d2, d3);
    }

    public void a(mxx mxx2, dta dta2, double d2, double d3) {
        mxx2.a(dta2, d2, d3);
    }

    public void a(mxu mxu2, List list, double d2, double d3) {
        mxu2.a(list, d2, d3);
    }

    public void a(mxv mxv2, btk btk2, double d2, double d3) {
        mxv2.a(btk2, d2, d3);
    }

    public void a(mxw mxw2, amf[] amfArray, double d2, double d3) {
        mxw2.a(amfArray, d2, d3);
    }

    public boolean a(DropTargetDragEvent dropTargetDragEvent) {
        return (dropTargetDragEvent.getDropAction() & 3) != 0;
    }

    public boolean a(DropTargetDropEvent dropTargetDropEvent) {
        return (dropTargetDropEvent.getDropAction() & 3) != 0;
    }
}

