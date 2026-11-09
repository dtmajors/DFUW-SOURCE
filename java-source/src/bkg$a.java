class bkg$a {
   public ldv Ui;
   public double dsE;

   private bkg$a(bkg var1) {
      this.dsF = var1;
      this.Ui = null;
      this.dsE = 0.0;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SFRunningEffect: MeshObjectGUID=");
      var1.append(this.Ui);
      var1.append(" EffectTimeoutTime=");
      var1.append(this.dsE);
      return var1.toString();
   }
}
