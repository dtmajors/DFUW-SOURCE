import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpz$12 implements ActionListener {
   mpz$12(mpz var1) {
      this.DYa = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var2 = Float.parseFloat(mpz.b(this.DYa).getText());
      if (var2 > 800.0F) {
         var2 = 800.0F;
         mpz.b(this.DYa).setText("800");
      }

      if (var2 < 0.1F) {
         var2 = 0.1F;
         mpz.b(this.DYa).setText("0.1");
      }

      float var3 = var2;
      this.DYa.DEC.b(new mpz$12$1(this, var3));
   }
}
