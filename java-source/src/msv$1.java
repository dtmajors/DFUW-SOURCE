import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class msv$1 implements ActionListener {
   msv$1(msv var1) {
      this.EvN = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      msv.a(this.EvN, new msj(msv.a(this.EvN)));
      msv.b(this.EvN).e(msv.a(this.EvN));
   }
}
