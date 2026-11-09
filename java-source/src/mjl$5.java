import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

class mjl$5 implements MenuListener {
   mjl$5(mjl var1) {
      this.DCP = var1;
   }

   @Override
   public void menuCanceled(MenuEvent var1) {
   }

   @Override
   public void menuDeselected(MenuEvent var1) {
      this.DCP.removeAll();
   }

   @Override
   public void menuSelected(MenuEvent var1) {
      mjl.b(this.DCP);
   }
}
