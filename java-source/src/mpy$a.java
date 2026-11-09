class mpy$a implements Runnable {
   private mpy$a(mpy var1) {
      this.DXs = var1;
   }

   @Override
   public void run() {
      while (true) {
         if (mpy.a(this.DXs) != null && mpy.a(this.DXs).egz() != null) {
            mpy.b(this.DXs).setText(mpy.a(this.DXs).egz());
            mpy.c(this.DXs).setText(mpy.a(this.DXs).eLw());
            mpy.d(this.DXs);

            try {
               Thread.sleep(20L);
            } catch (InterruptedException var2) {
               var2.printStackTrace();
            }
         }
      }
   }
}
