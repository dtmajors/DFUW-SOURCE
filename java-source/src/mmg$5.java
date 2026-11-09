import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmg$5 implements ChangeListener {
   mmg$5(mmg var1) {
      this.DMB = var1;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      mmg.b(this.DMB).yH(mmg.i(this.DMB).isSelected());
   }
}
