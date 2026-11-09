import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class laq$4 extends MouseAdapter {
   laq$4(laq var1) {
      this.qtu = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (SwingUtilities.isRightMouseButton(var1)) {
         if (laq.a(this.qtu) == "AS_Action") {
            laq.a(this.qtu, "");
            laq.g(this.qtu).setBackground(laq.b(this.qtu));
            laq.g(this.qtu).select(0, 0);
         } else {
            laq.a(this.qtu, "AS_Action");
            laq.g(this.qtu).setBackground(laq.d(this.qtu));
            laq.g(this.qtu).select(0, 0);
         }

         laq.e(this.qtu).yn(laq.a(this.qtu));
      }
   }
}
