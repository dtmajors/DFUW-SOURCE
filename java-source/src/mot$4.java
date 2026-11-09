import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mot$4 implements ActionListener {
   mot$4(mot var1) {
      this.DTx = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mot.a(this.DTx);
   }
}
