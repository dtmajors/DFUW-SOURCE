import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JSlider;

class mtu$14 extends KeyAdapter {
   mtu$14(mtu var1, JSlider var2, JLabel var3, String var4) {
      this.EDB = var1;
      this.EDI = var2;
      this.EDJ = var3;
      this.EDE = var4;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      if (var1.getKeyCode() == 37 || var1.getKeyCode() == 39) {
         float var2 = this.EDI.getValue() / 10.0F;
         this.EDJ.setText(String.valueOf(var2));
         cur var3 = (cur)mtu.d(this.EDB).get(this.EDE);
         var3.bFz = var2;
         mtu.a(this.EDB, this.EDI, var2);
      }
   }
}
