class jpr$a {
   public int ixE;
   public double Up;
   public double eNV;
   public boolean nOW;

   public jpr$a(jpr var1) {
      this.nOX = var1;
      this.ixE = 0;
      this.Up = 0.0;
      this.eNV = 0.0;
      this.nOW = false;
   }

   public String dPu() {
      return jpr.a(this.nOX).getName(this.ixE);
   }

   public void reset() {
      this.ixE = 0;
      this.Up = 0.0;
      this.eNV = 0.0;
      this.nOW = false;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SFActionTimer: ActionType=");
      var1.append(this.ixE);
      var1.append(" ActionName='");
      var1.append(this.dPu());
      var1.append("' TimerLength=");
      if (this.Up == -2.0 || this.Up == -3.0) {
         var1.append("INFINITE_LENGTH");
      } else if (this.eNV > 0.0) {
         var1.append(this.eNV);
         var1.append("' TimeOut=");
         var1.append(this.Up);
      }

      return var1.toString();
   }
}
