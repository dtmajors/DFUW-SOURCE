final class irp$2 extends iqz {
   @Override
   public void e(ipf var1) {
      irp var2 = (irp)var1.djJ();
      if (irp.b(var2) != null) {
         var1.setHeight(1);
         var1.setSize(irp.b(var2).getWidth(), irp.b(var2).getHeight());
      }
   }

   @Override
   public void i(ipf var1) {
      irp var2 = (irp)var1.djJ();
      if (irp.b(var2) != null) {
         irp.b(var2).setWidth(irp.a(var2).getWidth());
      }

      if (irp.f(var2).djL()) {
         irp.f(var2).r(0, 0, var1.getWidth(), 32);
      }

      if (irp.g(var2).djL()) {
         irp.g(var2).r(0, var1.getHeight() - 32, var1.getWidth(), 32);
      }
   }
}
