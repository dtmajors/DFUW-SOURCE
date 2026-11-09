abstract class ijk$a implements hvr {
   private ipb mdy;
   private float mdz;
   private double mdA;
   private double mdB;
   private double dPp;
   private int mdC;
   private float mdD;
   private int mdE;
   private int mdF;
   private float mdG;
   private int mdH;

   public ijk$a(ijk var1, ipb var2, int var3, int var4, double var5) {
      this.mdw = var1;
      this.mdy = null;
      this.mdz = 1.0F;
      this.mdA = 0.0;
      this.mdB = 0.0;
      this.dPp = 0.0;
      this.mdC = 0;
      this.mdD = 0.0F;
      this.mdE = 0;
      this.mdF = 0;
      this.mdG = 0.0F;
      this.mdH = 0;
      this.mdy = var2;
      this.mdA = var5;
      this.mdB = this.mdA * 0.5;
      this.mdE = var3;
      this.mdH = var4;
      this.mdC = (int)(this.mdE * 0.5F + 0.5F);
      this.mdF = (int)(this.mdH * 0.5F + 0.5F);
   }

   @Override
   public void az(ldz var1) {
      this.mdy.hz(0.0F);
      this.mdy.setWidth(this.mdC);
      this.mdy.setHeight(this.mdF);
      this.dPp = var1.rgz;
      this.mdD = this.mdC;
      this.mdG = this.mdF;
   }

   @Override
   public void aA(ldz var1) {
      this.mdy.hz(0.0F);
      this.mdy.setWidth(this.mdE);
      this.mdy.setHeight(this.mdH);
      this.mdy = null;
   }

   @Override
   public void doTick(ldz var1) {
      float var2 = this.mdy.getAlpha() + (float)((var1.rgz - this.dPp) / (this.mdA * 0.5) * this.mdz);
      if (var2 > 1.0F) {
         this.mdz = -1.0F;
         var2 = 1.0F - (var2 - 1.0F);
         this.mdy.setWidth(this.mdE);
         this.mdy.setHeight(this.mdH);
      }

      if (var2 < 0.0F) {
         this.dbr();
      } else {
         this.mdy.hz(var2);
         if (var2 < 1.0F && this.mdz > 0.0F) {
            this.mdD = this.mdC + (this.mdE - this.mdC) * var2;
            this.mdG = this.mdF + (this.mdH - this.mdF) * var2;
            this.mdy.setWidth((int)(this.mdD + 0.5F));
            this.mdy.setHeight((int)(this.mdG + 0.5F));
         }

         this.dPp = var1.rgz;
      }
   }

   public abstract void dbr();
}
