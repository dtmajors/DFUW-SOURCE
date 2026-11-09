import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class kzw$2 implements ActionListener {
   kzw$2(kzw var1) {
      this.qpj = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (kzw.b(this.qpj)) {
         kzw.c(this.qpj, kzw.d(this.qpj).getSelectedItem().toString());
      }
   }
}
