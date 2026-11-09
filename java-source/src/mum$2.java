import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mum$2 implements ActionListener {
   mum$2(mum var1) {
      this.EGL = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mum.b(this.EGL, var1);
   }
}
