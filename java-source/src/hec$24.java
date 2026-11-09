import java.util.ArrayList;
import java.util.Collection;

class hec$24 implements lbi<fls> {
   hec$24(hec var1) {
      this.kdd = var1;
   }

   public void b(fls var1) {
      assert hec.n(this.kdd);
      if (var1.iPx != null) {
         if (var1.aO() != null) {
            if (var1.aXQ == null) {
            }

            hee var2 = this.kdd.kcj.af(var1.aO(), var1.aXQ);
            if (var2 != null) {
               ArrayList var3 = new ArrayList();

               for (bsf var5 : var1.iPx.values()) {
                  ldv var6 = var5.getGUID();
                  hdu var7 = this.kdd.kcj.kaV.qS(var6);
                  if (var7 == null) {
                     hdv var8 = hec.a(this.kdd, var5);
                     if (var8 == null) {
                        continue;
                     }

                     var7 = var8.a(this.kdd.kcj.kaV, var6);
                  }

                  var3.add(var7);
                  if (var7 != null) {
                     var7.a(var5);
                  }
               }

               if (var2 == this.kdd.kck.kyz) {
                  Collection var9 = this.kdd.kck.kyz.cfh();
                  Collection var10 = lin.a(var9, hea.class);
                  var3.addAll(var10);
               }

               var2.a(var3, var1.iPz, var1.iPy);
            }
         }
      }
   }
}
