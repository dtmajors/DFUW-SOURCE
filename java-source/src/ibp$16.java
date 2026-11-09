class ibp$16 extends ick {
   ibp$16(ibp var1) {
      this.lGb = var1;
   }

   @Override
   public void i(joa var1) {
      ibp.a(this.lGb, var1);
   }

   @Override
   public void j(joa var1) {
      ibp.b(this.lGb, var1);
   }

   @Override
   public void pB(String var1) {
      super.pB(var1);
      ibp.a(this.lGb, var1);
   }

   @Override
   public void pC(String var1) {
      super.pC(var1);
      ibp.b(this.lGb, var1);
   }

   @Override
   public void b(int var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.lGb.a(var1, var2, var3, var4, var5);
   }

   @Override
   public void k(joa var1) {
      ibp.c(this.lGb, var1);
   }

   @Override
   public void B(String var1, int var2) {
      this.lGb.z(var1, var2);
   }
}
