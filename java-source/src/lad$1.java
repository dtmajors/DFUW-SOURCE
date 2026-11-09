import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class lad$1 implements ItemListener {
   lad$1(lad var1) {
      this.qqV = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      String var2 = (String)var1.getItem();
      int var3 = ep.as(var2);
      if (!ep.aR(var3)) {
         lad.a(this.qqV).setSelectedIndex(0);
      }
   }
}
