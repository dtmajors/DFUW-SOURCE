import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mtr$1 implements ChangeListener {
   mtr$1(mtr var1) {
      this.ECh = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      int var2 = mtr.a(this.ECh).getValue();
      float var3 = var2 / 10.0F;
      mtr.b(this.ECh).setText(String.valueOf(var3));
   }
}
