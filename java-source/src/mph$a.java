import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.TreePath;

class mph$a extends MouseAdapter {
   private final mph DVj;
   private final JTree tree;
   private int cf;
   private int cg;

   mph$a(mph var1, JTree var2, mph var3) {
      this.DVk = var1;
      this.cf = 0;
      this.cg = 0;
      this.DVj = var3;
      this.tree = var2;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getModifiers() == 16 && var1.getClickCount() == 1) {
         TreePath var8 = this.tree.getPathForRow(this.tree.getRowForLocation(var1.getX(), var1.getY()));
         if (var8 != null) {
            lae var9 = (lae)var8.getLastPathComponent();
            if (var9 != null && var9.isLeaf()) {
               lgw var10 = (lgw)var9.dHM();
               if (var10 != null) {
                  mph.a(this.DVj).Cf(var10.getName());
                  mph.b(this.DVj).Cf(var10.getTypeName());
                  mph.c(this.DVj).Cf(Boolean.toString(var10.erK()));
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
                  if (this.DVk.DVh != null) {
                     this.DVk.DVh.x(var4);
                  } else if (var4.erK()) {
                     String var5 = var3.toString() + ".xml";
                     jrw var6 = new jrw(lcw.qLb + "xml-files/server/resource/" + var5);
                     if (!var6.exists()) {
                        mph.a(this.DVk, var4);
                     }

                     mph.a(this.DVk, var6);
                  } else {
                     String var11 = lcw.qLb + "xml-files/server/resource/" + var4.getName() + ".xml";
                     jrw var12 = new jrw(var11.toLowerCase());
                     if (var12.exists()) {
                        int var14 = JOptionPane.showConfirmDialog(
                           this.DVj, "Resource SFFile [] exists, but HasResourceFile is false in ResourceTree. Set it to true?"
                        );
                        if (var14 == 0) {
                           mph.a(this.DVk, var4.getType());
                           var4.ys(true);
                           this.tree.revalidate();
                        }

                        return;
                     }

                     int var7 = JOptionPane.showConfirmDialog(this.DVj, "Resource has no ResourceFile. Create one?");
                     if (var7 == 0) {
                        mph.a(this.DVk, var4);
                        mph.a(this.DVk, var4.getType());
                        var7 = JOptionPane.showConfirmDialog(this.DVj, "Trigger Exporting of ResourceTree to server location?");
                        if (var7 == 0) {
                           mph.eIr();
                        }

                        var4.ys(true);
                        this.tree.revalidate();
                     }
                  }
               }
            }
         }
      } else if (var1.getModifiers() == 4 && var1.getClickCount() == 1) {
         mph.d(this.DVk).show(var1.getComponent(), var1.getX(), var1.getY());
         this.cf = var1.getX();
         this.cg = var1.getY();
      }
   }
}
