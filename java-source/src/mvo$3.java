import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvo$3 implements ChangeListener {
   mvo$3(mvo var1) {
      this.ELs = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvo.a(this.ELs, new lcq(mvo.c(this.ELs).getColor()));
      mvo.d(this.ELs).setColor(mvo.c(this.ELs).getColor());
   }
}
