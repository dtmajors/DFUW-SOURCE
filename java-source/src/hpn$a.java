class hpn$a<NODE> extends hpm$a<NODE, NODE, hps<NODE, NODE, hms>, hms> {
   private final hpn<NODE> kVL;

   public hpn$a(hpn<NODE> var1) {
      super(var1);
      this.kVL = var1;
   }

   @Override
   public void c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super.c(var1, var2, var3, var4, var5, var6, var7, var8);
      this.kVL.a(var1, var2, var3, var4, var5 + this.kVJ, var6, var7 - this.kVJ, var8);
   }
}
