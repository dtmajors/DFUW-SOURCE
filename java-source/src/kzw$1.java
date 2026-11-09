import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class kzw$1 implements ActionListener {
   kzw$1(kzw var1) {
      this.qpj = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      kzw.a(this.qpj).removeAll();
      if (kzw.b(this.qpj)) {
         kzw.a(this.qpj, kzw.c(this.qpj).getText());
      } else {
         kzw.b(this.qpj, kzw.c(this.qpj).getText());
      }
   }
}
