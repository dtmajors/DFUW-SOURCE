import java.util.Map;

class hcg$a {
   public final hnb jFE;
   public final int jFF;
   private final Map<Character, lhf> jFG;

   public hcg$a(hcg var1, hnb var2) {
      this.jFH = var1;
      this.jFE = var2;
      this.jFG = lcn.emG();
      this.jFF = var1.dXw.a(this.jFE, "XYZpygfF").H;
   }

   public lhf d(char var1) {
      lhf var2 = this.jFG.get(var1);
      if (var2 == null) {
         var2 = new lhf(this.jFH.dXw.a(this.jFE, "" + var1).rmN, this.jFF);
         this.jFG.put(var1, var2);
      }

      return var2;
   }
}
