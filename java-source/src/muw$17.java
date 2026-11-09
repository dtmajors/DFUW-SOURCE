import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class muw$17 implements ActionListener {
   muw$17(muw var1) {
      this.EJb = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mkb var2 = new mkb();
      var2.setCurrentDirectory(new jrw(muw.elW()));
      int var3 = var2.showOpenDialog(muw.d(this.EJb));
      if (var3 == 0) {
         jrw var4 = var2.eDc();
         muw.b(this.EJb, var4);
      }
   }
}
