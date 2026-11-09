import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class aux$d extends WindowAdapter {
   aux$d(aux var1) {
      this.DDk = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      aux.k(this.DDk);
   }
}
