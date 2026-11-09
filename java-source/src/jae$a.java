public class jae$a extends jac$c {
   private String YL;
   private ist mFP;
   private int ezo;
   private ist mGg;
   private int mGh;
   private ist mGi;
   private int mGj;
   private ist mGk;

   public jae$a(jae var1, int var2) {
      super(var1, var2);
      this.mGl = var1;
      this.YL = null;
      this.mFP = null;
      this.ezo = -1;
      this.mGg = null;
      this.mGh = 0;
      this.mGi = null;
      this.mGj = 0;
      this.mGk = null;
      this.dum();
   }

   @Override
   protected void dum() {
      super.dut();
      ipx var1 = ipx.l();
      ist var2 = new ist(jac.mEO, 14, 12357465, Integer.toString(this.adk + 1));
      var1.W(ipx.a(30, 14, ipx.d(var2)));
      var1.W(this.dsZ());
      this.mFP = new ist(jac.mEO, 14, 11250603, "-");
      var1.W(ipx.a(180, 14, ipx.d(this.mFP)));
      var1.W(this.dsZ());
      this.mGg = new ist(jac.mEO, 14, 11250603, "-");
      var1.W(ipx.a(70, 14, ipx.d(this.mGg)));
      var1.W(this.dsZ());
      this.mGi = new ist(jac.mEO, 14, 11250603, "-");
      var1.W(ipx.a(70, 14, ipx.d(this.mGi)));
      var1.W(this.dsZ());
      this.mGk = new ist(jac.mEO, 14, 11250603, "-");
      var1.W(ipx.a(50, 14, ipx.d(this.mGk)));
      this.W(ipx.c(4, 4, 4, 4, var1));
   }

   public void c(String var1, int var2, int var3, int var4) {
      if (this.YL == null && var1 != null || this.YL != null && var1 == null || this.YL != null && var1 != null && !this.YL.equals(var1)) {
         this.YL = var1;
         this.mFP.setText(this.YL == null ? "-" : this.YL);
      }

      if (this.ezo != var2) {
         this.ezo = var2;
         this.mGg.setText(this.ezo < 0 ? "-" : String.format("%d", this.ezo));
      }

      if (this.mGh != var3) {
         this.mGh = var3;
         this.mGi.setText(this.mGh < 0 ? "-" : String.format("%d", this.mGh));
      }

      if (this.mGj != var4) {
         this.mGj = var4;
         this.mGk.setText(this.mGj == 0 ? "=" : (this.mGj == Integer.MAX_VALUE ? "*" : (this.mGj == Integer.MIN_VALUE ? "-" : String.format("%d", this.mGj))));
      }
   }
}
