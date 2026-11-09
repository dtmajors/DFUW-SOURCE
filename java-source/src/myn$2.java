class myn$2 implements lbn {
   myn$2(myn var1) {
      this.EUq = var1;
   }

   @Override
   public final void W() {
      assert myn.a(this.EUq);
      s.e var1 = myn.b(this.EUq).E();
      if (var1.cY == 240) {
         myn.a(this.EUq, 1, var1.cZ);
      } else if (var1.cY == 242) {
         myn.a(this.EUq, 2, var1.cZ);
      } else if (var1.cY == 241) {
         myn.a(this.EUq, 4, var1.cZ);
      } else if (var1.cY == 308 && var1.cZ) {
         myn.c(this.EUq, 120);
         myn.e(this.EUq);
      } else if (var1.cY == 309 && var1.cZ) {
         myn.c(this.EUq, -120);
         myn.e(this.EUq);
      } else {
         int var2 = var1.cZ ? 1 : 4;
         byte var3 = 0;
         if (var1.da) {
            var3 |= 4;
         }

         if (var1.db) {
            var3 |= 2;
         }

         if (var1.dc) {
            var3 |= 1;
         }

         myp var4 = new myp(var2, var1.cY, var3, 0);
         myn.a(this.EUq, var4);
      }
   }
}
