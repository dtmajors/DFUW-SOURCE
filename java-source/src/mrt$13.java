class mrt$13 implements Runnable {
   mrt$13(mrt var1, int var2, int var3) {
      this.Env = var1;
      this.DGn = var2;
      this.DGm = var3;
   }

   @Override
   public void run() {
      if (mrt.c(this.Env).isIndeterminate()) {
         mrt.c(this.Env).setIndeterminate(false);
         mrt.c(this.Env).setString(null);
      }

      mrt.c(this.Env).setMaximum(this.DGn);
      mrt.c(this.Env).setValue(this.DGm);
   }
}
