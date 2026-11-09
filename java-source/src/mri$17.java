import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class mri$17 implements FocusListener {
   mri$17(mri var1) {
      this.Ejc = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
   }

   @Override
   public void focusLost(FocusEvent var1) {
      mri.b(mri.eKB());
   }
}
