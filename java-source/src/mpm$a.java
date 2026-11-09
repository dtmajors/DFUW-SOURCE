class mpm$a implements Runnable {
   private mpm$a(mpm var1) {
      this.DVG = var1;
   }

   @Override
   public void run() {
      while (true) {
         if (mpm.a(this.DVG) != null && mpm.a(this.DVG).egz() != null) {
            mpm.b(this.DVG).setText(mpm.a(this.DVG).egz());
            mpm.c(this.DVG).setText(mpm.a(this.DVG).eLw());
            mpm.d(this.DVG);

            try {
               Thread.sleep(20L);
            } catch (InterruptedException var2) {
               var2.printStackTrace();
            }
         }
      }
   }
}
