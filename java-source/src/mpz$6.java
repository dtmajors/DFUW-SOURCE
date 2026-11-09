import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpz$6 implements ActionListener {
   mpz$6(mpz var1) {
      this.DYa = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      lco var2 = this.DYa.DXX.bxE().bmM();
      Color var3 = new Color(var2.qwk, var2.qwl, var2.qwm);
      mjp var4 = new mjp(var3, "Choose Color for light ");
      mpz.n(this.DYa).setBackground(var3);
      var4.getColorSelectionModel().addChangeListener(new mpz$6$1(this, var4));
      this.DYa.DEC.eCu().add(var4);
      var4.setVisible(true);
   }
}
