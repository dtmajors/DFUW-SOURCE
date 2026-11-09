import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$14 implements ChangeListener {
   mwa$14(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.a(this.EOM, new lcq(mwa.t(this.EOM).getColor()));
      mwa.u(this.EOM).setColor(mwa.t(this.EOM).getColor());
   }
}
