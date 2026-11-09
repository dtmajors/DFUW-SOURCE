import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvr$1 implements ChangeListener {
   mvr$1(mvr var1) {
      this.ELI = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      JSlider var2 = (JSlider)var1.getSource();
      if (!var2.getValueIsAdjusting()) {
         mvr.a(this.ELI, mvr.a(this.ELI).getValue());
      }
   }
}
