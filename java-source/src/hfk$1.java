class hfk$1 implements lbn {
   hfk$1(hfk var1) {
      this.kiH = var1;
   }

   @Override
   public final void W() {
      double var1 = hfk.a(this.kiH).esb();
      double var3 = var1 * this.kiH.kLu.crR();
      var3 = Math.abs(Math.sin(var3));
      float var5 = (float)var3;
      var5 *= 1.5F;
      if (var5 > 1.0F) {
         var5 = 1.0F;
      }

      assert var5 >= 0.0F && var5 <= 1.0F;
      hfk.b(this.kiH).H(new lcq(1.0F, 1.0F, 1.0F, var5));
   }
}
