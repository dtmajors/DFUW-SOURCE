import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class moz$4 implements ChangeListener {
   moz$4(moz var1) {
      this.DUe = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      moz.b(this.DUe).setDuration(moz.a(this.DUe).getValue());
   }
}
