import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class lab$9 extends MouseAdapter {
   lab$9(lab var1) {
      this.qqJ = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (SwingUtilities.isRightMouseButton(var1)) {
         if (lab.a(this.qqJ) == "OF_ReactionFunction") {
            lab.a(this.qqJ, "");
            lab.e(this.qqJ).setBackground(lab.b(this.qqJ));
            lab.e(this.qqJ).select(0, 0);
         } else {
            lab.a(this.qqJ, "OF_ReactionFunction");
            lab.e(this.qqJ).setBackground(lab.d(this.qqJ));
            lab.e(this.qqJ).select(0, 0);
            lab.c(this.qqJ).setBackground(lab.b(this.qqJ));
         }

         lab.f(this.qqJ).yo(lab.a(this.qqJ));
      }
   }
}
