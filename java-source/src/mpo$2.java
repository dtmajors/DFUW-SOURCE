class mpo$2 implements Runnable {
   mpo$2(mpo var1, int var2, int var3) {
      this.DWe = var1;
      this.DGn = var2;
      this.DWf = var3;
   }

   @Override
   public void run() {
      mpo.a(this.DWe).setMaximum(this.DGn);
      mpo.a(this.DWe).setValue(this.DWf);
   }
}
