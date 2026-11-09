class imc$1 extends ilv {
   imc$1(imc var1, ilt var2) {
      super(var2);
      this.miX = var1;
   }

   @Override
   public void ddt() {
      this.miX.ddt();
   }

   @Override
   public void ddu() {
      this.miX.ddu();
   }
}
