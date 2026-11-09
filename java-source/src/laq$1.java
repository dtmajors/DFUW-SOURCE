import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class laq$1 extends MouseAdapter {
   laq$1(laq var1) {
      this.qtu = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (SwingUtilities.isRightMouseButton(var1)) {
         if (laq.a(this.qtu) == "ParentSkill") {
            laq.a(this.qtu, "");
            laq.c(this.qtu).setBackground(laq.b(this.qtu));
            laq.c(this.qtu).select(0, 0);
         } else {
            laq.a(this.qtu, "ParentSkill");
            laq.c(this.qtu).setBackground(laq.d(this.qtu));
            laq.c(this.qtu).select(0, 0);
         }

         laq.e(this.qtu).yr(laq.a(this.qtu));
      }
   }
}
