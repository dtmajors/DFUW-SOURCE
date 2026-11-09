import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mmh$a extends MouseAdapter {
   mmh$a(mmh var1) {
      this.DMR = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (var1.getModifiers() == 4) {
         Component var2 = (Component)var1.getSource();
         if (var2.equals(mmh.h(this.DMR).getList())) {
            mmh.i(this.DMR).show(var1.getComponent(), var1.getX(), var1.getY());
         }

         if (var2.equals(mmh.j(this.DMR).getList())) {
            mmh.k(this.DMR).show(var1.getComponent(), var1.getX(), var1.getY());
         }
      } else if (var1.getModifiers() == 16 && var1.getClickCount() == 2) {
         lfn.b(0, "SFMouseHandler", "mousePressed() : DOUBLE KLIKKK!!");
         Component var5 = (Component)var1.getSource();
         if (var5.equals(mmh.j(this.DMR).getList())) {
            lkp var3 = (lkp)mmh.j(this.DMR).getList().getSelectedValue();
            if (var3 != null) {
               mlw var4 = new mlw(mmh.l(this.DMR), mmh.m(this.DMR), mmh.b(this.DMR));
               var4.d(var3);
               mmh.l(this.DMR).eCu().add(var4);
               var4.setVisible(true);
            }
         }
      }
   }
}
