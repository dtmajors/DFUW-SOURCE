class inb$15 extends ing {
   inb$15(inb var1, imr var2) {
      super(var2);
      this.mlz = var1;
   }

   @Override
   public void cGR() {
      super.cGR();
      inb.a(this.mlz, (ing)null);
   }
}
