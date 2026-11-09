import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mmg$a extends MouseAdapter {
   mmg$a(mmg var1) {
      this.DMB = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getModifiers() == 4) {
         Component var2 = (Component)var1.getSource();
         if (var2.equals(mmg.j(this.DMB))) {
            mmg.k(this.DMB).show(var1.getComponent(), var1.getX(), var1.getY());
         } else if (var2.equals(mmg.l(this.DMB))) {
            mmg.m(this.DMB).show(var1.getComponent(), var1.getX(), var1.getY());
         } else if (var2.equals(mmg.n(this.DMB))) {
            mmg.o(this.DMB).show(var1.getComponent(), var1.getX(), var1.getY());
         }
      } else if (var1.getModifiers() == 16 && var1.getClickCount() == 2) {
         lfn.b(0, "SFMouseHandler", "mousePressed() : DOUBLE KLIKKK!!");
         Component var5 = (Component)var1.getSource();
         if (var5.equals(mmg.l(this.DMB))) {
            lkp var3 = (lkp)mmg.l(this.DMB).getSelectedValue();
            if (var3 != null) {
               mlw var4 = new mlw(mmg.p(this.DMB), mmg.q(this.DMB), mmg.b(this.DMB));
               var4.d(var3);
               mmg.p(this.DMB).eCu().add(var4);
               var4.setVisible(true);
            }
         } else if (var5.equals(mmg.n(this.DMB))) {
         }
      }
   }
}
