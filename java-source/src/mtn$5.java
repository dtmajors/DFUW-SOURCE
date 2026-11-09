import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mtn$5 implements ChangeListener {
   mtn$5(mtn var1, int var2) {
      this.EzC = var1;
      this.EzG = var2;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      et var2 = mtn.b(this.EzC).fi().ah(this.EzG);
      var2.o(mtn.e(this.EzC).getValue());
   }
}
