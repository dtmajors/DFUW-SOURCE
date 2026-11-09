import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpz$2 implements ActionListener {
   mpz$2(mpz var1) {
      this.DYa = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var2 = Float.parseFloat(mpz.j(this.DYa).getText());
      this.DYa.DEC.b(new mpz$2$1(this, var2));
   }
}
