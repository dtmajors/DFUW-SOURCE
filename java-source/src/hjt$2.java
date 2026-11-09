import java.util.HashMap;
import java.util.Iterator;

class hjt$2 implements lbi<fxx> {
   hjt$2(hjt var1) {
      this.kAU = var1;
   }

   public void a(fxx var1) {
      if (hjt.a(this.kAU) == null) {
         hjt.a(this.kAU, var1.aO());
      }

      if (hjt.a(this.kAU).equals(var1.aO())) {
         int var2 = var1.jaP.length;
         if (var2 >= 10) {
            var2 = 10;
         }

         HashMap var3 = new HashMap();

         for (int var4 = 0; var4 < var2; var4++) {
            lip var5 = var1.jaP[var4].eiq;
            var3.put(var5, var1.jaP[var4]);
         }

         boolean var9 = false;

         for (lip var6 : var3.keySet()) {
            cbi var7 = (cbi)var3.get(var6);
            if (hjt.b(this.kAU).containsKey(var6)) {
               hek var8 = (hek)hjt.b(this.kAU).get(var6);
               var8.a(var7.afF, var7.eiq, var7.eiM, var7.eiL, var7.eiN, var7.dMT, var7.Qw, var7.aGr, var7.aGA);
            } else {
               hek var13 = new hek(var6);
               hjt.b(this.kAU).put(var6, var13);
               var13.a(var7.afF, var7.eiq, var7.eiM, var7.eiL, var7.eiN, var7.dMT, var7.Qw, var7.aGr, var7.aGA);
               var9 = true;
            }
         }

         Iterator var11 = hjt.b(this.kAU).keySet().iterator();

         while (var11.hasNext()) {
            lip var12 = (lip)var11.next();
            if (!var3.containsKey(var12)) {
               var9 = true;
               var11.remove();
            }
         }

         if (var9) {
            hjt.c(this.kAU).enp();
         }
      }
   }
}
