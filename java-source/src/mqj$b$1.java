import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class mqj$b$1 implements MouseMotionListener {
   mqj$b$1(mqj$b var1, mqj var2) {
      this.Edu = var1;
      this.Edt = var2;
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      int var2 = (int)var1.getPoint().getX();
      if (var2 < 0) {
         var2 = 0;
      }

      if (var2 > this.Edu.getWidth() - 1) {
         var2 = this.Edu.getWidth() - 1;
      }

      if (mqj$b.a(this.Edu)) {
         mqj.a(this.Edu.Edp, var2);
      } else if (mqj$b.b(this.Edu)) {
         mqj.b(this.Edu.Edp, var2);
      }

      if (mqj$b.a(this.Edu) || mqj$b.b(this.Edu)) {
         this.Edu.repaint();
      }
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
   }
}
