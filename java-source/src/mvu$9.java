import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvu$9 implements ChangeListener {
   mvu$9(mvu var1) {
      this.EMm = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      JSlider var2 = (JSlider)var1.getSource();
      float var3 = 1.5F * var2.getValue() / var2.getMaximum();
      mvu.h(this.EMm).setText("" + var3);
      mvu.a(this.EMm, var3);
   }
}
