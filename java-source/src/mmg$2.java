import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmg$2 implements ChangeListener {
   mmg$2(mmg var1) {
      this.DMB = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmg.b(this.DMB).yD(mmg.f(this.DMB).isSelected());
      if (mmg.f(this.DMB).isSelected()) {
         mmg.e(this.DMB).setSelected(false);
      }
   }
}
