import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mmg$3 implements ChangeListener {
   mmg$3(mmg var1) {
      this.DMB = var1;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      mmg.b(this.DMB).yE(mmg.g(this.DMB).isSelected());
      mmg.h(this.DMB).setEnabled(mmg.g(this.DMB).isSelected());
      if (mmg.g(this.DMB).isSelected()) {
         mmg.f(this.DMB).setSelected(true);
      }
   }
}
