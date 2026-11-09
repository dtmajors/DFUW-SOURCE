import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mvl$1 implements ActionListener {
   mvl$1(mvl var1) {
      this.ELb = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      float var2 = Float.parseFloat(mvl.a(this.ELb).getText());
      if (mvl.b(this.ELb) != null) {
         mvl.b(this.ELb).setRadius(var2);
      }
   }
}
