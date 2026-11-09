class jag$a extends jac$c {
   private String YL;
   private ist mFP;
   private dwl mGA;
   private ist mGB;
   private float ezc;
   private ist mGg;

   public jag$a(jag var1, int var2) {
      super(var1, var2);
      this.mGC = var1;
      this.YL = null;
      this.mFP = null;
      this.mGA = null;
      this.mGB = null;
      this.ezc = -1.0F;
      this.mGg = null;
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
      var1.W(ipx.a(190, 14, ipx.d(this.mFP)));
      var1.W(this.dsZ());
      this.mGB = new ist(jac.mEO, 14, 11250603, "-");
      var1.W(ipx.a(100, 14, ipx.d(this.mGB)));
      var1.W(this.dsZ());
      this.mGg = new ist(jac.mEO, 14, 11250603, "-");
      var1.W(ipx.a(80, 14, ipx.d(this.mGg)));
      this.W(ipx.c(4, 4, 4, 4, var1));
   }

   public void a(String var1, dwl var2, float var3) {
      if (this.YL == null && var1 != null || this.YL != null && var1 == null || this.YL != null && var1 != null && !this.YL.equals(var1)) {
         this.YL = var1;
         this.mFP.setText(this.YL == null ? "-" : this.YL);
      }

      if (this.mGA == null && var2 != null || this.mGA != null && var2 == null || this.mGA != null && var2 != null && this.mGA != var2) {
         this.mGA = var2;
         if (this.mGA == null) {
            this.mGB.setText("-");
         } else {
            this.mGB.o(this.mGA.bCQ());
         }
      }

      if (this.ezc != var3) {
         this.ezc = var3;
         this.mGg.setText(this.ezc < 0.0F ? "-" : String.format("%.2f", this.ezc));
      }
   }
}
