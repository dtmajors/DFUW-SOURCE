import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

class mqy$4 implements ActionListener {
   mqy$4(mqy var1) {
      this.Ehw = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JCheckBox var2 = (JCheckBox)var1.getSource();
      mqy.c(this.Ehw).jo(var2.isSelected());
      mqy.b(this.Ehw);
   }
}
