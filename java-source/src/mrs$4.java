import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mrs$4 implements ChangeListener {
   mrs$4(mrs var1) {
      this.EmT = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      mrs.b(this.EmT, var1);
   }
}
