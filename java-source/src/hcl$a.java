import java.util.List;

class hcl$a {
   private String aFo;
   private final String jFM;
   public final hck jFL;
   public lgs jFO;
   public lgs jFP;
   public List<String> dFm;

   public hcl$a(hcl var1, String var2, hck var3, lhf var4) {
      this.jGD = var1;
      this.jFO = null;
      this.jFP = null;
      this.dFm = null;
      this.jFM = var2;
      this.jFL = var3;
      if (this.jFL != hck.jFS && this.jFL != hck.jFU && this.jFL != hck.jFT && this.jFL != hck.jFV) {
         this.aFo = this.jFM;
      } else {
         int var5 = this.jFM.indexOf(167);
         int var6 = var5;

         while (var6 >= 0) {
            int var7 = this.jFM.indexOf(167, var6 + 1);
            if (var7 < 0) {
               var7 = this.jFM.length();
            }

            String var8 = this.jFM.substring(var6 + 1, var7);
            if (this.dFm == null) {
               this.dFm = lcn.emv();
            }

            this.dFm.add(var8);
            var6 = var7;
            if (var6 >= this.jFM.length()) {
               var6 = -1;
            }
         }

         if (var5 >= 0) {
            this.aFo = this.jFM.substring(0, var5);
         } else {
            this.aFo = this.jFM;
         }
      }

      this.jFO = new lgs(-1, -1, var4.rmN, var4.H);
   }
}
