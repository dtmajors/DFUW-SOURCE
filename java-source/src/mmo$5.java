import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmo$5 implements ChangeListener {
   mmo$5(mmo var1) {
      this.DNk = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmo.e(this.DNk).yK(mmo.f(this.DNk).eDr());
      if (mmo.f(this.DNk).eDr()) {
         mmo.d(this.DNk).zi(false);
      }

      mmo.h(this.DNk).setEnabled(mmo.f(this.DNk).eDr());
   }
}
