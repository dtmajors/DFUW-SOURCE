public class cux extends cuv {
   private static final double aTo = 5.0;
   private static final float aTp = 10.0F;
   private static final String TC = "SFRelicChest";
   private final ayc abM;
   private final int ResourceType;
   private ljq Position;
   private ljq etB;

   public cux(cuu var1, int var2, ljq var3) {
      super(var1);
      this.ResourceType = var2;
      this.Position = var3;
      this.abM = lea.epQ();
      this.fyu = ayc.cvU;
      this.cvV = ayc.cvV;
   }

   @Override
   protected ljq bch() {
      lea.epQ();
      if (ayc.cvQ && this.Position == null) {
         lea.epQ();
         ljq var7 = ayc.cvT;
         float var10002 = var7.x;
         float var10003 = (float)Math.random();
         lea.epQ();
         return new ljq(var10002 + var10003 * ayc.cvS, var7.y, var7.rlV);
      }

      ljq var1 = null;
      boolean var2 = false;

      do {
         float var3 = this.Position != null ? this.Position.x : lew.o(fyl.x, fym.x, (float)Math.random());
         float var4 = this.Position != null ? this.Position.y + 5.0F : 1000.0F;
         float var5 = this.Position != null ? this.Position.rlV : lew.o(fyl.rlV, fym.rlV, (float)Math.random());
         var1 = new ljq(var3, var4, var5);
         var2 = lea.eg(var1) == lmf.rEz;
         if (var2) {
            this.bcj();
         }
      } while (var2);

      return var1;
   }

   @Override
   protected void handleLineContainmentResponse(kuj var1) {
      assert this.fys != null;
      this.fys = null;
      if (var1.bqd == null) {
         this.bcj();
      } else if (var1.bqd.length <= 0) {
         this.bcj();
      } else {
         if (var1.bqd.length != 1) {
            this.bcj();
         }

         boolean var2;
         label52: {
            var2 = var1.bqd[0] == cug.fqr;
            if (var2) {
               lea.epQ();
               if (ayc.cvR && this.Position != null) {
                  boolean var4 = true;
                  break label52;
               }
            }

            boolean var10000 = false;
         }

         if (var1.bqd[0] == cug.fkp || var1.bqd[0] == cug.fly || var1.bqd[0] == cug.fkr || this.Position != null && var2) {
            assert var1.ilP[0] != null;
            this.bA(var1.ilP[0]);
         } else {
            this.bcj();
         }
      }
   }

   private void bcj() {
      if (this.Position != null) {
         lea.epQ();
         float var1 = ayc.cvS;
         this.Position.x = lew.o(this.Position.x, this.Position.x + (float)Math.random() * var1, (float)Math.random());
         this.Position.y = lew.o(this.Position.y, this.Position.y + (float)Math.random() * var1, (float)Math.random());
         if (!lcw.dY(this.Position)) {
            this.Position = null;
         }
      }
   }

   @Override
   protected void bA(ljq var1) {
      assert this.fyt == null;
      ldv var2 = null;
      if (lcw.enb()) {
         var2 = lcr.qBq;
      } else {
         this.fyr = this.fyq.bbl();
         var2 = lcr.ak(lcr.qBq, this.fyr);
      }

      ljq var3 = new ljq(var1);
      var3.et(new ljq(0.0F, 10.0F, 0.0F));
      float var4 = (float)(Math.PI * Math.random());
      lgl var5 = new lgl(new ljq(0.0F, var4, 0.0F));
      var4 = (float)(Math.PI * Math.random());
      lgl var6 = new lgl(new ljq(0.0F, var4, 0.0F));
      ecr var7 = (ecr)this.MessageDelegator.h(19457, this.getGUID(), var2);
      var7.sk(0);
      var7.l(this.ResourceType);
      var7.ilS = var3;
      var7.c(var1);
      var7.ilT = var5;
      var7.a(var6);
      var7.aTo = 5.0;
      var7.ilR = true;
      var7.jS(true);
      var7.oF(null);
      this.MessageDelegator.F(var7);
      this.fyt = var7;
   }

   public int az() {
      return this.ResourceType;
   }

   public ljq Bc() {
      return this.etB;
   }

   public void bB(ljq var1) {
      this.etB = var1;
   }
}
