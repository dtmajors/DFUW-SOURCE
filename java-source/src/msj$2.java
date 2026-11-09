import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

class msj$2 implements ActionListener {
   msj$2(msj var1, JTree var2, JDialog var3) {
      this.Euq = var1;
      this.Eup = var2;
      this.EtI = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = this.Eup.getSelectionRows();
      if (var2 != null && this.Eup.getLastSelectedPathComponent() != null && !this.Eup.getLastSelectedPathComponent().equals("")) {
         DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)this.Eup.getLastSelectedPathComponent();
         String var4 = var3.toString();
         msj.a(this.Euq, var4);
         msj.b(this.Euq).setText(msj.a(this.Euq));
         this.EtI.dispose();
      }
   }
}
