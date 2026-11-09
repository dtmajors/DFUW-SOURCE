import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class kyr$1 extends WindowAdapter {
   kyr$1(kyr var1) {
      this.qmL = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      if (kyr.a(this.qmL) != null) {
         kyr.a(this.qmL).xR(false);
      }

      kyr.a(this.qmL, kyr.b(this.qmL).isEnabled());
      kyr.c(this.qmL);
      kyr.d(this.qmL).eiW();
      System.exit(0);
   }
}
