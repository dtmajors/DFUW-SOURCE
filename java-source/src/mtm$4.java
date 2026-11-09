import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mtm$4 implements ChangeListener {
   mtm$4(mtm var1) {
      this.Ezt = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      int var2 = mtm.l(this.Ezt).getValue();
      mtm.m(this.Ezt).setText(String.valueOf(var2));
   }
}
