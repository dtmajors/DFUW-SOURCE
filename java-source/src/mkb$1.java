import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class mkb$1 implements KeyListener {
   mkb$1(mkb var1) {
      this.DEO = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 127) {
         jrw[] var2 = this.DEO.eDe();
         int var3 = 0;

         for (jrw var7 : var2) {
            if (var7.getName().toLowerCase().endsWith(".xlk")) {
               var7.delete();
               var3++;
            }
         }

         if (var3 > 0) {
            this.DEO.updateUI();
         }
      }
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }
}
