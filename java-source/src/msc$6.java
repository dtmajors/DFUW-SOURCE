import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class msc$6 extends KeyAdapter {
   msc$6(msc var1) {
      this.EpP = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      msc.d(this.EpP, var1);
   }
}
