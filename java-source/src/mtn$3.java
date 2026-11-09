import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mtn$3 implements ChangeListener {
   mtn$3(mtn var1, int var2) {
      this.EzC = var1;
      this.EzE = var2;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      et var2 = mtn.b(this.EzC).fi().ah(this.EzE);
      var2.o(mtn.c(this.EzC).getValue());
   }
}
