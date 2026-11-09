class cga$b {
   cga$a ewI;
   boolean ewJ;
   ljq ewg;
   String YL;
   int ewK;
   ldv diQ;
   ldv ewL;
   int ewM;
   bsa ewN;
   double oV;
   boolean ewO;
   double ewP;
   long aEW;

   cga$b(cga var1) {
      this.ewQ = var1;
      this.ewI = cga$a.ewz;
      this.ewJ = false;
      this.ewg = null;
      this.YL = null;
      this.ewK = -1;
      this.diQ = null;
      this.ewL = null;
      this.ewM = -1;
      this.ewN = null;
      this.oV = -1.0;
      this.ewO = false;
      this.ewP = -1.0;
      this.aEW = -1L;
   }

   public void fY(boolean var1) {
      switch (this.ewI) {
         case ewF:
            if (cga.a(this.ewQ)) {
               if (!this.ewJ) {
                  this.j(1, 3, var1 ? cga.b(this.ewQ).enw() : cga.c(this.ewQ).diQ.enw());
               }

               this.Li();
               return;
            }

            this.pS(cga$a.ewz.ordinal());
            if (var1) {
               this.aNW();
            } else {
               this.aNX();
               this.aNW();
            }
            break;
         case ewB:
         case ewA:
         case ewC:
         case ewD:
         case ewE:
            this.pS(cga$a.ewz.ordinal());
         default:
            this.aNW();
      }

      this.Li();
   }

   private void aNW() {
      if (this.ewN != null && this.ewN.awJ() != null) {
         bqk var1 = cga.d(this.ewQ);
         if (var1 != null) {
            bqu var2 = var1.auo();
            if (var2 != null) {
               int var3 = 0;

               for (int var4 = this.ewN.avX().length; var3 < var4; var3++) {
                  ldv var5 = this.ewN.avX()[var3].GUID;
                  lef var6 = this.ewN.awJ()[var3];
                  if (!var2.a(var5, var6)) {
                     lfn.b(5, "DuelingData", "resetLocks() Failed to release itemlock " + var6 + " on item " + var5);
                  }
               }
            }
         }
      }
   }

   private void aNX() {
      if (this.ewN != null && this.ewN.awJ() != null) {
         ha var1 = cga.e(this.ewQ).mA();
         if (var1 != null) {
            bqk var2 = cga.d(this.ewQ);
            if (var2 != null) {
               bri var3 = (bri)var2;
               boolean var4 = var3.a(this.ewN, bqy.dIe);
               if (!var4) {
                  lfn.b(5, "DuelingData", "removeFee() Resource removal failed. Winner will not be awarded with anything to avoid any dupe possibility.");
                  assert false;
               } else {
                  fmz var5 = (fmz)cga.g(this.ewQ).h(7955, cga.f(this.ewQ), cga.c(this.ewQ).diQ);
                  var5.iQH = true;
                  var5.iJG = true;
                  var5.bqd = new int[]{this.ewN.az()};
                  var5.iIY = new int[]{this.ewN.vf()};
                  var5.b(bqy.dHa);
                  cga.h(this.ewQ).F(var5);
               }
            }
         }
      }
   }

   private void Li() {
      this.ewI = cga$a.ewz;
      this.ewJ = false;
      this.ewg = null;
      this.YL = null;
      this.ewK = -1;
      this.diQ = null;
      this.ewL = null;
      this.ewM = -1;
      this.ewN = null;
      this.oV = -1.0;
      this.ewO = false;
      this.ewP = -1.0;
   }

   public void a(cga$a var1) {
      this.ewI = var1;
      switch (var1) {
         case ewF:
            this.pS(var1.ordinal());
            this.aEW = cga.i(this.ewQ).bzy().getTimeInMillis();
            if (!this.ewJ) {
               this.j(0, -1, 0);
            }
            break;
         case ewE:
            if (!this.ewJ) {
               loz var2 = mbs.umm.bD(5.0);
               cga.e(this.ewQ).c(var2);
               ldv var3 = new ldv(cga.c(this.ewQ).ewK, lcr.acL.enw(), lcr.acL.enx());
               this.d(var2, var3);
            }

            this.pS(var1.ordinal());
      }
   }

   public cga$a aNY() {
      return this.ewI;
   }

   private void d(loz var1, ldv var2) {
      fgs var3 = (fgs)cga.k(this.ewQ).h(29446, cga.j(this.ewQ), var2);
      var3.r(var1);
      cga.l(this.ewQ).F(var3);
   }

   @Override
   public String toString() {
      return "State                 : "
         + this.ewI
         + "\n IsChallenger        : "
         + this.ewJ
         + "\n DuelCenter          : "
         + this.ewg
         + "\n PlayerName          : "
         + this.YL
         + "\n PlayerPSOGUID       : "
         + this.diQ
         + "\n PlayerCharacterGUID : "
         + this.ewL
         + "\n PlayerClientNodeID  : "
         + this.ewK
         + "\n PlayerProwessPoints : "
         + this.ewM
         + "\n DuelFee             : "
         + this.ewN
         + "\n StartTime           : "
         + this.oV
         + "\n IsOutOfRange        : "
         + this.ewO
         + "\n OutOfRangeTimeStamp : "
         + this.ewP;
   }

   private void j(int var1, int var2, int var3) {
      gnl var4 = (gnl)cga.m(this.ewQ).h(3604, this.ewQ.getGUID(), lcr.qEl);
      var4.pQ(cga.c(this.ewQ).ewN != null ? cga.c(this.ewQ).ewN.vf() : 0);
      var4.Kp(var1);
      var4.Kr(var3);
      var4.EW(var2);
      var4.cS(cga.c(this.ewQ).diQ.enw());
      var4.Kq(cga.b(this.ewQ).enw());
      var4.ah(this.aEW);
      cga.n(this.ewQ).E(var4);
   }

   private void pS(int var1) {
      ezy var2 = (ezy)cga.p(this.ewQ).h(33289, this.ewQ.getGUID(), cga.o(this.ewQ));
      var2.setState(var1);
      var2.cG(this.ewg);
      cga.q(this.ewQ).F(var2);
   }
}
