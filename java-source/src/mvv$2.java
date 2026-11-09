import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvv$2 implements ChangeListener {
   mvv$2(mvv var1) {
      this.EMt = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      JSlider var2 = (JSlider)var1.getSource();
      if (!var2.getValueIsAdjusting()) {
         mvv.b(this.EMt, mvv.b(this.EMt).getValue());
      }
   }
}
