import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mvy$5 implements ActionListener {
   mvy$5(mvy var1) {
      this.ENn = var1;
   }

   @Override
   public final void actionPerformed(ActionEvent var1) {
      mvy.c(this.ENn, mvy.d(this.ENn).eDr());
   }
}
