import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mqj$b$2 extends MouseAdapter {
   mqj$b$2(mqj$b var1, mqj var2) {
      this.Edu = var1;
      this.Edt = var2;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int var2 = (int)var1.getPoint().getX();
      if (Math.abs(mqj.f(this.Edu.Edp) - var2) <= 3) {
         mqj$b.a(this.Edu, true);
      } else if (Math.abs(mqj.g(this.Edu.Edp) - var2) <= 3) {
         mqj$b.b(this.Edu, true);
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      mqj$b.a(this.Edu, mqj$b.b(this.Edu, false));
   }
}
