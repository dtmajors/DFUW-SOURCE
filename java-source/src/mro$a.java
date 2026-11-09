class mro$a implements Runnable {
   private mro$a(mro var1) {
      this.ElA = var1;
   }

   @Override
   public void run() {
      while (true) {
         if (mro.a(this.ElA) != null && mro.a(this.ElA).egz() != null) {
            if (!mro.a(this.ElA).isDisplayable()) {
               return;
            }

            mro.b(this.ElA).setText(mro.a(this.ElA).eLw());
            mro.c(this.ElA);

            try {
               Thread.sleep(20L);
            } catch (InterruptedException var2) {
               var2.printStackTrace();
            }
         }
      }
   }
}
