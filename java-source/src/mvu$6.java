import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mvu$6 implements ActionListener {
   mvu$6(mvu var1) {
      this.EMm = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = mvu.j(this.EMm).getText();

      try {
         float var3 = Float.valueOf(var2.trim()) / 8.0F;
         int var7 = (int)(var3 * mvu.f(this.EMm).getMaximum() + 0.5F);
         if (var7 < 0) {
            var7 = 0;
         }

         if (var7 > mvu.f(this.EMm).getMaximum()) {
            var7 = mvu.f(this.EMm).getMaximum();
         }

         mvu.f(this.EMm).setValue(var7);
         float var5 = 8.0F * ((float)var7 / mvu.f(this.EMm).getMaximum());
         mvu.c(this.EMm, var5);
         mvu.j(this.EMm).setText("" + var5);
      } catch (NumberFormatException var6) {
         float var4 = 8.0F * mvu.f(this.EMm).getValue() / mvu.f(this.EMm).getMaximum();
         mvu.j(this.EMm).setText("" + var4);
      }
   }
}
