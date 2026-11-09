import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mss$1 implements ChangeListener {
   mss$1(mss var1) {
      this.Eva = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      if ((Integer)mss.a(this.Eva).getModel().getValue() < 0) {
         mss.a(this.Eva).getModel().setValue(0);
      }
   }
}
