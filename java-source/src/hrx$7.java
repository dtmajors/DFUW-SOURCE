class hrx$7 implements lbi<miu> {
   hrx$7(hrx var1) {
      this.laO = var1;
   }

   public final void a(miu var1) {
      assert var1.getErrorCode() == 0;
      boolean var2 = false;
      int var3 = var1.ezm();
      if ((var3 & 32) != 0) {
         hrx.a(this.laO, var1.ezj());
      }

      if ((var3 & 128) != 0) {
         hrx.b(this.laO, var1.getCursorType());
      }

      if ((var3 & 64) != 0) {
         hrx.b(this.laO, var1.ezl());
      }

      if ((var3 & 8) != 0) {
         hrx.c(this.laO, var1.ezp());
      }

      if ((var3 & 1) != 0) {
         hrx$a var4 = hrx.c(this.laO, var1.getState());
         hrx.a(this.laO, var4);
      }

      if ((var3 & 16) != 0) {
      }

      if ((var3 & 4) != 0) {
         lgs var5 = new lgs(var1.ezn(), var1.ezo(), var1.chN(), var1.chO());
         if (hrx.f(this.laO) != hrx$a.laQ) {
            hrx.g(this.laO).t(var5);
            var2 = true;
         }
      }

      if ((var3 & 2) != 0) {
         lgs var6 = new lgs(var1.ezq(), var1.ezr(), var1.eez(), var1.eey());
         if (hrx.f(this.laO) != hrx$a.laQ) {
            hrx.h(this.laO).t(var6);
            var2 = true;
         }
      }

      if (var2) {
         hrx.i(this.laO);
      }
   }
}
