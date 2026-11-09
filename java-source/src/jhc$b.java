public enum jhc$b {
   ndJ(lyh.tDY),
   ndK(lyh.tDZ),
   ndL(lyh.tEa),
   ndM(lyh.tEb),
   ndN(lyh.tEc),
   ndO(lyh.tEd),
   ndP(lyh.tEe),
   ndQ(lyh.tEf),
   ndR(lyh.tEg);

   private lox DisplayName = null;

   jhc$b(lox var3) {
      this.DisplayName = var3;
   }

   public static lox[] getDisplayNames() {
      lox[] var0 = new lox[values().length];

      for (int var1 = 0; var1 < values().length; var1++) {
         var0[var1] = values()[var1].DisplayName;
      }

      return var0;
   }

   @Override
   public String toString() {
      return this.DisplayName.bD().exA();
   }
}
