import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.tree.DefaultMutableTreeNode;

class mxm$a extends MouseAdapter {
   mxm$a(mxm var1) {
      this.ETV = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getModifiers() == 4 && mxm.a(this.ETV) == null) {
         mxm.b(this.ETV).show(var1.getComponent(), var1.getX(), var1.getY());
         Component var2 = (Component)var1.getSource();
         if (var2 == mxm.c(this.ETV)) {
            mxm.a(this.ETV, mxm.c(this.ETV).getPathForLocation(var1.getX(), var1.getY()));
            if (mxm.d(this.ETV) != null) {
               DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)mxm.d(this.ETV).getLastPathComponent();
               mxm.a(this.ETV, var3);
            }
         } else {
            lfn.print("SFObjectList: Selected popup area is not over a JTree. Comp is: " + var1.getSource());
         }
      }
   }
}
