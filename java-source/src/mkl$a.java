import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mkl$a implements ChangeListener {
   private mkl$a(mkl var1) {
      this.DFv = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      mkl.a(this.DFv, true);
   }
}
