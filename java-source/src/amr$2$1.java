import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class amr$2$1 extends WindowAdapter {
   amr$2$1(amr$2 var1) {
      this.bAD = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      System.exit(0);
   }
}
