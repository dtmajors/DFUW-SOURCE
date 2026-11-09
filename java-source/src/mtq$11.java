import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class mtq$11 extends FocusAdapter {
   mtq$11(mtq var1) {
      this.EBi = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      super.focusLost(var1);

      try {
         mtq.c(this.EBi).setValue(Integer.parseInt(mtq.d(this.EBi).getText()));
      } catch (NumberFormatException var3) {
      }
   }
}
