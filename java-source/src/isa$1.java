final class isa$1 extends iqz {
   @Override
   public void e(ipf var1) {
      isa var2 = (isa)var1;
      int var3 = 0;
      int var4 = 0;

      for (int var5 = 0; var5 < var2.bfn(); var5++) {
         ipf var6 = var2.RO(var5);
         if (var6.djL() && var6 != isa.b(var2) && var6 != isa.c(var2) && var6 != isa.d(var2)) {
            var3 += var6.getWidth();
            var4 = Math.max(var4, var6.getHeight());
         }
      }

      if (isa.b(var2) != null) {
         var4 += var2.dpc();
      }

      var2.setSize(var3, var4);
   }

   @Override
   public void i(ipf var1) {
      isa var2 = (isa)var1;
      boolean var3 = hso.cxK().cxN() == jnz.nFE;
      boolean var4 = var2.doR() && !var3;
      int var5 = isa.b(var2) != null ? var2.dpc() : 0;
      int var6 = var2.getHeight() - var5;
      if (isa.c(var2) != null) {
         if (!var3) {
            isa.c(var2).r(0, var5, var2.getWidth(), var6);
         } else {
            isa.c(var2).r(0, var5, Math.min(isa.e(var2).getWidth(), var2.getWidth()), var6);
         }
      }

      if (isa.d(var2) != null) {
         iwx var7 = null;
         if (isa.e(var2) != null) {
            for (int var8 = isa.e(var2).bfn() - 1; var8 >= 0; var8--) {
               ipf var9 = isa.e(var2).RO(var8);
               if (var9 instanceof iwx) {
                  var7 = (iwx)var9;
                  break;
               }
            }
         }

         if (isa.d(var2).djL()) {
            isa.d(var2).ek(isa.e(var2).getWidth(), var5);
            if (var7 != null) {
               var7.setVisible(false);
            }
         } else if (var7 != null) {
            var7.setVisible(true);
         }
      }

      if (isa.f(var2) != null) {
         isa.f(var2).setVisible(var4);
      }

      if (isa.g(var2) != null) {
         isa.g(var2).setVisible(var4);
      }

      for (int var11 = var2.bfn() - 5; var11 >= 0; var11--) {
         ipf var13 = var2.RO(var11);
         if (var13 == isa.h(var2)) {
            break;
         }

         var13.setVisible(var4);
      }

      int var12 = var2.dpd();

      for (int var14 = 0; var14 < var2.bfn(); var14++) {
         ipf var16 = var2.RO(var14);
         if (var16 == isa.h(var2)) {
            break;
         }

         if (var16.djL() && var16 != isa.c(var2) && var16 != isa.d(var2) && var16 != isa.b(var2)) {
            var16.r(var12, var5, var16.getWidth(), var6);
            var12 += var16.getWidth();
         }
      }

      int var15 = var2.getWidth() - var2.dpe();

      for (int var17 = var2.bfn() - 1; var17 >= 0; var17--) {
         ipf var10 = var2.RO(var17);
         if (var10 == isa.h(var2)) {
            break;
         }

         if (var10.djL() && var10 != isa.c(var2) && var10 != isa.d(var2) && var10 != isa.b(var2)) {
            var15 -= var10.getWidth();
            var10.r(var15, var5, var10.getWidth(), var6);
         }
      }

      if (!var3) {
         isa.h(var2).r(var12, var5, var15 - var12, var6);
      } else {
         isa.h(var2).r(0, var5, Math.min(isa.e(var2).getWidth(), var2.getWidth()), var6);
      }

      if (isa.b(var2) != null) {
         if (!var3) {
            isa.b(var2).r(0, 0, var2.getWidth(), var2.getHeight());
         } else {
            isa.b(var2).r(0, 0, Math.min(isa.e(var2).getWidth() + (isa.d(var2) != null ? isa.d(var2).getWidth() : 0), var2.getWidth()), var2.getHeight());
         }
      }
   }
}
