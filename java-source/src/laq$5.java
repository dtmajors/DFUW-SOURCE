import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class laq$5 extends MouseAdapter {
   laq$5(laq var1) {
      this.qtu = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (SwingUtilities.isRightMouseButton(var1)) {
         if (laq.a(this.qtu) == "AS_Skill") {
            laq.a(this.qtu, "");
            laq.h(this.qtu).setBackground(laq.b(this.qtu));
            laq.h(this.qtu).select(0, 0);
         } else {
            laq.a(this.qtu, "AS_Skill");
            laq.h(this.qtu).setBackground(laq.d(this.qtu));
            laq.h(this.qtu).select(0, 0);
         }

         laq.e(this.qtu).yr(laq.a(this.qtu));
      }
   }
}
