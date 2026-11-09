class jad$a extends jac$c {
   private String YL;
   private ist mFP;
   private int mFQ;
   private ist mFR;

   public jad$a(jad var1, int var2) {
      super(var1, var2);
      this.mFS = var1;
      this.YL = null;
      this.mFP = null;
      this.mFQ = -1;
      this.mFR = null;
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
      var1.W(ipx.a(260, 14, ipx.d(this.mFP)));
      var1.W(this.dsZ());
      this.mFR = new ist(jac.mEO, 14, 11250603, "-");
      var1.W(ipx.a(110, 14, ipx.d(this.mFR)));
      this.W(ipx.c(4, 4, 4, 4, var1));
   }

   public void O(String var1, int var2) {
      if (this.YL == null && var1 != null || this.YL != null && var1 == null || this.YL != null && var1 != null && !this.YL.equals(var1)) {
         this.YL = var1;
         this.mFP.setText(this.YL == null ? "-" : this.YL);
      }

      if (this.mFQ != var2) {
         this.mFQ = var2;
         this.mFR.setText(this.mFQ < 0 ? "-" : String.format("%d", this.mFQ));
      }
   }
}
