import java.util.ArrayList;

public class hfk extends hpw implements hbw, hma {
   private final ldl khR = new ldl();
   private final ldl khS = new ldl();
   private final hfk$b khT;
   private final int khU;
   private final hfl khV;
   private final hpa khW;
   private final hpa khX;
   private final lhz khY;
   private final hcl khZ;
   private boolean Initialized;
   private hfk$a kia;
   private int kib;
   private int kic;
   private boolean kid;
   private hov kie;
   private hpa kif;
   private boolean kig;
   private String jGu = "";
   private final hdm dXw;
   private hms kih = null;
   private int kii = -1;
   private hfj kij = null;
   private final lbn kfc = new hfk$1(this);
   private final lbp kik = new hfk$12(this);
   private final lbp kil = new hfk$23(this);
   private final lbp kim = new hfk$25(this);
   private final lbp kin = new hfk$26(this);
   private final lbp kio = new hfk$27(this);
   private final lbp kip = new hfk$28(this);
   private final lbp kiq = new hfk$29(this);
   private final lbp kir = new hfk$30(this);
   private final lbp kis = new hfk$2(this);
   private final lbp kit = new hfk$3(this);
   private final lbp kiu = new hfk$4(this);
   private final lbp kiv = new hfk$5(this);
   private final lbp kiw = new hfk$6(this);
   private final lbp kix = new hfk$7(this);
   private final lbp jHX = new hfk$8(this);
   private final lbp kiy = new hfk$9(this);
   private final lbp jHs = new hfk$10(this);
   private final lbp jHt = new hfk$11(this);
   private final lbp jHu = new hfk$13(this);
   private final lbp kiz = new hfk$14(this);
   private final lbp kiA = new hfk$15(this);
   private final lbp kiB = new hfk$16(this);
   private final lbp kiC = new hfk$17(this);
   private final lbp kiD = new hfk$18(this);
   private final lbp kiE = new hfk$19(this);
   private final lbn kiF = new hfk$20(this);
   private final hly jHr = new hfk$21(this);
   private final hmj kiG = new hfk$22(this);

   public hfk(hdm var1, String var2, lgg var3, hfk$b var4, int var5) {
      super(var1, var2, var3, a(var1, var4, ""), var4.khH);
      this.dXw = var1;
      this.khT = var4;
      this.khU = var5;
      this.khY = new lhz(this.kLu.kAz);
      this.khX = new hpa(this.kLu, (String)null, lgg.rlI, lhf.rnv, var4.kiM);
      this.j(this.khX);
      this.khW = new hpa(this.kLu, (String)null, lgg.rlI, lhf.rnv, var4.kiL);
      this.j(this.khW);
      this.khW.nR(true);
      this.khZ = new hcl(var1.jZD.jGq, "", var4.kiK.jFE, var4.kiK.dMT, true, 0L);
      this.khV = new hfl(var1, "Chat Entry", lgg.rlI, lhf.rnv, this.khZ, false);
      this.j(this.khV);
      this.chp();
   }

   public final void a(hfk$a var1) {
      assert var1 != null;
      assert !this.Initialized;
      assert this.kia == null;
      this.kia = var1;
   }

   public final hmj chj() {
      return this.kiG;
   }

   @Override
   protected void FF() {
      assert !this.Initialized;
      this.Initialized = true;
      super.FF();
      this.mU(true);
      this.chn();
   }

   @Override
   protected void FG() {
      assert this.Initialized;
      this.mU(false);
      super.FG();
      this.Initialized = false;
   }

   @Override
   protected lcu cfR() {
      assert this.Initialized;
      return this.kLu.kNx;
   }

   @Override
   protected void cbM() {
      assert this.Initialized;
      super.cbM();
      int var1 = this.khZ.i(this.cqu());
      this.kiG.L(var1, this.kLu.crI());
   }

   @Override
   protected boolean LM(int var1) {
      assert this.Initialized;
      this.cqt().Nj(var1);
      return false;
   }

   @Override
   protected void cbu() {
      assert this.Initialized;
      super.cbu();
      if (this.kLu.csc()) {
         int var1 = this.khZ.i(this.cqu());
         this.kiG.L(var1, true);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected int a(ldb var1, ldd var2, int var3) {
      assert this.Initialized;
      int var4 = 0;
      switch (var1) {
         case reo:
            var3 = this.khZ.i(new lgg(var3, 0));
            var4 = this.jGu.length();
            break;
         case rep:
            int var5 = this.khT.kiK.jFE.kNb * 2;
            var3 /= var5;
            var4 = this.getLineCount();
            break;
         default:
            assert false;
      }

      switch (var2) {
         case ret:
            if (++var3 > var4) {
               var3 = var4;
            }
            break;
         case rer:
            if (--var3 < 0) {
               var3 = 0;
            }
         case res:
            break;
         default:
            assert false;
      }

      switch (var1) {
         case reo:
            var3 = this.khZ.LL(var3).cf;
            break;
         case rep:
            if (var3 >= var4) {
               var3 = var4 - 1;
            }

            int var6 = this.khT.kiK.jFE.kNb * 2;
            var3 *= var6;
            break;
         default:
            assert false;
      }

      return var3;
   }

   @Override
   protected void ccf() {
      assert this.Initialized;
      super.ccf();
      boolean var1 = this.isFocusOwner();
      this.khW.nR(!var1);
      this.khY.setStarted(var1);
      this.khY.eqf().a(var1, this.kfc);
      this.kLu.a(var1, this.jHr);
   }

   protected String mL(String var1) {
      if (this.kia != null) {
         var1 = this.kia.mQ(var1);
      }

      return var1;
   }

   protected void chk() {
      if (this.kia != null) {
         this.kia.chF();
      }

      this.khS.enp();
   }

   protected void chl() {
      this.chn();
      this.cho();
      this.khR.enp();
      if (this.kia != null) {
         this.kia.chG();
      }
   }

   protected void chm() {
      if (!this.kig) {
         if (this.kie != null) {
            this.kie.remove();
            this.kie = null;
         }
      } else if (this.kie == null) {
         this.kie = new hov(this.kLu, (String)null, lgg.rlI, this.cqv());
         this.j(this.kie);
         this.kif = new hpa(this.kLu, (String)null, lgg.rlI, this.cqv(), this.khT.kiP);
         this.kie.j(this.kif);
         this.kif.H(this.khT.kiQ);
      }
   }

   private void chn() {
      lgs var3 = this.khZ.LL(this.kib);
      if (!this.kid) {
         var3 = new lgs(var3.cf + this.khT.kiO - 1, 0, this.khT.kiN, this.getHeight());
      } else {
         var3 = new lgs(var3.cf + this.khT.kiO - 1, 0, var3.rmN < this.khT.kiN ? this.khT.kiN : var3.rmN, this.getHeight());
      }

      this.khW.j(var3);
      this.l(var3);
   }

   private void cho() {
      int var1 = this.kib;
      int var2 = this.kic;
      if (var1 > var2) {
         int var3 = var1;
         var1 = var2;
         var2 = var3;
      }

      lgs var7 = this.khZ.LL(var1);
      lgs var4 = this.khZ.LL(var2);
      int var5 = var4.cf - var7.cf;
      if (var5 < this.khT.kiN) {
         var5 = this.khT.kiN;
      }

      lgs var6 = new lgs(var7.cf, var7.cg, var5, this.getHeight());
      this.khX.cB(var6.cf + this.khT.kiO - 1, 0);
      this.khX.cC(var6.rmN, this.getHeight());
   }

   private boolean mM(String var1) {
      if (this.jGu.equals(var1)) {
         return false;
      }

      var1 = this.mL(var1);
      if (var1.length() > this.khU) {
         return false;
      }

      this.khZ.i(var1, 100000, 1);
      this.jGu = var1;
      this.chp();
      this.chk();
      return true;
   }

   private void chp() {
      this.khZ.ci(100000, 99990);
      int var1 = this.khZ.cca() + this.khT.kiO * 2;
      if (var1 < this.getWidth()) {
         var1 = this.getWidth();
      }

      int var2 = this.khZ.ccb() < this.getHeight() ? this.getHeight() : this.khZ.ccb();
      lhf var3 = new lhf(var1, var2);
      this.d(var3);
      this.khV.cB(this.khT.kiO, this.getHeight() - this.khZ.ccb() - 1);
      this.khV.cC(var3.rmN, var3.H);
   }

   private static lhf a(hnc var0, hfk$b var1, String var2) {
      int var3 = var0.a(var1.kiK.jFE, var2).rmN;
      int var4 = var1.kiK.jFE.kNb * 2;
      return new lhf(var3 + var1.kiO * 2, var4);
   }

   private boolean cp(int var1, int var2) {
      if (var1 == this.kib && var2 == this.kic) {
         return false;
      }

      this.kib = var1;
      this.kic = var2;
      this.chl();
      return true;
   }

   private boolean Mi(int var1) {
      if (var1 >= this.jGu.length()) {
         return false;
      }

      char var2 = this.jGu.charAt(var1);
      return Character.isLetterOrDigit(var2);
   }

   private void g(char var1) {
      assert this.Initialized;
      if (var1 >= ' ' && var1 != '^') {
         if (this.kid && this.kic == this.kib && this.kib + 1 <= this.jGu.length()) {
            this.a(ldd.ret, false, true);
         }

         this.kiG.mO(new String(new char[]{var1}));
      }
   }

   private int J(int var1, boolean var2) {
      hcj var3 = this.khZ.LK(var1);
      if (var3 == null) {
         return var1;
      } else if (var3.jFL == hck.jFQ || var3.jFL == hck.jFR) {
         return var1;
      } else if (!var2) {
         return var3.als;
      } else {
         return var1 == var3.als ? var1 : var3.als + var3.cbY();
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void a(ldd var1, boolean var2, boolean var3) {
      assert var1 == ldd.rer || var1 == ldd.ret;
      int var4 = this.kib;
      int var5 = this.jGu.length();
      if (var2) {
         switch (var1) {
            case ret:
               label105:
               if (var4 < this.jGu.length()) {
                  int var9 = this.J(var4 + 1, false);
                  hcj var13 = this.khZ.LK(var9);
                  if (var9 == var4) {
                     var9 = var13.als + var13.cbY();
                     var13 = this.khZ.LK(var9);
                     if (this.Mi(var9) || var13 == null) {
                        var4 = var9;
                        break label105;
                     }
                  }

                  if (var13 != null) {
                     var4 = var9;

                     while (this.Mi(var4) && var4 <= this.jGu.length()) {
                        var9 = this.J(var4 + 1, false);
                        if (var9 != var4 + 1 || var9 > this.jGu.length()) {
                           break;
                        }

                        var4 = var9;
                     }

                     while (!this.Mi(var4) && var4 < this.jGu.length()) {
                        var9 = this.J(var4 + 1, false);
                        if (var9 != var4 + 1 || var9 > this.jGu.length()) {
                           if (var9 <= this.jGu.length()) {
                              var4 = var9;
                           }
                           break;
                        }

                        var4 = var9;
                     }
                  }
               }
               break;
            case rer:
               if (var4 > 0) {
                  int var6 = this.J(var4 - 1, false);
                  if (var6 != var4 - 1) {
                     var4 = var6;
                  } else {
                     hcj var7 = this.khZ.LK(var6);
                     if (var7 != null) {
                        for (var4 = var6; !this.Mi(var4) && var4 > 0; var4 = var6) {
                           var6 = this.J(var4 - 1, false);
                           if (var6 != var4 - 1 || var6 < 0) {
                              if (var6 >= 0) {
                                 var4 = var6;
                              }
                              break;
                           }
                        }

                        while (this.Mi(var6) && var6 >= 0) {
                           var4 = var6;
                           var6 = this.J(var4 - 1, false);
                           if (var6 != var4 - 1 || var6 < 0) {
                              break;
                           }
                        }
                     }
                  }
               }
               break;
            default:
               assert false : var1;
         }
      } else {
         hcj var12 = this.khZ.LK(var4);
         var4 += var1.reu;
         if (var4 < 0) {
            var4 = 0;
         }

         var4 = this.J(var4, var1.reu > 0);
         if (var4 > var5) {
            var4 = var5;
         }
      }

      this.kiG.L(var4, var3);
   }

   private void K(int var1, boolean var2) {
      assert var1 == -1 || var1 == 1;
      int var3 = var1 == -1 ? 0 : this.jGu.length();
      this.kiG.L(var3, var2);
   }

   private void nr(boolean var1) {
      if (var1 != this.kid) {
         this.kid = var1;
         if (this.Initialized) {
            this.chl();
         }
      }
   }

   private void chq() {
      if (this.kic == this.kib && this.kib > 0) {
         this.a(ldd.rer, false, true);
      }

      this.kiG.mO("");
   }

   private void chr() {
      if (this.kic == this.kib && this.kib < this.jGu.length()) {
         this.a(ldd.ret, false, true);
      }

      this.kiG.mO("");
   }

   private int getLineCount() {
      return 1;
   }

   private void mU(boolean var1) {
      this.a(var1, this.kik, 37, jpn.nLm);
      this.a(var1, this.kil, 37, jpn.nLH);
      this.a(var1, this.kim, 37, jpn.nLI);
      this.a(var1, this.kin, 37, jpn.nLL);
      this.a(var1, this.kio, 39, jpn.nLm);
      this.a(var1, this.kip, 39, jpn.nLH);
      this.a(var1, this.kiq, 39, jpn.nLI);
      this.a(var1, this.kir, 39, jpn.nLL);
      this.a(var1, this.kis, 36, jpn.nLm);
      this.a(var1, this.kis, 36, jpn.nLI);
      this.a(var1, this.kit, 36, jpn.nLH);
      this.a(var1, this.kit, 36, jpn.nLL);
      this.a(var1, this.kiu, 35, jpn.nLm);
      this.a(var1, this.kiu, 35, jpn.nLI);
      this.a(var1, this.kiv, 35, jpn.nLH);
      this.a(var1, this.kiv, 35, jpn.nLL);
      this.a(var1, this.kiw, 45, jpn.nLm);
      this.a(var1, this.kix, 8, jpn.nLm);
      this.a(var1, this.jHX, 46, jpn.nLm);
      this.a(var1, this.kiy, 34, jpn.nLm);
      this.a(var1, this.kiy, 33, jpn.nLm);
      this.a(var1, this.kiy, 38, jpn.nLm);
      this.a(var1, this.kiy, 40, jpn.nLm);
      this.a(var1, this.kiy, 9, jpn.nLm);
      this.a(var1, this.kiy, 101, jpn.nLm);
      this.a(var1, this.jHs, 88, jpn.nLI);
      this.a(var1, this.jHt, 67, jpn.nLI);
      this.a(var1, this.jHu, 86, jpn.nLI);
      this.a(var1, this.kiA, 88, jpn.nLL);
      this.a(var1, this.kiz, 67, jpn.nLL);
      this.a(var1, this.jHu, 86, jpn.nLL);
      this.a(var1, this.jHs, 46, jpn.nLH);
      this.a(var1, this.jHt, 45, jpn.nLI);
      this.a(var1, this.jHu, 45, jpn.nLH);
      this.a(var1, this.kiA, 46, jpn.nLL);
      this.a(var1, this.kiz, 45, jpn.nLL);
      this.a(var1, this.kiB, 73, jpn.nLI);
      this.a(var1, this.kiC, 66, jpn.nLI);
      this.a(var1, this.kiD, 82, jpn.nLI);
      this.a(var1, this.kiE, 75, jpn.nLI);
   }

   @Override
   public boolean b(hms var1) {
      return var1 instanceof hgy || var1 instanceof hgz;
   }

   @Override
   public void cge() {
   }

   @Override
   public void cgf() {
      if (this.kih != null) {
         hcj var1 = this.khZ.LK(this.kii);
         if (var1 == null) {
            this.kih.nR(false);
            this.kii = -1;
            this.kih = null;
         } else {
            this.cp(var1.als, var1.als + var1.cbY());
            this.kiG.mO("");
            this.kih.nR(false);
            this.kih = null;
            this.kii = -1;
         }
      }
   }

   @Override
   public void a(hdz var1, int var2, int var3, lgg var4) {
   }

   public final boolean a(hgz var1, boolean var2) {
      lgg var3 = this.cqu();
      int var4 = this.khZ.i(var3);
      if (var2 && var4 == this.kii) {
         return true;
      }

      hea var5 = var1.ckh();
      if (var5 != null && var5.kaW != null) {
         if (this.kih != null) {
            hcj var6 = this.khZ.LK(this.kii);
            if (var6 == null) {
               this.kih.nR(false);
               this.kii = -1;
               this.kih = null;
               return false;
            }

            this.cp(var6.als, var6.als + var6.cbY());
            this.kiG.mO("");
            this.kih = null;
            this.kii = -1;
            var4 = this.khZ.i(var3);
         } else {
            var1.nR(true);
         }

         hdx var11 = (hdx)var5.kaW;
         ArrayList var7 = lcn.emv();
         this.dXw.a(var5, var11, var7);
         StringBuilder var8 = new StringBuilder();
         var8.append('^');
         var8.append('S');
         var8.append(var11.ceh());

         for (hnt var10 : var7) {
            var8.append('\u00a7');
            var8.append(var10.r(this.dXw));
         }

         var8.append('^');
         String var12 = var8.toString();
         this.cp(var4, var4);
         this.kiG.mO(var12);
         if (!var2) {
            for (hmt var13 = this.cqt(); var13 != null; var13 = var13.cqt()) {
               if (var13 instanceof hen) {
                  ((hen)var13).cqV();
                  break;
               }
            }

            this.cqV();
         }

         if (var2) {
            this.kii = var4;
            this.kih = var1;
            return true;
         } else {
            var1.nR(false);
            this.kii = -1;
            this.kih = null;
            return false;
         }
      } else {
         return false;
      }
   }

   public final boolean a(hgy var1, boolean var2) {
      lgg var3 = this.cqu();
      int var4 = this.khZ.i(var3);
      if (var2 && var4 == this.kii) {
         return true;
      }

      if (this.kih != null) {
         hcj var5 = this.khZ.LK(this.kii);
         if (var5 == null) {
            this.kih.nR(false);
            this.kii = -1;
            this.kih = null;
            return false;
         }

         this.cp(var5.als, var5.als + var5.cbY());
         this.kiG.mO("");
         this.kih = null;
         this.kii = -1;
         var4 = this.khZ.i(var3);
      } else {
         var1.nR(true);
      }

      hdz var11 = var1.cjV();
      hdw var6 = (hdw)var11.kaW;
      ArrayList var7 = lcn.emv();
      this.dXw.a(var11, var6, var7);
      StringBuilder var8 = new StringBuilder();
      var8.append('^');
      var8.append('O');
      var8.append(var6.ceh());

      for (hnt var10 : var7) {
         var8.append('\u00a7');
         var8.append(var10.r(this.dXw));
      }

      var8.append('^');
      String var12 = var8.toString();
      this.cp(var4, var4);
      if (!this.kiG.mO(var12)) {
         var1.nR(false);
         return false;
      } else if (var2) {
         this.kii = var4;
         this.kih = var1;
         return true;
      } else {
         var1.nR(false);
         this.kii = -1;
         this.kih = null;
         return false;
      }
   }

   private void chs() {
      if (this.kib != this.kic) {
         int var1 = this.kib < this.kic ? this.kib : this.kic;
         int var2 = this.kib > this.kic ? this.kib : this.kic;
         this.kiG.L(var2, false);
         this.kiG.mO("^I0^");
         this.kiG.L(var1, false);
         this.kiG.mO("^I1^");
         this.kiG.L(var1, false);
      } else {
         hcj var3 = this.khZ.LK(this.kib);
         boolean var4 = false;
         if (var3 == null && this.kib > 0) {
            var3 = this.khZ.LK(this.kib - 1);
         }

         if (var3 != null) {
            var4 = var3.jFE.kNd;
         }

         if (var4) {
            this.kiG.mO("^I0^");
         } else {
            this.kiG.mO("^I1^");
         }
      }
   }

   private void cht() {
      if (this.kib != this.kic) {
         int var1 = this.kib < this.kic ? this.kib : this.kic;
         int var2 = this.kib > this.kic ? this.kib : this.kic;
         this.kiG.L(var2, false);
         this.kiG.mO("^W" + this.khZ.jGs.kNc + '^');
         this.kiG.L(var1, false);
         this.kiG.mO("^W1^");
         this.kiG.L(var1, false);
      } else {
         hcj var3 = this.khZ.LK(this.kib);
         boolean var4 = false;
         if (var3 == null && this.kib > 0) {
            var3 = this.khZ.LK(this.kib - 1);
         }

         if (var3 != null) {
            var4 = var3.jFE.kNc != this.khZ.jGs.kNc;
         }

         if (var4) {
            this.kiG.mO("^W" + this.khZ.jGs.kNc + '^');
         } else {
            this.kiG.mO("^W1^");
         }
      }
   }

   private void chu() {
      int var1 = this.kib < this.kic ? this.kib : this.kic;
      this.cp(var1, var1);
      this.kiG.mO("^N^");
   }

   private String F(lcq var1) {
      String var2 = Integer.toHexString(var1.getColor().getRGB()).substring(2);

      while (var2.length() < 6) {
         var2 = "0" + var2;
      }

      return "^C" + var2 + '^';
   }

   private void chv() {
      this.kij.khP.a(false, this.kiF);
      if (this.kij.khO != null) {
         String var1 = this.F(this.kij.khO);
         hcj var3 = this.khZ.LK(this.kib < this.kic ? this.kib : this.kic);
         String var2;
         if (var3 == null) {
            var2 = this.F(this.khZ.jGr);
         } else {
            var2 = this.F(var3.dMT);
         }

         if (this.kib != this.kic) {
            int var4 = this.kib < this.kic ? this.kib : this.kic;
            int var5 = this.kib > this.kic ? this.kib : this.kic;
            this.kiG.L(var5, false);
            this.kiG.mO(var2);
            this.kiG.L(var4, false);
            this.kiG.mO(var1);
            this.kiG.L(var4, false);
         } else {
            this.kiG.mO(var1);
         }

         this.cqV();
      }
   }

   private void chw() {
      this.dXw.jYN.cdj();
      hen var1 = this.dXw.jYN.cdh();
      lgg var2 = this.y(this.khZ.LL(this.kib).aI());
      var2 = new lgg(var2.cf, var2.cg - var1.getHeight());
      var1.z(var2);
      this.kij = (hfj)var1.csT();
      this.kij.khP.a(true, this.kiF);
   }
}
