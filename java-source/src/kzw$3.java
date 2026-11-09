import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class kzw$3 implements ActionListener {
   kzw$3(kzw var1) {
      this.qpj = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (kzw.b(this.qpj)) {
         kzw.e(this.qpj);
      } else {
         kzw.f(this.qpj);
      }
   }
}
