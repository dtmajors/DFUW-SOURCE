import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class mrq$c extends MouseMotionAdapter {
   private mrq$c(mrq var1) {
      this.ElR = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      mrq.a(this.ElR, var1.getPoint());
      this.ElR.repaint();
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      mrq.a(this.ElR, var1.getPoint());
      if (!mrq.a(this.ElR)) {
         if ((var1.getModifiers() & 16) != 0) {
            mrq.a(this.ElR, var1.getPoint(), true);
         } else if ((var1.getModifiers() & 4) != 0) {
            mrq.a(this.ElR, var1.getPoint(), false);
         }

         this.ElR.repaint();
      }
   }
}
