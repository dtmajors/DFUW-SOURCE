import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpz$3 implements ActionListener {
   mpz$3(mpz var1) {
      this.DYa = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var2 = Float.parseFloat(mpz.k(this.DYa).getText());
      this.DYa.DEC.b(new mpz$3$1(this, var2));
   }
}
