import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mtq$12 implements ChangeListener {
   mtq$12(mtq var1) {
      this.EBi = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mtq.a(this.EBi, mtq.e(this.EBi).getColor());
   }
}
