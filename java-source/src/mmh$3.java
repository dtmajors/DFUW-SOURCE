import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmh$3 implements ChangeListener {
   mmh$3(mmh var1, mkl var2) {
      this.DMR = var1;
      this.DMS = var2;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmh.b(this.DMR).yC(mmh.d(this.DMR).eDr());
      if (mmh.d(this.DMR).eDr()) {
         this.DMS.zi(false);
      }
   }
}
