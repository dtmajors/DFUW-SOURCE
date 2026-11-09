import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mlq$2 implements ChangeListener {
   mlq$2(mlq var1, int var2) {
      this.DJF = var1;
      this.DIY = var2;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mlq.a(this.DJF, mlq.b(this.DJF)[this.DIY].getValue(), this.DIY);
   }
}
