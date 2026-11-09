import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTree;
import javax.swing.tree.TreePath;

class h$a extends MouseAdapter {
   private h ck;
   private JTree tree;
   private int cf;
   private int cg;

   h$a(h var1, JTree var2, h var3) {
      this.cl = var1;
      this.cf = 0;
      this.cg = 0;
      this.ck = var3;
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
                  this.ck.bX.Cf(var7.getName());
                  this.ck.bY.Cf(var7.getTypeName());
                  this.ck.bZ.Cf(Boolean.toString(var7.erK()));
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
                  h.a(this.cl).a(var4.getType());
               }
            }
         }
      } else if (var1.getModifiers() == 4 && var1.getClickCount() == 1) {
         h.b(this.cl).show(var1.getComponent(), var1.getX(), var1.getY());
         this.cf = var1.getX();
         this.cg = var1.getY();
      }
   }
}
