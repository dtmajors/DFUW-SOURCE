import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvx$3 implements ChangeListener {
   mvx$3(mvx var1) {
      this.EMZ = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvx.b(this.EMZ, new lco(mvx.c(this.EMZ).getColor()));
      mvx.d(this.EMZ).setColor(mvx.c(this.EMZ).getColor());
   }
}
