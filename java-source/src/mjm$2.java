import java.awt.event.ActionListener;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

final class mjm$2 implements ChangeListener {
   mjm$2(JTextField var1, JSlider var2, float var3, ActionListener var4) {
      this.DDz = var1;
      this.DDB = var2;
      this.DDA = var3;
      this.DDC = var4;
   }

   @Override
   public void stateChanged(ChangeEvent var1) {
      if (!mjm.DDy) {
         this.DDz.setText(String.valueOf(this.DDB.getValue() / this.DDA));

         for (ActionListener var5 : this.DDz.getActionListeners()) {
            if (var5 != this.DDC) {
               var5.actionPerformed(null);
            }
         }
      }
   }
}
