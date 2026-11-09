import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragGestureRecognizer;
import java.awt.dnd.DragSource;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

class mxz$b extends DragGestureRecognizer {
   mxz$b(DragGestureListener var1) {
      super(DragSource.getDefaultDragSource(), null, 0, var1);
   }

   void a(JComponent var1, MouseEvent var2, int var3, int var4) {
      this.setComponent(var1);
      this.setSourceActions(var3);
      this.appendEvent(var2);
      this.fireDragGestureRecognized(var4, var2.getPoint());
   }

   @Override
   protected void registerListeners() {
   }

   @Override
   protected void unregisterListeners() {
   }
}
