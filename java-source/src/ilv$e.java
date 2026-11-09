class ilv$e extends ilv$d {
   private int miA;
   private int quantity;

   ilv$e(ilv var1, int var2, int var3) {
      super(var1);
      this.miA = var2;
      this.quantity = var3;
   }

   @Override
   public void ddx() {
      ilv.a(this.mix, this.miA, this.quantity, this.miy);
   }
}
