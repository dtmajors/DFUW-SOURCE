import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class lan$1 extends MouseAdapter {
   lan$1(lan var1) {
      this.qta = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (SwingUtilities.isRightMouseButton(var1)) {
         if (lan.a(this.qta) == "ParentResource") {
            lan.a(this.qta, "");
            lan.c(this.qta).setBackground(lan.b(this.qta));
            lan.c(this.qta).select(0, 0);
         } else {
            lan.a(this.qta, "ParentResource");
            lan.c(this.qta).setBackground(lan.d(this.qta));
            lan.c(this.qta).select(0, 0);
         }

         lan.e(this.qta).yq(lan.a(this.qta));
      }
   }
}
