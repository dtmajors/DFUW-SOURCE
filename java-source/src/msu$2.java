import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class msu$2 implements ItemListener {
   msu$2(msu var1) {
      this.EvB = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      if (msu.b(this.EvB).getSelectedItem().toString().equals("SKILL")) {
         msu.f(this.EvB).setEnabled(true);
         msu.d(this.EvB).setEnabled(false);
         msu.e(this.EvB).setEnabled(false);
      } else if (msu.b(this.EvB).getSelectedItem().toString().equals("RESOURCE")) {
         msu.f(this.EvB).setEnabled(false);
         msu.d(this.EvB).setEnabled(false);
         msu.e(this.EvB).setEnabled(false);
      } else if (msu.b(this.EvB).getSelectedItem().toString().equals("BOOSTER")) {
         msu.f(this.EvB).setEnabled(false);
         msu.d(this.EvB).setEnabled(true);
         msu.e(this.EvB).setEnabled(true);
      }
   }
}
