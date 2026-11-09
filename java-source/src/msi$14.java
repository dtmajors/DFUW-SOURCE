import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class msi$14 extends MouseAdapter {
   msi$14(msi var1) {
      this.EtH = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      Boolean var2 = false;
      String var3 = (String)msi.x(this.EtH).getSelectedValue();
      if (var3 != null) {
         msi.a(this.EtH, msi.j(this.EtH), msi.k(this.EtH), var3);
         msi.a(this.EtH, msi.y(this.EtH), msi.z(this.EtH), var3);
      }
   }
}
