import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mqy$20 implements ActionListener {
   mqy$20(mqy var1) {
      this.Ehw = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mqy.c(this.Ehw).is(Float.parseFloat(mqy.h(this.Ehw).getText()));
      mqy.b(this.Ehw);
   }
}
