import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mte$1 implements ActionListener {
   mte$1(mte var1) {
      this.Exs = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mte.a(this.Exs, new msj(mte.a(this.Exs)));
      mte.b(this.Exs).e(mte.a(this.Exs));
   }
}
