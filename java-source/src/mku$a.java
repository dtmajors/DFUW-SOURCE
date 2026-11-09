class mku$a implements Runnable {
   boolean mY;

   private mku$a(mku var1) {
      this.DFT = var1;
      this.mY = true;
   }

   @Override
   public void run() {
      lfn.b(0, this.getClass().getSimpleName(), "run() : Starting Updater thread");

      while (this.mY) {
         try {
            Thread.sleep(100L);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         }

         mku.d(this.DFT).Cf(Float.toString(mku.c(this.DFT).getX()));
         mku.e(this.DFT).Cf(Float.toString(mku.c(this.DFT).getY()));
         mku.f(this.DFT).Cf(Float.toString(mku.c(this.DFT).bdV()));
         mku.d(this.DFT).updateUI();
         mku.e(this.DFT).updateUI();
         mku.f(this.DFT).updateUI();
      }

      lfn.b(0, this.getClass().getSimpleName(), "run() : Stopping Updater thread");
   }
}
