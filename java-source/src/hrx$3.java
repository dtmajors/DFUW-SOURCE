class hrx$3 implements lbi<miv> {
   hrx$3(hrx var1) {
      this.laO = var1;
   }

   public final void a(miv var1) {
      assert hrx.f(this.laO) != null;
      assert var1.dRw().equals(hrx.j(this.laO));
      if (var1.getErrorCode() != 0) {
         assert false;
      } else {
         boolean var2 = false;
         if (hrx.f(this.laO) != hrx$a.laQ) {
            lgs var3 = new lgs(var1.ezn(), var1.ezo(), var1.chN(), var1.chO());
            hrx.g(this.laO).t(var3);
            var2 = true;
         }

         if (hrx.f(this.laO) != hrx$a.laQ) {
            lgs var4 = new lgs(var1.ezq(), var1.ezr(), var1.eez(), var1.eey());
            hrx.h(this.laO).t(var4);
            var2 = true;
         }

         if (var2) {
            hrx.i(this.laO);
         }
      }
   }
}
