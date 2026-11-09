class mmu$4 extends Thread {
   mmu$4(mmu var1) {
      this.DNV = var1;
   }

   @Override
   public void run() {
      while (mmu.a(this.DNV)) {
         try {
            Thread.sleep(50L);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         }

         if (mmu.b(this.DNV) != null) {
            mmu.d(this.DNV).cL(mmu.c(this.DNV).fb());
            mmu.e(this.DNV).cL(mmu.c(this.DNV).getRotation());
         }
      }
   }
}
