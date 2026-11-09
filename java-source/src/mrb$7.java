class mrb$7 implements Runnable {
   mrb$7(mrb var1, int var2) {
      this.EhQ = var1;
      this.EhR = var2;
   }

   @Override
   public void run() {
      if (mrb.d(this.EhQ).getParent().isVisible()) {
         mrb.d(this.EhQ).setText("(" + this.EhR + " files parsed out of aproximately 20000...)");
      }
   }
}
