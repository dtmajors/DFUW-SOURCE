class hmp$a {
   private final hoy kLF;
   private boolean kLG;

   public hmp$a(hmp var1, hoy var2) {
      this.kLH = var1;
      this.kLF = var2;
      hmp.a(var1).a(true, this.kLF);
      this.kLG = true;
   }

   public void cleanup() {
      assert this.kLG;
      hmp.a(this.kLH).a(false, this.kLF);
      this.kLG = false;
   }
}
