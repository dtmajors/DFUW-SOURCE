class asv$a {
   final ljq bWW;
   final ljq[] bWX;
   int index;
   double ps;

   public asv$a(asv var1, int var2) {
      this.bWY = var1;
      this.bWW = new ljq();
      this.index = 0;
      this.bWX = new ljq[var2];

      for (int var3 = 0; var3 < this.bWX.length; var3++) {
         this.bWX[var3] = new ljq();
      }
   }

   void b(ljq var1, double var2) {
      assert var1 != null;
      this.ps = var2;
      this.bWX[this.index].ex(var1);
      this.index = ++this.index >= this.bWX.length ? 0 : this.index;
   }

   ljq aj(double var1) {
      this.bWW.esK();
      if (var1 - this.ps > 0.5) {
         return this.bWW;
      }

      for (ljq var6 : this.bWX) {
         this.bWW.es(var6);
      }

      if (!this.bWW.isZero()) {
         this.bWW.nm(1.0F / this.bWX.length);
      }

      return this.bWW;
   }
}
