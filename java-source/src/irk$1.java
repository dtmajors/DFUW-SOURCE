final class irk$1 extends iqz {
   @Override
   public void e(ipf var1) {
      irk var2 = (irk)var1;
      int var3 = 0;
      int var4 = 0;
      if (irk.a(var2) == ire.mul) {
         if (irk.b(var2) != null && irk.b(var2).djO()) {
            var3 = Math.max(var3, irk.b(var2).getWidth());
            var4 += irk.b(var2).getHeight();
         }

         if (irk.c(var2) != null && irk.c(var2).djO()) {
            var3 = Math.max(var3, irk.c(var2).getWidth());
            var4 += irk.c(var2).getHeight();
         }

         var4 += irk.d(var2);
      } else {
         if (irk.b(var2) != null && irk.b(var2).djO()) {
            var3 += irk.b(var2).getWidth();
            var4 = Math.max(var4, irk.b(var2).getHeight());
         }

         if (irk.c(var2) != null && irk.c(var2).djO()) {
            var3 += irk.c(var2).getWidth();
            var4 = Math.max(var4, irk.c(var2).getHeight());
         }

         var3 += irk.d(var2);
      }

      var2.setSize(var3, var4);
   }

   @Override
   public void i(ipf var1) {
      irk var2 = (irk)var1;
      if (irk.a(var2) == ire.mul) {
         irk.a(var2, irk.e(var2) != null ? irk.e(var2).getSize(var2.getHeight()) : 0);
         irk.b(var2, irk.f(var2) != null ? irk.f(var2).getSize(var2.getHeight()) : 0);
      } else {
         irk.a(var2, irk.e(var2) != null ? irk.e(var2).getSize(var2.getWidth()) : 0);
         irk.b(var2, irk.f(var2) != null ? irk.f(var2).getSize(var2.getWidth()) : 0);
      }

      if (irk.b(var2) != null && irk.b(var2).djO() && irk.c(var2) != null && irk.c(var2).djO()) {
         boolean var3 = irk.b(var2).djQ() != null && irk.b(var2).dkj();
         boolean var4 = irk.c(var2).djQ() != null && irk.c(var2).dkj();
         if (irk.g(var2) == -1) {
            if (var3 == var4) {
               irk.c(var2, irk.a(var2) == ire.mul ? var2.getHeight() / 2 - irk.d(var2) / 2 : var2.getWidth() / 2 - irk.d(var2) / 2);
            } else if (var3) {
               irk.c(
                  var2,
                  irk.a(var2) == ire.mul ? var2.getHeight() - irk.c(var2).getHeight() - irk.d(var2) : var2.getWidth() - irk.c(var2).getWidth() - irk.d(var2)
               );
            } else {
               irk.c(var2, irk.a(var2) == ire.mul ? irk.b(var2).getHeight() : irk.b(var2).getWidth());
            }
         }

         if (var2.getWidth() != irk.h(var2) || var2.getHeight() != irk.i(var2)) {
            if (var3 == var4) {
               if (irk.a(var2) == ire.mul) {
                  double var5 = irk.i(var2) != -1 ? Math.min((double)irk.g(var2) / irk.i(var2), 1.0) : 0.5;
                  irk.c(var2, (int)(var2.getHeight() * var5));
               } else {
                  double var7 = irk.h(var2) != -1 ? Math.min((double)irk.g(var2) / irk.h(var2), 1.0) : 0.5;
                  irk.c(var2, (int)(var2.getWidth() * var7));
               }
            } else if (var3) {
               if (irk.a(var2) == ire.mul) {
                  if (irk.g(var2) + irk.d(var2) + irk.c(var2).getHeight() != var2.getHeight()) {
                     irk.c(var2, var2.getHeight() - irk.c(var2).getHeight() - irk.d(var2));
                  }
               } else if (irk.g(var2) + irk.d(var2) + irk.c(var2).getWidth() != var2.getWidth()) {
                  irk.c(var2, var2.getWidth() - irk.c(var2).getWidth() - irk.d(var2));
               }
            }

            irk.d(var2, var2.getWidth());
            irk.e(var2, var2.getHeight());
         }

         int var8 = irk.a(var2) == ire.mul ? var2.getHeight() : var2.getWidth();
         if (irk.g(var2) > var8 - irk.d(var2) - irk.j(var2)) {
            irk.c(var2, var8 - irk.d(var2) - irk.j(var2));
         }

         if (irk.g(var2) < irk.k(var2)) {
            irk.c(var2, irk.k(var2));
         }

         if (irk.a(var2) == ire.mul) {
            irk.b(var2).r(0, 0, var2.getWidth(), irk.g(var2));
            irk.c(var2).r(0, irk.g(var2) + irk.d(var2), var2.getWidth(), var2.getHeight() - irk.g(var2) - irk.d(var2));
         } else {
            irk.b(var2).r(0, 0, irk.g(var2), var2.getHeight());
            irk.c(var2).r(irk.g(var2) + irk.d(var2), 0, var2.getWidth() - irk.g(var2) - irk.d(var2), var2.getHeight());
         }
      } else if (irk.b(var2) != null && irk.b(var2).djO()) {
         irk.b(var2).r(0, 0, var2.getWidth(), var2.getHeight());
      } else if (irk.c(var2) != null && irk.c(var2).djO()) {
         irk.c(var2).r(0, 0, var2.getWidth(), var2.getHeight());
      }

      var2.dnq();
   }
}
