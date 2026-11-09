final class irp$1 extends iqz {
   @Override
   public void e(ipf var1) {
      irp var2 = (irp)var1;
      var2.setSize(irp.a(var2).getWidth(), irp.a(var2).getHeight());
   }

   @Override
   public void i(ipf var1) {
      irp var2 = (irp)var1;
      boolean var3 = irp.b(var2).getHeight() > var2.getHeight();
      if (var3) {
         if (irp.c(var2) != null) {
            irp.a(var2).r(0, 0, var2.getWidth() - irp.c(var2).getWidth(), var2.getHeight());
            irp.c(var2).setVisible(true);
            irp.c(var2).r(var2.getWidth() - irp.c(var2).getWidth(), 0, irp.c(var2).getWidth(), var2.getHeight());
         } else {
            irp.a(var2).r(0, 0, var2.getWidth(), var2.getHeight());
         }
      } else if (irp.c(var2) != null) {
         irp.a(var2).r(0, 0, var2.getWidth() - irp.c(var2).getWidth(), var2.getHeight());
         irp.c(var2).setVisible(false);
      } else {
         irp.a(var2).r(0, 0, var2.getWidth(), var2.getHeight());
      }

      irp.d(var2);
      if (var3) {
         irp.e(var2);
      }
   }
}
