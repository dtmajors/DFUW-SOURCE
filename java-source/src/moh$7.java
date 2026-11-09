class moh$7 implements Runnable {
   moh$7(moh var1) {
      this.DSw = var1;
   }

   @Override
   public void run() {
      moh.f(this.DSw).setValue(this.DSw.op.size());
   }
}
