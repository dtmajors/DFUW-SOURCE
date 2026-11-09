import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mtn$4 implements ChangeListener {
   mtn$4(mtn var1, int var2) {
      this.EzC = var1;
      this.EzF = var2;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      et var2 = mtn.b(this.EzC).fi().ah(this.EzF);
      var2.o(mtn.d(this.EzC).getValue());
   }
}
