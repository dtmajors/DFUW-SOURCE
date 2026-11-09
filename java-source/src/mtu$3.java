import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JSlider;

class mtu$3 extends MouseAdapter {
   mtu$3(mtu var1, JSlider var2, JLabel var3, String var4) {
      this.EDB = var1;
      this.EDF = var2;
      this.EDG = var3;
      this.EDE = var4;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      if (var1.getClickCount() == 1 && var1.getButton() == 1) {
         float var2 = this.EDF.getValue();
         this.EDG.setText(String.valueOf(var2));
         cur var3 = (cur)mtu.d(this.EDB).get(this.EDE);
         var3.fyc = var2;
         mtu.c(this.EDB, this.EDF, var2);
      }
   }
}
