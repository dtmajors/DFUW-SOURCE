import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JSlider;

class mtu$4 extends KeyAdapter {
   mtu$4(mtu var1, JSlider var2, JLabel var3, String var4) {
      this.EDB = var1;
      this.EDF = var2;
      this.EDG = var3;
      this.EDE = var4;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      if (var1.getKeyCode() == 37 || var1.getKeyCode() == 39) {
         float var2 = this.EDF.getValue();
         this.EDG.setText(String.valueOf(var2));
         cur var3 = (cur)mtu.d(this.EDB).get(this.EDE);
         var3.fyc = var2;
         mtu.c(this.EDB, this.EDF, var2);
      }
   }
}
