import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mkb$b$11 implements ActionListener {
   mkb$b$11(mkb$b var1) {
      this.DFa = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int var2 = mkb$b.a(this.DFa).getSelectedIndex();
      if (var2 != -1 && var2 > 0) {
         String var3 = (String)mkb.g(this.DFa.DEO).remove(var2);
         mkb.g(this.DFa.DEO).add(var2 - 1, var3);
         mkb$b.a(this.DFa).setSelectedIndex(var2 - 1);
      }

      mkb$b.a(this.DFa).updateUI();
   }
}
