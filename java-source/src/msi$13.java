import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.tree.TreePath;

class msi$13 implements ActionListener {
   msi$13(msi var1) {
      this.EtH = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Enumeration var2 = msi.k(this.EtH).depthFirstEnumeration();

      while (var2.hasMoreElements()) {
         msg var3 = (msg)var2.nextElement();
         TreePath var4 = new TreePath(var3.getPath());
         msi.j(this.EtH).setSelectionPath(var4);
         msi.j(this.EtH).scrollPathToVisible(var4);
         if (msi.w(this.EtH) != null) {
            this.EtH.eNp();
         }
      }
   }
}
