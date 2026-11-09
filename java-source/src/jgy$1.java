import java.util.ArrayList;
import java.util.List;

class jgy$1 extends ivs {
   jgy$1(jgy var1) {
      this.nbN = var1;
   }

   @Override
   public void pn(boolean var1) {
      if (var1) {
         ArrayList var2 = lcn.emv();
         aex var3 = aev.zi().get(jgy.a(this.nbN).Name);
         if (var3 == null) {
            return;
         }

         if (var3.zn() == null || var3.zn().size() <= jgy.a(this.nbN).kgo) {
            return;
         }

         aez var4 = var3.zn().get(jgy.a(this.nbN).kgo);
         afm var5 = var4.zz();
         if (var5 != afm.bgP) {
            return;
         }

         afb var6 = (afb)var4;
         List var7 = var6.zK();
         if (var7 == null) {
            return;
         }

         for (int var9 : var7) {
            String var10 = lvm.sXa.bD(var9).exA();
            var2.add(var10);
         }

         hso.cxK().cxT().b(jgy.a(this.nbN).Name, var2);
      } else {
         hso.cxK().cxT().sx(jgy.a(this.nbN).Name);
      }
   }
}
