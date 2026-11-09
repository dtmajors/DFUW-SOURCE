class ilv$c extends ilv$d {
   hxd miv;

   public ilv$c(ilv var1, ilv var2, hxd var3) {
      super(var2);
      this.miw = var1;
      this.miv = var3;
   }

   @Override
   public void ddx() {
      ilv.a(this.miw, this.miv);
   }
}
