abstract class hjb$a {
   private boolean jLT;
   protected final int kwN;
   protected final hpa kwO;
   protected final hpe koQ;
   protected final hpe kwP;
   protected hgz kxp;
   protected hpa kxq;
   protected final hpe kxr;
   protected hdx kxs;
   protected hea kxt;
   private final lbn jEQ;

   public hjb$a(hjb var1, int var2, hpe.c var3, hpe.c var4) {
      this.kxo = var1;
      this.jEQ = new hjb$a$1(this);
      this.kwN = var2;
      this.kwO = new hpa(var1.kLu, (String)null, lgg.rlI, lhf.rnv, lhu.rnR);
      var1.j(this.kwO);
      this.koQ = new hpe(var1.kLu, (String)null, lgg.rlI, lhf.rnv, var3, "");
      var1.j(this.koQ);
      this.kwP = new hpe(var1.kLu, (String)null, lgg.rlI, lhf.rnv, var4, "");
      var1.j(this.kwP);
      this.kxr = new hpe(var1.kLu, (String)null, lgg.rlI, lhf.rnv, hjb.a(var1).kxv, "");
      var1.j(this.kxr);
      this.kxq = new hpa(var1.kLu, (String)null, lgg.rlI, lhf.rnv, lhu.rnR);
      var1.j(this.kxq);
      this.jLT = true;
   }

   public void dispose() {
      assert this.jLT;
      if (this.kxt != null) {
         this.nJ(false);
         this.kxt = null;
      }

      this.kxr.remove();
      this.kwO.remove();
      this.kxp.remove();
      this.koQ.remove();
      this.kwP.remove();
      this.kxq.remove();
      this.jLT = false;
   }

   private void nJ(boolean var1) {
      this.kxt.cec().a(var1, this.jEQ);
   }

   public final void a(hdx var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      assert this.jLT;
      assert lda.acc(var2);
      if (!lin.i(var1, this.kxs)) {
         if (this.kxt != null) {
            this.nJ(false);
         }

         this.kxs = var1;
         this.kxt = this.kxo.cbP().kck.b(var1);
         if (this.kxt != null) {
            this.nJ(true);
         }

         this.koQ.mV(var1.cdY().esy());
         this.kwP.mV(var1.cei().esy());
         if (this.kxp != null) {
            this.kxp.remove();
         }

         this.kxp = new hgz(this.kxo.cbO(), (String)null, lgg.rlI, this.kxs, this.kxt, true, true);
         this.kxo.j(this.kxp);
      }

      lgs var8 = new lgs(var3, var4, var6, var7);
      this.f(var8);
      var8.cg -= 5;
      this.kwO.j(var8);
      if (this instanceof hjb$c) {
         this.kwO.a(this.kxo.getSelectedItem() == var1 ? hjb.a(this.kxo).jGN : this.kxo.cbO().kIn.kFk);
         var8.rmN = 0;

         for (int var9 = 0; var9 < var5.length; var9++) {
            var8.cf = var8.cf + (var8.rmN - 6);
            var8.cg -= 3;
            var8.rmN = var5[var9];
            this.a(var9, new lgs(var8));
         }
      } else {
         this.kwO.a(this.kxo.cbO().kIn.kFl);
         var8.rmN = 0;

         for (int var10 = 0; var10 < var5.length; var10++) {
            var8.cf = var8.cf + var8.rmN + 16;
            var8.cg += 0;
            var8.rmN = var5[var10];
            this.a(var10, new lgs(var8));
         }
      }
   }

   protected final void H(lcq var1) {
      assert this.jLT;
      this.kwO.H(var1);
      this.kxp.H(var1);
      this.koQ.H(var1);
      this.kwP.H(var1);
   }

   protected void f(lgs var1) {
      assert this.jLT;
      assert lda.by(var1);
   }

   protected abstract void a(int var1, lgs var2);
}
