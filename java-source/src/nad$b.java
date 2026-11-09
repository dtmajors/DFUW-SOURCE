class nad$b extends nad$a {
   nad$b$a EXY;
   nad$b$a EXZ;

   public nad$b(nad var1) {
      super(var1, null);
      this.EXX = var1;
      this.EXY = new nad$b$a(this, null);
      this.EXZ = new nad$b$a(this, null);
      this.EXY.saveState();
   }

   @Override
   public void perform() {
      this.EXZ.restoreState();
   }

   @Override
   void eUf() {
      this.EXY.restoreState();
   }

   @Override
   void eUg() {
      this.EXZ.saveState();
   }

   @Override
   boolean uw(ldv var1) {
      return false;
   }
}
