class hyg$a {
   public double lnz;
   public double lnA;
   public double lnB;
   public double lnC;
   public double lnD;
   public double lnE;

   public hyg$a(double var1, double var3, double var5, double var7) {
      this.lnz = var1;
      this.lnA = var3;
      this.lnB = var5;
      this.lnC = var7;
      this.lnD = this.lnA - this.lnz;
      this.lnE = this.lnC - this.lnB;
   }
}
