import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class msw$2 implements ActionListener {
   msw$2(msw var1) {
      this.Ewq = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      msw.a(this.Ewq, new msj(msw.c(this.Ewq)));
      msw.b(this.Ewq).e(msw.c(this.Ewq));
   }
}
