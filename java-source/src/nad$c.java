class nad$c extends nad$a {
   ldv jyx;
   ljq Position;
   lgl Rotation;
   String FileName;

   nad$c(nad var1, ldv var2) {
      super(var1, null);
      this.EXX = var1;
      this.jyx = null;
      this.Position = null;
      this.Rotation = null;
      this.FileName = "";
      this.jyx = new ldv(var2.ib(), var2.enw(), var2.enx());
      amf var3 = nad.a(var1).d(var2);
      if (var3 != null) {
         if (var3 instanceof ami) {
            ami var4 = (ami)var3;
            this.Position = var4.av().esF();
            this.Rotation = new lgl(var4.aw());
         }

         this.FileName = "";
         if (var3 instanceof bdl) {
            this.FileName = "xml-files/object/collection/" + ((bdl)var3).amd();
         } else if (var3 instanceof dsp) {
            this.FileName = ((dsp)var3).atK();
         } else {
            this.FileName = "xml/" + var3.getObjectDescriptionFilename();
         }
      }
   }

   @Override
   public void perform() {
   }

   @Override
   public void eUf() {
      if (this.FileName.length() != 0) {
         hac var1 = (hac)nad.b(this.EXX).d(4097);
         var1.on(lcr.qAE);
         var1.f(lcr.qzr);
         var1.Lb(1);
         var1.setFileName(lcw.qLb + this.FileName);
         if (this.Position != null && this.Rotation != null) {
            var1.c(this.Position);
            var1.setRotation(this.Rotation.eqT());
         }

         nad.b(this.EXX).a(var1);
      }
   }

   @Override
   void eUg() {
   }

   @Override
   boolean uw(ldv var1) {
      return false;
   }
}
