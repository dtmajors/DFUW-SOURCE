import javax.swing.SwingUtilities;
import mjj.a;

class eg$4 implements a {
   eg$4(eg var1) {
      this.tn = var1;
   }

   @Override
   public void a(ktv var1, Object var2) {
      kxc var3 = (kxc)var1;
      SwingUtilities.invokeLater(new eg$4$1(this, var3));
   }
}
