import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class kzw$4 implements ActionListener {
   kzw$4(kzw var1) {
      this.qpj = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      kzw.g(this.qpj).ekK();
      if (kzw.b(this.qpj)) {
         kzw.g(this.qpj).ekF();
         int var2 = JOptionPane.showConfirmDialog(this.qpj, "Do you want to save SpecialEffects as well", "Save specialeffects confirmation", 0);
         if (var2 == 0) {
            kzw.g(this.qpj).aa(lea.bkO());
         }
      }
   }
}
