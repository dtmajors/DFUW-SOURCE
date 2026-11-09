import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpz$4 implements ActionListener {
   mpz$4(mpz var1) {
      this.DYa = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var2 = Float.parseFloat(mpz.l(this.DYa).getText());
      this.DYa.DEC.b(new mpz$4$1(this, var2));
   }
}
