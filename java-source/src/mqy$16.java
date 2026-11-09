import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mqy$16 implements ActionListener {
   mqy$16(mqy var1) {
      this.Ehw = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mqy.c(this.Ehw).jq(mqy.d(this.Ehw).isSelected());
      mqy.b(this.Ehw);
   }
}
