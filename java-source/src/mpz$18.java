import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpz$18 implements ActionListener {
   mpz$18(mpz var1) {
      this.DYa = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var2 = Float.parseFloat(mpz.h(this.DYa).getText());
      this.DYa.DEC.b(new mpz$18$1(this, var2));
   }
}
