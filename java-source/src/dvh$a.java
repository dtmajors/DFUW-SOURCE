class dvh$a {
   public ldv GUID;
   public int[] bqd;
   public int[] dhI;

   dvh$a(dvh var1) {
      this.hfC = var1;
      this.GUID = null;
      this.bqd = null;
      this.dhI = null;
   }

   @Override
   public boolean equals(Object var1) {
      assert this.dhI != null;
      if (!(var1 instanceof dvh$a)) {
         return false;
      }

      dvh$a var2 = (dvh$a)var1;
      return var2.GUID.equals(this.GUID);
   }

   @Override
   public String toString() {
      assert this.dhI != null;
      StringBuilder var1 = new StringBuilder();
      var1.append(this.getClass().getSimpleName());
      var1.append(": GUID=");
      var1.append(this.GUID);
      var1.append(" NumberOfEvents=");
      var1.append(this.dhI.length);

      for (int var5 : this.bqd) {
         var1.append(" Resource=");
         var1.append(var5);
      }

      return var1.toString();
   }
}
