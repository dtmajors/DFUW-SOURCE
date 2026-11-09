import java.util.List;

class jao$1 implements hyk {
   jao$1(jao var1, List var2) {
      this.mIK = var1;
      this.mIJ = var2;
   }

   @Override
   public String[] cDR() {
      return this.mIJ.toArray(new String[this.mIJ.size()]);
   }

   @Override
   public void a(int var1, String var2, int var3, int var4, int var5, int var6) {
      if (var2.equalsIgnoreCase(lxj.trL.bD().exA().toUpperCase())) {
         this.mIK.a("collapseItemCatalog", new Object[0]);
      }

      jao.cDY().czi();
   }

   @Override
   public void cDU() {
   }
}
