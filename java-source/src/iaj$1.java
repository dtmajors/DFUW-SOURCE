class iaj$1 extends lie {
   iaj$1(iaj var1, double var2, boolean var4) {
      super(var2, var4);
      this.lBs = var1;
   }

   @Override
   public void dh(double var1) {
      if (var1 >= 10.0) {
         iaj.a(this.lBs);
      }

      iaj.b(this.lBs).setProgress((float)lew.i(0.0, var1 / 10.0, 1.0));
   }
}
