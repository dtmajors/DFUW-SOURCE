import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvu$10 implements ChangeListener {
   mvu$10(mvu var1) {
      this.EMm = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      JSlider var2 = (JSlider)var1.getSource();
      float var3 = 8.0F * var2.getValue() / var2.getMaximum();
      mvu.i(this.EMm).setText("" + var3);
      mvu.b(this.EMm, var3);
   }
}
