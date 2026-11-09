/*
 * Decompiled with CFR.
 */
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DragSourceListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

public class mxz
extends mye {
    private static b ETY = null;

    @Override
    public void exportAsDrag(JComponent jComponent, InputEvent inputEvent, int n2) {
        int n3 = this.getSourceActions(jComponent);
        int n4 = n3 & n2;
        if (!(inputEvent instanceof MouseEvent)) {
            n4 = 0;
        }
        if (n4 != 0) {
            if (ETY == null) {
                ETY = new b(new a(null));
            }
            ETY.a(jComponent, (MouseEvent)inputEvent, n3, n4);
        } else {
            this.exportDone(jComponent, null, 0);
        }
    }

    @Override
    protected Transferable createTransferable(JComponent jComponent) {
        lfn.b(5, "SFFileChooserTranseferable", "GOING FOR GOLD");
        myh myh2 = null;
        if (jComponent instanceof mxt) {
            mxt mxt2 = (mxt)((Object)jComponent);
            try {
                dqn dqn2 = mxt2.eIU();
                myh2 = new mym(dqn2);
                DragSourceListener dragSourceListener = mxt2.eIS();
                if (dragSourceListener == null) {
                    lfn.b(5, "SFFileChooserTranseferable", "DragList or Transferable is null!");
                }
            }
            catch (Exception exception) {
                lfn.b(5, "SFFileChooserTranseferable", "Exception! " + exception);
            }
        } else if (jComponent instanceof mxr) {
            mxr mxr2 = (mxr)((Object)jComponent);
            try {
                btk btk2 = mxr2.eIT();
                myh2 = new myi(btk2);
                DragSourceListener dragSourceListener = mxr2.eIS();
                if (dragSourceListener == null) {
                    lfn.b(5, "SFFileChooserTranseferable", "DragList or Transferable is null!");
                }
            }
            catch (Exception exception) {
                lfn.b(5, "SFFileChooserTranseferable", "Exception! " + exception);
            }
        } else {
            lfn.b(5, "SFFileChooserTranseferable", "Source does not implement SFObjectDragSource!");
        }
        return myh2;
    }
}

