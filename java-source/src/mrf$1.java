import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mrf$1 extends MouseAdapter {
   mrf$1(mrf var1) {
      this.EiE = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() == 1 && var1.getClickCount() == 2) {
         mrf.a(this.EiE);
      }
   }
}
