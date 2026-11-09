import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class msw$3 implements ActionListener {
   msw$3(msw var1) {
      this.Ewq = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      msw.a(this.Ewq, new msj(msw.d(this.Ewq)));
      msw.b(this.Ewq).f(msw.d(this.Ewq));
   }
}
