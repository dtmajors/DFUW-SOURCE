import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mvd$3 extends MouseAdapter {
   mvd$3(mvd var1) {
      this.EJO = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      mvd.a(this.EJO, var1.getPoint());
   }
}
