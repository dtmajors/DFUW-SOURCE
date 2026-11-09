import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class mro$1 extends WindowAdapter {
   mro$1(mro var1) {
      this.ElA = var1;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      mro.a(this.ElA, var1);
   }
}
