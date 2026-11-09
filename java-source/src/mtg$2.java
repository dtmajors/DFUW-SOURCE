import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtg$2 implements ActionListener {
   mtg$2(mtg var1) {
      this.ExF = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mtg.a(this.ExF, new msj(mtg.c(this.ExF)));
      mtg.b(this.ExF).f(mtg.c(this.ExF));
   }
}
