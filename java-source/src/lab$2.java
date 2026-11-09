import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class lab$2 implements ItemListener {
   lab$2(lab var1) {
      this.qqJ = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      if (var1.getStateChange() == 1 && !lab.l(this.qqJ).getSelectedItem().equals("")) {
      }
   }
}
