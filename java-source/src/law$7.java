import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class law$7 implements ItemListener {
   law$7(law var1) {
      this.quD = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      if (law.h(this.quD).isSelected()) {
         law.i(this.quD).setEnabled(true);
         law.i(this.quD).setEditable(true);
      } else {
         law.i(this.quD).setEnabled(false);
         law.i(this.quD).setEditable(false);
      }
   }
}
