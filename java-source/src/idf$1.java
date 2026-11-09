import java.util.List;
import kh.a;

class idf$1 implements hyk {
   idf$1(idf var1, List var2) {
      this.lJQ = var1;
      this.lra = var2;
   }

   @Override
   public String[] cDR() {
      return this.lra.toArray(new String[this.lra.size()]);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void a(int var1, String var2, int var3, int var4, int var5, int var6) {
      jmy var7 = jmy.getValueByName(var2);
      String var8 = null;
      switch (var7) {
         case nCw:
         case nCx:
            idf.a(this.lJQ);
            this.lJQ.cqF();
            this.lJQ.cFc();
            break;
         case nCA:
         case nCB:
            var8 = idf.b(this.lJQ).cOn();
            if (var8 != null && !var8.isEmpty()) {
               String[] var22 = var8.split(" ");
               if (var22 != null && var22.length == 2) {
                  idf.b(this.lJQ).M(var22[0], var22[1]);
               }
            }
            break;
         case nCI:
            var8 = idf.b(this.lJQ).cOn();
            if (var8 != null && !var8.isEmpty()) {
               idf.a(this.lJQ, var8, 1);
            }
            break;
         case nCJ:
            var8 = idf.b(this.lJQ).cOn();
            if (var8 != null && !var8.isEmpty()) {
               idf.a(this.lJQ, var8, 2);
            }
            break;
         case nCR:
            if (idf.cOH().cyZ().a(jmy.nCR)) {
               hso.cxK().a(jmq.nzc);
               var8 = idf.b(this.lJQ).cOn();
               if (var8 != null && !var8.isEmpty()) {
                  String[] var21 = var8.split(" ");
                  if (var21 != null && var21.length == 2 && hso.cxK().cxP().cyJ() != null && hso.cxK().cxP().cyJ().cHv() != null) {
                     hso.cxK().cxP().cyJ().cHv().pR(a.aop.name() + " " + var21[0] + " " + var21[1]);
                  }
               }
            }
            break;
         case nCS:
            if (idf.cOI().cyZ().a(jmy.nCS)) {
               hso.cxK().a(jmq.nzc);
               var8 = idf.b(this.lJQ).cOn();
               if (var8 != null && !var8.isEmpty()) {
                  String[] var20 = var8.split(" ");
                  if (var20 != null && var20.length == 2 && hso.cxK().cxP().cyJ() != null && hso.cxK().cxP().cyJ().cHv() != null) {
                     hso.cxK().cxP().cyJ().cHv().pR(a.aoq.name() + " " + var20[0] + " " + var20[1]);
                  }
               }
            }
            break;
         case nCT:
            if (idf.cOJ().cyZ().a(jmy.nCT)) {
               hso.cxK().a(jmq.nzc);
               var8 = idf.b(this.lJQ).cOn();
               if (var8 != null && !var8.isEmpty()) {
                  String[] var19 = var8.split(" ");
                  if (var19 != null && var19.length == 2 && hso.cxK().cxP().cyJ() != null && hso.cxK().cxP().cyJ().cHv() != null) {
                     hso.cxK().cxP().cyJ().cHv().pR(a.aoA.name() + " " + var19[0] + " " + var19[1]);
                  }
               }
            }
            break;
         case nCU:
            if (idf.cOK().cyZ().a(jmy.nCU)) {
               hso.cxK().a(jmq.nzc);
               var8 = idf.b(this.lJQ).cOn();
               if (var8 != null && !var8.isEmpty()) {
                  String[] var18 = var8.split(" ");
                  if (var18 != null && var18.length == 2 && hso.cxK().cxP().cyJ() != null && hso.cxK().cxP().cyJ().cHv() != null) {
                     hso.cxK().cxP().cyJ().cHv().pR(kt.a.arB.name() + " " + var18[0] + " " + var18[1]);
                  }
               }
            }
            break;
         case nCV:
            if (idf.cOL().cyZ().a(jmy.nCV)) {
               hso.cxK().a(jmq.nzc);
               var8 = idf.b(this.lJQ).cOn();
               if (var8 != null && !var8.isEmpty()) {
                  String[] var9 = var8.split(" ");
                  if (var9 != null && var9.length == 2 && hso.cxK().cxP().cyJ() != null && hso.cxK().cxP().cyJ().cHv() != null) {
                     hso.cxK().cxP().cyJ().cHv().pR(kt.a.arC.name() + " " + var9[0] + " " + var9[1]);
                  }
               }
            }
      }

      idf.cOM().czi();
   }

   @Override
   public void cDU() {
   }
}
