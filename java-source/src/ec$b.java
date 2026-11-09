class ec$b implements Comparable<ec$b> {
   String Name;
   ash[] pl;

   ec$b(ec var1) {
      this.pm = var1;
      this.pl = new ash[0];
   }

   public void a(ash var1) {
      ash[] var2 = new ash[this.pl.length + 1];
      System.arraycopy(this.pl, 0, var2, 0, this.pl.length);
      this.pl = var2;
      this.pl[this.pl.length - 1] = var1;
   }

   public int a(ec$b var1) {
      return var1.equals(this) ? 0 : var1.hashCode() - this.hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (var1 == null) {
         return false;
      }

      if (!(var1 instanceof ec$b)) {
         return false;
      }

      ec$b var2 = (ec$b)var1;
      if (this.Name == null) {
         if (var2.Name != null) {
            return false;
         }
      } else if (!this.Name.equals(var2.Name)) {
         return false;
      }

      return true;
   }

   @Override
   public int hashCode() {
      byte var1 = 31;
      byte var2 = 1;
      return 31 * var2 + (this.Name == null ? 0 : this.Name.hashCode());
   }
}
