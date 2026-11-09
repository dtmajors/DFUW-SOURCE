import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mtv$7 extends MouseAdapter {
   mtv$7(mtv var1) {
      this.EEq = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() == 1 && var1.getClickCount() == 2) {
         mtv.a(this.EEq, mtv.b(this.EEq), mtv.b(this.EEq).eIv(), mtv.b(this.EEq).eDc().getName());
      }
   }
}
