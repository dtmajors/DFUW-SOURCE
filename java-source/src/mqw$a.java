import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.TreePath;

class mqw$a extends MouseAdapter {
   private mqw Ehd;
   private JTree tree;
   private int cf;
   private int cg;

   mqw$a(mqw var1, JTree var2, mqw var3) {
      this.Ehe = var1;
      this.cf = 0;
      this.cg = 0;
      this.Ehd = var3;
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
                  this.Ehd.bX.Cf(var8.getName());
                  this.Ehd.bY.Cf(var8.getTypeName());
                  this.Ehd.bZ.Cf(Boolean.toString(var8.erK()));
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
                  lfn.b(0, this.getClass().getSimpleName(), "mouseClicked() : Adding ResourceType = " + var4.getType());
                  String var5 = var4.getName();
                  this.Ehe.EgV.Ad(var5);
                  JOptionPane.showMessageDialog(this.Ehe, "ResourceType changed to: " + var5);
                  this.Ehe.dispose();
                  lfn.b(0, this.getClass().getName(), "mouseClicked() : Value is: " + var4.getDescription());
               }
            }
         }
      }
   }
}
