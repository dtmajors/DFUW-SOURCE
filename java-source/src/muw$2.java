import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class muw$2 implements ActionListener {
   muw$2(muw var1) {
      this.EJb = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mkb var2 = new mkb();
      var2.setCurrentDirectory(new jrw(muw.EHV));
      int var3 = var2.showOpenDialog(muw.d(this.EJb));
      if (var3 == 0 && var2.eDc() != null) {
         muw.c(this.EJb, var2.eDc());
      }
   }
}
