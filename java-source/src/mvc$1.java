import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.tree.TreePath;

class mvc$1 extends MouseAdapter {
   mvc$1(mvc var1) {
      this.EJE = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      TreePath var2 = mvc.a(this.EJE).getPathForLocation(var1.getX(), var1.getY());
      if (var2 != null) {
         mvc.a(this.EJE).setSelectionPath(var2);
         if (SwingUtilities.isRightMouseButton(var1)) {
            mvc.a(this.EJE, var1);
         }
      }
   }
}
