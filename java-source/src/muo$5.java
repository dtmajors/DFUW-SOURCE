import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class muo$5 implements ChangeListener {
   muo$5(muo var1, JCheckBox var2, JTextField var3) {
      this.EHi = var1;
      this.EHk = var2;
      this.EHh = var3;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      if (this.EHk.isSelected()) {
         this.EHh.setEditable(true);
      } else {
         this.EHh.setEditable(false);
      }
   }
}
