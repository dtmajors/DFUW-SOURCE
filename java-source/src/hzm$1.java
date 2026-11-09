class hzm$1 extends lie {
   hzm$1(hzm var1, double var2, boolean var4) {
      super(var2, var4);
      this.lwv = var1;
   }

   @Override
   public void dh(double var1) {
      if (hzm.a(this.lwv) < hzm.b(this.lwv).size()) {
         ((iax)hzm.b(this.lwv).get(hzm.a(this.lwv))).pB(true);
      }
   }
}
