import java.util.Collection;

class hjb$c extends hjb$a {
   public hjb$c(hjb var1, int var2) {
      super(var1, var2, hjb.a(var1).kwV, hjb.a(var1).kwW);
      this.kxo = var1;
   }

   @Override
   public void dispose() {
      super.dispose();
   }

   @Override
   protected void a(int var1, lgs var2) {
      if (var2.H != 64) {
      }

      int var3 = (var2.H - this.kxp.getHeight()) / 2;
      var2.cg += var3;
      var2.H -= var3 * 2;
      var2.cf += var3;
      var2.rmN -= var3;
      switch (var1) {
         case 0:
            this.kxp.z(var2.aI());
            this.kxp.d(this.kxs.atw().kLY);
            int var11 = this.kxp.getWidth() + var3;
            var2.cf += var11;
            var2.cg -= 4;
            var2.rmN -= var11;
            this.koQ.j(var2);
            var2.cg += 14;
            var2.rmN = 316;
            this.kwP.j(var2);
            var2.cg -= 14;
            var2.cf += 308;
            var2.rmN = 24;
            this.kxq.j(var2);
            break;
         case 1:
            if (this.kxt == null && hjb.b(this.kxo)) {
               hee var10 = this.kxo.cbP().kci.cof();
               if (var10 != null) {
                  Collection var12 = var10.cfh();
                  if (var12 != null) {
                     for (hdu var7 : var12) {
                        if (var7 instanceof hea && var7.kaW.c(this.kxs)) {
                           float var8 = var7.Bb();
                           String var9 = new ljd(var8).esy();
                           this.kxr.j(var2);
                           this.kxr.mV(var9);
                           return;
                        }
                     }
                  }
               }
            } else {
               this.kxr.j(var2);
               float var4 = this.kxt == null ? 0.0F : this.kxt.getLevel();
               lip var5 = var4 == 0.0F ? ljg.roH : new ljm(var4);
               this.kxr.mV(var5.esy());
            }
            break;
         default:
            assert false : var1;
      }
   }
}
