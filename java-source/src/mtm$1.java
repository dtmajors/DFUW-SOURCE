import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mtm$1 extends MouseAdapter {
   mtm$1(mtm var1) {
      this.Ezt = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() == 1) {
         mtm.a(this.Ezt);
         mtm.b(this.Ezt);
      }
   }
}
