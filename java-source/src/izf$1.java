class izf$1 extends lie {
   izf$1(izf var1, double var2, boolean var4) {
      super(var2, var4);
      this.mDc = var1;
   }

   @Override
   public void dh(double var1) {
      for (int var3 = 0; var3 < izf.a(this.mDc).size(); var3++) {
         ipi var4 = (ipi)izf.a(this.mDc).get(var3);
         float var5 = var4.getAlpha();
         var5 -= 1.0F / izf.a(this.mDc).size();
         if (var5 <= 0.0F) {
            var5 = 1.0F;
         }

         ((ipi)izf.a(this.mDc).get(var3)).hz(var5);
      }
   }
}
