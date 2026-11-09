class cel$a {
   public final int SkillType;
   public final int aYH;
   public final double dth;
   public boolean eqt;

   public cel$a(cel var1, int var2, int var3, double var4) {
      this.equ = var1;
      this.eqt = false;
      this.SkillType = var2;
      this.aYH = var3;
      this.dth = var4;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SFSkillSessionInfo: Skill='");
      var1.append(lea.enZ().getName(this.SkillType));
      var1.append("' SessionID=");
      var1.append(this.aYH);
      var1.append(" TimeoutTime=");
      var1.append(this.dth);
      return var1.toString();
   }
}
