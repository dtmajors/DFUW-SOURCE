import java.util.Set;

public class igx extends ipz implements iua {
   private ign liv;
   private boolean lMW;
   private boolean lUs = false;
   private ipf lMX;
   private ipx lUt;
   private ipx lUu;
   private igw lUv;
   private ipf lUw;
   private ist lTZ;
   private irr lBr;
   private ist lUx;
   private ist lUe;
   private ist lUy;
   private ipx lvG;
   private ipb lNa;
   private ipb lUz;
   private ihk lUA;
   private ipx lUB;
   private ist lUC;
   private ipx lUD;
   private static lie lUE;
   private static Set<igx> lUF = lcn.emx();

   public igx(ign var1) {
      this.liv = var1;
      this.a(irl.dnr());
      this.W(this.cGT());
      this.lUt = ipx.k();
      this.W(this.lUt);
      this.lUw = ipx.l(new ipb("HorizontalFeatItemSeparatorBitmap"), ipx.c());
      this.lUw.setVisible(false);
      this.lUt.W(this.lUw);
      this.lUt.W(this.cVc());
      this.lUt.W(ipx.l(new ipb("HorizontalFeatItemSeparatorBitmap"), ipx.c()));
   }

   @Override
   public void cleanUp() {
      super.cleanUp();
      this.cVD();
   }

   public ign cUF() {
      return this.liv;
   }

   @Override
   public boolean getSelected() {
      return this.lMW;
   }

   @Override
   public void setSelected(boolean var1) {
      if (var1 != this.lMW) {
         this.lMW = var1;
         iul.b(this, var1);
         if (this.lUu == null) {
            this.lUt.c(this.cVv(), 0);
            this.lUt.c(this.cVu(), 1);
            this.lUt.c(this.cVt(), 2);
         }

         this.lUu.setVisible(this.lMW);
         this.lUv.setVisible(this.lMW);
         this.lUB.setVisible(this.lMW);
         if (!var1) {
            this.lUv.cUI();
         }

         if (this.lMX != null) {
            this.lMX.pack();
         }

         if (var1) {
            this.cVC();
         } else {
            this.cVD();
         }

         this.cVa();
      }
   }

   public boolean cUY() {
      return this.lUw.djL();
   }

   void qh(boolean var1) {
      this.lUw.setVisible(var1);
   }

   @Override
   public void kh(float var1) {
      if (this.lMX != null) {
         this.lMX.kh(var1);
      }

      if (this.lBr != null) {
         this.lBr.kh(var1);
      }

      if (this.lUv != null) {
         this.lUv.kh(var1);
      }
   }

   public void cUZ() {
      ihk var10000;
      boolean var10001;
      label25: {
         var10000 = this.lUA;
         label19:
         if (!this.liv.cTZ()) {
            if (this.dkb()) {
               this.djE();
               if (ioa.cyJ().cIM().dGE() && !this.liv.isLocked() && !this.liv.isCompleted()) {
                  break label19;
               }
            }

            var10001 = false;
            break label25;
         }

         var10001 = true;
      }

      var10000.setVisible(var10001);
      this.lUA.hX(this.liv.cTZ());
   }

   @Override
   public void cND() {
      super.cND();
      if (this.lMX != null) {
         this.lMX.setVisible(this.dkb());
      }

      this.cUZ();
   }

   public void cVa() {
   }

   public void cSv() {
      this.cVj();
      this.cVl();
      this.cVq();
      this.cVp();
      this.cUD();
      this.cVe();
      this.cVA();
   }

   public void m(ign var1) {
      if (this.lUv != null) {
         this.lUv.m(var1);
      }
   }

   public void cVb() {
      if (this.lUe != null) {
         this.cUD();
      }
   }

   public void n(ign var1) {
   }

   private ipf cGT() {
      this.lMX = new ihi();
      this.lMX.setVisible(false);
      return this.lMX;
   }

   private ipf cVc() {
      igx$1 var1 = new igx$1(this, iqo.dmT());
      var1.W(ipx.a(1, 2));
      var1.W(this.cVd());
      var1.W(ipx.a(1, 2));
      return var1;
   }

   private ipf cVd() {
      ipx var1 = ipx.l();
      var1.W(ipx.a(4, 1));
      var1.W(ipx.a(42, 42, this.cGW()));
      var1.W(ipx.a(4, 1));
      var1.W(ipx.d(ipx.a(1, 36, new ihh())));
      var1.W(ipx.a(8, 1));
      var1.W(ipx.d(this.cVg()));
      var1.W(ipx.d(ipx.a(1, 36, new ihh())));
      var1.W(ipx.a(4, 1));
      var1.W(this.cVr());
      return var1;
   }

   private ipf cGW() {
      ipx var1 = ipx.d();
      this.lvG = var1;
      this.lNa = new ipb("/dfdata/" + this.liv.cTI().cTo());
      var1.W(this.lNa);
      this.cVe();
      this.lvG.W(ipx.d(this.cVf()));
      return var1;
   }

   private void cVe() {
      if (this.liv.isLocked()) {
         this.lNa.hz(0.35F);
         if (this.lUz != null) {
            this.lUz.qP("IconFeatLockedBitmap");
         } else {
            this.lUz = new ipb("IconFeatLockedBitmap");
            this.lvG.W(this.lUz);
         }
      } else if (this.liv.isCompleted()) {
         String var1 = !this.liv.cTT() ? "IconFeatCompletedBitmap" : "icon_status_completed_repeatable";
         this.lNa.hz(0.35F);
         if (this.lUz != null) {
            this.lUz.qP(var1);
         } else {
            this.lUz = new ipb(var1);
            this.lvG.W(this.lUz);
         }
      } else {
         this.lNa.hz(1.0F);
         if (this.lUz != null) {
            this.lUz.removeFromParent();
            this.lUz = null;
         }
      }
   }

   private ipf cVf() {
      this.lUA = new igx$2(this);
      this.lUA.setVisible(false);
      return this.lUA;
   }

   private ipf cVg() {
      ipx var1 = ipx.j();
      var1.W(this.cVh());
      var1.W(ipx.a(1, 6));
      var1.W(this.cVk());
      return var1;
   }

   private ipf cVh() {
      return ipx.d(this.cVi());
   }

   private ipf cVi() {
      ist var1 = new ist();
      this.lTZ = var1;
      var1.o(this.liv.cTE());
      var1.a(isf.mwN, 14);
      var1.a(isu.mxP);
      var1.sv(false);
      var1.setSize(370, 14);
      this.cVj();
      return var1;
   }

   private void cVj() {
      if (this.liv.isLocked()) {
         this.lTZ.Rk(5197647);
      } else {
         this.lTZ.Rk(12357465);
      }
   }

   private ipf cVk() {
      ipx var1 = ipx.l();
      var1.W(this.cUv());
      var1.W(this.cVm());
      return var1;
   }

   private ipf cUv() {
      irs var1 = new irs();
      var1.qu("SecondaryProgressBarBackgroundBitmap");
      var1.ra("SecondaryProgressBarBitmap_" + this.liv.cTI().cTm());
      var1.sk(true);
      this.lBr = new irr(var1);
      this.cVl();
      return this.lBr;
   }

   private void cVl() {
      if (this.lBr != null) {
         this.lBr.setProgress(this.liv.cTu(), 0, this.liv.cTt());
      }
   }

   private ipf cVm() {
      ipx var1 = ipx.a(80, 20);
      ipx var2 = ipx.l();
      var1.W(ipx.d(var2));
      var2.W(this.cVn());
      var2.W(this.cVo());
      return var1;
   }

   private ipf cVn() {
      this.lUx = new ist();
      this.lUx.a(isf.mwN, 14);
      this.lUx.Rk(11250603);
      this.lUx.a(isu.mxQ);
      this.lUx.sv(false);
      this.lUx.setSize(40, 20);
      this.cVq();
      return this.lUx;
   }

   private ipf cVo() {
      ist var1 = new ist();
      this.lUy = var1;
      var1.a(isf.mwN, 14);
      var1.a(isu.mxP);
      var1.sv(false);
      var1.setSize(40, 20);
      var1.setText("/" + this.liv.cTt());
      this.cVp();
      return var1;
   }

   private void cVp() {
      if (this.lUy != null) {
         if (this.liv.isLocked()) {
            this.lUy.Rk(5197647);
         } else {
            this.lUy.Rk(12357465);
         }
      }
   }

   private void cVq() {
      if (this.lUx != null) {
         this.lUx.setText("" + this.liv.cTu());
         if (this.liv.isLocked()) {
            this.lUx.Rk(5197647);
         } else if (this.liv.isCompleted()) {
            this.lUx.Rk(12357465);
         } else {
            this.lUx.Rk(11250603);
         }
      }
   }

   private ipf cVr() {
      int var1 = this.liv.cTF();
      boolean var2 = this.liv.cTP();
      ipx var3 = ipx.a(100, 32);
      ipx var4 = ipx.l();
      var3.W(ipx.d(var4));
      if (var1 > 0) {
         var4.W(ipx.d(this.cVs()));
         var4.W(ipx.d(new ipb("IconProwessBitmap")));
      }

      if (var2) {
         var4.W(ipx.d(new igx$3(this, "button_tag_material_off_normal", "button_tag_material_off_hover")));
      }

      return var3;
   }

   private ipf cVs() {
      ist var1 = new ist();
      this.lUe = var1;
      var1.a(isf.mwO, 16);
      var1.a(isu.mxQ);
      var1.sv(false);
      var1.setSize(40, 20);
      this.cUD();
      return var1;
   }

   private void cUD() {
      this.lUe.Rk(this.liv.isLocked() ? 5197647 : 12357465);
      this.lUe.setText(this.liv.cTH());
   }

   private ipf cVt() {
      this.lUu = ipx.l();
      this.lUu.W(ipx.a(17, 1));
      this.lUu.W(ipx.b(16, 2, new ipb("IconArrowBitmap")));
      this.lUu.W(ipx.c());
      this.lUu.setVisible(false);
      return this.lUu;
   }

   private ipf cVu() {
      this.lUv = new igx$4(this, this.liv);
      this.lUv.setVisible(false);
      return this.lUv;
   }

   private ipf cVv() {
      this.lUB = ipx.j();
      this.lUB.setVisible(false);
      this.lUB.W(ipx.a(1, 4));
      ipx var1 = ipx.l();
      this.lUB.W(var1);
      var1.W(ipx.c());
      if (this.liv.cTT()) {
         var1.W(ipx.d(this.cVw()));
         var1.W(ipx.a(4, 1));
         var1.W(ipx.d(this.cVx()));
         var1.W(ipx.a(8, 1));
         var1.W(new ihh());
         var1.W(ipx.a(8, 1));
      }

      var1.W(ipx.d(this.cVy()));
      var1.W(ipx.d(this.cVz()));
      var1.W(ipx.a(8, 1));
      this.lUB.W(ipx.a(1, 4));
      return this.lUB;
   }

   private ipf cVw() {
      ist var1 = new ist();
      var1.a(isf.mwN, 14);
      var1.Rk(12357465);
      var1.o(lww.tiV.bD());
      return var1;
   }

   private ipf cVx() {
      this.lUC = new ist();
      ist var1 = new ist();
      var1.a(isf.mwN, 14);
      var1.Rk(11250603);
      this.cVB();
      return this.lUC;
   }

   private ipf cVy() {
      ist var1 = new ist();
      var1.a(isf.mwN, 14);
      var1.Rk(12357465);
      var1.o(lww.tiW.bD());
      return var1;
   }

   private ipf cVz() {
      this.lUD = ipx.l();
      this.cVA();
      return this.lUD;
   }

   private void cVA() {
      if (this.lUD != null) {
         this.lUD.removeAllChildren();

         for (igp var3 : this.liv.cTQ()) {
            this.lUD.W(new ihb(var3));
         }
      }
   }

   private void cVB() {
      ioa var1 = this.djE();
      if (var1 != null) {
         double var2 = Math.max(this.liv.cTV() - var1.getMessageDelegator().arc().rgz, 0.0);
         this.lUC.setText(lww.tjB.bD(var2).exA());
      }
   }

   private void cVC() {
      if (this.liv.cTT() && !this.lUs) {
         lUF.add(this);
         if (lUE == null) {
            lUE = new igx$5(this, 1.0, true);
            lUE.e(this.djE().getMessageDelegator());
         }

         this.lUs = true;
      }
   }

   private void cVD() {
      if (this.liv.cTT() && this.lUs) {
         lUF.remove(this);
         if (lUF.isEmpty()) {
            lUE.stop();
            lUE = null;
         }

         this.lUs = false;
      }
   }
}
