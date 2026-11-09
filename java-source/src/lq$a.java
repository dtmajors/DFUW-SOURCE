final class lq$a {
   private final ldv auP;
   private final int ResourceType;
   private ljq Position;
   private String auQ;

   public lq$a(lq var1, ldv var2, int var3, String var4, ljq var5) {
      this.auR = var1;
      this.auP = var2;
      this.ResourceType = var3;
      this.Position = var5;
      this.auQ = var4;
   }

   @Override
   public String toString() {
      return "GUID : " + this.auP + " Type : " + cug.uG(this.ResourceType) + " Position : " + this.Position + " Captain Name : " + this.auQ;
   }
}
