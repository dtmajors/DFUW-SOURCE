import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvt$5 implements ChangeListener {
   mvt$5(mvt var1) {
      this.ELZ = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      JSlider var2 = (JSlider)var1.getSource();
      if (!var2.getValueIsAdjusting()) {
         mvt.c(this.ELZ, mvt.e(this.ELZ).getValue());
      }
   }
}
