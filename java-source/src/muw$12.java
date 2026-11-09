import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class muw$12 implements ActionListener {
   muw$12(muw var1) {
      this.EJb = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mkb var2 = new mkb();
      var2.setCurrentDirectory(new jrw(muw.EHZ));
      int var3 = var2.showOpenDialog(muw.d(this.EJb));
      if (var3 == 0) {
         muw.a(this.EJb, var2.eDc());
      }
   }
}
