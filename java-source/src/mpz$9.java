import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class mpz$9 implements ActionListener {
   mpz$9(mpz var1) {
      this.DYa = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JCheckBox var2 = (JCheckBox)var1.getSource();
      this.DYa.DXX.jm(var2.isSelected());
   }
}
