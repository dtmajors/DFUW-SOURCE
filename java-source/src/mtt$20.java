import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class mtt$20 implements ItemListener {
   mtt$20(mtt var1) {
      this.EDj = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      mtt.a(this.EDj, false);
   }
}
