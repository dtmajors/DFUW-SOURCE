import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.tree.TreePath;

class lau$2 extends MouseAdapter {
   lau$2(lau var1) {
      this.quf = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      TreePath var2 = this.quf.qtO.getPathForLocation(var1.getX(), var1.getY());
      if (var2 != null) {
         this.quf.qtO.setSelectionPath(var2);
         if (SwingUtilities.isLeftMouseButton(var1) && var1.getClickCount() == 2) {
            lae var3 = (lae)var2.getLastPathComponent();
            String var4 = var3.getName();
            String var5 = null;
            if (var3.getParent() != null) {
               var5 = ((lae)var3.getParent()).getName();
            }

            switch (var3.getNodeType()) {
               case 1:
               case 9:
               case 16:
               case 18:
               case 20:
               default:
                  break;
               case 2:
                  this.quf.qoZ.b((cam)((lae)var3.getParent()).getValue());
                  this.quf.qoZ.d((cai)var3.getValue());
                  break;
               case 3:
                  this.quf.qoZ.b((cam)((lae)var3.getParent()).getValue());
                  this.quf.qoZ.d((cai)var3.getValue());
                  break;
               case 4:
                  this.quf.qoZ.ap(var4, var5);
                  break;
               case 5:
                  this.quf.qoZ.a((all)var3.getValue());
                  break;
               case 6:
                  this.quf.qoZ.aq(var4, var5);
                  break;
               case 7:
                  this.quf.qoZ.d((ctm)var3.getValue());
                  break;
               case 8:
                  this.quf.qoZ.b((cam)((lae)var3.getParent().getParent()).getValue());
                  this.quf.qoZ.d((cah)var3.getValue());
                  break;
               case 10:
               case 11:
                  this.quf.qoZ.b((cam)var3.getValue());
                  break;
               case 12:
                  this.quf.qoZ.h((ctu)var3.getValue());
                  break;
               case 13:
                  this.quf.qoZ.a((ctv)var3.getValue());
                  break;
               case 14:
                  this.quf.qoZ.c((ctz)var3.getValue());
                  break;
               case 15:
                  this.quf.qoZ.ar(var4, var5);
                  break;
               case 17:
                  this.quf.qoZ.as(var4, var5);
                  break;
               case 19:
                  dgj var7 = (dgj)var3.getValue();
                  this.quf.qoZ.a(var7, false);
                  break;
               case 21:
                  dgj var6 = (dgj)var3.getValue();
                  this.quf.qoZ.a(var6, true);
                  break;
               case 22:
                  this.quf.qoZ.b((cam)((lae)var3.getParent()).getValue());
                  this.quf.qoZ.d((cai)var3.getValue());
            }
         } else if (SwingUtilities.isRightMouseButton(var1)) {
            this.quf.n(var1);
         }
      }
   }
}
