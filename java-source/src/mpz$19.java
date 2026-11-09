import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpz$19 implements ActionListener {
   mpz$19(mpz var1) {
      this.DYa = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var2 = Float.parseFloat(mpz.i(this.DYa).getText());
      this.DYa.DEC.b(new mpz$19$1(this, var2));
   }
}
