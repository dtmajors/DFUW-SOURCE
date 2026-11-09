import java.util.Map.Entry;

class iav$a extends ipx {
   final dlt lCR;
   final boolean lCS;

   public iav$a(iav var1, dlt var2) {
      this.lCQ = var1;
      this.lCR = var2;
      this.a(iqo.dmS());
      this.lCS = this.cLt();
      int var3 = this.lCS ? 524072 : 16723759;
      this.a(iqo.dmS());
      ist var4 = new ist(this.lCR.DisplayName);
      var4.Rk(var3);
      this.W(var4);

      for (Entry var6 : this.lCR.gHa.entrySet()) {
         ist var7 = new ist(" [" + (String)var6.getKey() + ":" + var6.getValue() + "]");
         var7.Rk(var3);
         this.W(var7);
      }
   }

   @Override
   public boolean dv(int var1, int var2) {
      iav.a(this.lCQ, this);
      return false;
   }

   private boolean cLt() {
      for (Entry var2 : this.lCR.gHa.entrySet()) {
         int var3 = 0;

         for (bsh var5 : iav.a(this.lCQ).values()) {
            if (var5.awz().equalsIgnoreCase((String)var2.getKey())) {
               var3 += var5.vf();
            }

            if (var3 >= (Integer)var2.getValue()) {
               break;
            }
         }

         if (var3 < (Integer)var2.getValue()) {
            return false;
         }
      }

      return true;
   }
}
