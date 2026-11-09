final class iyj$1 extends iqz {
   @Override
   public void e(ipf var1) {
      iph var2 = (iph)var1;
      int var3 = 0;

      for (int var4 = 0; var4 < var2.bfn(); var4++) {
         ipf var5 = var2.RO(var4);
         if (var5.djL()) {
            var3 += var5.getWidth();
         }
      }

      var2.setSize(var3, 24);
   }

   @Override
   public void i(ipf var1) {
      iph var2 = (iph)var1;
      int var3 = 0;

      for (int var4 = 0; var4 < var2.bfn(); var4++) {
         ipf var5 = var2.RO(var4);
         if (var5.djL()) {
            if (var5 instanceof isb) {
               var5.ek(var3, 0);
            } else {
               var5.r(var3, 0, var5.getWidth(), var2.getHeight());
            }

            var3 += var5.getWidth();
         }
      }
   }
}
