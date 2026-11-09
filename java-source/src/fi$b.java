class fi$b {
   public boolean QO;
   public boolean QP;
   public boolean QQ;

   private fi$b(fi var1) {
      this.QN = var1;
      this.QO = false;
      this.QP = false;
      this.QQ = false;
   }

   public void a(fi$b var1) {
      this.QO = var1.QO;
      this.QP = false;
      var1.QP = false;
      this.QQ = false;
      var1.QQ = false;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof fi$b) {
         fi$b var2 = (fi$b)var1;
         return this.QO != var2.QO ? false : !this.QP && !this.QQ;
      } else {
         return false;
      }
   }

   public fi$c b(fi$b var1) {
      if (var1 == null) {
         return null;
      } else if (var1.QO) {
         return !fi.a(this.QN).QO ? fi$c.QS : null;
      } else if (!var1.QO) {
         return fi.a(this.QN).QO ? fi$c.QR : null;
      } else {
         return null;
      }
   }
}
