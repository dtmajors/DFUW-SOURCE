class icx$a extends iqv {
   private boolean lIw;
   private int lIx;
   private int lIy;

   private icx$a() {
   }

   @Override
   public void e(ipf var1) {
      if (this.lIw) {
         var1.setSize(this.lIx, this.lIy);
      } else {
         super.e(var1);
         this.lIw = true;
         this.lIx = var1.getWidth();
         this.lIy = var1.getHeight();
      }
   }
}
