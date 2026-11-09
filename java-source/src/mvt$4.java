import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvt$4 implements ChangeListener {
   mvt$4(mvt var1) {
      this.ELZ = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      JSlider var2 = (JSlider)var1.getSource();
      if (!var2.getValueIsAdjusting()) {
         mvt.b(this.ELZ, mvt.d(this.ELZ).getValue());
      }
   }
}
