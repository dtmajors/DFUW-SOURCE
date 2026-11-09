import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class msc$2 extends KeyAdapter {
   msc$2(msc var1) {
      this.EpP = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      msc.b(this.EpP, var1);
   }
}
