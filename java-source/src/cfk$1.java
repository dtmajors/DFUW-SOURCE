class cfk$1 implements aca {
   public cew baO;
   public int ResourceType;

   cfk$1(cfk var1, cew var2, cfs var3, int var4) {
      this.euJ = var1;
      this.euG = var2;
      this.euH = var3;
      this.euI = var4;
      this.baO = this.euG;
      this.ResourceType = this.euH.az();
   }

   @Override
   public void a(int var1, float var2, ldv var3, ljq var4) {
      if (var2 <= this.euH.getRadius()) {
         this.euJ.pJ(this.euI);
         this.baO.b(this, var1);
      }
   }
}
