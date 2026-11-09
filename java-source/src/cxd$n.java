class cxd$n {
   public final int Type;
   public final String Name;
   public final float Pz;

   public cxd$n(cxd var1, int var2, String var3, float var4) {
      this.fRX = var1;
      this.Type = var2;
      this.Name = var3;
      this.Pz = var4;
   }

   @Override
   public String toString() {
      return "SFGlobalConstant: Type=" + this.Type + " Name='" + this.Name + " Value=" + this.Pz;
   }
}
