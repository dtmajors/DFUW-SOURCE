import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mrx$3 extends MouseAdapter {
   mrx$3(mrx var1) {
      this.Eop = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      int var2 = this.Eop.DHd.getSelectedIndex();
      if (var2 != -1) {
         String var3 = this.Eop.DHd.getSelectedValue().toString();
         mrx.c(this.Eop).wu(var3);
         mrx.a(this.Eop);
      }
   }
}
