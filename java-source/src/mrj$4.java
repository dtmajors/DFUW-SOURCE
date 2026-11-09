import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mrj$4 implements ChangeListener {
   mrj$4(mrj var1) {
      this.EkK = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      mrj.l(this.EkK).setText("Volume(" + (int)(100.0F * (mrj.k(this.EkK).getValue() / 255.0F)) + ")");
      mrj.i(this.EkK);
   }
}
