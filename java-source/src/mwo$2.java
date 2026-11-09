import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mwo$2 extends MouseAdapter {
   mwo$2(mwo var1) {
      this.ERN = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      mwo.a(this.ERN, var1);
   }
}
