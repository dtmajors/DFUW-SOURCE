class hok$2 implements hmc {
   hok$2(hok var1) {
      this.kSv = var1;
   }

   @Override
   public final lbl<lbn> cpU() {
      return hok.b(this.kSv);
   }

   @Override
   public final hmc$a cpV() {
      return hok.c(this.kSv) == null ? null : hok$a.b(hok.c(this.kSv));
   }

   @Override
   public final void refresh() {
      this.kSv.refresh();
   }
}
