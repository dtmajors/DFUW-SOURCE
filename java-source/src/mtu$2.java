import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JSlider;

class mtu$2 extends KeyAdapter {
   mtu$2(mtu var1, JSlider var2, JLabel var3, String var4) {
      this.EDB = var1;
      this.EDC = var2;
      this.EDD = var3;
      this.EDE = var4;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      if (var1.getKeyCode() == 37 || var1.getKeyCode() == 39) {
         float var2 = this.EDC.getValue();
         this.EDD.setText(String.valueOf(var2));
         cur var3 = (cur)mtu.d(this.EDB).get(this.EDE);
         var3.fyb = var2;
         mtu.b(this.EDB, this.EDC, var2);
      }
   }
}
