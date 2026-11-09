import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class mqk$a extends MouseAdapter {
   private mqk$a(mqk var1) {
      this.EdN = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() != 1) {
         if (var1.getButton() == 3) {
            mqk.c(this.EdN).eLJ();
         }
      } else {
         mqk.b(this.EdN, null);
         Point var2 = var1.getPoint();
         if (mqk.a(this.EdN) != null) {
            for (mqm var4 : mqk.a(this.EdN)) {
               Point var5 = var4.eGU();
               Dimension var6 = var4.getSize();
               int var7 = (int)(var6.width / 2.0);
               int var8 = (int)(var6.height / 2.0);
               Rectangle var9 = new Rectangle(var5.x - var7, var5.y - var8, var6.width, var6.height);
               if (var9.contains(var2)) {
                  mqk.b(this.EdN, var4);
                  break;
               }
            }
         }

         if (mqk.b(this.EdN) == null && mqk.c(this.EdN).eLV()) {
            ljq var10 = mqk.a(this.EdN, var2.x, var2.y);
            mqk.b(this.EdN, new mqm());
            mqk.b(this.EdN).t("Search Marker");
            mqk.b(this.EdN).eY(var10);
            mqk.b(this.EdN).gi("No Desc File");
            mqk.b(this.EdN).t("Search Here");
            mqk.b(this.EdN).a(mqm$a.Eel);
         }

         if (mqk.b(this.EdN) != null) {
            mqk.c(this.EdN).a(mqk.b(this.EdN));
            if (var1.getClickCount() == 2) {
               if (mqk.b(this.EdN).eJp() == mqm$a.Eed) {
                  mqk.c(this.EdN).c(mqk.b(this.EdN));
               } else if (mqk.b(this.EdN).eJp() == mqm$a.Eee) {
                  mqk.c(this.EdN).b(mqk.b(this.EdN));
               }
            }
         }
      }
   }
}
