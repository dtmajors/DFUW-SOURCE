class mql$a implements Runnable {
   private mql$a(mql var1) {
      this.EdT = var1;
   }

   @Override
   public void run() {
      while (true) {
         if (mql.a(this.EdT) != null && mql.a(this.EdT).egz() != null) {
            mql.b(this.EdT).setText(mql.a(this.EdT).egz());
            mql.c(this.EdT).setText(mql.a(this.EdT).eLw());
            mql.d(this.EdT);

            try {
               Thread.sleep(20L);
            } catch (InterruptedException var2) {
               var2.printStackTrace();
            }
         }
      }
   }
}
