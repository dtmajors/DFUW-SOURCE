import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mum$3 implements ActionListener {
   mum$3(mum var1) {
      this.EGL = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mum.c(this.EGL, var1);
   }
}
