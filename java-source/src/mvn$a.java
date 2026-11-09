import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.TreePath;

class mvn$a extends MouseAdapter {
   private mvn ELi;
   private JTree tree;
   private int cf;
   private int cg;

   mvn$a(mvn var1, JTree var2, mvn var3) {
      this.ELj = var1;
      this.cf = 0;
      this.cg = 0;
      this.ELi = var3;
      this.tree = var2;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getModifiers() == 16 && var1.getClickCount() == 1) {
         TreePath var6 = this.tree.getPathForRow(this.tree.getRowForLocation(var1.getX(), var1.getY()));
         if (var6 != null) {
            lae var7 = (lae)var6.getLastPathComponent();
            if (var7 != null && var7.isLeaf()) {
               lgw var8 = (lgw)var7.dHM();
               if (var8 != null) {
                  this.ELi.bX.Cf(var8.getName());
                  this.ELi.bY.Cf(var8.getTypeName());
                  this.ELi.bZ.Cf(Boolean.toString(var8.erK()));
               }
            }
         }
      } else if (var1.getModifiers() == 16 && var1.getClickCount() == 2) {
         TreePath var2 = this.tree.getPathForRow(this.tree.getRowForLocation(var1.getX(), var1.getY()));
         if (var2 != null) {
            lae var3 = (lae)var2.getLastPathComponent();
            if (var3 != null) {
               lgw var4 = (lgw)var3.dHM();
               if (var4 != null && var3.isLeaf()) {
                  int var5 = var4.getType();
                  JOptionPane.showMessageDialog(this.ELj, "ResourceType changed to: " + lea.enW().getName(var5));
                  this.ELj.ELh.afL(var5);
               }
            }
         }
      }
   }
}
