import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mtn$6 extends KeyAdapter {
   mtn$6(mtn var1, ff var2) {
      this.EzC = var1;
      this.EzH = var2;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      if (var1.getKeyCode() == 10) {
         this.EzH.av(mtn.f(this.EzC).eCU());
      }
   }
}
