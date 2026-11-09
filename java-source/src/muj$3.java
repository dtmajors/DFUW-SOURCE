import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class muj$3 implements ChangeListener {
   muj$3(muj var1) {
      this.EGr = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      muj.b(this.EGr, muj.d(this.EGr).getValue());
   }
}
