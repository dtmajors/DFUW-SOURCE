import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtg$1 implements ActionListener {
   mtg$1(mtg var1) {
      this.ExF = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mtg.a(this.ExF, new msj(mtg.a(this.ExF)));
      mtg.b(this.ExF).e(mtg.a(this.ExF));
   }
}
