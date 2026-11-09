import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.tree.DefaultMutableTreeNode;

class mtm$18 implements ActionListener {
   mtm$18(mtm var1, JButton var2, JDialog var3) {
      this.Ezt = var1;
      this.Ezu = var2;
      this.EtI = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = mtm.x(this.Ezt).getSelectionRows();
      if (var2 != null) {
         DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)mtm.x(this.Ezt).getLastSelectedPathComponent();
         if (var3.isLeaf()) {
            String var4 = var3.toString();
            if (this.Ezu == mtm.f(this.Ezt)) {
               mtm.y(this.Ezt).setText(var4);
            } else {
               mtm.z(this.Ezt).setText(var4);
            }

            if (mtm.A(this.Ezt) != null) {
               mtm.A(this.Ezt).nt(lea.enT().getType(var4));
            }

            this.EtI.dispose();
         }
      }
   }
}
