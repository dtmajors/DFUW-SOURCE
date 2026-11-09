enum jx$a {
   ams("adm_quests_reset_quest", hc.aaP, lqh.scH, new mhs[]{mhs.INTEGER}, true),
   amt("adm_quests_progress_quest", hc.aaP, lqh.scI, new mhs[]{mhs.INTEGER}, true);

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

   jx$a(String var3, hc var4, lox var5, mhs[] var6, boolean var7) {
      this.akV = var3;
      this.SC = var4;
      this.alA = var5;
      this.alB = var6;
      this.alg = var7;
   }

   public static jx$a findCommand(String var0) {
      for (jx$a var4 : values()) {
         if (var4.getCommand().equals(var0)) {
            return var4;
         }
      }

      return null;
   }
}
