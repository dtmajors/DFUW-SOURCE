import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mre$3 implements ChangeListener {
   mre$3(mre var1) {
      this.Eiu = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      mre.a(this.Eiu);
   }
}
