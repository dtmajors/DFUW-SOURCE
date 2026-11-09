import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class mrr$4 extends MouseAdapter {
   mrr$4(mrr var1) {
      this.EmC = var1;
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      Object var2 = mrr.a(this.EmC).getSelectedValue();
      if (var2 != null) {
         mrr.b(this.EmC).clear();
         mrr.c(this.EmC).setListData(mrr.b(this.EmC));
         mrr.d(this.EmC).clear();
         mrr.e(this.EmC).setListData(mrr.d(this.EmC));
         String var3 = "r_" + var2.toString();
         int var4 = lea.enW().getType(var3);
         Map var5 = lea.eoJ();
         ctq var6 = (ctq)var5.get(var4);
         if (var6 != null) {
            List var7 = var6.fgc;
            if (var7 != null) {
               for (int var8 = 0; var8 < var7.size(); var8++) {
                  Object var9 = var7.get(var8);
                  if (var9 instanceof cto) {
                     cto var19 = (cto)var9;
                     int var21 = var19.ResourceType;
                     float var24 = var19.Probability;
                     String var27 = cug.uG(var21);
                     mrr.b(this.EmC).add(var27 + " : " + var24);
                  } else if (var9 instanceof ArrayList) {
                     for (cto var12 : (ArrayList)var9) {
                        int var13 = var12.ResourceType;
                        float var14 = var12.Probability;
                        String var15 = cug.uG(var13);
                        mrr.b(this.EmC).add("Random : " + var15 + " : " + var14);
                     }
                  }
               }

               mrr.c(this.EmC).setListData(mrr.b(this.EmC));
            }

            List var17 = var6.fgg;
            if (var17 != null) {
               for (int var18 = 0; var18 < var17.size(); var18++) {
                  Object var20 = var17.get(var18);
                  if (var20 instanceof cto) {
                     cto var23 = (cto)var20;
                     int var26 = var23.ResourceType;
                     float var29 = var23.Probability;
                     String var31 = cug.uG(var26);
                     mrr.d(this.EmC).add(var31 + " : " + var29);
                  } else {
                     for (cto var28 : (ArrayList)var20) {
                        int var30 = var28.ResourceType;
                        float var32 = var28.Probability;
                        String var16 = cug.uG(var30);
                        mrr.d(this.EmC).add("Random : " + var16 + " : " + var32);
                     }
                  }
               }

               mrr.e(this.EmC).setListData(mrr.d(this.EmC));
            }
         }
      }
   }
}
