import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mrq$d extends MouseAdapter {
   private mrq$d(mrq var1) {
      this.ElR = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() == 1 && var1.getClickCount() == 1) {
         mrq.a(this.ElR, var1);
      }
   }
}
