final class iul$2 extends iqy {
   iul$2(ire var1, int var2) {
      super(var1, var2);
   }

   @Override
   public void e(ipf var1) {
      iul var2 = (iul)var1;
      super.e(var1);
      var1.setSize(var1.getWidth() - iul.b(var2), var1.getHeight() - iul.c(var2));
   }

   @Override
   public void i(ipf var1) {
      iul var2 = (iul)var1;
      super.i(var1);
      if (iul.d(var2) != null) {
         ((ipf)iul.d(var2)).RH(((ipf)iul.d(var2)).getX() - iul.b(var2));
      }

      if (iul.e(var2) != null) {
         ((ipf)iul.e(var2)).RH(((ipf)iul.e(var2)).getX() - iul.c(var2));
      }
   }
}
