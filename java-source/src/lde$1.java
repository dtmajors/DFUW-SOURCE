class lde$1 implements lbk<B> {
   lde$1(lde var1) {
      this.rey = var1;
   }

   @Override
   public <A extends B> void a(boolean var1, Class<A> var2, lbi<A> var3) {
      this.c(var1, var2, var3);
   }

   @Override
   public <I extends B, A extends I> void b(boolean var1, Class<A> var2, lbi<I> var3) {
      this.c(var1, var2, var3);
   }

   @Override
   public int emf() {
      return this.rey.rew.size();
   }

   private void c(boolean var1, Class<? extends B> var2, lbi<? extends B> var3) {
      assert var1 ? !lde.a(this.rey, var2) : this.rey.rew.get(var2) == var3;
      if (var1) {
         this.rey.rew.put(var2, var3);
      } else {
         this.rey.rew.remove(var2);
      }
   }
}
