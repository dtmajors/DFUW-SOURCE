import java.util.Collection;

class hja$c extends hja$a {
   public hja$c(hja var1, int var2) {
      super(var1, var2, hja.a(var1).kwV, hja.a(var1).kwW);
      this.kxg = var1;
   }

   @Override
   public void dispose() {
      super.dispose();
   }

   @Override
   protected void a(int var1, lgs var2) {
      if (var2.H != 56) {
      }

      int var3 = (var2.H - this.kwQ.getHeight()) / 2;
      var2.cg += var3;
      var2.H -= var3 * 2 + 4;
      var2.cf += var3;
      var2.rmN -= var3;
      switch (var1) {
         case 0:
            lhf var12 = new lhf(32, 32);
            var2.cg += 4;
            var2.cf += 4;
            this.kwQ.z(var2.aI());
            this.kwQ.d(var12);
            var2.cg -= 4;
            var2.cf -= 4;
            int var15 = this.kwQ.getWidth() + var3;
            var2.cf += var15;
            var2.rmN -= var15;
            this.koQ.j(var2);
            var2.cg += 14;
            var2.rmN = 316;
            this.kwP.j(var2);
            break;
         case 1:
            var2.cg += 7;
            var2.cf += 70;
            this.kwR.j(var2);
            if (this.kdD == null) {
               hee var4 = this.kxg.cbP().kci.cof();
               if (var4 != null) {
                  Collection var5 = var4.cfh();
                  if (var5 != null) {
                     for (hdu var7 : var5) {
                        if (var7 instanceof hdz && var7.kaW.c(this.kkQ)) {
                           float var8 = var7.Bb();
                           String var9 = new ljd(var8).esy();
                           this.kwR.mV(var9);
                           return;
                        }
                     }
                  }
               }
            } else if (cug.vF(this.kdD.kaW.Type)) {
               brt var10 = (brt)cug.fxg.get(this.kdD.kaW.Type);
               if (var10 != null) {
                  float var13 = var10.Bb();
                  String var16 = new ljd(var13).esy();
                  this.kwR.mV(var16);
               }
            } else {
               hee var11 = this.kxg.cbP().kci.cof();
               if (var11 != null) {
                  Collection var14 = var11.cfh();
                  if (var14 != null) {
                     for (hdu var18 : var14) {
                        if (var18 instanceof hdz && var18.kaW.c(this.kkQ)) {
                           float var19 = var18.Bb();
                           String var20 = new ljd(var19).esy();
                           this.kwR.mV(var20);
                           return;
                        }
                     }
                  }
               }
            }
            break;
         default:
            assert false : var1;
      }
   }
}
