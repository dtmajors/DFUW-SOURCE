import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mlz$2 implements ActionListener {
   mlz$2(mlz var1) {
      this.DLU = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mlz.i(this.DLU, var1);
   }
}
