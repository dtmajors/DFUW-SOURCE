import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpy$1 implements ActionListener {
   mpy$1(mpy var1) {
      this.DXs = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mpy.a(this.DXs, var1);
   }
}
