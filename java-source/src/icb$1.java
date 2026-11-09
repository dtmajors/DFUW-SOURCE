class icb$1 extends ica {
   icb$1(icb var1, ibu var2) {
      super(var2);
      this.lGS = var1;
   }

   @Override
   public void c(ibu var1) {
      this.lGS.close();
      this.lGS.c(var1);
   }
}
