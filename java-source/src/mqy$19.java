import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mqy$19 implements ActionListener {
   mqy$19(mqy var1) {
      this.Ehw = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mqy.c(this.Ehw).ir(Float.parseFloat(mqy.g(this.Ehw).getText()));
      mqy.b(this.Ehw);
   }
}
