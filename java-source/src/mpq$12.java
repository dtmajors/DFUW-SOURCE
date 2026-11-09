import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

class mpq$12 implements ActionListener {
   mpq$12(mpq var1, mjc.b var2, JTextField var3) {
      this.DWB = var1;
      this.DWD = var2;
      this.DDz = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String var2 = this.DWD.Dzp;
      if (var2 == null) {
         var2 = "xml";
      }

      mpq.a(this.DWB, this.DDz, var2);
   }
}
