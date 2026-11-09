import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mvy$10 implements ActionListener {
   mvy$10(mvy var1) {
      this.ENn = var1;
   }

   @Override
   public final void actionPerformed(ActionEvent var1) {
      mvy.a(this.ENn, Integer.parseInt((String)mvy.j(this.ENn).getSelectedItem()));
   }
}
