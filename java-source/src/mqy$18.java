import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mqy$18 implements ActionListener {
   mqy$18(mqy var1) {
      this.Ehw = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mqy.c(this.Ehw).BO(Integer.parseInt(mqy.f(this.Ehw).getText()));
      mqy.b(this.Ehw);
   }
}
