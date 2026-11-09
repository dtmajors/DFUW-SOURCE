import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvo$6 implements ChangeListener {
   mvo$6(mvo var1) {
      this.ELs = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvo.h(this.ELs).hu(mvo.i(this.ELs).getValue());
   }
}
