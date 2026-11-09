class iio$2 extends hvl {
   iio$2(iio var1, float var2, float var3, double var4) {
      super(var2, var3, var4);
      this.mbA = var1;
   }

   @Override
   public void hz(float var1) {
      iio.a(this.mbA).hz(var1);
   }
}
