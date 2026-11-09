import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class mtm$11 extends FocusAdapter {
   mtm$11(mtm var1) {
      this.Ezt = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      String var2 = mtm.s(this.Ezt).getText();
      var2 = var2.replaceAll(",", ".");
      float var3 = Float.parseFloat(var2);
      int var4 = (int)(var3 * 10.0F);
      if (var4 > mtm.r(this.Ezt).getMaximum()) {
         var4 = mtm.r(this.Ezt).getMaximum();
         mtm.s(this.Ezt).setText(String.valueOf(var3 / 10.0F));
      } else if (var4 < mtm.r(this.Ezt).getMinimum()) {
         var4 = mtm.r(this.Ezt).getMinimum();
         mtm.s(this.Ezt).setText(String.valueOf(var3 / 10.0F));
      }

      mtm.r(this.Ezt).setValue(var4);
   }
}
