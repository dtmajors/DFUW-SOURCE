import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class mtv$12 implements ActionListener {
   mtv$12(mtv var1) {
      this.EEq = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mtv.a(this.EEq, JOptionPane.showInputDialog(mtv.a(this.EEq), "SFFile Name"), "SFLootInventory");
   }
}
