class ibp$19 extends ibo {
   ibp$19(ibp var1) {
      this.lGb = var1;
   }

   @Override
   public void pb(String var1) {
      ibp.c(this.lGb, var1);
   }

   @Override
   public void pc(String var1) {
      ibp.d(this.lGb, var1);
   }

   @Override
   public void c(jmz var1) {
      if (!ibp.e(this.lGb)) {
         ibp.f(this.lGb).SK(ibp.f(this.lGb).ac(this));
      }
   }

   @Override
   public void cbU() {
      ibp.f(this.lGb).Tg(ibp.f(this.lGb).ab(this)).cbU();
   }

   @Override
   public void cGR() {
      this.lGb.PQ(ibp.f(this.lGb).ab(this));
   }
}
