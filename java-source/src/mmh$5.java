import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmh$5 implements ChangeListener {
   mmh$5(mmh var1, mkl var2) {
      this.DMR = var1;
      this.DMS = var2;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmh.b(this.DMR).yE(mmh.e(this.DMR).eDr());
      mmh.f(this.DMR).setEnabled(mmh.e(this.DMR).eDr());
      if (mmh.e(this.DMR).eDr()) {
         this.DMS.zi(true);
      }
   }
}
