class fj$a {
   int Rl;
   final int ResourceType;
   final boolean Rm;
   final boolean Rn;
   final boolean Ro;

   public fj$a(fj var1, int var2) {
      this.Rp = var1;
      this.ResourceType = var2;
      this.Rm = fj.a(var1, this.ResourceType);
      this.Rn = !this.Rm && fj.b(var1, this.ResourceType);
      this.Ro = !this.Rm && !this.Rn && fj.c(var1, this.ResourceType);
      this.Rl = 1;
   }
}
