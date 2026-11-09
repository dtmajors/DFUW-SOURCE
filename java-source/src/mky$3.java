class mky$3 implements Runnable {
   mky$3(mky var1, int var2, int var3, String var4) {
      this.DGl = var1;
      this.DGm = var2;
      this.DGn = var3;
      this.DGo = var4;
   }

   @Override
   public void run() {
      mky.a(this.DGl).setString("" + this.DGm + "/" + this.DGn);
      if (mky.a(this.DGl).isIndeterminate() && this.DGn != 0) {
         mky.a(this.DGl).setIndeterminate(false);
         mky.a(this.DGl).setString(null);
      }

      mky.a(this.DGl).setMaximum(this.DGn);
      mky.a(this.DGl).setValue(this.DGm);
      mky.b(this.DGl).append(this.DGo + "\n");
   }
}
