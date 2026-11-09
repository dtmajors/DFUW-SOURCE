import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class muv$10 implements ActionListener {
   muv$10(muv var1) {
      this.EHU = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      muv.h(this.EHU, var1);
   }
}
