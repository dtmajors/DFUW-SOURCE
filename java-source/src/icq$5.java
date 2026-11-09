class icq$5 extends iwr {
   icq$5(icq var1, boolean var2, boolean var3) {
      super(var2, var3);
      this.lHA = var1;
   }

   @Override
   public void pn(boolean var1) {
      icq.e(this.lHA).visible = var1;
      if (hso.cxK().cxR().dMl() && icq.f(this.lHA) != null) {
         this.sF(var1);

         for (icq var3 : icq.f(this.lHA)) {
            icq.a(var3, var1);
         }
      }

      if (var1) {
         for (icq var4 = icq.c(this.lHA); var4 != null; var4 = icq.c(var4)) {
            icq.h(var4).sF(true);
         }
      } else {
         for (icq var5 = icq.c(this.lHA); var5 != null; var5 = icq.c(var5)) {
            icq.h(var5).sF(icq.i(var5));
         }
      }
   }

   @Override
   public hyn dd(int var1, int var2) {
      return iae.oJ(lvw.tbS.bD().exA());
   }
}
