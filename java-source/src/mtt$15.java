import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mtt$15 extends MouseAdapter {
   mtt$15(mtt var1) {
      this.EDj = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() == 1) {
         mtt.c(this.EDj);
         mtt.d(this.EDj);
      }
   }
}
