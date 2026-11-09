import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvy$8 implements ChangeListener {
   mvy$8(mvy var1) {
      this.ENn = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvy.b(this.ENn, mvy.g(this.ENn).getValue());
   }
}
