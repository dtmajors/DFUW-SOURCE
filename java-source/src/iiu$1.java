class iiu$1 extends jlr<iiu, Float> {
   iiu$1(iiu var1, iiu var2) {
      super(var2);
      this.mbW = var1;
   }

   public void a(iiu var1, Float var2) {
      if (iiu.a(this.mbW) != null) {
         if (var2 < 0.0F) {
            this.mbW.setVisible(false);
         } else {
            iiu.a(this.mbW, var2 < 0.0F ? 0.0F : (var2 > 1.0F ? 1.0F : var2));
            iiu.a(this.mbW).setProgress(iiu.b(this.mbW));
            iiu.a(this.mbW).OI(iiu.b(this.mbW) < 0.25F ? 1 : 0);
            this.mbW.daj();
            this.mbW.setVisible(iiu.b(this.mbW) <= 1.0F && iiu.b(this.mbW) >= 0.0F);
         }
      }
   }
}
