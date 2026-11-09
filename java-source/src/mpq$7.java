import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mpq$7 implements ActionListener {
   mpq$7(mpq var1, String var2) {
      this.DWB = var1;
      this.DWG = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mpq.b(this.DWB).jf(this.DWG);
      mpq.c(this.DWB).removeAll();
      mpq.d(this.DWB);
   }
}
