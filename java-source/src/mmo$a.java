import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mmo$a extends MouseAdapter {
   mmo$a(mmo var1) {
      this.DNk = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getModifiers() != 4 && var1.getModifiers() == 16 && var1.getClickCount() == 2) {
      }
   }
}
