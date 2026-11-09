class mrz$e {
   public String aQU;
   public Double Epd;
   public Double Epe;

   public mrz$e(mrz var1, String var2, Double var3, Double var4) {
      this.EoW = var1;
      this.aQU = "";
      this.Epd = -10.0;
      this.Epe = 10.0;
      this.aQU = var2;
      this.Epd = var3;
      this.Epe = var4;
   }

   @Override
   public String toString() {
      return this.aQU + ":" + this.Epd + "-" + this.Epe;
   }
}
