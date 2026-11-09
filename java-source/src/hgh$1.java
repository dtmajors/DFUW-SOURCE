import hii.a;

class hgh$1 implements lbn {
   hgh$1(hgh var1) {
      this.knP = var1;
   }

   @Override
   public final void W() {
      assert hgh.a(this.knP);
      hii var2 = (hii)hgh.b(this.knP).csT();
      a var3 = var2.cmj();
      boolean var1 = var3 != null && var3 == a.kvq;
      hgh.c(this.knP);
      if (var1) {
         bpj var4 = hgh.d(this.knP).getSelectedItem();
         if (var4 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "observeEvent() : HM!");
            return;
         }

         this.knP.cbP().kci.qY(var4.getGUID());
      }
   }
}
