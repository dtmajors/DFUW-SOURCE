class ifj$2 implements ifi$a {
   ifj$2(ifj var1, hvy var2) {
      this.lRl = var1;
      this.lPp = var2;
   }

   @Override
   public void QA(int var1) {
      this.lPp.cV(1, var1);
      if (var1 != -1) {
         int var2 = this.lRl.QC(var1);
         ifj.b(this.lRl).do(var2);
         if (ifj.a(this.lRl).az() == var1 && var2 < 2) {
            ifj.a(this.lRl).Qz(-1);
         }
      }

      ifj.a(this.lRl).cSj();
      ifj.b(this.lRl).cSj();
   }

   @Override
   public void QB(int var1) {
      ifj.a(this.lRl).Qz(var1);
   }
}
