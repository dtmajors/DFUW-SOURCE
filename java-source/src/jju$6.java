class jju$6 extends lie {
   jju$6(jju var1, double var2, boolean var4, hyy.b var5, hzz var6) {
      super(var2, var4);
      this.nrc = var1;
      this.nrn = var5;
      this.nro = var6;
   }

   @Override
   public void dh(double var1) {
      String var3 = this.nrc.c(this.nrn);
      if (var3 == null) {
         var3 = this.nrn.cGE().bD().exA();
      }

      var3 = iah.oM(var3);
      if (var3 != null) {
         this.nro.mf(var3);
      } else {
         this.stop();
      }
   }
}
