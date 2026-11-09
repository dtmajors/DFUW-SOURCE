import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mta$1 implements ActionListener {
   mta$1(mta var1) {
      this.EwY = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mta.a(this.EwY, new msj(mta.a(this.EwY)));
      mta.b(this.EwY).e(mta.a(this.EwY));
   }
}
