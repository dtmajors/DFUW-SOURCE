/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 */
import java.awt.Component;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSourceListener;

public class mxp
implements DragGestureListener {
    private lfn ga = lfn.eqw();

    @Override
    public void dragGestureRecognized(DragGestureEvent dragGestureEvent) {
        Component component = dragGestureEvent.getComponent();
        if (component instanceof mxt) {
            mxt mxt2 = (mxt)((Object)component);
            try {
                dqn dqn2 = mxt2.eIU();
                mym mym2 = new mym(dqn2);
                DragSourceListener dragSourceListener = mxt2.eIS();
                if (dragSourceListener == null) {
                    lfn.b(0, this.getClass().getName(), "SFDragGestureListener: DragList or Transferable is null!");
                }
                dragGestureEvent.startDrag(null, mym2, dragSourceListener);
            }
            catch (Exception exception) {
                lfn.b(0, this.getClass().getName(), "SFDragGestureListener: Exception! " + exception);
            }
        } else if (component instanceof mxr) {
            mxr mxr2 = (mxr)((Object)component);
            try {
                btk btk2 = mxr2.eIT();
                myi myi2 = new myi(btk2);
                DragSourceListener dragSourceListener = mxr2.eIS();
                if (dragSourceListener == null) {
                    lfn.b(0, this.getClass().getName(), "SFDragGestureListener: DragList or Transferable is null!");
                }
                dragGestureEvent.startDrag(null, myi2, dragSourceListener);
            }
            catch (Exception exception) {
                lfn.b(0, this.getClass().getName(), "SFDragGestureListener: Exception! " + exception);
            }
        } else if (component instanceof mxs) {
            mxs mxs2 = (mxs)((Object)component);
            try {
                dta dta2 = mxs2.eIV();
                myl myl2 = new myl(dta2);
                DragSourceListener dragSourceListener = mxs2.eIS();
                if (dragSourceListener == null) {
                    lfn.b(0, this.getClass().getName(), "SFDragGestureListener: DragList or Transferable is null!");
                }
                dragGestureEvent.startDrag(null, myl2, dragSourceListener);
            }
            catch (Exception exception) {
                lfn.b(0, this.getClass().getName(), "SFDragGestureListener: Exception! " + exception);
            }
        } else {
            lfn.print("SFDragGestureListener: Error: Source does not implement SFObjectDragSource!");
        }
    }
}

