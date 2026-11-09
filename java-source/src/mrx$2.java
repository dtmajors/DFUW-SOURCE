import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mrx$2 extends MouseAdapter {
   mrx$2(mrx var1) {
      this.Eop = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      String var2 = this.Eop.Eot.getText();
      if (var2 != null && !var2.trim().isEmpty()) {
         for (String var4 : mrx.b(this.Eop)) {
            if (var4.contains(var2)) {
               this.Eop.DHd.setSelectedValue(var4, true);
               mrx.a(this.Eop);
            }
         }
      }
   }
}
