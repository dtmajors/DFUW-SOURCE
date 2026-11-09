class jhg$2 extends lie {
   jhg$2(jhg var1, double var2, boolean var4) {
      super(var2, var4);
      this.ney = var1;
   }

   @Override
   public void dh(double var1) {
      if (var1 < 30.0) {
         jhg.a(this.ney, (int)var1);
      } else {
         jhg.a(this.ney);
         this.ney.cUF().qg(false);
      }
   }
}
