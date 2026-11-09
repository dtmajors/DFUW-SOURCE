import java.util.LinkedList;

final class hok$a extends hmt {
   private final hpa kSw;
   private final hpe jBm;
   private hmc$a kSx;

   public hok$a(hok var1, hnc var2, String var3, hmc$a var4) {
      super(var2, var3, lgg.rlI, lhf.rnv);
      this.kSv = var1;
      this.kSx = var4;
      this.kSw = new hpa(var2, (String)null, lgg.rlI, lhf.rnv, var4.atw());
      this.j(this.kSw);
      this.jBm = new hpe(var2, (String)null, lgg.rlI, lhf.rnv, hok.a(var1).kSC, "");
      if (hok.a(var1).kSB) {
         this.j(this.jBm);
      }

      this.layout();
   }

   public void b(hmc$a var1) {
      this.kSx = var1;
   }

   private void layout() {
      lhu var1 = this.kSx.atw();
      String var2 = this.kSx.getName();
      this.jBm.mV(var2);
      int var3 = var1.kLY.rmN + hok.a(this.kSv).kSA.cf * 2;
      int var4 = this.kLu.a(hok.a(this.kSv).kSC.jFE, var2, true, var3, true);
      this.cC(var1.kLY.rmN + hok.a(this.kSv).kSA.cf * 2, var1.kLY.H + var4 + hok.a(this.kSv).kSA.cg * 2);
      this.kSw.z(hok.a(this.kSv).kSA);
      this.kSw.d(var1.kLY);
      this.jBm.cB(0, hok.a(this.kSv).kSA.cg + var1.kLY.H);
      this.jBm.cC(var3, var4);
   }

   @Override
   protected void ccc() {
      LinkedList var1 = new LinkedList();
      this.kSx.bb(var1);
      this.kLu.a(this.kSx.atw(), var1);
   }
}
