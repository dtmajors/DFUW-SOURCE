final class irr$1 extends iqz {
   @Override
   public void e(ipf var1) {
      irr var2 = (irr)var1;
      if (irr.a(var2) != null) {
         var2.setSize(irr.a(var2).getWidth(), irr.a(var2).getHeight());
      } else if (irr.b(var2).size() >= 1) {
         iqa var3 = (iqa)irr.b(var2).get(0);
         var2.setSize(var3.getWidth(), var3.getHeight());
      } else {
         var1.setSize(0, 0);
      }
   }

   @Override
   public void i(ipf var1) {
      irr var2 = (irr)var1;
      ira.c(var2);

      for (iqa var4 : irr.b(var2)) {
         irr.a((irr)var1, var4);
      }

      if (irr.c(var2).dnT() > 0) {
         int var8 = ((iqa)irr.b(var2).get(0)).dju() / (irr.c(var2).dnT() + 1);
         int var9 = ((iqa)irr.b(var2).get(0)).getX() + var8;
         int var5 = irr.c(var2).dnW() == 0 ? ((iqa)irr.b(var2).get(0)).djv() : irr.c(var2).dnW();

         for (int var6 = 0; var6 < irr.d(var2).size(); var6++) {
            ((ipk)irr.d(var2).get(var6)).r(var9 - irr.c(var2).dnV() / 2, (var2.getHeight() - var5) / 2, irr.c(var2).dnV(), var5);
            if (irr.e(var2) != null) {
               ipb var7 = (ipb)irr.e(var2).get(var6);
               var7.ek(var9 - var7.dju() / 2, (var2.getHeight() - var7.djv()) / 2);
            }

            var9 += var8;
         }
      }

      if (irr.c(var2).doc()) {
         ((ipb)irr.g(var2).get(irr.f(var2)))
            .RH(
               irr.c(var2).doi()
                  ? ((iqa)irr.b(var2).get(irr.f(var2))).getX()
                  : ((iqa)irr.b(var2).get(irr.f(var2))).getX()
                     + ((iqa)irr.b(var2).get(irr.f(var2))).getWidth()
                     - ((ipb)irr.g(var2).get(irr.f(var2))).getWidth() / 2
            );
      }

      irr.a(var2, true);
   }
}
