import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrn$2 implements ActionListener {
   mrn$2(mrn var1) {
      this.Elm = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrn.b(this.Elm);
   }
}
