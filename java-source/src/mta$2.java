import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mta$2 implements ActionListener {
   mta$2(mta var1) {
      this.EwY = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mta.a(this.EwY, new msj(mta.c(this.EwY)));
      mta.b(this.EwY).e(mta.c(this.EwY));
   }
}
