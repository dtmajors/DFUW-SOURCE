import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mlh$2 implements ActionListener {
   mlh$2(mlh var1, int var2) {
      this.DIX = var1;
      this.DIY = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mlh.b(this.DIX, var1, this.DIY);
   }
}
