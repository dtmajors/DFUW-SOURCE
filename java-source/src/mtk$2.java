import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtk$2 implements ActionListener {
   mtk$2(mtk var1) {
      this.Eya = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mtk.a(this.Eya, new msj(mtk.c(this.Eya)));
      mtk.b(this.Eya).e(mtk.c(this.Eya));
   }
}
