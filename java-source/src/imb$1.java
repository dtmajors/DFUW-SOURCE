class imb$1 extends ilv {
   imb$1(imb var1, ilt var2) {
      super(var2);
      this.miW = var1;
   }

   @Override
   public void ddt() {
      this.miW.ddt();
   }

   @Override
   public void ddu() {
      this.miW.ddu();
   }
}
