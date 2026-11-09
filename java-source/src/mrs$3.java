import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mrs$3 implements ChangeListener {
   mrs$3(mrs var1) {
      this.EmT = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      mrs.a(this.EmT, var1);
   }
}
