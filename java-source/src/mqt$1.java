import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mqt$1 implements ActionListener {
   mqt$1(mqt var1) {
      this.EgG = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mqt.a(this.EgG, var1);
   }
}
