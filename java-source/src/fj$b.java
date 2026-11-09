class fj$b {
   int Rq;
   ldv Rr;
   ldv Rs;
   boolean Rt;

   private fj$b(fj var1) {
      this.Rp = var1;
   }

   final boolean bt(int var1) {
      return this.Rq > 0 && this.Rq + 2 < var1;
   }

   @Override
   public String toString() {
      return (this.Rt ? "Create" : "Remove") + " of " + this.Rs + (this.Rq == 0 ? " (not performed)" : " (performed in tick " + this.Rq);
   }
}
