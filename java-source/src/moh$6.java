class moh$6 extends mjg {
   moh$6(moh var1, lej var2) {
      this.DSw = var1;
      this.DSx = var2;
   }

   @Override
   public Object Hv() {
      return moh.a(this.DSw, this.DSx);
   }

   @Override
   public void finished() {
      moh.e(this.DSw).setEnabled(true);
   }
}
