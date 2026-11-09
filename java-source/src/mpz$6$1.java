import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class mpz$6$1 implements ChangeListener {
   mpz$6$1(mpz$6 var1, mjp var2) {
      this.DYl = var1;
      this.DYh = var2;
   }

   @Override
   public final void stateChanged(ChangeEvent var1) {
      lco var2 = new lco(this.DYh.getColor());
      this.DYl.DYa.DEC.b(new mpz$6$1$1(this, var2));
      mpz.n(this.DYl.DYa).setBackground(this.DYh.getColor());
   }
}
