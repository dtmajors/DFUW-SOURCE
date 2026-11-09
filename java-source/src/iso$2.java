class iso$2 extends itd {
   iso$2(iso var1, lox var2, boolean var3) {
      this.mxn = var1;
      this.lWv = var2;
      this.mxo = var3;
   }

   @Override
   public String getText() {
      return this.lWv != null ? (this.mxo ? this.lWv.bD().exA().toUpperCase() : this.lWv.bD().exA()) : null;
   }
}
