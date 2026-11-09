import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mku$2 extends KeyAdapter {
   mku$2(mku var1) {
      this.DFT = var1;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      if (var1.getKeyCode() == 10 && this.DFT.DFQ != null) {
         this.DFT.DFQ.actionPerformed(null);
      }
   }
}
