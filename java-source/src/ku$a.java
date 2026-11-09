enum ku$a {
   arW("adm_territory_define_territory", hc.aaP, lqj.sdf, new mhs[]{mhs.INTEGER}, true),
   arX("adm_territory_define_region", hc.aaP, lqj.sdg, new mhs[]{mhs.INTEGER}, true),
   arY("adm_territory_define_all_territories", hc.aaP, lqj.sdh, null, false),
   arZ("adm_territory_query_territory_collector_status", hc.aaP, lqj.sdi, new mhs[]{mhs.INTEGER}, true),
   asa("adm_territory_query_region_collectors_status", hc.aaP, lqj.sdj, new mhs[]{mhs.INTEGER}, true),
   asb("adm_territory_query_all_collectors_status", hc.aaP, lqj.sdk, null, false);

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

   ku$a(String var3, hc var4, lox var5, mhs[] var6, boolean var7) {
      this.akV = var3;
      this.SC = var4;
      this.alA = var5;
      this.alB = var6;
      this.alg = var7;
   }

   public static ku$a findCommand(String var0) {
      for (ku$a var4 : values()) {
         if (var4.getCommand().equals(var0)) {
            return var4;
         }
      }

      return null;
   }
}
