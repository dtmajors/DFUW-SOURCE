import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mrr$c extends MouseAdapter {
   private mrr$c(mrr var1) {
      this.EmC = var1;
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      mrr.b(this.EmC, true);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      mrr.b(this.EmC, false);
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() == 3) {
         mrr.i(this.EmC);
      }
   }
}
