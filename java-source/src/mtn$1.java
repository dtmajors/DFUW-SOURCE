import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mtn$1 implements ChangeListener {
   mtn$1(mtn var1, et var2) {
      this.EzC = var1;
      this.EzB = var2;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      this.EzB.o(mtn.a(this.EzC).getValue());
   }
}
