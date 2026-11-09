class hyu$b {
   String YL;
   ldv GUID;
   ldv bWM;
   ldv bbA;
   float aGr;
   float bWk;
   int ixP;
   public String lpU;
   public String lpZ;
   public String lqa;

   hyu$b(hyu var1) {
      this.lpY = var1;
      this.lpU = "/dfdata/texture/dds/";
   }

   void cGn() {
      bsn var1 = (bsn)lea.enZ().zx("s_combat skills");
      this.lpU = "/dfdata/texture/dds/" + var1.atw().Name.replace("//", "/");
   }
}
