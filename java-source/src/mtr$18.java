import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mtr$18 implements ChangeListener {
   mtr$18(mtr var1) {
      this.ECh = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      int var2 = mtr.e(this.ECh).getValue();
      float var3 = var2 / 10.0F;
      mtr.f(this.ECh).setText(String.valueOf(var3));
   }
}
