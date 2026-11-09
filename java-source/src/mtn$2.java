import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mtn$2 implements ChangeListener {
   mtn$2(mtn var1, ez var2) {
      this.EzC = var1;
      this.EzD = var2;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      this.EzD.o(mtn.a(this.EzC).getValue());
   }
}
