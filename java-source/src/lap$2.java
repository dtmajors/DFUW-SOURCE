import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class lap$2 implements ActionListener {
   lap$2(lap var1) {
      this.qtk = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      lap.a(this.qtk);
   }
}
