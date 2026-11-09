import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class lap$3 implements ActionListener {
   lap$3(lap var1) {
      this.qtk = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.qtk.setVisible(false);
   }
}
