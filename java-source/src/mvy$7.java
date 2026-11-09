import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvy$7 implements ChangeListener {
   mvy$7(mvy var1) {
      this.ENn = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvy.a(this.ENn, mvy.f(this.ENn).getValue());
   }
}
