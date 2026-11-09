class nad$d extends nad$a {
   protected ldv EYc;
   protected ldv EYd;

   @Override
   public String toString() {
      return " change selection from " + this.EYc + " to " + this.EYd;
   }

   public nad$d(nad var1, ldv var2) {
      super(var1, null);
      this.EXX = var1;
      this.EYc = var2;
   }

   @Override
   public void perform() {
      nad.c(this.EXX).w(this.EYd);
   }

   @Override
   public void eUf() {
      nad.c(this.EXX).w(this.EYc);
   }

   @Override
   public void eUg() {
      this.EYd = mje.gUd;
      lfn.b(0, "SFUndoSelect", "Finalize action " + this.EYc + " to " + this.EYd);
   }

   @Override
   public boolean uw(ldv var1) {
      if (var1 == null) {
         return false;
      }

      if (this.EYc != null && var1.equals(this.EYc)) {
         this.EYc = null;
      }

      if (this.EYd != null && var1.equals(this.EYd)) {
         this.EYd = null;
      }

      return true;
   }
}
