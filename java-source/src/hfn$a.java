public class hfn$a {
   final String jGu;
   final hfl$a kjw;
   final long aEW;
   int kjx;
   int kjy;
   int kjz;
   hfl kjA;
   hcl kiV;

   hfn$a(hfn var1, String var2, hnb var3, lcq var4, long var5) {
      this.kjv = var1;
      this.kjx = -1;
      this.kjy = -1;
      this.kjz = -1;
      this.kjA = null;
      this.jGu = var2;
      this.kjw = new hfl$a(var3, var4);
      this.aEW = var5;
      this.kiV = new hcl(var1.jET.jIm.dXw.jZD.jGq, var2, var3, var4, false, var5);
   }

   int Mm(int var1) {
      if (var1 == this.kjz) {
         return this.kjy;
      }

      this.kjz = var1;
      this.kiV.ci(var1, var1 / 2);
      this.kjy = this.kiV.ccb();
      return this.kjy;
   }

   hcl Mn(int var1) {
      this.Mm(var1);
      return this.kiV;
   }

   hfl b(lgg var1, lhf var2) {
      this.Mm(var2.rmN);
      if (this.kjA == null) {
         this.kjA = new hfl(this.kjv.jET.jIm.dXw, "Chat Entry", var1, var2, this.kiV, true);
         this.kjv.j(this.kjA);
      } else {
         this.kjA.z(var1);
         this.kjA.d(var2);
      }

      return this.kjA;
   }

   void chY() {
      if (this.kjA != null) {
         this.kjA.remove();
         this.kjA = null;
      }
   }
}
