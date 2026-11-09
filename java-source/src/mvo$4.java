import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvo$4 implements ChangeListener {
   mvo$4(mvo var1) {
      this.ELs = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvo.b(this.ELs, new lcq(mvo.e(this.ELs).getColor()));
      mvo.f(this.ELs).setColor(mvo.e(this.ELs).getColor());
   }
}
