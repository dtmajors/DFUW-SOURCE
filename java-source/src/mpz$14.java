import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpz$14 implements ActionListener {
   mpz$14(mpz var1) {
      this.DYa = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var2 = Float.parseFloat(mpz.d(this.DYa).getText());
      this.DYa.DEC.b(new mpz$14$1(this, var2));
   }
}
