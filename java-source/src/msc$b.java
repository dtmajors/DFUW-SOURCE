class msc$b implements Runnable {
   private msc$b(msc var1) {
      this.EpP = var1;
   }

   @Override
   public void run() {
      while (true) {
         if (msc.a(this.EpP) != null && msc.a(this.EpP).egz() != null) {
            msc.b(this.EpP).setText(msc.a(this.EpP).egz());
            msc.c(this.EpP).setText(msc.a(this.EpP).eLw());
            msc.d(this.EpP);

            try {
               Thread.sleep(20L);
            } catch (InterruptedException var2) {
               var2.printStackTrace();
            }
         }
      }
   }
}
