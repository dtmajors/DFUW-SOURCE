import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class e$1 extends WindowAdapter {
   e$1(e var1) {
      this.bT = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      e.a(this.bT, var1);
   }
}
