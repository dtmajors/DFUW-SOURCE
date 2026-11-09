import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrn$1 implements ActionListener {
   mrn$1(mrn var1) {
      this.Elm = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mrn.a(this.Elm).repaint();
   }
}
