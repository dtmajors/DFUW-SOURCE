import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JOptionPane;

class mtr$21 extends FocusAdapter {
   mtr$21(mtr var1) {
      this.ECh = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      if (mtr.c(this.ECh) != null) {
         try {
            String var2 = mtr.h(this.ECh).getText();
            float var3 = Float.parseFloat(var2);
            int var4 = (int)(var3 * 10.0F);
            if (var4 > mtr.g(this.ECh).getMaximum()) {
               var4 = mtr.g(this.ECh).getMaximum();
               mtr.h(this.ECh).setText(String.valueOf(var4 / 10.0F));
            } else if (var4 < mtr.g(this.ECh).getMinimum()) {
               var4 = mtr.g(this.ECh).getMinimum();
               mtr.h(this.ECh).setText(String.valueOf(var4 / 10.0F));
            }

            mtr.g(this.ECh).setValue(var4);
         } catch (Exception var5) {
         }
      } else {
         JOptionPane.showInternalMessageDialog(mtr.d(this.ECh), "Select A Missile Info Item First");
      }
   }
}
