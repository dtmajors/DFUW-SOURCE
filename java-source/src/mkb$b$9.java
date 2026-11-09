import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mkb$b$9 implements ActionListener {
   mkb$b$9(mkb$b var1) {
      this.DFa = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      jrw var2 = this.DFa.DEO.eDd();
      mkb.g(this.DFa.DEO).add(var2.getAbsolutePath());
      mkb$b.a(this.DFa).updateUI();
   }
}
