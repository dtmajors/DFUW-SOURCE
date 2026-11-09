class nad$e extends nad$a {
   protected ldv EYe;
   protected ldv EYf;
   protected ljq bWy;
   protected ljq pUf;
   protected lgl EYg;
   protected lgl pUg;

   public nad$e(nad var1, ldv var2, ldv var3) {
      super(var1, null);
      this.EXX = var1;
      this.bWy = new ljq();
      this.pUf = null;
      this.EYg = new lgl();
      this.pUg = null;
      this.EYf = var3;
      this.EYe = var2;
      this.x(this.bWy, this.EYg);
   }

   @Override
   public String toString() {
      return " move object:" + this.EYe + " from " + this.bWy + " to " + this.pUf;
   }

   @Override
   public void eUg() {
      if (this.EYe != null) {
         this.pUf = new ljq();
         this.pUg = new lgl();
         this.x(this.pUf, this.pUg);
      }
   }

   @Override
   public void perform() {
      if (this.EYe != null) {
         this.y(this.pUf, this.pUg);
      }
   }

   @Override
   public void eUf() {
      if (this.EYe != null) {
         this.y(this.bWy, this.EYg);
      }
   }

   private void x(ljq var1, lgl var2) {
      dtc var3 = nad.a(this.EXX);
      ldv var4 = nad.c(this.EXX).eE().bvZ();
      amf var5 = var3.d(var4);
      if (var5 instanceof dqk) {
         dqk var6 = (dqk)var5;
         var1.ex(var6.av());
         var2.X(var6.aw());
      } else {
         lfn.b(4, "SFUndoManager", " object is not world mesh object!!");
      }
   }

   private void y(ljq var1, lgl var2) {
      ldv var3 = nad.c(this.EXX).eE().bvZ();
      ftv var4 = (ftv)nad.c(this.EXX).getMessageDelegator().h(1025, nad.c(this.EXX).getGUID(), var3);
      var4.HT(8);
      var4.c(var1);
      var4.a(new lgl(var2));
      nad.c(this.EXX).getMessageDelegator().E(var4);
   }

   @Override
   public boolean uw(ldv var1) {
      if (this.EYe != null && var1.equals(this.EYe)) {
         this.EYe = null;
         this.EYf = null;
         return true;
      } else {
         return false;
      }
   }
}
