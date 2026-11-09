import hpx.a;

class hgf$b extends hqv {
   public int ResourceType;

   public hgf$b(hgf var1, hnc var2, String var3, lgg var4, lhf var5, a var6, hqv.a var7, lhu var8) {
      super(var2, var3, var4, var5, var6, var7, var8);
      this.kng = var1;
   }

   @Override
   public void ccc() {
      if (hgf.a(this.kng) != null && !hgf.a(this.kng).isEmpty()) {
         for (hdz var2 : hgf.a(this.kng)) {
            if (var2.kaW.Type == this.ResourceType) {
               hgf.a(this.kng, (hdu)var2);
               break;
            }
         }

         super.ccc();
      }
   }
}
