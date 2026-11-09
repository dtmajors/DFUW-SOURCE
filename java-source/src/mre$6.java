import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mre$6 implements ActionListener {
   mre$6(mre var1) {
      this.Eiu = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (!mre.b(this.Eiu).isCleanedUp()) {
         ljq var2 = mje.DBl;
         var2.et(mre.b(this.Eiu).av());
         if (mre.b(this.Eiu).byi().axv() == 0) {
            mre.b(this.Eiu).byi().dg(var2.eqN() / 4.0F);
         } else {
            mre.b(this.Eiu).byi().setMaxRadius(var2.eqN());
         }

         mre.b(this.Eiu).byg();
         this.Eiu.eKi();
      }
   }
}
