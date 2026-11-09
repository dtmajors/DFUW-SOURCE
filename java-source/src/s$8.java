import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

class s$8 implements FocusListener {
   s$8(s var1) {
      this.cS = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
   }

   @Override
   public void focusLost(FocusEvent var1) {
      ArrayList var2 = lcn.emv();

      for (Integer var4 : s.g(this.cS)) {
         var2.add(var4);
      }

      for (Integer var6 : var2) {
         s.a(this.cS, false, var6, false, false, false);
      }
   }
}
