import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpz$1 implements ActionListener {
   mpz$1(mpz var1) {
      this.DYa = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var2 = Float.parseFloat(mpz.a(this.DYa).getText());
      if (var2 > 800.0F) {
         var2 = 800.0F;
         mpz.a(this.DYa).setText("800");
      }

      if (var2 < 0.0F) {
         var2 = 0.0F;
         mpz.a(this.DYa).setText("0.0");
      }

      float var3 = var2;
      this.DYa.DEC.b(new mpz$1$1(this, var3));
   }
}
