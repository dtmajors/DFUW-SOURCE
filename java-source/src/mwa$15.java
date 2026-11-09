import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mwa$15 implements ChangeListener {
   mwa$15(mwa var1) {
      this.EOM = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mwa.w(this.EOM).setColor(mwa.v(this.EOM).getColor());
      mwa.b(this.EOM, new lcq(mwa.v(this.EOM).getColor()));
   }
}
