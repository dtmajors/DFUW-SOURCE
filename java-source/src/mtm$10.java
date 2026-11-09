import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mtm$10 implements ChangeListener {
   mtm$10(mtm var1) {
      this.Ezt = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      int var2 = mtm.r(this.Ezt).getValue();
      float var3 = var2 / 10.0F;
      mtm.s(this.Ezt).setText(String.valueOf(var3));
   }
}
