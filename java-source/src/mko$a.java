import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mko$a extends KeyAdapter {
   private mko$a(mko var1) {
      this.DFy = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
      System.out.println("SFLabelAndText: CHANGED!");
      mko.a(this.DFy, true);
   }
}
