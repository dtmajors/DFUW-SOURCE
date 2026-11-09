import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mvy$1 implements ActionListener {
   mvy$1(mvy var1) {
      this.ENn = var1;
   }

   @Override
   public final void actionPerformed(ActionEvent var1) {
      mvy.a(this.ENn, mvy.a(this.ENn).eDr());
   }
}
