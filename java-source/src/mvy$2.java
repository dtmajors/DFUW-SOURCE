import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvy$2 implements ChangeListener {
   mvy$2(mvy var1) {
      this.ENn = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvy.c(this.ENn, mvy.k(this.ENn).getValue());
   }
}
