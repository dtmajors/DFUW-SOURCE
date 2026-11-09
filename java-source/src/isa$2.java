final class isa$2 extends iqv {
   @Override
   public void i(ipf var1) {
      ipz var2 = (ipz)var1;
      if (var2.djJ() != null && var2.djJ() instanceof isa) {
         isa var3 = (isa)var2.djJ();
         if (isa.e(var3) != null) {
            int var4 = isa.e(var3).getX();
            if (isa.i(var3)) {
               isa.a(var3, false);
               var4 = isa.a(var3, isa.e(var3).dpr(), var4);
            }

            if (isa.e(var3).getWidth() > var2.getWidth()) {
               if (var4 + isa.e(var3).getWidth() < var2.getWidth()) {
                  var4 = var2.getWidth() - isa.e(var3).getWidth();
               }

               if (var4 > 0) {
                  var4 = 0;
               }
            } else {
               var4 = 0;
            }

            isa.e(var3).r(var4, 0, isa.e(var3).getWidth(), var2.getHeight());
            isa.j(var3);
         }
      }
   }
}
