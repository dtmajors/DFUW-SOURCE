import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmh$2 implements ChangeListener {
   mmh$2(mmh var1) {
      this.DMR = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmh.b(this.DMR).setLooping(mmh.c(this.DMR).eDr());
   }
}
