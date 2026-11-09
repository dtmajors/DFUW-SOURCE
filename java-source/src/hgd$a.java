class hgd$a implements lbn {
   private hbk jDO;
   private final ldp kmB;
   private final boolean mq;
   private final hpe kmC;
   private hqz kmD;

   hgd$a(hgd var1, ldp var2, boolean var3, hpe var4) {
      this.kmy = var1;
      this.kmB = var2;
      this.mq = var3;
      this.kmC = var4;
   }

   public void a(hbk var1) {
      this.jDO = var1;
   }

   @Override
   public final void W() {
      if (this.jDO == null) {
         lfn.b(5, this.getClass().getSimpleName(), "observeEvent() : Selector is null!");
         assert false;
      } else {
         int var1 = this.jDO.caV();
         int var2 = var1;
         int var3 = this.kmB.reW.length;
         if (this.mq) {
            var1++;
         } else {
            var1--;
         }

         if (var1 < 0) {
            var1 = var3 - 1;
         } else if (var1 >= var3) {
            var1 = 0;
         }

         this.cq(var1, var2);
      }
   }

   private void ciL() {
      String var1 = this.kmB.reW[this.jDO.caV()];
      if (var1.length() == 0) {
         if (this.kmC != null) {
            float var2 = 0.0F;
            if (this.jDO.caV() != this.kmy.a(this.kmB)) {
               var2 = 150.0F;
            }

            this.kmD.og(var2 == 0.0F);
            this.kmC.mV(new ljd(var2).esy());
         }
      } else {
         int var5 = lea.enW().getType(var1);
         if (this.kmC != null && var5 > 0) {
            float var3 = 150.0F;
            lgw var4 = (lgw)lea.enW().acv(var5);
            if (var4 != null) {
               var3 = hgd.a(this.kmy, var4);
            } else {
               var3 = 0.0F;
            }

            if (this.jDO.caV() == this.kmy.a(this.kmB)) {
               var3 = 0.0F;
            }

            this.kmC.mV(new ljd(var3).esy());
            this.kmD.og(var3 == 0.0F);
         }
      }
   }

   private void cq(int var1, int var2) {
      this.jDO.LC(var1);
      this.kmB.ksh = var1;
      this.jDO.lW(hgd.a(this.kmy, this.jDO.caV(), this.jDO.caW()));
      String var3 = this.kmB.reW[var1];
      if (var3.length() == 0) {
         int var4 = lea.enW().getType(this.kmB.reW[var2]);
         this.kmy.a(2, var4, null);
         if (this.kmC != null) {
            float var5 = 0.0F;
            if (var1 != this.kmy.a(this.kmB)) {
               var5 = 150.0F;
            }

            this.kmD.og(var5 == 0.0F);
            this.kmC.mV(new ljd(var5).esy());
         }
      } else {
         int var7 = lea.enW().getType(var3);
         this.kmy.a(1, var7, null);
         if (this.kmC != null && var7 > 0) {
            float var8 = 150.0F;
            lgw var6 = (lgw)lea.enW().acv(var7);
            if (var6 != null) {
               var8 = hgd.a(this.kmy, var6);
            } else {
               var8 = 0.0F;
            }

            if (var1 == this.kmy.a(this.kmB)) {
               var8 = 0.0F;
            }

            this.kmD.og(var8 == 0.0F);
            this.kmC.mV(new ljd(var8).esy());
         }
      }

      hgd.b(this.kmy);
   }

   public final void ciM() {
      int var1 = this.jDO.caV();
      int var2 = this.kmy.a(this.kmB);
      if (var1 != var2) {
         this.cq(var2, var1);
      }
   }
}
