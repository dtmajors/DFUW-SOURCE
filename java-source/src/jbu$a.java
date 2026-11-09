import java.util.List;

class jbu$a {
   int aDf;
   int mPN;
   List<jbu$b> gXm;

   public jbu$a(jbu var1, int var2, int var3, List var4) {
      this.mPO = var1;
      this.aDf = var2;
      this.mPN = var3;
      this.gXm = var4;
   }

   public void fl(int var1, int var2) {
      for (jbu$b var4 : this.gXm) {
         if (var4.ResourceType == var1) {
            var4.ayN = var2;
         }
      }
   }
}
