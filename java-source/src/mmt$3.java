class mmt$3 implements Runnable {
   mmt$3(mmt var1, boolean var2) {
      this.DNM = var1;
      this.DNN = var2;
   }

   @Override
   public void run() {
      if (this.DNN && !mmt.a(this.DNM).isSelected()) {
         mmt.a(this.DNM).doClick();
      } else if (!this.DNN && mmt.a(this.DNM).isSelected()) {
         mmt.a(this.DNM).doClick();
      }

      try {
         Thread.sleep(100L);
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }
   }
}
