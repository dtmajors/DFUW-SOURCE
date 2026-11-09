class icd$1 extends ice {
   icd$1(icd var1, jmy var2) {
      super(var2);
      this.lHc = var1;
   }

   @Override
   public void c(jmy var1) {
      this.lHc.close();
      this.lHc.c(var1);
   }
}
