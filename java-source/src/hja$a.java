abstract class hja$a {
   private boolean jLT;
   protected final int kwN;
   protected final hpa kwO;
   protected final hpe koQ;
   protected final hpe kwP;
   protected hpa kwQ;
   protected final hpe kwR;
   protected hdw kkQ;
   protected hdz kdD;
   private final lbn jEQ;

   public hja$a(hja var1, int var2, hpe.c var3, hpe.c var4) {
      this.kxg = var1;
      this.jEQ = new hja$a$1(this);
      this.kwN = var2;
      this.kwO = new hpa(var1.kLu, (String)null, lgg.rlI, lhf.rnv, lhu.rnR);
      var1.j(this.kwO);
      this.koQ = new hpe(var1.kLu, (String)null, lgg.rlI, lhf.rnv, var3, "");
      var1.j(this.koQ);
      this.kwP = new hpe(var1.kLu, (String)null, lgg.rlI, lhf.rnv, var4, "");
      var1.j(this.kwP);
      this.kwR = new hpe(var1.kLu, (String)null, lgg.rlI, lhf.rnv, hja.a(var1).kwX, "");
      var1.j(this.kwR);
      this.jLT = true;
   }

   public void dispose() {
      assert this.jLT;
      if (this.kdD != null) {
         this.nJ(false);
         this.kdD = null;
      }

      this.kwR.remove();
      this.kwO.remove();
      this.kwQ.remove();
      this.koQ.remove();
      this.kwP.remove();
      this.jLT = false;
   }

   private void nJ(boolean var1) {
      if (var1 != this.kdD.cec().a(this.jEQ)) {
         this.kdD.cec().a(var1, this.jEQ);
      }
   }

   public final void a(hdw var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      assert this.jLT;
      assert lda.acc(var2);
      if (!lin.i(var1, this.kkQ)) {
         if (this.kdD != null) {
            this.nJ(false);
         }

         this.kkQ = var1;
         this.kdD = (hdz)var1.a(null, ldv.rfe);
         this.koQ.mV(var1.cdY().esy());
         this.kwP.mV(var1.cei().esy());
         if (this.kwQ != null) {
            this.kwQ.remove();
         }

         float var8 = 32.0F;
         lhf var9 = new lhf((int)var8, (int)var8);
         this.kwQ = new hpa(this.kxg.cbO(), (String)null, lgg.rlI, var9, this.kkQ.atw());
         if (this.kkQ.atw().kLY.rmN > (int)var8) {
            float var10 = var8 / this.kkQ.atw().kLY.rmN;
            float var11 = var8 / this.kkQ.atw().kLY.H;
            this.kwQ.N(var10, var11);
         }

         if (this instanceof hja$b) {
            this.kwQ.a(lhu.rnR);
         }

         this.kxg.j(this.kwQ);
      }

      lcq var12 = lcq.COLORSHIFT_NEUTRAL;
      lgs var13 = new lgs(var3, var4, var6, var7);
      this.f(var13);
      var13.cg -= 2;
      this.kwO.j(var13);
      if (this instanceof hja$c) {
         this.kwO.a(this.kxg.getSelectedItem() == var1 ? hja.a(this.kxg).jGN : hlu.kGS);
         var13.rmN = 0;

         for (int var14 = 0; var14 < var5.length; var14++) {
            var13.cf = var13.cf + (var13.rmN - 6);
            var13.cg -= 7;
            var13.rmN = var5[var14];
            this.a(var14, new lgs(var13));
         }
      } else {
         this.kwO.a(this.kxg.getSelectedItem() == var1 ? hlu.kGT : hlu.kGT);
         var13.rmN = 0;

         for (int var15 = 0; var15 < var5.length; var15++) {
            var13.cf = var13.cf + var13.rmN + 16;
            var13.cg += 0;
            var13.rmN = var5[var15];
            this.a(var15, new lgs(var13));
         }
      }
   }

   protected final void H(lcq var1) {
      assert this.jLT;
      this.kwO.H(var1);
      this.kwQ.H(var1);
      this.koQ.H(var1);
      this.kwP.H(var1);
   }

   protected void f(lgs var1) {
      assert this.jLT;
      assert lda.by(var1);
   }

   protected abstract void a(int var1, lgs var2);
}
