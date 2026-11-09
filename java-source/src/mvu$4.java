import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mvu$4 implements ActionListener {
   mvu$4(mvu var1) {
      this.EMm = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = mvu.h(this.EMm).getText();

      try {
         float var3 = Float.valueOf(var2.trim()) / 1.5F;
         int var7 = (int)(var3 * mvu.b(this.EMm).getMaximum() + 0.5F);
         if (var7 < 0) {
            var7 = 0;
         }

         if (var7 > mvu.b(this.EMm).getMaximum()) {
            var7 = mvu.b(this.EMm).getMaximum();
         }

         mvu.b(this.EMm).setValue(var7);
         float var5 = 1.5F * ((float)var7 / mvu.b(this.EMm).getMaximum());
         mvu.a(this.EMm, var5);
         mvu.h(this.EMm).setText("" + var5);
      } catch (NumberFormatException var6) {
         float var4 = 1.5F * mvu.b(this.EMm).getValue() / mvu.b(this.EMm).getMaximum();
         mvu.h(this.EMm).setText("" + var4);
      }
   }
}
