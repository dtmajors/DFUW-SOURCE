import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mvy$4 implements ActionListener {
   mvy$4(mvy var1) {
      this.ENn = var1;
   }

   @Override
   public final void actionPerformed(ActionEvent var1) {
      mvy.b(this.ENn, mvy.c(this.ENn).eDr());
   }
}
