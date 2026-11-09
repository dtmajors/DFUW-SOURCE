import java.util.List;
import spenefett.hid.gui.serialization.dto.SFVideoOptionsDTO;

class jjd$e {
   private static final int njd = 0;
   private static final int nje = 1;
   private static final int njf = 2;
   private static final int njg = 3;
   public static final String njh = "VO.Resolution";
   public static final String nji = "VO.Reflections";
   public static final String njj = "VO.Fullscreen";
   public static final String njk = "VO.PostFX";
   public static final String njl = "VO.TextureFiltering";
   public static final String njm = "VO.EnableShadows";
   public static final String njn = "VO.ShadowQuality";
   public static final String njo = "VO.ShadowSmoothingQuality";
   public static final String njp = "VO.SMAA";
   public static final String njq = "VO.CharacterShadowsOnly";
   public static final String njr = "VO.QuickState";
   public static final String njs = "VO.Gamma";
   public static final String njt = "VO.ObjectClipping";
   public static final String nju = "VO.AutoOptimization";
   public static final String njv = "VO.HiResMap";
   public static final String njw = "VO.GodRays";
   public static final String njx = "VO.VSync";
   public static final String njy = "VO.SpecialFXQuality";
   public static final String njz = "VO.TextureQuality";
   public static final String njA = "VO.DepthOfField";
   public static final String njB = "VO.ShaderQuality";
   List<String> njC;

   private void a(SFVideoOptionsDTO var1) {
      this.nij.a("VO.Resolution", hsu.ldg, var1.Resolution);
      this.nij.a("VO.Reflections", hsu.ldg, var1.Reflections);
      this.nij.a("VO.Fullscreen", hsu.ldg, var1.Fullscreen);
      this.nij.a("VO.PostFX", hsu.ldg, var1.PostFX);
      this.nij.a("VO.TextureFiltering", hsu.ldg, var1.TextureFiltering);
      this.nij.a("VO.EnableShadows", hsu.ldg, var1.EnableShadows);
      this.nij.a("VO.ShadowQuality", hsu.ldg, var1.ShadowQuality);
      this.nij.a("VO.ShadowSmoothingQuality", hsu.ldg, var1.ShadowSmoothingQuality);
      this.nij.a("VO.SMAA", hsu.ldg, var1.SMAA);
      this.nij.a("VO.CharacterShadowsOnly", hsu.ldg, var1.CharacterShadowsOnly);
      this.nij.a("VO.QuickState", hsu.ldg, var1.QuickState);
      this.nij.a("VO.Gamma", hsu.ldg, var1.Gamma);
      this.nij.a("VO.ObjectClipping", hsu.ldg, var1.ObjectClipping);
      this.nij.a("VO.AutoOptimization", hsu.ldg, var1.AutoOptimization);
      this.nij.a("VO.HiResMap", hsu.ldg, var1.HighResolutionMap);
      this.nij.a("VO.GodRays", hsu.ldg, var1.EnableGodRays);
      this.nij.a("VO.VSync", hsu.ldg, var1.VSync);
      this.nij.a("VO.SpecialFXQuality", hsu.ldg, var1.SpecialFXQuality);
      this.nij.a("VO.TextureQuality", hsu.ldg, var1.TextureQuality);
      this.nij.a("VO.DepthOfField", hsu.ldg, var1.DepthOfField);
      this.nij.a("VO.ShaderQuality", hsu.ldg, var1.ShaderQuality);
   }

   private SFVideoOptionsDTO dIB() {
      SFVideoOptionsDTO var1 = new SFVideoOptionsDTO();
      var1.Resolution = this.nij.nj("VO.Resolution");
      var1.Reflections = this.nij.nk("VO.Reflections");
      var1.Fullscreen = this.nij.nk("VO.Fullscreen");
      var1.PostFX = this.nij.nk("VO.PostFX");
      var1.TextureFiltering = this.nij.nh("VO.TextureFiltering");
      var1.EnableShadows = this.nij.nk("VO.EnableShadows");
      var1.ShadowQuality = this.nij.nh("VO.ShadowQuality");
      var1.ShadowSmoothingQuality = this.nij.nh("VO.ShadowSmoothingQuality");
      var1.SMAA = this.nij.nk("VO.SMAA");
      var1.CharacterShadowsOnly = this.nij.nk("VO.CharacterShadowsOnly");
      var1.QuickState = this.nij.nh("VO.QuickState");
      var1.Gamma = this.nij.ni("VO.Gamma");
      var1.ObjectClipping = this.nij.nk("VO.ObjectClipping");
      var1.AutoOptimization = this.nij.nk("VO.AutoOptimization");
      var1.HighResolutionMap = this.nij.nk("VO.HiResMap");
      var1.EnableGodRays = this.nij.nk("VO.GodRays");
      var1.VSync = this.nij.nk("VO.VSync");
      var1.SpecialFXQuality = this.nij.nh("VO.SpecialFXQuality");
      var1.TextureQuality = this.nij.nh("VO.TextureQuality");
      var1.DepthOfField = this.nij.nk("VO.DepthOfField");
      var1.ShaderQuality = this.nij.nh("VO.ShaderQuality");
      return var1;
   }

   private void b(SFVideoOptionsDTO var1) {
      this.nij.B("VO.Resolution", var1.Resolution);
      this.nij.q("VO.Reflections", var1.Reflections);
      this.nij.q("VO.Fullscreen", var1.Fullscreen);
      this.nij.q("VO.PostFX", var1.PostFX);
      this.nij.w("VO.TextureFiltering", var1.TextureFiltering);
      this.nij.q("VO.EnableShadows", var1.EnableShadows);
      this.nij.w("VO.ShadowQuality", var1.ShadowQuality);
      this.nij.w("VO.ShadowSmoothingQuality", var1.ShadowSmoothingQuality);
      this.nij.q("VO.SMAA", var1.SMAA);
      this.nij.q("VO.CharacterShadowsOnly", var1.CharacterShadowsOnly);
      this.nij.w("VO.QuickState", var1.QuickState);
      this.nij.d("VO.Gamma", var1.Gamma);
      this.nij.q("VO.ObjectClipping", var1.ObjectClipping);
      this.nij.q("VO.AutoOptimization", var1.AutoOptimization);
      this.nij.q("VO.HiResMap", var1.HighResolutionMap);
      this.nij.q("VO.GodRays", var1.EnableGodRays);
      this.nij.q("VO.VSync", var1.VSync);
      this.nij.w("VO.SpecialFXQuality", var1.SpecialFXQuality);
      this.nij.w("VO.TextureQuality", var1.TextureQuality);
      this.nij.q("VO.DepthOfField", var1.DepthOfField);
      this.nij.w("VO.ShaderQuality", var1.ShaderQuality);
   }

   public void fz(int var1, int var2) {
      SFVideoOptionsDTO var3 = this.dIB();
      var3.cDK();
      if (var3.QuickState == 3) {
         SFVideoOptionsDTO var4 = new SFVideoOptionsDTO();
         if (var1 < 20) {
            var3.DepthOfField = var4.DepthOfField;
         }
      }

      this.b(var3);
   }

   public jjd$e(jjd var1) {
      this.nij = var1;
      this.njC = lcn.emv();
      SFVideoOptionsDTO var2 = new SFVideoOptionsDTO();
      var2.cDJ();
      this.a(var2);
   }

   private cqx dIC() {
      return (cqx)jjd.a(this.nij).bzx().bzt().d(lcr.qCg);
   }

   public void dIl() {
      cqx var1 = this.dIC();
      csq var2 = var1.aZQ();
      this.njC.clear();
      this.njC = csq.hT(var2.baP());
      this.nij.lcI.add(new lfs<>(0, 0));

      for (String var4 : this.njC) {
         String[] var5 = var4.split("x");
         String[] var6 = var5[1].split("@");
         this.nij.lcI.add(new lfs<>(Integer.valueOf(var5[0]), Integer.valueOf(var6[0])));
      }

      SFVideoOptionsDTO var7 = this.dIB();
      var7.Resolution = var2.baO();
      var7.Fullscreen = var2.baQ();
      if (lcw.bcB == 2 && var2.baR()) {
         var7.Fullscreen = true;
      }

      this.b(var7);
      SFVideoOptionsDTO var8 = new SFVideoOptionsDTO();
      var8.cDJ();
      this.a(var8, var7, true);
   }

   private void cBa() {
      this.dID();
      this.nij.a("VideoOptionsDivision_fromDTO", new Object[]{this.dIB()});
      mih var1 = (mih)jjd.b(this.nij).BX(1);
      var1.tk(jjd.c(this.nij));
      var1.aet(255);
      jjd.d(this.nij).a(var1);
   }

   private void dID() {
      String var1 = "";

      for (int var2 = 0; var2 < this.njC.size(); var2++) {
         String[] var3 = this.njC.get(var2).split("[x@]");
         if (var3.length == 3) {
            try {
               int var4 = Integer.parseInt(var3[0]);
               int var5 = Integer.parseInt(var3[1]);
               if (var4 < 1024 || var5 < 720) {
                  continue;
               }
            } catch (NumberFormatException var6) {
               continue;
            }

            var1 = var1 + this.njC.get(var2) + ";";
         }
      }

      cqx var7 = this.dIC();
      csq var8 = var7.aZQ();
      String[] var9 = var8.baO().split("[x@]");
      String var10 = "";
      if (var9.length >= 2) {
         var10 = var9[0] + "x" + var9[1];
      }

      this.nij.a("VideoOptionsDivision_setDisplayModes", new Object[]{var1, var10});
   }

   public void c(SFVideoOptionsDTO var1) {
      SFVideoOptionsDTO var2 = this.dIB();
      this.a(var2, var1, false);
      this.b(var1);
      this.nij.a("VideoOptionsDivision_fromDTO", new Object[]{var1});
   }

   private boolean aa(String var1, String var2) {
      return !var1.equals("NONE") && !var2.equals("NONE") ? var1.equals(var2) : true;
   }

   private void a(SFVideoOptionsDTO var1, SFVideoOptionsDTO var2, boolean var3) {
      this.dIJ();
      this.dII();
      if (!var3 && (!this.aa(var1.Resolution, var2.Resolution) || var1.Fullscreen != var2.Fullscreen)) {
         if (var2.Resolution.equals("NONE") && !var1.Resolution.equals("NONE")) {
            this.H(var1.Resolution, var2.Fullscreen);
         } else {
            this.H(var2.Resolution, var2.Fullscreen);
         }
      }

      if (var1.EnableShadows != var2.EnableShadows
         || var1.ShadowQuality != var2.ShadowQuality
         || var1.ShadowSmoothingQuality != var2.ShadowSmoothingQuality
         || var1.CharacterShadowsOnly != var2.CharacterShadowsOnly) {
         this.a(var2.EnableShadows, var2.ShadowQuality, var2.ShadowSmoothingQuality, var2.CharacterShadowsOnly);
      }

      if (var1.PostFX != var2.PostFX) {
         this.tP(var2.PostFX);
      }

      if (var1.Reflections != var2.Reflections) {
         this.tQ(var2.Reflections);
      }

      if (var1.TextureFiltering != var2.TextureFiltering) {
         this.UW(var2.TextureFiltering);
      }

      if (var1.SMAA != var2.SMAA) {
         this.tR(var2.SMAA);
      }

      if (var2.Fullscreen) {
         this.kV(var2.Gamma);
      } else {
         var2.Gamma = var1.Gamma;
         this.kV(1.0F);
      }

      if (var1.ObjectClipping != var2.ObjectClipping) {
         this.tS(var2.ObjectClipping);
      }

      if (var1.AutoOptimization != var2.AutoOptimization) {
         this.tT(var2.AutoOptimization);
      }

      if (var1.EnableGodRays != var2.EnableGodRays) {
         this.tU(var2.EnableGodRays);
      }

      hyn.cyJ().cHB().ue(var2.HighResolutionMap);
      if (var1.VSync != var2.VSync) {
         this.tV(var2.VSync);
      }

      if (var1.DepthOfField != var2.DepthOfField) {
         this.tW(var2.DepthOfField);
      }

      if (var1.SpecialFXQuality != var2.SpecialFXQuality) {
         this.UZ(var2.SpecialFXQuality);
      }

      if (var1.TextureQuality != var2.TextureQuality) {
         this.Va(var2.TextureQuality);
      }

      if (var1.ShaderQuality != var2.ShaderQuality) {
         this.UX(var2.ShaderQuality);
      }

      this.dIK();
   }

   private void H(String var1, boolean var2) {
      cse var3 = csq.hU(var1);
      kfy var4 = (kfy)jjd.e(this.nij).BV(3);
      var4.ts(jjd.f(this.nij));
      var4.WE(224);
      var4.WF(var3.fb);
      var4.WG(var3.fc);
      var4.vm(var2);
      var4.vl(false);
      var4.gU(false);
      if (lcw.bcB == 2 && var4.dWj()) {
         var4.vm(false);
         var4.gU(true);
      }

      jjd.g(this.nij).b(var4);
   }

   private void a(boolean var1, int var2, int var3, boolean var4) {
      kgp var5 = (kgp)jjd.h(this.nij).BV(5);
      var5.ts(jjd.i(this.nij));
      var5.Xa(32768);
      var5.vC(var1);
      jjd.j(this.nij).b(var5);
      kgn var6 = (kgn)jjd.k(this.nij).BV(9);
      var6.ts(jjd.l(this.nij));
      var6.WS(1664);
      var6.WV(var2);
      var6.WW(var3);
      var6.gW(var1);
      jjd.m(this.nij).b(var6);
      kgn var7 = (kgn)jjd.n(this.nij).BV(9);
      var7.ts(this.nij.getGUID());
      var7.WS(384);
      var7.vD(true);
      var7.gW(!var4);
      jjd.o(this.nij).b(var7);
   }

   private void tP(boolean var1) {
      kgp var2 = (kgp)jjd.p(this.nij).BV(5);
      var2.ts(jjd.q(this.nij));
      var2.ts(jjd.r(this.nij));
      var2.Xa(268435472);
      var2.wr(true);
      var2.wz(var1);
      jjd.s(this.nij).b(var2);
   }

   private void tQ(boolean var1) {
      kgp var2 = (kgp)jjd.t(this.nij).BV(5);
      var2.ts(jjd.u(this.nij));
      var2.WY(1);
      var2.wg(var1);
      jjd.v(this.nij).b(var2);
   }

   private void UW(int var1) {
      kgp var2 = (kgp)jjd.w(this.nij).BV(5);
      var2.ts(jjd.x(this.nij));
      var2.Xa(6291456);
      var2.Xd(var1 == 1 ? 1 : 2);
      byte var3 = 0;
      switch (var1) {
         case 2:
            var3 = 0;
            break;
         case 3:
            var3 = 1;
            break;
         case 4:
            var3 = 2;
            break;
         case 5:
            var3 = 3;
      }

      var2.Xe(var3);
      jjd.y(this.nij).b(var2);
   }

   private void UX(int var1) {
      kgp var2 = (kgp)jjd.z(this.nij).BV(5);
      var2.ts(jjd.A(this.nij));
      var2.WY(128);
      var2.we(var1 == 0);
      jjd.B(this.nij).b(var2);
   }

   private void tR(boolean var1) {
      kgp var2 = (kgp)jjd.C(this.nij).BV(5);
      var2.ts(jjd.D(this.nij));
      var2.WY(2);
      var2.wA(var1);
      jjd.E(this.nij).b(var2);
   }

   private void kT(float var1) {
      dld var2 = (dld)jjd.F(this.nij).bzx().bzt().d(lcr.rg);
      if (var2 != null && var2.axa() != null) {
         kir var3 = (kir)jjd.G(this.nij).h(2054);
         var3.ts(jjd.H(this.nij));
         var3.nN = var2.axa();
         var3.ha(lew.o(300.0F, 1100.0F, var1));
         var3.XZ(2);
         jjd.I(this.nij).a(var3);
         drk var4 = (drk)jjd.J(this.nij).bzx().bzt().d(lcr.qDR);
         if (var4 != null) {
            var4.cb(var4.bvG());
            var4.ca(var4.bvH());
         }
      }
   }

   public void cEj() {
   }

   public void UY(int var1) {
      switch (var1) {
         case 0:
            this.dIE();
            break;
         case 1:
            this.dIF();
            break;
         case 2:
            this.dIG();
            break;
         case 3:
            this.dIH();
            break;
         default:
            assert false;
      }
   }

   private void dIE() {
      SFVideoOptionsDTO var1 = this.dIB();
      var1.cDG();
      this.nij.a("VideoOptionsDivision_fromDTONotYetApplied", new Object[]{var1});
   }

   private void dIF() {
      SFVideoOptionsDTO var1 = this.dIB();
      var1.cDH();
      this.nij.a("VideoOptionsDivision_fromDTONotYetApplied", new Object[]{var1});
   }

   private void dIG() {
      SFVideoOptionsDTO var1 = this.dIB();
      var1.cDI();
      this.nij.a("VideoOptionsDivision_fromDTONotYetApplied", new Object[]{var1});
   }

   private void dIH() {
      SFVideoOptionsDTO var1 = this.dIB();
      var1.QuickState = 3;
      this.nij.a("VideoOptionsDivision_fromDTONotYetApplied", new Object[]{var1});
   }

   public void kU(float var1) {
      this.kV(var1);
   }

   public void kV(float var1) {
      kgp var2 = (kgp)jjd.K(this.nij).BV(5);
      var2.ts(this.nij.getGUID());
      var2.Xa(8388608);
      var2.lR(var1);
      jjd.L(this.nij).b(var2);
   }

   private void tS(boolean var1) {
      kgd var2 = (kgd)jjd.M(this.nij).BV(4);
      var2.ts(this.nij.getGUID());
      var2.WK(18);
      if (var1) {
         var2.vs(true);
         var2.lo(50.0F);
         var2.lk(0.005F);
         var2.vr(true);
         var2.ls(200.0F);
         var2.lt(200.0F);
      } else {
         var2.vs(false);
      }

      jjd.N(this.nij).b(var2);
   }

   private void tT(boolean var1) {
      kgd var2 = (kgd)jjd.O(this.nij).BV(4);
      var2.ts(this.nij.getGUID());
      var2.WK(8192);
      var2.WL(127);
      var2.WM(7);
      var2.vy(var1);
      var2.lz(10.0F);
      var2.lA(20.0F);
      jjd.P(this.nij).b(var2);
   }

   private void tU(boolean var1) {
      kgp var2 = (kgp)jjd.Q(this.nij).BV(5);
      var2.ts(jjd.R(this.nij));
      var2.WY(4);
      var2.wd(var1);
      jjd.S(this.nij).b(var2);
   }

   private void tV(boolean var1) {
      kfy var2 = (kfy)jjd.T(this.nij).BV(3);
      var2.ts(jjd.U(this.nij));
      var2.WE(16);
      var2.vn(var1);
      jjd.V(this.nij).b(var2);
   }

   private void tW(boolean var1) {
      kgp var2 = (kgp)jjd.W(this.nij).BV(5);
      var2.ts(jjd.X(this.nij));
      var2.WY(256);
      var2.wf(var1);
      jjd.Y(this.nij).b(var2);
   }

   private void UZ(int var1) {
      byte var2 = 100;
      switch (var1) {
         case 0:
            var2 = 25;
            break;
         case 1:
            var2 = 50;
            break;
         case 2:
         case 3:
            var2 = 100;
      }

      kgp var3 = (kgp)jjd.Z(this.nij).BV(5);
      var3.ts(jjd.aa(this.nij));
      var3.WY(32);
      var3.WZ(var2);
      jjd.ab(this.nij).b(var3);
   }

   private void Va(int var1) {
      kgp var2 = (kgp)jjd.ac(this.nij).BV(5);
      var2.ts(jjd.ad(this.nij));
      var2.WY(64);
      var2.Xf(2 - var1);
      jjd.ae(this.nij).b(var2);
   }

   private void dII() {
      float var1 = 80.0F;
      int var2 = 100000;
      kgq var3 = (kgq)jjd.af(this.nij).BV(8);
      var3.ts(this.nij.getGUID());
      var3.Xi(1);
      var3.Xi(var3.dYU() | 1 | 2);
      var3.lS(var1);
      var3.Xh(var2);
      jjd.ag(this.nij).b(var3);
   }

   private void dIJ() {
      kgp var1 = (kgp)jjd.ah(this.nij).BV(5);
      var1.ts(jjd.ai(this.nij));
      var1.WY(8);
      jjd.aj(this.nij).b(var1);
   }

   private void dIK() {
      kgp var1 = (kgp)jjd.ak(this.nij).BV(5);
      var1.ts(jjd.al(this.nij));
      var1.WY(16);
      jjd.am(this.nij).b(var1);
   }
}
