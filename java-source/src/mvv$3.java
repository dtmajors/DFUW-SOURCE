import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvv$3 implements ChangeListener {
   mvv$3(mvv var1) {
      this.EMt = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      JSlider var2 = (JSlider)var1.getSource();
      if (!var2.getValueIsAdjusting()) {
         mvv.c(this.EMt, mvv.c(this.EMt).getValue());
      }
   }
}
