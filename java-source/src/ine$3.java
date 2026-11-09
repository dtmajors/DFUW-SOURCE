import java.util.ArrayList;
import java.util.Map.Entry;

class ine$3 extends iwv {
   ine$3(ine var1, String var2) {
      super(var2);
      this.mlT = var1;
   }

   @Override
   public hyn dd(int var1, int var2) {
      if (ine.b(this.mlT)) {
         return iae.oJ(lxb.tmU.bD().exA().toUpperCase());
      }

      if (ine.c(this.mlT) == null) {
         return null;
      }

      String var3 = isg.b(isf.mwM, 12, 16777215, lxb.tmV.bD().exA().toUpperCase());
      ArrayList var4 = lcn.emv();

      for (Entry var6 : ine.c(this.mlT).entrySet()) {
         int var7 = (Integer)var6.getKey();
         int var8 = (Integer)var6.getValue();
         String var9 = isg.b(isf.mwM, 11, 16777215, lvm.sXa.bD(var7).exA().toUpperCase());
         var4.add(var9);
         String var10 = isg.a(ish.mwS, isg.b(isf.mwM, 11, 16776960, "" + var8));
         var4.add(var10);
      }

      String[] var11 = var4.toArray(new String[var4.size()]);
      return iae.b(iae.a(var3, null, ine.c(this.mlT).size(), 2, 0, 0, var11));
   }
}
