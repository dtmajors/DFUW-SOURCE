final class iop$1 extends iqz {
   @Override
   public void e(ipf var1) {
      iop var2 = (iop)var1;
      int var3 = 0;
      int var4 = 0;
      if (iop.a(var2) != null) {
         var3 = Math.max(var3, iop.a(var2).getWidth());
         var4 = Math.max(var4, iop.a(var2).getHeight());
      }

      if (iop.b(var2) != null) {
         var3 = Math.max(var3, iop.b(var2).getWidth());
         var4 = Math.max(var4, iop.b(var2).getHeight());
      }

      var2.setSize(var3, var4);
   }

   @Override
   public void i(ipf var1) {
      iop var2 = (iop)var1;
      if (iop.a(var2) != null) {
         iop.a(var2).r(0, 0, var2.getWidth(), var2.getHeight());
      }

      if (iop.b(var2) != null) {
         iop.b(var2)
            .r(
               var2.getWidth() / 2 - iop.b(var2).getWidth() / 2,
               var2.getHeight() / 2 - iop.b(var2).getHeight() / 2,
               iop.b(var2).getWidth(),
               iop.b(var2).getHeight()
            );
      }
   }
}
