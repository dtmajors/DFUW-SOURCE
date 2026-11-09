class cxh$a {
   public final int Type;
   public final String Name;

   public cxh$a(cxh var1, int var2, String var3) {
      this.fWe = var1;
      this.Type = var2;
      this.Name = var3;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SkillFunction: Name='");
      var1.append(this.Name);
      var1.append("' Type=");
      var1.append(this.Type);
      return var1.toString();
   }
}
