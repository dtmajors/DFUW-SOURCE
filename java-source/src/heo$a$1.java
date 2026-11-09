class heo$a$1 implements lbn {
   heo$a$1(heo$a var1) {
      this.kfd = var1;
   }

   @Override
   public final void W() {
      double var1 = heo$a.a(this.kfd).esb() * 5.0;
      double var3 = Math.sin(var1);
      double var5 = (1.0 + var3) / 2.0;
      assert var5 >= 0.0 && var5 <= 1.0;
      double var7 = Math.abs(var3);
      assert var7 >= 0.0 && var7 <= 1.0;
      lcq var9 = new lcq((float)var5, (float)var5, (float)var5, (float)var7);
      var9 = var9.V(heo$a.b(this.kfd));
      this.kfd.K(var9);
   }
}
