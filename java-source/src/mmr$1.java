import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmr$1 implements ChangeListener {
   mmr$1(mmr var1) {
      this.DNy = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      this.DNy.zm(mmr.a(this.DNy).eDr());
   }
}
