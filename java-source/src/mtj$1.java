import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtj$1 implements ActionListener {
   mtj$1(mtj var1) {
      this.ExO = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mtj.a(this.ExO, new msj(mtj.a(this.ExO)));
      mtj.b(this.ExO).e(mtj.a(this.ExO));
   }
}
