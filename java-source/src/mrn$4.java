import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrn$4 implements ActionListener {
   mrn$4(mrn var1) {
      this.Elm = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrn.d(this.Elm);
   }
}
