import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mlq$1 implements ChangeListener {
   mlq$1(mlq var1) {
      this.DJF = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      JSlider var2 = (JSlider)var1.getSource();
      if (!var2.getValueIsAdjusting()) {
         mlq.a(this.DJF, mlq.a(this.DJF).getValue());
      }
   }
}
