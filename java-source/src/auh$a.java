class auh$a implements Comparable<auh$a> {
   public ldv ccj;
   public int cck;
   public String Name;
   public lip bZO;
   public egg[] ccl;

   public auh$a(ldv var1, int var2, String var3, lip var4, egg[] var5) {
      assert var1 != null;
      assert var3 != null;
      assert var4 != null;
      assert var5 != null;
      assert auh.b(var5);
      this.ccj = var1;
      this.cck = var2;
      this.Name = var3;
      this.bZO = var4;
      this.ccl = var5;
   }

   public int a(auh$a var1) {
      return this.Name.compareTo(var1.Name);
   }

   @Override
   public String toString() {
      return null;
   }
}
