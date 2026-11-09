import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mvd$2 implements ActionListener {
   mvd$2(mvd var1) {
      this.EJO = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.EJO.setVisible(false);
   }
}
