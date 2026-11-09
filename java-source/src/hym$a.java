import java.util.ArrayList;

class hym$a implements hyl {
   public ArrayList<hyj> lof;
   public jlf<hyk> log;
   public hym loh;

   public hym$a(ArrayList<hyj> var1, jlf<hyk> var2) {
      this.lof = var1;
      this.log = var2;
   }

   @Override
   public String[] cDR() {
      String[] var1 = new String[this.lof.size()];

      for (int var2 = 0; var2 < this.lof.size(); var2++) {
         var1[var2] = this.lof.get(var2).getText();
      }

      return var1;
   }

   @Override
   public void a(int var1, String var2, int var3, int var4, int var5, int var6) {
      this.lof.get(var1).cDS();
      hym.cDY().czi();
   }

   @Override
   public void cDU() {
      if (this.log != null) {
         this.log.T(this);
      }
   }

   @Override
   public ArrayList<hyj> cDV() {
      return this.lof;
   }

   @Override
   public hym cDW() {
      return this.loh;
   }
}
