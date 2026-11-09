import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mot$a extends MouseAdapter {
   mot$a(mot var1) {
      this.DTx = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      Component var2 = (Component)var1.getSource();
      if (var1.getModifiers() == 4) {
         if (var2.equals(mot.b(this.DTx).getList())) {
            mot.c(this.DTx).show(var1.getComponent(), var1.getX(), var1.getY());
            int var3 = mot.b(this.DTx).getList().locationToIndex(new Point(var1.getX(), var1.getY()));
            mot.b(this.DTx).getList().setSelectedIndex(var3);
         }
      } else if (var1.getModifiers() == 16 && var1.getClickCount() == 2 && var2.equals(mot.b(this.DTx).getList())) {
         eh var5 = (eh)mot.b(this.DTx).getList().getSelectedValue();
         if (var5 != null) {
            if (mot.a(this.DTx, mot.d(this.DTx))) {
               var5.ac(0);
            } else {
               var5.ac(1);
            }

            mmr var4 = new mmr(mot.d(this.DTx), var5);
            var4.p(mot.e(this.DTx));
            mot.e(this.DTx).eCu().add(var4);
            var4.setVisible(true);
         }
      }
   }
}
