class ces$a {
   public final int Type;
   public final String Name;

   public ces$a(ces var1, int var2, String var3) {
      this.erk = var1;
      this.Type = var2;
      this.Name = var3;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("PlayerFunction: Name='");
      var1.append(this.Name);
      var1.append("' Type=");
      var1.append(this.Type);
      return var1.toString();
   }
}
