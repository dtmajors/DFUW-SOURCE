class con$b implements Comparable<con$b> {
   public jrw EXb;
   public con$a EXc;

   con$b(con var1) {
      this.EWS = var1;
      this.EXc = con$a.EWX;
   }

   public int a(con$b var1) {
      return this.equals(var1) ? 0 : this.hashCode() - var1.hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (var1 == null) {
         return false;
      }

      if (!(var1 instanceof con$b)) {
         return false;
      }

      con$b var2 = (con$b)var1;
      if (this.EXb == null) {
         if (var2.EXb != null) {
            return false;
         }
      } else if (!this.EXb.equals(var2.EXb)) {
         return false;
      }

      if (this.EXc == null) {
         if (var2.EXc != null) {
            return false;
         }
      } else if (!this.EXc.equals(var2.EXc)) {
         return false;
      }

      return true;
   }

   @Override
   public int hashCode() {
      byte var1 = 31;
      int var2 = 1;
      var2 = 31 * var2 + (this.EXb == null ? 0 : this.EXb.hashCode());
      return 31 * var2 + (this.EXc == null ? 0 : this.EXc.hashCode());
   }

   @Override
   public String toString() {
      return "File = " + this.EXb + ", Type = " + this.EXc;
   }
}
