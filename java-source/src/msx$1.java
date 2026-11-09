import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class msx$1 implements ActionListener {
   msx$1(msx var1) {
      this.Ewz = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      msx.a(this.Ewz, new msj(msx.a(this.Ewz)));
      msx.b(this.Ewz).h(msx.a(this.Ewz));
   }
}
