import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvx$4 implements ChangeListener {
   mvx$4(mvx var1) {
      this.EMZ = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvx.c(this.EMZ, new lco(mvx.e(this.EMZ).getColor()));
      mvx.f(this.EMZ).setColor(mvx.e(this.EMZ).getColor());
   }
}
