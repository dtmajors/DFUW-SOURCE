import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mtm$2 implements ChangeListener {
   mtm$2(mtm var1) {
      this.Ezt = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      int var2 = mtm.j(this.Ezt).getValue();
      float var3 = var2 / 10.0F;
      mtm.k(this.Ezt).setText(String.valueOf(var3));
   }
}
