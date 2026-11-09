enum jp$a {
   alz("adm_clan_vault_fetch", hc.aaP, lqe.rXE, new mhs[]{mhs.BOOLEAN}, true);

   private String akV = null;
   private hc SC = hc.aaP;
   private lox alA = null;
   private mhs[] alB = null;
   private boolean alg = false;

   public String getCommand() {
      return this.akV;
   }

   public hc hf() {
      return this.SC;
   }

   public lox ok() {
      return this.alA;
   }

   public mhs[] ol() {
      return this.alB;
   }

   public boolean om() {
      return this.alg;
   }

   jp$a(String var3, hc var4, lox var5, mhs[] var6, boolean var7) {
      this.akV = var3;
      this.SC = var4;
      this.alA = var5;
      this.alB = var6;
      this.alg = var7;
   }

   public static jp$a findCommand(String var0) {
      for (jp$a var4 : values()) {
         if (var4.getCommand().equals(var0)) {
            return var4;
         }
      }

      return null;
   }
}
