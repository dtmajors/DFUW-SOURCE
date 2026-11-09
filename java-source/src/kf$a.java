enum kf$a {
   aoe("gm_clan_holding_history", hc.aaR, lqe.rXA, new mhs[]{mhs.STRING}, false),
   aof("adm_clan_name_change", hc.aaP, lqe.rXB, new mhs[]{mhs.STRING, mhs.STRING}, true);

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

   kf$a(String var3, hc var4, lox var5, mhs[] var6, boolean var7) {
      this.akV = var3;
      this.SC = var4;
      this.alA = var5;
      this.alB = var6;
      this.alg = var7;
   }

   public static kf$a findCommand(String var0) {
      for (kf$a var4 : values()) {
         if (var4.getCommand().equals(var0)) {
            return var4;
         }
      }

      return null;
   }
}
