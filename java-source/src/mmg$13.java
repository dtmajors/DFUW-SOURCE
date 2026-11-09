import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmg$13 implements ChangeListener {
   mmg$13(mmg var1) {
      this.DMB = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmg.b(this.DMB).yG(mmg.d(this.DMB).isSelected());
   }
}
