class mld$6 extends mld$b {
   mld$6(mld var1, String var2) {
      super(var1, null);
      this.DHD = var1;
      this.DHF = var2;
   }

   @Override
   public void a(cto var1, boolean var2, int var3) {
      if (var1.pa().toLowerCase().contains(this.DHF)) {
         this.DHG = true;
      }
   }
}
