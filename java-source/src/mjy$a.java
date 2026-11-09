import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mjy$a extends KeyAdapter {
   private mjy$a(mjy var1) {
      this.DEq = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
      mjy.a(this.DEq, true);
   }
}
