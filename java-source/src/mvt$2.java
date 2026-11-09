import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvt$2 implements ChangeListener {
   mvt$2(mvt var1) {
      this.ELZ = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mvt.a(this.ELZ, new lcq(mvt.b(this.ELZ).getColor()));
      mvt.c(this.ELZ).setColor(mvt.b(this.ELZ).getColor());
   }
}
