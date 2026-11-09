class ipf$3 extends lie {
   ipf$3(ipf var1, double var2, boolean var4) {
      super(var2, var4);
      this.mrB = var1;
   }

   @Override
   public void dh(double var1) {
      ipf.U(this.mrB);
   }
}
