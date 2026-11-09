import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mri$15 implements ChangeListener {
   mri$15(mri var1) {
      this.Ejc = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      mri.b(this.Ejc);
   }
}
