import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mlw$5 implements ChangeListener {
   mlw$5(mlw var1) {
      this.DLp = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mlw.a(this.DLp, mlw.a(this.DLp).getValue());
   }
}
