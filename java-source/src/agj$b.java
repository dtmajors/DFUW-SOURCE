class agj$b extends agj$a {
   public final int bib;

   public agj$b(agj var1, int var2) {
      super(var1, var2);
      this.bia = var1;
      this.bib = this.eY(this.aXP);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(" LinkedEventType='");
      var1.append(this.bia.eV(this.bib));
      var1.append("'");
      return var1.toString();
   }

   private int eY(int var1) {
      switch (var1) {
         case 2:
            return 4;
         case 512:
            return 1024;
         case 1024:
            return 512;
         case 2048:
            return 4096;
         case 4096:
            return 2048;
         case 8192:
            return 16384;
         case 16384:
            return 8192;
         default:
            return -1;
      }
   }
}
