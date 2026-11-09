import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class msc$8 extends KeyAdapter {
   msc$8(msc var1) {
      this.EpP = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      msc.a(this.EpP, var1);
   }
}
