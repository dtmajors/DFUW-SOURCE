class mrz$d {
   private dgj gpE;
   private dgb Epi;

   public mrz$d(mrz var1, dgb var2) {
      this.EoW = var1;
      this.gpE = null;
      this.Epi = null;
      this.Epi = var2;
   }

   public mrz$d(mrz var1, dgj var2) {
      this.EoW = var1;
      this.gpE = null;
      this.Epi = null;
      this.gpE = var2;
   }

   public dgj eMZ() {
      return this.gpE;
   }

   public dgb eNa() {
      return this.Epi;
   }

   public String getClassName() {
      if (this.gpE != null) {
         Integer var3 = this.gpE.getEffectClassType();
         return del.zR(var3);
      } else if (this.Epi != null) {
         short var1 = this.Epi.getComponentType();
         return del.c(var1);
      } else {
         return "?";
      }
   }

   @Override
   public String toString() {
      String var1 = this.getClassName();
      if (this.Epi != null) {
         if (this.Epi.getComponentType() == 0) {
            dgc var2 = (dgc)this.Epi;
            var1 = var1 + "(" + del.b.values()[var2.getAtomParameterFloat1()].toString() + ")";
         } else if (this.Epi.getComponentType() == 1) {
            dgd var3 = (dgd)this.Epi;
            var1 = var1 + "(" + del.c.values()[var3.getAtomParameterVector1()].toString() + ")";
         }
      }

      return var1;
   }
}
