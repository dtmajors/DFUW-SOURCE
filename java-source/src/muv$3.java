import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class muv$3 implements ActionListener {
   muv$3(muv var1) {
      this.EHU = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      muv.a(this.EHU, var1);
   }
}
