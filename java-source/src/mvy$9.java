import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvy$9 implements ChangeListener {
   mvy$9(mvy var1) {
      this.ENn = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvy.a(this.ENn, new lcq(mvy.h(this.ENn).getColor()));
      mvy.i(this.ENn).setColor(mvy.h(this.ENn).getColor());
   }
}
