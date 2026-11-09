class mpj$a extends Thread {
   private int DVo;

   public mpj$a(mpj var1, int var2) {
      this.DVp = var1;
      this.DVo = 0;
      this.DVo = var2;
   }

   @Override
   public void run() {
      synchronized (this) {
         while (true) {
            try {
               this.wait(this.DVo);
               if (this.DVp.isVisible()) {
                  this.DVp.rescanCurrentDirectory();
               }
            } catch (InterruptedException var4) {
               var4.printStackTrace();
            }
         }
      }
   }
}
