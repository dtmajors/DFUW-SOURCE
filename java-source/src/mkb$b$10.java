import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mkb$b$10 implements ActionListener {
   mkb$b$10(mkb$b var1) {
      this.DFa = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = mkb$b.a(this.DFa).getSelectedIndex();
      if (var2 != -1) {
         mkb.g(this.DFa.DEO).remove(var2);
      }

      mkb$b.a(this.DFa).updateUI();
   }
}
