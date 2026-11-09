import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class lab$8 implements ItemListener {
   lab$8(lab var1) {
      this.qqJ = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      if (var1.getStateChange() == 1) {
         lab.f(this.qqJ).ekv();
      }
   }
}
