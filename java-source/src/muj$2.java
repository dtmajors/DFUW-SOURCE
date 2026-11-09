import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class muj$2 implements ChangeListener {
   muj$2(muj var1) {
      this.EGr = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      muj.a(this.EGr, muj.c(this.EGr).getValue());
   }
}
