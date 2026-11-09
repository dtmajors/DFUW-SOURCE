final class isb$1 extends irl {
   @Override
   public void e(ipf var1) {
      isb var2 = (isb)var1;
      if (isb.f(var2) != null && isb.f(var2).djL()) {
         isb.f(var2).setSize(0, 0);
      }

      super.e(var1);
      if (isb.f(var2) != null && isb.f(var2).djL()) {
         var2.setWidth(var2.getWidth() + isb.f(var2).dlQ() + isb.f(var2).dlS());
      }
   }

   @Override
   public void i(ipf var1) {
      isb var2 = (isb)var1;
      if (isb.f(var2) != null && isb.f(var2).djL()) {
         ira.a(var2, 1, 0, var2.getWidth() - 2, var2.getHeight() - 1);
         isb.f(var2).r(0, 0, var2.getWidth(), var2.getHeight());
      } else {
         super.i(var1);
      }
   }
}
