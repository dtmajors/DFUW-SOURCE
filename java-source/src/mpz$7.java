import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpz$7 implements ActionListener {
   mpz$7(mpz var1) {
      this.DYa = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (!mpz.o(this.DYa).isSelected()) {
         mpz.DXY = null;
      } else {
         this.DYa.eIY();
      }
   }
}
