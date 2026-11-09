class hix$c extends hix$a {
   public hix$c(hix var1, int var2) {
      super(var1, var2, hix.a(var1).kwV, hix.a(var1).kwW);
      this.kwM = var1;
   }

   @Override
   public void dispose() {
      super.dispose();
   }

   @Override
   protected void a(int var1, lgs var2) {
      if (var2.H != 80) {
      }

      byte var3 = 20;
      switch (var1) {
         case 0:
            this.kwQ.z(var2.aI());
            int var4 = this.kwQ.getWidth() + var3;
            var2.cf += var4;
            var2.cg += 10;
            var2.rmN = 300;
            this.koQ.j(var2);
            var2.cg += 14;
            var2.rmN = 356;
            this.kwP.j(var2);
         case 1:
            break;
         default:
            assert false : var1;
      }
   }
}
