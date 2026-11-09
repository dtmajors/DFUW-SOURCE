import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class mtv$4 implements ActionListener {
   mtv$4(mtv var1) {
      this.EEq = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = mtv.b(this.EEq).eDc().getName();
      if (mtv.b(this.EEq).eDc().exists()) {
         int var3 = JOptionPane.showConfirmDialog(mtv.b(this.EEq), "Overriding SFFile ? " + mtv.b(this.EEq).eDc().getName());
         if (var3 == 0 && mtv.b(this.EEq).eDc() != null) {
            mtv.a(this.EEq, var2, "SFSkinningInventory");
         }
      }
   }
}
