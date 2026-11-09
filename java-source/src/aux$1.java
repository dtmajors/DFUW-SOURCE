import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class aux$1 extends ComponentAdapter {
   aux$1(aux var1) {
      this.DDk = var1;
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      super.componentMoved(var1);
      mje.DBJ = new Point(this.DDk.getLocation());
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      mje.MainWindowSize = new Dimension(this.DDk.getSize());
   }
}
