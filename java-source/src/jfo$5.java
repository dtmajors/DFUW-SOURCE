final class jfo$5 extends iqz {
   @Override
   public void e(ipf var1) {
      var1.setSize(0, 0);
   }

   @Override
   public void i(ipf var1) {
      int var2 = var1.getWidth() / 2 + 28;
      byte var3 = 0;
      iph var4 = (iph)var1;

      for (ipf var6 : var4.getChildren()) {
         var6.ek(var2, var3);
      }
   }
}
