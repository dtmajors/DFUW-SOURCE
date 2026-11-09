import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mvm$2 implements ActionListener {
   mvm$2(mvm var1) {
      this.ELf = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      muj var2 = new muj(mvm.b(this.ELf));
      var2.p(mvm.a(this.ELf));
      mvm.a(this.ELf).eCu().add(var2);
      var2.setVisible(true);
   }
}
