import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class mqy$2 implements ActionListener {
   mqy$2(mqy var1) {
      this.Ehw = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JCheckBox var2 = (JCheckBox)var1.getSource();
      mqy.c(this.Ehw).jp(var2.isSelected());
      mqy.b(this.Ehw);
   }
}
