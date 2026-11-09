import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class msc$4 extends KeyAdapter {
   msc$4(msc var1) {
      this.EpP = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      msc.c(this.EpP, var1);
   }
}
