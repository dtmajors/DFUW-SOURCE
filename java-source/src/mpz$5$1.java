import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mpz$5$1 implements ChangeListener {
   mpz$5$1(mpz$5 var1, mjp var2) {
      this.DYi = var1;
      this.DYh = var2;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      lco var2 = new lco(this.DYh.getColor());
      this.DYi.DYa.DEC.b(new mpz$5$1$1(this, var2));
      mpz.m(this.DYi.DYa).setBackground(this.DYh.getColor());
   }
}
