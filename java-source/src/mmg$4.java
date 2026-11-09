import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmg$4 implements ChangeListener {
   mmg$4(mmg var1) {
      this.DMB = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      if (!mmg.h(this.DMB).getValueIsAdjusting()) {
         mmg.b(this.DMB).nF(mmg.h(this.DMB).getValue());
      }
   }
}
