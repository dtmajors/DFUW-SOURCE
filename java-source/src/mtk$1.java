import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mtk$1 implements ActionListener {
   mtk$1(mtk var1) {
      this.Eya = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mtk.a(this.Eya, new msj(mtk.a(this.Eya)));
      mtk.b(this.Eya).e(mtk.a(this.Eya));
   }
}
