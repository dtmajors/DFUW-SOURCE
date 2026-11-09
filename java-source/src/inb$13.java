class inb$13 extends ina {
   inb$13(inb var1, ioa var2, joa var3, imn var4) {
      super(var2, var3, var4);
      this.mlz = var1;
   }

   @Override
   protected void b(imn var1) {
      inb.e(this.mlz).a(var1);
   }
}
