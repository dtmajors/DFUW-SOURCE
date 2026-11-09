import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmg$12 implements ChangeListener {
   mmg$12(mmg var1) {
      this.DMB = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmg.b(this.DMB).setLooping(mmg.c(this.DMB).isSelected());
   }
}
