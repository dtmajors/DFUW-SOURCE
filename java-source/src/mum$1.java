import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mum$1 implements ActionListener {
   mum$1(mum var1) {
      this.EGL = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mum.a(this.EGL, var1);
   }
}
