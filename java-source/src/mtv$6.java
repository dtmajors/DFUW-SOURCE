import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class mtv$6 extends KeyAdapter {
   mtv$6(mtv var1) {
      this.EEq = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      if (var1.getKeyCode() == 10) {
         mtv.a(this.EEq, mtv.b(this.EEq), mtv.b(this.EEq).eIv(), mtv.b(this.EEq).eDc().getName());
      }
   }
}
