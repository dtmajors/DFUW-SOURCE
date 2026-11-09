import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.TreePath;

class mqv$a extends MouseAdapter {
   private mqv Ehb;
   private JTree tree;
   private int cf;
   private int cg;

   mqv$a(mqv var1, JTree var2, mqv var3) {
      this.Eha = var1;
      this.cf = 0;
      this.cg = 0;
      this.Ehb = var3;
      this.tree = var2;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getModifiers() == 16 && var1.getClickCount() == 1) {
         TreePath var6 = this.tree.getPathForRow(this.tree.getRowForLocation(var1.getX(), var1.getY()));
         if (var6 == null) {
            return;
         }

         lae var7 = (lae)var6.getLastPathComponent();
         if (var7 == null || !var7.isLeaf()) {
            return;
         }

         lgw var8 = (lgw)var7.dHM();
         if (var8 == null) {
            return;
         }

         mqv.e(this.Ehb).setText(var8.getName());
         mqv.f(this.Ehb).setText(Boolean.toString(var8.erK()));
         mqv.g(this.Ehb).setText(var8.bBt());
      } else if (var1.getModifiers() == 16 && var1.getClickCount() == 2) {
         TreePath var2 = this.tree.getPathForRow(this.tree.getRowForLocation(var1.getX(), var1.getY()));
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
}
