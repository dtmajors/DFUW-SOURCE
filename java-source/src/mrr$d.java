import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class mrr$d extends MouseMotionAdapter {
   private mrr$d(mrr var1) {
      this.EmC = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      if (mrr.h(this.EmC)) {
         mrr.a(this.EmC, var1.getPoint());
         mrr.q(this.EmC).repaint();
      }
   }
}
