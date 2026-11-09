import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class mtm$9 extends FocusAdapter {
   mtm$9(mtm var1) {
      this.Ezt = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      String var2 = mtm.q(this.Ezt).getText();
      var2 = var2.replaceAll(",", ".");
      float var3 = Float.parseFloat(var2);
      int var4 = (int)(var3 * 10.0F);
      if (var4 > mtm.p(this.Ezt).getMaximum()) {
         var4 = mtm.p(this.Ezt).getMaximum();
         mtm.q(this.Ezt).setText(String.valueOf(var3 / 10.0F));
      } else if (var4 < mtm.p(this.Ezt).getMinimum()) {
         var4 = mtm.p(this.Ezt).getMinimum();
         mtm.q(this.Ezt).setText(String.valueOf(var3 / 10.0F));
      }

      mtm.p(this.Ezt).setValue(var4);
   }
}
