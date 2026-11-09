import java.util.ArrayList;
import java.util.Collection;

class hjh$1 implements lbi<gjh> {
   hjh$1(hjh var1) {
      this.kyZ = var1;
   }

   public void b(gjh var1) {
      if (var1.jjf == 2) {
         ArrayList var2 = new ArrayList();

         for (cxc var6 : var1.jiJ) {
            hea var7 = hjh.a(this.kyZ).kaV.qU(var6.getGUID());
            if (var7 == null) {
               hdx var8 = hdx.LX(var6.zg());
               var7 = new hea(hjh.a(this.kyZ).kaV, var6.getGUID(), var8);
            }

            var7.a(var6);
            var2.add(var7);
         }

         Collection var9 = this.kyZ.kyz.cfh();
         Collection var10 = lin.b(var9, hea.class);
         ArrayList var11 = new ArrayList(var10);
         var11.addAll(var2);
         this.kyZ.kyz.l(var11);
      }
   }
}
