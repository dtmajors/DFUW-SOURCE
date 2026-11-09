import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mtt$12 extends KeyAdapter {
   mtt$12(mtt var1) {
      this.EDj = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 40 || var1.getKeyCode() == 38) {
         mtt.a(this.EDj);
         mtt.b(this.EDj);
      }
   }
}
