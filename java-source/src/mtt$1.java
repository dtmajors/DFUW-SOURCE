import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mtt$1 extends MouseAdapter {
   mtt$1(mtt var1) {
      this.EDj = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() == 1) {
         mtt.a(this.EDj);
         mtt.b(this.EDj);
      }
   }
}
