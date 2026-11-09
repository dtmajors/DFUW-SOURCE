import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class mtt$21 implements ItemListener {
   mtt$21(mtt var1) {
      this.EDj = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      mtt.a(this.EDj, false);
   }
}
