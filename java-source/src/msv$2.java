import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class msv$2 implements ActionListener {
   msv$2(msv var1) {
      this.EvN = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      msv.a(this.EvN, new msj(msv.c(this.EvN)));
      msv.b(this.EvN).f(msv.c(this.EvN));
   }
}
