import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mtm$13 implements ChangeListener {
   mtm$13(mtm var1) {
      this.Ezt = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      int var2 = mtm.t(this.Ezt).getValue();
      float var3 = var2 / 10.0F;
      mtm.u(this.Ezt).setText(String.valueOf(var3));
   }
}
