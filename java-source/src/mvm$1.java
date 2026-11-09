import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mvm$1 implements ActionListener {
   mvm$1(mvm var1) {
      this.ELf = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      mvn var2 = new mvn(this.ELf);
      var2.setLocation(mvm.a(this.ELf).getX() + 5, mvm.a(this.ELf).getY() + 5);
      var2.setVisible(true);
   }
}
