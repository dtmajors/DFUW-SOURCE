import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpz$13 implements ActionListener {
   mpz$13(mpz var1) {
      this.DYa = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var2 = Float.parseFloat(mpz.c(this.DYa).getText());
      this.DYa.DEC.b(new mpz$13$1(this, var2));
   }
}
