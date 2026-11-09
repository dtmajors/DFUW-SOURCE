import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvt$1 implements ChangeListener {
   mvt$1(mvt var1) {
      this.ELZ = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      JSlider var2 = (JSlider)var1.getSource();
      mvt.a(this.ELZ, mvt.a(this.ELZ).getValue());
   }
}
