import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mlq$4 implements ChangeListener {
   mlq$4(mlq var1, int var2) {
      this.DJF = var1;
      this.DIY = var2;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mlq.b(this.DJF, mlq.d(this.DJF)[this.DIY].getValue(), this.DIY);
   }
}
