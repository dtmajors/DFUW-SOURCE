import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mtq$10 implements ChangeListener {
   mtq$10(mtq var1) {
      this.EBi = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      int var2 = mtq.c(this.EBi).getValue();
      mtq.d(this.EBi).setText(String.valueOf(var2));
   }
}
