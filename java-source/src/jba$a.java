class jba$a extends hvn {
   private double lfT;

   public jba$a(jba var1) {
      this.mMz = var1;
      ioc var2 = var1.dvY();
      this.a(new ioh(jba.a(var1), jba.a(var1).dju(), jba.a(var1).djv(), var2.cf, var2.cg, 0.25));
      this.a(new ioh(jba.b(var1), jba.a(var1).dju(), 0, var2.cf, var2.cg, 0.25));
      this.a(new ioh(jba.c(var1), jba.c(var1).dju(), jba.a(var1).djv(), jba.c(var1).dju(), jba.c(var1).djv(), 0.25));
      this.a(new ioh(jba.d(var1), 22, 22, 48, 48, 0.25));
      this.a(new ioh(jba.e(var1), 1, 15, 1, 48, 0.25));
      this.a(new ioh(jba.f(var1), 0, 0, jba.g(var1).dqg(), jba.g(var1).dqh(), 0.25));
      this.a(new ioh(jba.h(var1), 0, 0, jba.h(var1).dju(), jba.h(var1).djv(), 0.25));
      this.a(new ioe(jba.a(var1), 1.0F, 0.0F, 0.25));
      this.a(new ioe(jba.b(var1), 0.0F, 1.0F, 0.25));
      this.a(new ioj(jba.i(var1), 11250603, 12357465, 0.25));
   }

   @Override
   public void az(ldz var1) {
      super.az(var1);
      this.lfT = var1.rgz;
   }

   @Override
   public void doTick(ldz var1) {
      super.doTick(var1);
      this.mMz.dhJ().pack();
      this.mMz.pack();
      double var2 = (var1.rgz - this.lfT) / 0.25;
      if (var2 >= 1.0) {
         jba.j(this.mMz);
      }
   }
}
