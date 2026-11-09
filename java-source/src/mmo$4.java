import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmo$4 implements ChangeListener {
   mmo$4(mmo var1) {
      this.DNk = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmo.e(this.DNk).yL(mmo.d(this.DNk).eDr());
      if (mmo.d(this.DNk).eDr()) {
         mmo.f(this.DNk).zi(false);
      }

      mmo.g(this.DNk).setEnabled(mmo.d(this.DNk).eDr());
   }
}
