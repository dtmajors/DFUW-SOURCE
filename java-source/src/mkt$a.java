import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mkt$a extends KeyAdapter {
   private mkt$a(mkt var1) {
      this.DFN = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
      this.DFN.DDT = true;
   }
}
