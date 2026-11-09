class lmy$1 implements lmy$d {
   lmy$1(lmy var1) {
      this.rFe = var1;
   }

   @Override
   public final void adE(int var1) {
      assert this.rFe.isConstructed();
      lmx$a$a var2 = this.rFe.evp().evn().get(var1);
      lmu var3 = var2.kza;
      lmv var4 = var3.euX();
      if (var2.kuI != null) {
         var4.i(var2.kuI);
      }

      this.rFe.c(var1, var4);
   }
}
