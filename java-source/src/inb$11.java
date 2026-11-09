class inb$11 extends imz {
   inb$11(inb var1, ioa var2, joa var3, imm var4) {
      super(var2, var3, var4);
      this.mlz = var1;
   }

   @Override
   protected void a(imm var1, boolean var2, boolean var3) {
      this.mlz.b(var1, var2, var3);
   }
}
