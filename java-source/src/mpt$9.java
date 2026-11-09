import java.util.ArrayList;
import java.util.Map;

class mpt$9 implements Runnable {
   mpt$9(mpt var1, Map var2, mpt$a var3, boolean var4) {
      this.DXe = var1;
      this.DXg = var2;
      this.DXf = var3;
      this.DXh = var4;
   }

   @Override
   public void run() {
      for (dta var2 : this.DXg.values()) {
         ArrayList var3 = lcn.emv();
         var3.addAll(var2.bzr());

         for (amf var5 : var3) {
            this.DXf.g(var5, this.DXh);
         }
      }
   }
}
