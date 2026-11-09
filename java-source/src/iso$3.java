class iso$3 extends itd {
   iso$3(iso var1, loz var2) {
      this.mxn = var1;
      this.mxp = var2;
   }

   @Override
   public String getText() {
      return this.mxp != null ? this.mxp.exA() : null;
   }
}
