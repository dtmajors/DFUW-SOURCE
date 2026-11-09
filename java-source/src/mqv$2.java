import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

class mqv$2 implements ActionListener {
   mqv$2(mqv var1) {
      this.Eha = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      TreePath var2 = mqv.a(this.Eha).getSelectionPath();
      if (var2 != null) {
         lae var3 = (lae)var2.getLastPathComponent();
         if (var3 != null) {
            lgw var4 = (lgw)var3.dHM();
            if (var4 == null) {
               return;
            }

            if (mqv.b(this.Eha) || var3.isLeaf()) {
               lfn.b(0, this.getClass().getSimpleName(), "mouseClicked() : Adding ResourceType = " + var4.getType());
               String var5 = var4.getName();
               this.Eha.EgV.Ad(var5);
               if (mqv.c(this.Eha)) {
                  if (mqv.d(this.Eha)) {
                     JOptionPane.showMessageDialog(this.Eha, "ResourceType Selected: " + var5);
                  }

                  this.Eha.dispose();
               }

               lfn.b(0, this.getClass().getName(), "mouseClicked() : Value is: " + var4.getDescription());
            }
         }
      }
   }
}
