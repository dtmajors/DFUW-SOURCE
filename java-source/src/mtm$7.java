import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class mtm$7 extends FocusAdapter {
   mtm$7(mtm var1) {
      this.Ezt = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      String var2 = mtm.o(this.Ezt).getText();
      var2 = var2.replaceAll(",", ".");
      float var3 = Float.parseFloat(var2);
      int var4 = (int)(var3 * 10.0F);
      if (var4 > mtm.n(this.Ezt).getMaximum()) {
         var4 = mtm.n(this.Ezt).getMaximum();
         mtm.o(this.Ezt).setText(String.valueOf(var3 / 10.0F));
      } else if (var4 < mtm.n(this.Ezt).getMinimum()) {
         var4 = mtm.n(this.Ezt).getMinimum();
         mtm.o(this.Ezt).setText(String.valueOf(var3 / 10.0F));
      }

      mtm.n(this.Ezt).setValue(var4);
   }
}
