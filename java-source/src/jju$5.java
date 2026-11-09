import java.util.List;

class jju$5 implements hyk {
   jju$5(jju var1, List var2, jjg var3, double var4, double var6, jjh var8, int var9, int var10, boolean var11) {
      this.nrc = var1;
      this.mIJ = var2;
      this.nrg = var3;
      this.nrh = var4;
      this.nri = var6;
      this.nrj = var8;
      this.nrk = var9;
      this.nrl = var10;
      this.nrm = var11;
   }

   @Override
   public String[] cDR() {
      return this.mIJ.toArray(new String[this.mIJ.size()]);
   }

   @Override
   public void a(int var1, String var2, int var3, int var4, int var5, int var6) {
      if (var2.equalsIgnoreCase(lzc.tOX.bD().exA())) {
         this.nrg.k(this.nrh, this.nri);
      } else if (var2.equalsIgnoreCase(lzc.tOY.bD().exA())) {
         this.nrg.l(this.nrh, this.nri);
      } else if (var2.equalsIgnoreCase(lzc.tOZ.bD().exA())) {
         this.nrg.m(this.nrh, this.nri);
      } else if (var2.equalsIgnoreCase(lzc.tPa.bD().exA())) {
         this.nrg.n(this.nrh, this.nri);
      } else if (var2.equalsIgnoreCase(lzc.tPb.bD().exA())) {
         this.nrg.n(this.nrj);
      } else if (var2.equalsIgnoreCase(lzc.tPc.bD().exA())) {
         this.nrg.o(this.nrj);
      } else if (var2.equalsIgnoreCase(lzc.tPd.bD().exA())) {
         this.nrg.p(this.nrj);
      } else if (var2.equalsIgnoreCase(lzc.tPe.bD().exA())) {
         this.nrg.s(this.nrj);
      } else if (var2.equalsIgnoreCase(lzc.tPl.bD().exA())) {
         this.nrg.w(this.nrj);
      } else if (var2.equalsIgnoreCase(lzc.tPm.bD().exA())) {
         this.nrg.x(this.nrj);
      } else if (var2.equalsIgnoreCase(lzc.tPh.bD().exA())) {
         jju.a(this.nrc, this.nrk, this.nrl, this.nrj);
      } else if (var2.equalsIgnoreCase(lzc.tPi.bD().exA())) {
         this.nrg.v(this.nrj);
      } else if (var2.equalsIgnoreCase(lzc.tPS.bD(jju.a(this.nrc, this.nrh, this.nri)).exA())
         || var2.equalsIgnoreCase(lzc.tPT.bD(jju.a(this.nrc, this.nrh, this.nri)).exA())) {
         ljq var10 = lcw.zh(jju.a(this.nrc, this.nrh, this.nri));
         if (var10 == null || var10.x == 0.0F && var10.y == 0.0F && var10.rlV == 0.0F) {
            return;
         }

         var10.x = (float)this.nrh;
         var10.y = 500.0F;
         var10.rlV = (float)this.nri;
         ern var8 = (ern)jju.c(this.nrc).h(16645, jju.b(this.nrc), hso.cxK().bAn().gYX);
         var8.ilu = 6;
         var8.izI = var2.equalsIgnoreCase(lzc.tPT.bD(jju.a(this.nrc, this.nrh, this.nri)).exA());
         var8.Position = var10;
         jju.d(this.nrc).F(var8);
         if (this.nrm) {
            hyn.cyJ().cHw().a(hyc.lmJ, false);
         }
      } else if (var2.equalsIgnoreCase(lzc.tPV.bD().exA())) {
         jju.b(this.nrc, false);
         jkr var7 = (jkr)jju.e(this.nrc).get(jks.ntj);
         if (var7 != null) {
            var7.setVisible(false);
         }

         jju.f(this.nrc);
      } else if (var2.equalsIgnoreCase(lzc.tPU.bD().exA())) {
         jju.b(this.nrc, true);
         jkr var9 = (jkr)jju.e(this.nrc).get(jks.ntj);
         if (var9 != null) {
            var9.setVisible(true);
         }

         jju.f(this.nrc);
      } else if (var2.equalsIgnoreCase(lzc.tPW.bD().exA())) {
         this.nrc.ue(true);
      } else if (var2.equalsIgnoreCase(lzc.tPX.bD().exA())) {
         this.nrc.ue(false);
      }

      jju.dKL().czi();
   }

   @Override
   public void cDU() {
   }
}
