class cza$a {
   public int SkillType;
   public ddf fZq;
   private cxd$p fZr;
   private final cxd$p fZs;
   private float fZt;
   private double fZu;
   private float fZv;

   public cza$a(cza var1, int var2, cxd$p var3, ddf var4, float var5) {
      this.fZw = var1;
      this.SkillType = 0;
      this.fZq = null;
      this.fZr = cxd$p.fSb;
      this.fZs = cxd$p.fSd;
      this.fZt = 0.0F;
      this.fZu = 0.0;
      this.fZv = -1.0F;
      assert var2 > 0;
      assert var4 != null;
      assert var4.gee != null;
      assert var4.gee.length > 1;
      assert var5 > 0.0;
      this.SkillType = var2;
      this.fZr = var3;
      this.fZq = var4;
      this.fZt = var5;
      this.fZu = cza.a(var1).rgz + this.fZt;
      this.fL(0.0F);
      this.fZv = 0.0F;
   }

   public void nh() {
      assert !this.bhn();
      float var1 = this.bho();
      this.fL(var1);
      this.fZv = var1;
   }

   public boolean bhn() {
      assert this.fZv <= 1.0F;
      return this.fZv == 1.0F;
   }

   private void fL(float var1) {
      int var2 = 0;

      for (int var3 = this.fZq.gee.length; var2 < var3; var2++) {
         dde var4 = this.fZq.gee[var2];
         if (var4.bjS() <= var1 && var4.bjS() > this.fZv) {
            switch (var4.bjR()) {
               case fSt:
               case fSu:
                  ddd var6 = (ddd)var4;
                  if (var6.bjQ().biV() == this.fZr) {
                     cza.a(this.fZw, var6.bjQ(), this.fZt);
                  }
                  break;
               case fSv:
                  if (this.fZr == this.fZs) {
                     cza.a(this.fZw, this.SkillType, (ddg)var4);
                  }
                  break;
               case fSw:
                  if (this.fZr == this.fZs) {
                     cwx var5 = cza.b(this.fZw).yG(this.SkillType);
                     if (var5 == null) {
                        return;
                     }

                     var5.beR();
                  }
            }
         }
      }
   }

   private float bho() {
      assert this.fZv < 1.0F;
      float var1 = 1.0F;
      if (cza.a(this.fZw).rgz < this.fZu) {
         var1 = 1.0F - (float)((this.fZu - cza.a(this.fZw).rgz) / this.fZt);
      }

      return var1;
   }
}
