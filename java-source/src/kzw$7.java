import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class kzw$7 implements ActionListener {
   kzw$7(kzw var1) {
      this.qpj = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (!kzw.h(this.qpj).isEmpty()) {
         for (int var2 = 0; var2 < kzw.h(this.qpj).size(); var2++) {
            ((kzl)kzw.h(this.qpj).get(var2)).xX(true);
         }
      }
   }
}
