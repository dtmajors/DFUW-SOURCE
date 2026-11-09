import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmg$14 implements ChangeListener {
   mmg$14(mmg var1) {
      this.DMB = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmg.b(this.DMB).yC(mmg.e(this.DMB).isSelected());
      if (mmg.e(this.DMB).isSelected()) {
         mmg.f(this.DMB).setSelected(false);
      }
   }
}
