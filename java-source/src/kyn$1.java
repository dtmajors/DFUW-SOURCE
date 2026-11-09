import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class kyn$1 extends WindowAdapter {
   kyn$1(kyn var1) {
      this.qmb = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      kyn.a(this.qmb, null);
   }
}
