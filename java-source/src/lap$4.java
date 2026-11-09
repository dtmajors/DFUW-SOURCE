import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class lap$4 extends MouseAdapter {
   lap$4(lap var1) {
      this.qtk = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int var2 = lap.b(this.qtk).locationToIndex(var1.getPoint());
      lap.a(this.qtk, var2);
   }
}
