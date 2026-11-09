import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class muv$5 implements ActionListener {
   muv$5(muv var1) {
      this.EHU = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      muv.c(this.EHU, var1);
   }
}
