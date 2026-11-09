import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class msi$6 implements ActionListener {
   msi$6(msi var1) {
      this.EtH = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      msi.a(this.EtH, new msj(msi.W(this.EtH)));
      msi.b(this.EtH).e(msi.W(this.EtH));
   }
}
