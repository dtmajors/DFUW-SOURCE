class atz$a {
   public boolean active;
   public boolean visible;
   public auk bZF;
   public jnc bZG;
   public boolean bZH;
   public ldv bZI;
   public ldv bZJ;
   public ldv bZK;
   public ldv bZL;
   public double bZM;

   public atz$a(atz var1, ldv var2) {
      this.bZN = var1;
      this.active = false;
      this.visible = false;
      this.bZF = null;
      this.bZG = null;
      this.bZH = false;
      this.bZJ = null;
      this.bZK = null;
      this.bZL = null;
      this.bZM = 0.0;
      this.bZL = var2;
   }

   public void create() {
      kkp var1 = (kkp)atz.a(this.bZN).h(1034);
      var1.ts(atz.b(this.bZN));
      var1.hC(this.bZL);
      var1.setType(1);
      var1.wD(true);
      var1.GUID = this.bZL;
      atz.c(this.bZN).a(var1);
   }

   public void activate() {
      this.active = true;
      this.VO();
      this.VP();
   }

   public void VN() {
      this.VP();
   }

   private void VO() {
      kni var1 = (kni)atz.d(this.bZN).h(782);
      var1.biE = new ljq(0.0F, 1.8F, 0.0F);
      var1.biF = new lgl();
      var1.ehv = this.bZL;
      var1.ehw = this.bZI;
      var1.ec = this.bZN.getGUID();
      var1.dsK = true;
      var1.iBr = true;
      var1.biD = false;
      var1.doP = ldv.rfe;
      var1.pPN = 16;
      var1.GUID = this.bZL;
      atz.e(this.bZN).a(var1);
   }

   private void VP() {
      if (!this.bZH) {
         String var1 = this.bZF == null ? this.bZG.dNa() : this.bZF.aFo;
         String var2 = "ChatBubble;" + var1;
         kga var3 = (kga)atz.f(this.bZN).BV(19);
         var3.ts(atz.g(this.bZN));
         var3.setType(1);
         var3.wH(var2);
         var3.tr(this.bZL);
         atz.h(this.bZN).b(var3);
         this.bZH = true;
      }
   }

   public void a(kgu var1) {
      this.VQ();
      this.bZJ = var1.dZa();
      kkp var2 = (kkp)atz.i(this.bZN).h(1034);
      var2.ts(atz.j(this.bZN));
      var2.hC(this.bZI);
      var2.setType(4);
      var2.tq(this.bZJ);
      var2.wD(false);
      var2.GUID = this.bZL;
      atz.k(this.bZN).a(var2);
      this.visible = true;
   }

   private void VQ() {
      if (this.bZJ != null) {
         atz.a(this.bZN, this.bZJ);
         this.bZJ = null;
      }
   }

   private void VR() {
      if (this.bZK != null) {
         atz.b(this.bZN, this.bZK);
         this.bZK = null;
      }
   }

   private void VS() {
      if (this.bZI != null) {
         this.bZN.do(this.bZI);
         this.bZI = null;
      }
   }

   public void cleanup() {
      this.VQ();
      this.VR();
      this.VS();
   }
}
