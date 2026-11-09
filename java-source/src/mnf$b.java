import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mnf$b extends MouseAdapter {
   mnf$b(mnf var1) {
      this.DOK = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getModifiers() == 4) {
         this.DOK.DOr = mnf.a(this.DOK).getFirstCellForLocation(var1.getX(), var1.getY());
         if (this.DOK.DOr != null) {
            this.DOK.DOr = mnf.a(this.DOK).getSelectionCell();
            mnf.f(this.DOK).show(var1.getComponent(), var1.getX(), var1.getY());
         } else {
            lfn.print("POPUP NOT POPUP");
         }
      }
   }
}
