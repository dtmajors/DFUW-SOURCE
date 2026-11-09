import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class muv$4 implements ActionListener {
   muv$4(muv var1) {
      this.EHU = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      muv.b(this.EHU, var1);
   }
}
