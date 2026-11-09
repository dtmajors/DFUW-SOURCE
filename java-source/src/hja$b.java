class hja$b extends hja$a {
   public hja$b(hja var1, int var2) {
      super(var1, var2, hja.a(var1).kwU, hja.a(var1).kwW);
      this.kxg = var1;
   }

   @Override
   protected void f(lgs var1) {
      if (var1.H != 37) {
      }

      var1.cg += 5;
      var1.H -= 5;
   }

   @Override
   protected void a(int var1, lgs var2) {
      if (var2.H != 32) {
      }

      byte var3 = 4;
      var2.cg += var3;
      var2.H -= var3 * 2;
      var2.cf += var3;
      var2.rmN -= var3;
      switch (var1) {
         case 0:
            this.kwQ.z(var2.aI());
            this.kwQ.d(this.kkQ.atw().kLY);
            int var4 = this.kwQ.getWidth() + hja.a(this.kxg).kwT;
            var2.rmN -= var4;
            var2.cg += 4;
            this.koQ.j(var2);
            break;
         case 1:
            this.kwR.j(var2);
            this.kwR.mV(ljg.roH.esy());
            break;
         default:
            assert false;
      }
   }
}
