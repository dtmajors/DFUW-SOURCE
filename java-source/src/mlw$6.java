import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mlw$6 implements ChangeListener {
   mlw$6(mlw var1) {
      this.DLp = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mlw.b(this.DLp, mlw.b(this.DLp).getValue());
   }
}
