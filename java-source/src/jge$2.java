class jge$2 extends lie {
   jge$2(jge var1, double var2, boolean var4) {
      super(var2, var4);
      this.mZu = var1;
   }

   @Override
   public void dh(double var1) {
      jge.a(this.mZu, var1);
      if (var1 >= jge.c(this.mZu)) {
         jge.d(this.mZu);
      }
   }
}
