import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mrm$2 implements ActionListener {
   mrm$2(mrm var1) {
      this.EkP = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.EkP.cDP();
      this.EkP.setVisible(false);
   }
}
