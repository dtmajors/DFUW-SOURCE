import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvo$2 implements ChangeListener {
   mvo$2(mvo var1) {
      this.ELs = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      JSlider var2 = (JSlider)var1.getSource();
      mvo.b(this.ELs, mvo.b(this.ELs).getValue());
   }
}
