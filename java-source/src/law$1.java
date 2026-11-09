import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class law$1 implements ItemListener {
   law$1(law var1) {
      this.quD = var1;
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      law.b(this.quD).setText(law.a(this.quD));
   }
}
