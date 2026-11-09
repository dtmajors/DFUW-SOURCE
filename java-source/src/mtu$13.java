import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JSlider;

class mtu$13 extends MouseAdapter {
   mtu$13(mtu var1, JSlider var2, JLabel var3, String var4) {
      this.EDB = var1;
      this.EDI = var2;
      this.EDJ = var3;
      this.EDE = var4;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      float var2 = this.EDI.getValue() / 10.0F;
      this.EDJ.setText(String.valueOf(var2));
      cur var3 = (cur)mtu.d(this.EDB).get(this.EDE);
      var3.bFz = var2;
      mtu.a(this.EDB, this.EDI, var2);
   }
}
