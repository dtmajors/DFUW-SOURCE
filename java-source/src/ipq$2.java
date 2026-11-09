class ipq$2 extends lie {
   ipq$2(ipq var1, double var2, boolean var4) {
      super(var2, var4);
      this.mst = var1;
   }

   @Override
   public void dh(double var1) {
      for (String var4 : ipq.c(this.mst)) {
         this.mst.qV(var4);
      }
   }
}
