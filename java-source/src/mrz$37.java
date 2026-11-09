import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;

class mrz$37 implements ActionListener {
   mrz$37(mrz var1, JList var2) {
      this.EoW = var1;
      this.EoZ = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = this.EoZ.getSelectedIndex();
      if (var2 >= 0 && var2 < mrz.y(this.EoW).size()) {
         mrz.y(this.EoW).remove(var2);
         this.EoZ.updateUI();
         mrz.A(this.EoW);
      }
   }
}
