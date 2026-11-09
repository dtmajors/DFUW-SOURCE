final class iru$1 extends iqz {
   @Override
   public void e(ipf var1) {
      iru var2 = (iru)var1;
      int var3 = 0;
      int var4 = 0;
      if (var2.dlY() == ire.mul) {
         if (iru.b(var2) != null && iru.b(var2).djQ() != null) {
            var3 = iru.b(var2).getWidth() + iru.c(var2) * 2 - iru.d(var2) * 2;
         }
      } else if (iru.b(var2) != null && iru.b(var2).djQ() != null) {
         var4 = iru.b(var2).getHeight() + iru.c(var2) * 2 - iru.d(var2) * 2;
      }

      var2.setSize(var3, var4);
   }

   @Override
   public void i(ipf var1) {
      iru var2 = (iru)var1;
      if (var2.dlY() == ire.mul) {
         if (iru.e(var2) != null) {
            iru.e(var2).r(iru.b(var2).getWidth() % 2, 0, var2.getWidth(), var2.getHeight());
         }

         if (iru.b(var2) != null) {
            int var3 = iru.a(var2, var2.getHeight() - iru.c(var2) * 2, iru.f(var2));
            int var4 = iru.a(var2, var2.getHeight() - iru.c(var2) * 2, iru.f(var2) + iru.g(var2) - 1);
            int var5 = var4 - var3 + 1;
            int var6 = iru.b(var2).ctw();
            if (var5 < var6) {
               var5 = var6;
               int var7 = var2.getHeight() - var6 - iru.c(var2) * 2;
               if (var3 > var7) {
                  var3 = var7;
               }
            }

            int var13 = iru.b(var2).doE();
            if (var5 > var13) {
               var5 = var13;
               int var8 = var2.getHeight() - var13 - iru.c(var2) * 2;
               if (var3 > var8) {
                  var3 = var8;
               }
            }

            if (iru.f(var2) == iru.h(var2)) {
               var3 = 0;
            } else if (iru.f(var2) == iru.i(var2)) {
               var3 = var2.getHeight() - var5 - iru.c(var2) * 2;
            }

            iru.b(var2).r(var2.getWidth() / 2 - iru.b(var2).getWidth() / 2 - iru.c(var2) % 2, var3 + iru.c(var2), iru.b(var2).getWidth(), var5);
         }
      } else {
         if (iru.e(var2) != null) {
            iru.e(var2).r(0, iru.b(var2).getHeight() % 2, var2.getWidth(), var2.getHeight());
         }

         if (iru.b(var2) != null) {
            int var9 = iru.a(var2, var2.getWidth() - iru.c(var2) * 2, iru.f(var2));
            int var10 = iru.a(var2, var2.getWidth() - iru.c(var2) * 2, iru.f(var2) + iru.g(var2) - 1);
            int var11 = var10 - var9 + 1;
            int var12 = iru.b(var2).ctv();
            if (var11 < var12) {
               var11 = var12;
               int var14 = var2.getWidth() - var12 - iru.c(var2) * 2;
               if (var9 > var14) {
                  var9 = var14;
               }
            }

            int var15 = iru.b(var2).doD();
            if (var11 > var15) {
               var11 = var15;
               int var16 = var2.getWidth() - var15 - iru.c(var2) * 2;
               if (var9 > var16) {
                  var9 = var16;
               }
            }

            if (iru.f(var2) == iru.h(var2)) {
               var9 = 0;
            } else if (iru.f(var2) == iru.i(var2)) {
               var9 = var2.getWidth() - var11 - iru.c(var2) * 2;
            }

            iru.b(var2).r(var9 + iru.c(var2), var2.getHeight() / 2 - iru.b(var2).getHeight() / 2 - iru.c(var2) % 2, var11, iru.b(var2).getHeight());
         }
      }

      iru.b(var2).cqF();
   }
}
