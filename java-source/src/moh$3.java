import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class moh$3 implements ChangeListener {
   moh$3(moh var1) {
      this.DSw = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      eb var2 = moh.a(this.DSw).eL();
      if (var2 != null) {
         var2.setRadius(moh.b(this.DSw).getValue());
      }
   }
}
