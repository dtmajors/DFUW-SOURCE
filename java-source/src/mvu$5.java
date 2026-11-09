import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mvu$5 implements ActionListener {
   mvu$5(mvu var1) {
      this.EMm = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = mvu.i(this.EMm).getText();

      try {
         float var3 = Float.valueOf(var2.trim()) / 8.0F;
         int var7 = (int)(var3 * mvu.d(this.EMm).getMaximum() + 0.5F);
         if (var7 < 0) {
            var7 = 0;
         }

         if (var7 > mvu.d(this.EMm).getMaximum()) {
            var7 = mvu.d(this.EMm).getMaximum();
         }

         mvu.d(this.EMm).setValue(var7);
         float var5 = 8.0F * ((float)var7 / mvu.d(this.EMm).getMaximum());
         mvu.b(this.EMm, var5);
         mvu.i(this.EMm).setText("" + 8.0F * ((float)var7 / mvu.d(this.EMm).getMaximum()));
      } catch (NumberFormatException var6) {
         float var4 = 8.0F * mvu.d(this.EMm).getValue() / mvu.d(this.EMm).getMaximum();
         mvu.i(this.EMm).setText("" + var4);
      }
   }
}
