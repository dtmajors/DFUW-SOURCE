class jbq$a {
   protected int mPl;
   protected int mPm;
   protected Integer[] mPn;

   private jbq$a(jbq var1) {
      this.mPk = var1;
      this.mPl = 0;
      this.mPm = -1;
      this.mPn = new Integer[]{null, null};
   }

   protected void a(jbq$a var1) {
      this.mPl = var1.mPl;
      this.mPm = var1.mPm;
      this.mPn = (Integer[])var1.mPn.clone();
   }

   boolean b(jbq$a var1) {
      if (this.mPl != var1.mPl) {
         return false;
      }

      if (this.mPm != var1.mPm) {
         return false;
      }

      if (this.mPn.length != var1.mPn.length) {
         return false;
      }

      for (int var2 = 0; var2 < this.mPn.length; var2++) {
         if (this.mPn[var2] != var1.mPn[var2]) {
            return false;
         }
      }

      return true;
   }
}
