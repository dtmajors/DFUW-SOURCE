import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class mtv$2 implements ActionListener {
   mtv$2(mtv var1) {
      this.EEq = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = mtv.a(this.EEq).eDc().getName();
      if (mtv.a(this.EEq).eDc().exists()) {
         int var3 = JOptionPane.showConfirmDialog(mtv.a(this.EEq), "Overriding SFFile ? " + var2);
         if (var3 == 0 && mtv.a(this.EEq).eDc() != null) {
            mtv.a(this.EEq, var2, "SFLootInventory");
         }
      }
   }
}
