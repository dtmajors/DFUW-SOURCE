class ihf$3 extends igx {
   ihf$3(ihf var1, ign var2) {
      super(var2);
      this.lVT = var1;
   }

   @Override
   public void n(ign var1) {
      this.lVT.p(var1);
   }

   @Override
   public void cVa() {
      if (this.djL()) {
         ihf.a(this.lVT, this.getSelected() ? 1 : -1);
         ihf.j(this.lVT);
      }
   }
}
