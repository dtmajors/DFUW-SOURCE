import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class kzx$1 extends WindowAdapter {
   kzx$1(kzx var1) {
      this.qqg = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      this.qqg.ekp();
      this.qqg.a(kzx.a(this.qqg));
      System.exit(0);
   }
}
