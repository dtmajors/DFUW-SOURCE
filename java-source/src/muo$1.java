import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

class muo$1 implements KeyListener {
   muo$1(muo var1, JTextField var2) {
      this.EHi = var1;
      this.EHh = var2;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      String var2 = this.EHh.getText();
      this.EHi.a(var2, this.EHh);
   }

   @Override
   public void keyPressed(KeyEvent var1) {
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }
}
