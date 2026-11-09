class ilv$b extends ilv$d {
   private hxd mit;
   private ldv miu;

   public ilv$b(ilv var1, hxd var2, ldv var3) {
      super(var1);
      this.mit = var2;
      this.miu = var3;
   }

   @Override
   public void ddx() {
      ilv.a(this.mix, this.mit, this.miu, this.miy);
   }
}
