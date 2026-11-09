class hpf$1 implements lbn {
   hpf$1(hpf var1) {
      this.kVo = var1;
   }

   @Override
   public final void W() {
      if (hpf.a(this.kVo)) {
         double var1 = hpf.b(this.kVo).esb();
         double var3 = var1 * this.kVo.kLu.crR();
         var3 = Math.abs(Math.sin(var3));
         float var5 = (float)var3;
         var5 *= 1.5F;
         if (var5 > 1.0F) {
            var5 = 1.0F;
         }

         assert var5 >= 0.0F && var5 <= 1.0F;
         hpf.c(this.kVo).H(new lcq(1.0F, 1.0F, 1.0F, var5));
      }
   }
}
