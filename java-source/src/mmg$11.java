import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmg$11 implements ChangeListener {
   mmg$11(mmg var1) {
      this.DMB = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      if (!mmg.a(this.DMB).getValueIsAdjusting()) {
         mmg.b(this.DMB).iF(mmg.a(this.DMB).getValue());
      }
   }
}
