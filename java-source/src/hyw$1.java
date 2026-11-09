class hyw$1 extends lie {
   hyw$1(hyw var1, double var2, boolean var4) {
      super(var2, var4);
      this.lqY = var1;
   }

   @Override
   public void dh(double var1) {
      if (var1 < hyw.a(this.lqY)) {
         hyw.a(this.lqY, hyw.a(this.lqY) - (float)var1);
      } else {
         hyw.a(this.lqY, hyw.b(this.lqY), hyw.c(this.lqY));
         hyw.d(this.lqY);
      }
   }
}
