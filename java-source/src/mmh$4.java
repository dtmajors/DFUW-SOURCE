import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmh$4 implements ChangeListener {
   mmh$4(mmh var1, mkl var2) {
      this.DMR = var1;
      this.DMS = var2;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmh.b(this.DMR).yD(this.DMS.eDr());
      if (this.DMS.eDr()) {
         mmh.d(this.DMR).zi(false);
      }
   }
}
