import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mvo$1 implements ChangeListener {
   mvo$1(mvo var1) {
      this.ELs = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      JSlider var2 = (JSlider)var1.getSource();
      mvo.a(this.ELs, mvo.a(this.ELs).getValue());
   }
}
