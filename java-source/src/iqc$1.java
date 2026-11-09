final class iqc$1 extends iqz {
   @Override
   public void e(ipf var1) {
      iqc var2 = (iqc)var1;
      var2.setSize(iqc.a(var2).getWidth() + iqc.b(var2).dmC(), iqc.b(var2).getHeight());
   }

   @Override
   public void i(ipf var1) {
      iqc var2 = (iqc)var1;
      iqc.b(var2).r(0, 0, var2.getWidth(), var2.getHeight());
      iqc.a(var2).r(0, iqc.c(var2), var2.getWidth(), var2.getHeight() - iqc.c(var2));
   }
}
