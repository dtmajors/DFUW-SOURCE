import jgs.a;

class jaq$3 implements jap {
   jaq$3(jaq var1, a var2) {
      this.mKC = var1;
      this.mKD = var2;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(ldv var1, String var2, jat$a var3) {
      switch (var3) {
         case mLV:
            jaq.a(this.mKC, jaq.c(this.mKC).rP(var1));
            if (jaq.h(this.mKC) == null) {
               return;
            }

            jaq.a(this.mKC, jaq.c(this.mKC).bRA() ? 10 : 11);
            jaq.a(this.mKC, this.mKD.getName(), ioa.cxP().bpb(), ioa.cxP().bpc(), 0, 0);
            break;
         case mLU:
            gjt var4 = (gjt)jaq.i(this.mKC).h(4617, this.mKC.getGUID(), hso.cxK().bAn().gYY);
            var4.SkillType = cxd.fHh;
            var4.YL = var2;
            jaq.j(this.mKC).F(var4);
            break;
         case mLT:
            hyn.cyJ().oh(var2);
      }
   }
}
