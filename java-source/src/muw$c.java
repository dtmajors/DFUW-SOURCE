import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

class muw$c extends KeyAdapter {
   JTextField EJg;

   public muw$c(muw var1, JTextField var2) {
      this.EJb = var1;
      this.EJg = var2;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      String var2 = this.EJg.getText();
      this.b(var2, this.EJg);
   }

   public void b(String var1, JTextField var2) {
      try {
         Float.parseFloat(var1);
      } catch (NumberFormatException var4) {
         if (var1.length() > 0) {
            var1 = var1.substring(0, var1.length() - 1);
            var2.setText(var1);
            this.b(var1, var2);
         }
      }
   }
}
