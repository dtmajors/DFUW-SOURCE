class hyu$a extends ipx {
   final hyu$b lpT;
   final int ixP;
   String lpU;
   ist lpV;
   ist lpW;
   private irr ljc;
   ipx lpX;

   public hyu$a(hyu var1, hyu$b var2, int var3) {
      this.lpY = var1;
      this.lpT = var2;
      this.ixP = var3;
      ipb var4 = new ipb(this.ixP == 0 ? "DuelBarBackgroundLeft" : "DuelBarBackgroundRight");
      var4.setHeight(38);
      ipx var5 = new ipx();
      var5.a(this.ixP == 0 ? iqo.dmS() : iqo.dmU());
      this.lpU = this.lpT.lpU;
      this.lpX = ipx.a(45, 35);
      this.lpX.W(new ipb(this.lpU));
      var5.W(this.lpX);
      var5.W(ipx.a(5, 38));
      this.lpV = new ist(this.lpT.YL);
      this.lpV.Rk(11250603);
      this.lpV.a(isf.mwO, 15);
      this.lpV.a(this.ixP == 0 ? isu.mxQ : isu.mxP);
      this.lpW = new ist(String.valueOf((int)this.lpT.aGr));
      this.lpW.Rk(11250603);
      this.lpW.sv(false);
      this.lpW.a(this.ixP == 0 ? isu.mxQ : isu.mxP);
      this.lpW.setSize(50, 20);
      this.lpW.a(isf.mwO, 18);
      this.lpW.a(this.ixP == 0 ? isu.mxQ : isu.mxP);
      ist var6 = new ist("HP");
      var6.Rk(11250603);
      var6.a(isf.mwO, 18);
      ipk var7 = new ipk();
      var7.setWidth(5);
      ipx var8 = ipx.a(308, 20);
      var8.a(this.ixP == 0 ? iqo.dmS() : iqo.dmU());
      var8.W(this.lpV);
      var8.W(ipx.c());
      var8.W(this.lpW);
      var8.W(var6);
      var8.setHeight(22);
      irs var9 = new irs();
      var9.qu("ProgressBarBackground");
      var9.ra("ProgressBarForeground");
      var9.Sn(1);
      var9.se(false);
      var9.sg(false);
      var9.sf(false);
      var9.ds(2.0);
      var9.So(3);
      var9.Sr(29);
      var9.Sp(1776411);
      var9.rc("ProgressBarSeparatorGlow");
      this.ljc = new irr(var9);
      this.ljc.setProgress(this.lpT.aGr, 0.0F, this.lpT.bWk);
      ipx var10 = ipx.a(308, 22, this.ljc);
      ipx var11 = ipx.j(var8, var10);
      var5.W(var11);
      ipx var12 = this.ixP == 0 ? ipx.l() : ipx.m();
      var12.W(ipx.a(3, 30));
      var12.W(ipx.d(ipx.a(3, 38, new ipk(this.ixP == 0 ? 12219922 : 1214396))));
      var12.W(ipx.c());
      var5.W(var12);
      var5.W(ipx.c());
      ipx var13 = ipx.h(var4, var5);
      this.a(iqo.dmT());
      this.W(var13);
      this.W(ipx.a(var13.getWidth(), 5));
   }

   public void cGm() {
      if (this.lpX != null && this.lpU != this.lpT.lpU) {
         this.lpX.removeAllChildren();
         if (this.lpT.lpU != null) {
            this.lpX.W(new ipb(this.lpT.lpU));
         }

         this.lpU = this.lpT.lpU;
      }

      if (this.lpV != null) {
         this.lpV.setText(this.lpT.YL);
      }

      if (this.lpW != null) {
         this.lpW.setText(String.valueOf((int)this.lpT.aGr));
      }

      if (this.ljc != null) {
         this.ljc.setProgress(this.lpT.aGr, 0.0F, this.lpT.bWk);
      }
   }
}
