class anm$a {
   ldv aCK = null;
   anm$b bGt = anm$b.bGx;

   anm$a(ldv var1, anm$b var2) {
      this.aCK = var1;
      this.bGt = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (var1 == null) {
         return false;
      }

      if (this.getClass() != var1.getClass()) {
         return false;
      }

      anm$a var2 = (anm$a)var1;
      if (this.aCK == null) {
         if (var2.aCK != null) {
            return false;
         }
      } else if (!this.aCK.equals(var2.aCK)) {
         return false;
      }

      if (this.bGt == null) {
         if (var2.bGt != null) {
            return false;
         }
      } else if (this.bGt != var2.bGt) {
         return false;
      }

      return true;
   }

   @Override
   public int hashCode() {
      byte var1 = 31;
      int var2 = 1;
      var2 = 31 * var2 + (this.aCK == null ? 0 : this.aCK.hashCode());
      return 31 * var2 + (this.bGt == null ? 0 : this.bGt.ordinal());
   }

   @Override
   public String toString() {
      return null;
   }
}
