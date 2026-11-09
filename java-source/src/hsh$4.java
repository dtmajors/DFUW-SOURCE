import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

class hsh$4 implements lbi<jpp> {
   hsh$4(hsh var1) {
      this.lbP = var1;
   }

   public final void b(jpp var1) {
      hsh.a(this.lbP, var1);
      switch (var1.nNJ) {
         case 256:
         case 260:
            int var10 = var1.nNK;
            int var11 = var1.nNL & 65535;
            boolean var12 = (var1.nNL & 1073741824) != 0;
            hsh.a(this.lbP, var10, true);
            EnumSet var5 = EnumSet.copyOf(hsh.d(this.lbP));
            var5.removeAll(jpn.nLP);
            Set var13 = Collections.unmodifiableSet(var5);

            for (int var6 = 0; var6 < var11; var6++) {
               this.lbP.c(var10, var12, var13);
               var12 = true;
            }
            break;
         case 257:
         case 261:
            int var9 = var1.nNK;
            hsh.a(this.lbP, var9, false);
            this.lbP.Nq(var9);
            break;
         case 258:
            char var8 = (char)var1.nNK;
            int var3 = var1.nNL & 65535;

            for (int var4 = 0; var4 < var3; var4++) {
               this.lbP.h(var8);
            }
            break;
         case 512:
            this.On(var1.nNL);
            break;
         case 513:
            this.On(var1.nNL);
            this.lbP.nY(false);
            break;
         case 514:
            this.On(var1.nNL);
            this.lbP.cqL();
            break;
         case 515:
            this.On(var1.nNL);
            this.lbP.nY(true);
            break;
         case 522:
            this.On(var1.nNL);
            int var2 = var1.nNK >> 16;
            var2 /= 120;
            if (var2 != 0) {
               this.lbP.Np(var2);
            }
      }

      hsh.a(this.lbP, null);
   }

   private void On(int var1) {
      short var2 = (short)(var1 & 65535);
      int var3 = var1 >> 16;
      if (var2 != hsh.e(this.lbP) || var3 != hsh.f(this.lbP)) {
         hsh.a(this.lbP, var2);
         hsh.b(this.lbP, var3);
         this.lbP.B(new lgg(var2, var3));
      }
   }
}
