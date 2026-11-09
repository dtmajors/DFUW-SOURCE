import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class mtm$5 extends FocusAdapter {
   mtm$5(mtm var1) {
      this.Ezt = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      String var2 = mtm.m(this.Ezt).getText();
      int var3 = Integer.parseInt(var2);
      if (var3 > mtm.l(this.Ezt).getMaximum()) {
         var3 = mtm.l(this.Ezt).getMaximum();
         mtm.m(this.Ezt).setText(String.valueOf(var3 / 10.0F));
      } else if (var3 < mtm.l(this.Ezt).getMinimum()) {
         var3 = mtm.l(this.Ezt).getMinimum();
         mtm.m(this.Ezt).setText(String.valueOf(var3 / 10.0F));
      }

      mtm.l(this.Ezt).setValue(var3);
   }
}
