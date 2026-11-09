import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class muw$5 implements ActionListener {
   muw$5(muw var1, String var2) {
      this.EJb = var1;
      this.EJc = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      muw.m(this.EJb);
      muw.q(this.EJb).DY(muw.EHV + "/" + this.EJc);
      muw.q(this.EJb).c(new jrw(muw.EHV), new jrw(muw.EHV + "/" + this.EJc));
   }
}
