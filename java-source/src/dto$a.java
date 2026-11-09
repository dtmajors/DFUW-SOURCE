public class dto$a {
   public ldv bBm;
   public ldv hcR;
   public ljq Position;
   public float hcS;
   public dyv hcT;

   public dto$a(dto var1) {
      this.hcU = var1;
      this.bBm = null;
      this.hcR = null;
      this.Position = null;
      this.hcS = 0.0F;
      this.hcT = null;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SFSpawnPointInfo: SpawnPointGUID=");
      var1.append(this.bBm);
      var1.append(" AOIGUID=");
      var1.append(this.hcR);
      var1.append(" Position=");
      var1.append(this.Position);
      var1.append(" AOIRadius=");
      var1.append(this.hcS);
      return var1.toString();
   }
}
