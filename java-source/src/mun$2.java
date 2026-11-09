import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mun$2 implements ActionListener {
   mun$2(mun var1) {
      this.EGO = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mun.a(this.EGO, var1);
   }
}
