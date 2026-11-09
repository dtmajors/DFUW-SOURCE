import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

class mqy$10 implements ActionListener {
   mqy$10(mqy var1) {
      this.Ehw = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      JTextField var2 = (JTextField)var1.getSource();
      int var3 = mqy.i(this.Ehw).getSelectedIndex();
      if (var3 != -1) {
         mqy.c(this.Ehw).byb().get(var3).iq(Float.parseFloat(var2.getText()));
         mqy.c(this.Ehw).bxN();
      }
   }
}
