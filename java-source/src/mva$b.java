import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mva$b extends MouseAdapter {
   mva$b(mva var1) {
      this.EJt = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getModifiers() == 4) {
         mva.b(this.EJt).show(var1.getComponent(), var1.getX(), var1.getY());
         Component var2 = (Component)var1.getSource();
         if (var2.equals(mva.c(this.EJt).getList())) {
            int var3 = mva.c(this.EJt).eDp();
         }
      }
   }
}
