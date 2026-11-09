import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTree;
import javax.swing.tree.TreePath;

class f$a extends MouseAdapter {
   private f ce;
   private JTree tree;
   private int cf;
   private int cg;

   f$a(f var1, JTree var2, f var3) {
      this.ch = var1;
      this.cf = 0;
      this.cg = 0;
      this.ce = var3;
      this.tree = var2;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getModifiers() == 16 && var1.getClickCount() == 1) {
         TreePath var5 = this.tree.getPathForRow(this.tree.getRowForLocation(var1.getX(), var1.getY()));
         if (var5 != null) {
            lae var6 = (lae)var5.getLastPathComponent();
            if (var6 != null && var6.isLeaf()) {
               lgw var7 = (lgw)var6.dHM();
               if (var7 != null) {
                  this.ce.bX.Cf(var7.getName());
                  this.ce.bY.Cf(var7.getTypeName());
                  this.ce.bZ.Cf(Boolean.toString(var7.erK()));
               }
            }
         }
      } else if (var1.getModifiers() == 16 && var1.getClickCount() == 2) {
         TreePath var2 = this.tree.getPathForRow(this.tree.getRowForLocation(var1.getX(), var1.getY()));
         if (var2 != null) {
            lae var3 = (lae)var2.getLastPathComponent();
            if (var3 != null) {
               lgw var4 = (lgw)var3.dHM();
               if (var4 != null && var3.isLeaf() && var4.erK()) {
                  f.a(this.ch, var4.getName());
                  this.ch.dispose();
               }
            }
         }
      } else if (var1.getModifiers() == 4 && var1.getClickCount() == 1) {
         f.a(this.ch).show(var1.getComponent(), var1.getX(), var1.getY());
         this.cf = var1.getX();
         this.cg = var1.getY();
      }
   }
}
