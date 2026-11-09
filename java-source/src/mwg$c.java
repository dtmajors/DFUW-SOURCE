class mwg$c implements Runnable {
   public mwg$c(mwg var1) {
      this.EPd = var1;
   }

   @Override
   public void run() {
      while (mwg.e(this.EPd)) {
         try {
            Thread.sleep(50L);
         } catch (InterruptedException var4) {
            var4.printStackTrace();
         }

         if (mwg.f(this.EPd) != null) {
            synchronized (mwg.f(this.EPd)) {
               if (mwg.g(this.EPd) != mwg.f(this.EPd).size()) {
                  mwg.a(this.EPd, mwg.f(this.EPd).size());
                  mwg.h(this.EPd);
               }
            }
         }
      }

      System.out.println("Table update thread killed!");
   }
}
