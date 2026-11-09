import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class lab$13 extends MouseAdapter {
   lab$13(lab var1) {
      this.qqJ = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (SwingUtilities.isRightMouseButton(var1)) {
         if (lab.a(this.qqJ) == "FA_Function") {
            lab.a(this.qqJ, "");
            lab.k(this.qqJ).setBackground(lab.b(this.qqJ));
            lab.k(this.qqJ).select(0, 0);
         } else {
            lab.a(this.qqJ, "FA_Function");
            lab.k(this.qqJ).setBackground(lab.d(this.qqJ));
            lab.k(this.qqJ).select(0, 0);
         }

         lab.f(this.qqJ).yo(lab.a(this.qqJ));
      }
   }
}
