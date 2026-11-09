import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mlh$13 implements ActionListener {
   mlh$13(mlh var1, int var2) {
      this.DIX = var1;
      this.DIY = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mlh.a(this.DIX, var1, this.DIY);
   }
}
