abstract class hix$a {
   private boolean jLT;
   protected final int kwN;
   protected final hpa kwO;
   protected final hpe koQ;
   protected final hpe kwP;
   protected hpa kwQ;
   protected final hpe kwR;
   protected bpj kwS;

   public hix$a(hix var1, int var2, hpe.c var3, hpe.c var4) {
      this.kwM = var1;
      this.kwN = var2;
      this.kwO = new hpa(var1.kLu, (String)null, lgg.rlI, lhf.rnv, lhu.rnR);
      var1.j(this.kwO);
      this.koQ = new hpe(var1.kLu, (String)null, lgg.rlI, lhf.rnv, var3, "");
      var1.j(this.koQ);
      this.kwP = new hpe(var1.kLu, (String)null, lgg.rlI, lhf.rnv, var4, "");
      var1.j(this.kwP);
      this.kwR = new hpe(var1.kLu, (String)null, lgg.rlI, lhf.rnv, hix.a(var1).kwX, "");
      var1.j(this.kwR);
      this.jLT = true;
   }

   public void dispose() {
      assert this.jLT;
      this.kwR.remove();
      this.kwO.remove();
      this.kwQ.remove();
      this.koQ.remove();
      this.kwP.remove();
      this.jLT = false;
   }

   public final void a(bpj var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      assert this.jLT;
      assert lda.acc(var2);
      if (!lin.i(var1, this.kwS)) {
         this.kwS = var1;
         String var8 = lea.enW().getName(this.kwS.atx());
         if (lea.enW().isDescendant(this.kwS.atx(), cug.flB)) {
         }

         if (var1.atA() != null && !var1.atA().equals("")) {
            try {
               StringBuffer var18 = new StringBuffer();
               long var9 = Long.valueOf(var1.atA());
               int var11 = (int)(var9 / 3600000L);
               long var12 = var9 - var11 * 3600000L;
               int var14 = (int)(var12 / 60000L);
               int var15 = (int)((var9 - var14 * 60000L - var11 * 3600000L) / 1000L);
               if (var11 < 10) {
                  var18.append("0" + var11);
               } else {
                  var18.append(var11);
               }

               var18.append(":");
               if (var14 < 10) {
                  var18.append("0" + var14);
               } else {
                  var18.append(var14);
               }

               var18.append(":");
               if (var15 < 10) {
                  var18.append("0" + var15);
               } else {
                  var18.append(var15);
               }

               String var16 = var18.toString();
               this.koQ.mV(var1.ats().esy() + " (" + var16 + ")");
            } catch (NumberFormatException var17) {
               this.koQ.mV(var1.ats().esy());
            }
         } else {
            this.koQ.mV(var1.ats().esy());
         }

         this.kwP.mV(var1.att().esy());
         if (this.kwQ != null) {
            this.kwQ.remove();
         }

         float var19 = 64.0F;
         lhf var22 = new lhf((int)var19, (int)var19);
         lhu var10 = hix.a(this.kwM, this.kwS, "gui/quest_tab/questtab_icon_");
         this.kwQ = new hpa(this.kwM.cbO(), (String)null, lgg.rlI, var22, var10);
         if (var10.kLY.rmN > (int)var19) {
            float var27 = var19 / var10.kLY.rmN;
            float var28 = var19 / var10.kLY.H;
            this.kwQ.N(var27, var28);
         }

         if (this instanceof hix$b) {
            this.kwQ.a(lhu.rnR);
         }

         this.kwM.j(this.kwQ);
      }

      lcq var20 = lcq.COLORSHIFT_NEUTRAL;
      if (this.kwM.cvj() == var1) {
         var20 = var20.V(hix.a(this.kwM).kwY);
      }

      this.H(var20);
      lgs var21 = new lgs(var3, var4, var6, var7);
      this.f(var21);
      byte var23 = 12;
      var21.cf -= var23;
      var21.rmN += var23;
      this.kwO.j(var21);
      if (this instanceof hix$c) {
         var23 = 18;
         var21.cf -= var23;
         var21.rmN += var23;
         this.kwO.j(var21);
         this.kwO.a(this.kwM.getSelectedItem() == var1 ? hix.a(this.kwM).jGN : hlu.kGV);
         var21.rmN = 0;

         for (int var26 = 0; var26 < var5.length; var26++) {
            var21.cf += 6;
            var21.cg += 10;
            var21.rmN = var5[var26];
            this.a(var26, new lgs(var21));
         }
      } else {
         this.kwO.a(var1.atw());
         var21.rmN = 0;

         for (int var25 = 0; var25 < var5.length; var25++) {
            var21.cf += 140;
            var21.cg += 5;
            var21.rmN = var5[var25];
            this.a(var25, new lgs(var21));
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
