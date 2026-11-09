import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class mtm$3 extends FocusAdapter {
   mtm$3(mtm var1) {
      this.Ezt = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      String var2 = mtm.k(this.Ezt).getText();
      var2 = var2.replaceAll(",", ".");
      float var3 = Float.parseFloat(var2);
      int var4 = (int)(var3 * 10.0F);
      if (var4 > mtm.j(this.Ezt).getMaximum()) {
         var4 = mtm.j(this.Ezt).getMaximum();
         mtm.k(this.Ezt).setText(String.valueOf(var3 / 10.0F));
      } else if (var4 < mtm.j(this.Ezt).getMinimum()) {
         var4 = mtm.j(this.Ezt).getMinimum();
         mtm.k(this.Ezt).setText(String.valueOf(var3 / 10.0F));
      }

      mtm.j(this.Ezt).setValue(var4);
   }
}
