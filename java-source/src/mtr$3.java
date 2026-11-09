import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mtr$3 implements ChangeListener {
   mtr$3(mtr var1) {
      this.ECh = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      int var2 = mtr.m(this.ECh).getValue();
      float var3 = var2 / 10.0F;
      mtr.n(this.ECh).setText(String.valueOf(var3));
   }
}
