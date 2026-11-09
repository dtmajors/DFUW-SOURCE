import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mtu$10 extends KeyAdapter {
   mtu$10(mtu var1) {
      this.EDB = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      int var2 = var1.getKeyCode();
      if (var2 == 10) {
         mtu.c(this.EDB);
      }
   }
}
