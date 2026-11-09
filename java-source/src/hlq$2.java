class hlq$2 implements lbn {
   hlq$2(hlq var1) {
      this.kDh = var1;
   }

   @Override
   public final void W() {
      assert hlq.f(this.kDh) != null;
      hoz var1 = (hoz)hlq.f(this.kDh).csT();
      hlq$a var2 = (hlq$a)var1.ccw();
      hlq.g(this.kDh).jZL.ccR().yP(!var1.cuF());
      hlq.a(this.kDh, null);
      hoz$a var3 = var1.coZ();
      if (var3 == hlq.cpr()) {
         if (var2.kDi.isInitialized()) {
            var2.kDi.remove();
         }

         hlq.h(this.kDh).cbP().b(var2.kDi.cjV());
      } else {
         if (var2.kDi.isInitialized()) {
            var2.kDi.c(var2.kDj);
            var2.kDi.z(var2.kDk);
         }

         if (var2.kDj instanceof hgm) {
            hgm var4 = (hgm)var2.kDj;
            if (var4.isInitialized()) {
               var4.kdT.cff();
            }
         }
      }
   }
}
