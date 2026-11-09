import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvx$2 implements ChangeListener {
   mvx$2(mvx var1) {
      this.EMZ = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvx.a(this.EMZ, new lco(mvx.a(this.EMZ).getColor()));
      mvx.b(this.EMZ).setColor(mvx.a(this.EMZ).getColor());
   }
}
