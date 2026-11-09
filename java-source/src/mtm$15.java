import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mtm$15 implements ChangeListener {
   mtm$15(mtm var1) {
      this.Ezt = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      int var2 = mtm.v(this.Ezt).getValue();
      float var3 = var2 / 10.0F;
      mtm.w(this.Ezt).setText(String.valueOf(var3));
   }
}
