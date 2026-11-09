class mpx$a implements Runnable {
   private mpx$a(mpx var1) {
      this.DXr = var1;
   }

   @Override
   public void run() {
      while (true) {
         if (mpx.b(this.DXr) != null && mpx.b(this.DXr).egz() != null) {
            mpx.c(this.DXr).setText(mpx.b(this.DXr).egz());
            mpx.d(this.DXr).setText(mpx.b(this.DXr).eLw());
            mpx.e(this.DXr);

            try {
               Thread.sleep(20L);
            } catch (InterruptedException var2) {
               var2.printStackTrace();
            }
         }
      }
   }
}
