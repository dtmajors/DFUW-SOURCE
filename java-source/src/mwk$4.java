import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mwk$4 extends MouseAdapter {
   mwk$4(mwk var1) {
      this.EPI = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getButton() == 1 && var1.getClickCount() == 1) {
         mwk.d(this.EPI);
      }
   }
}
