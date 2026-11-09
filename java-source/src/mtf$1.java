import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtf$1 implements ActionListener {
   mtf$1(mtf var1) {
      this.Exx = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mtf.a(this.Exx, new msj(mtf.a(this.Exx)));
      mtf.b(this.Exx).f(mtf.a(this.Exx));
   }
}
