import java.util.List;
import java.util.Locale;
import spenefett.hid.gui.serialization.dto.SFGameOptionsDTO;

class jjd$b {
   public static final String nik = "GO.DisplayFPS";
   public static final String nil = "GO.DisplayPing";
   public static final String nim = "GO.TargetOpacity";
   public static final String nin = "GO.PartyOpacity";
   public static final String nio = "GO.DisplayName";
   public static final String nip = "GO.HitSounds";
   public static final String niq = "GO.HideHelmet";
   public static final String nir = "GO.ForceShowHelmet";
   public static final String nis = "GO.SelfClanMemberIndicators";
   public static final String nit = "GO.AlliedClanMemberIndicators";
   public static final String niu = "GO.EnemyNationIndicators";
   public static final String niv = "GO.VendorMarkers";
   public static final String niw = "GO.CompactActionBar";
   public static final String nix = "GO.ShowChatBubbles2";
   public static final String niy = "GO.QueueActions";
   public static final String niz = "GO.AutoCloseWindows";
   public static final String niA = "GO.OnlyUseLeftAction";
   public static final String niB = "GO.ShowFloatingDamage";
   public static final String niC = "GO.EnableSprintFOV";
   public static final String niD = "GO.ShowAdvisory";
   public static final String niE = "GO.ShowActionBarShortcuts";

   public jjd$b(jjd var1) {
      this.nij = var1;
      SFGameOptionsDTO var2 = new SFGameOptionsDTO();
      var1.a("GO.DisplayFPS", hsu.ldg, var2.displayFPS);
      var1.a("GO.DisplayPing", hsu.ldg, var2.displayPing);
      var1.a("GO.TargetOpacity", hsu.ldg, var2.targetOpacity);
      var1.a("GO.PartyOpacity", hsu.ldg, var2.partyOpacity);
      var1.a("GO.DisplayName", hsu.ldg, var2.displayName);
      var1.a("GO.HitSounds", hsu.ldg, var2.hitSounds);
      var1.a("GO.HideHelmet", hsu.ldg, var2.hideHelmet);
      var1.a("GO.ForceShowHelmet", hsu.ldg, var2.forceShowHelmet);
      var1.a("GO.SelfClanMemberIndicators", hsu.ldg, var2.selfClanMemberIndicators);
      var1.a("GO.AlliedClanMemberIndicators", hsu.ldg, var2.alliedClanMemberIndicators);
      var1.a("GO.EnemyNationIndicators", hsu.ldg, var2.enemyNationIndicators);
      var1.a("GO.VendorMarkers", hsu.ldg, var2.vendorMarkers);
      var1.a("GO.CompactActionBar", hsu.ldg, var2.compactActionBar);
      var1.a("GO.ShowChatBubbles2", hsu.ldg, var2.showBubbles);
      var1.a("GO.QueueActions", hsu.ldg, var2.queueActions);
      var1.a("GO.AutoCloseWindows", hsu.ldg, var2.autoCloseWindows);
      var1.a("GO.OnlyUseLeftAction", hsu.ldg, var2.onlyUseLeftAction);
      var1.a("GO.ShowFloatingDamage", hsu.ldg, var2.showFloatingDamage);
      var1.a("GO.EnableSprintFOV", hsu.ldg, var2.EnableSprintFOV);
      var1.a("GO.ShowAdvisory", hsu.ldg, var2.showAdvisory);
      var1.a("GO.ShowActionBarShortcuts", hsu.ldg, var2.showActionBarShortcuts);
   }

   SFGameOptionsDTO dIn() {
      SFGameOptionsDTO var1 = new SFGameOptionsDTO();
      var1.displayFPS = this.nij.nk("GO.DisplayFPS");
      var1.displayPing = this.nij.nk("GO.DisplayPing");
      var1.targetOpacity = this.nij.ni("GO.TargetOpacity");
      var1.partyOpacity = this.nij.ni("GO.PartyOpacity");
      var1.displayName = this.nij.nk("GO.DisplayName");
      var1.hitSounds = this.nij.nk("GO.HitSounds");
      var1.hideHelmet = this.nij.nk("GO.HideHelmet");
      var1.showBubbles = this.nij.nk("GO.ShowChatBubbles2");
      var1.forceShowHelmet = this.nij.nk("GO.ForceShowHelmet");
      var1.selfClanMemberIndicators = this.nij.nk("GO.SelfClanMemberIndicators");
      var1.alliedClanMemberIndicators = this.nij.nk("GO.AlliedClanMemberIndicators");
      var1.enemyClanMemberIndicators = false;
      var1.enemyNationIndicators = this.nij.nk("GO.EnemyNationIndicators");
      var1.vendorMarkers = this.nij.nk("GO.VendorMarkers");
      var1.selectedLanguage = lpd.rHs.exK();
      var1.compactActionBar = this.nij.nk("GO.CompactActionBar");
      var1.queueActions = this.nij.nk("GO.QueueActions");
      var1.autoCloseWindows = this.nij.nk("GO.AutoCloseWindows");
      var1.onlyUseLeftAction = this.nij.nk("GO.OnlyUseLeftAction");
      var1.showFloatingDamage = this.nij.nk("GO.ShowFloatingDamage");
      var1.EnableSprintFOV = this.nij.nk("GO.EnableSprintFOV");
      var1.showAdvisory = this.nij.nk("GO.ShowAdvisory");
      var1.showActionBarShortcuts = this.nij.nk("GO.ShowActionBarShortcuts");
      return var1;
   }

   void a(SFGameOptionsDTO var1) {
      this.nij.q("GO.DisplayFPS", var1.displayFPS);
      this.nij.q("GO.DisplayPing", var1.displayPing);
      this.nij.d("GO.TargetOpacity", var1.targetOpacity);
      this.nij.d("GO.PartyOpacity", var1.partyOpacity);
      this.nij.q("GO.DisplayName", var1.displayName);
      this.nij.q("GO.HitSounds", var1.hitSounds);
      this.nij.q("GO.HideHelmet", var1.hideHelmet);
      this.nij.q("GO.ForceShowHelmet", var1.forceShowHelmet);
      this.nij.q("GO.SelfClanMemberIndicators", var1.selfClanMemberIndicators);
      this.nij.q("GO.AlliedClanMemberIndicators", var1.alliedClanMemberIndicators);
      this.nij.q("GO.EnemyNationIndicators", var1.enemyNationIndicators);
      this.nij.q("GO.VendorMarkers", var1.vendorMarkers);
      this.nij.q("GO.CompactActionBar", var1.compactActionBar);
      this.nij.q("GO.ShowChatBubbles2", var1.showBubbles);
      this.nij.q("GO.QueueActions", var1.queueActions);
      this.nij.q("GO.AutoCloseWindows", var1.autoCloseWindows);
      this.nij.q("GO.OnlyUseLeftAction", var1.onlyUseLeftAction);
      this.nij.q("GO.ShowFloatingDamage", var1.showFloatingDamage);
      this.nij.q("GO.EnableSprintFOV", var1.EnableSprintFOV);
      this.nij.q("GO.ShowAdvisory", var1.showAdvisory);
      this.nij.q("GO.ShowActionBarShortcuts", var1.showActionBarShortcuts);
   }

   public void fz(int var1, int var2) {
   }

   public void dIe() {
      SFGameOptionsDTO var1 = this.dIn();
      var1.compactActionBar = !var1.compactActionBar;
      this.d(var1.compactActionBar);
      this.a(var1);
      this.nij.a("GameOptionsDivision_fromDTO", new Object[]{var1});
   }

   public void dIl() {
   }

   public void cBa() {
      this.dIo();
      SFGameOptionsDTO var1 = this.dIn();
      this.b(var1);
      this.nij.a("GameOptionsDivision_fromDTO", new Object[]{var1});
   }

   public void cEj() {
   }

   public void b(SFGameOptionsDTO var1) {
      this.a(var1);
      this.c(var1);
   }

   private void c(SFGameOptionsDTO var1) {
      SFGameOptionsDTO var2 = this.dIn();
      this.kR(var1.partyOpacity);
      this.kS(var1.targetOpacity);
      this.tA(var1.displayFPS);
      this.tB(var1.displayPing);
      this.tC(var1.displayName);
      this.tG(var1.hitSounds);
      this.tH(var1.hideHelmet);
      this.tJ(var1.forceShowHelmet);
      this.b(var1.selfClanMemberIndicators, var1.alliedClanMemberIndicators, false);
      this.tI(var1.enemyNationIndicators);
      this.UT(var1.selectedLanguage);
      this.d(var1.compactActionBar);
      this.tF(var1.showBubbles);
      this.tD(var1.queueActions);
      this.tE(var1.onlyUseLeftAction);
      this.tK(var1.showFloatingDamage);
      this.tL(var1.EnableSprintFOV);
      this.tM(var1.showAdvisory);
      this.tN(var1.showActionBarShortcuts);
      if (var2.vendorMarkers != var1.vendorMarkers) {
         this.c(var1.vendorMarkers);
      }
   }

   private void kR(float var1) {
      hyn.cyJ().cIm().kz(var1);
   }

   private void kS(float var1) {
      hyn.cyJ().cHZ().kx(var1);
   }

   private void tA(boolean var1) {
      hyn.cyJ().cIb().pg(var1);
   }

   private void tB(boolean var1) {
      hyn.cyJ().cIb().ph(var1);
   }

   private void tC(boolean var1) {
      hyn.cyJ().cIq().lo(var1);
   }

   private void tD(boolean var1) {
      jpy var2 = (jpy)jjd.ax(this.nij).bzx().bzt().d(lcr.qBQ);
      var2.uC(var1);
   }

   private void tE(boolean var1) {
   }

   private void tF(boolean var1) {
      if (lcw.qOS) {
         jjd.dIk().cze().bZ(var1);
      } else {
         atz var2 = (atz)jjd.ay(this.nij).bzx().bzt().d(lcr.qCN);
         if (var2 != null) {
            var2.bZ(var1);
         }
      }
   }

   private void tG(boolean var1) {
      atn.bW(var1);
   }

   private void tH(boolean var1) {
      if (hso.cxK().bAn() != null) {
         eyl var2 = (eyl)jjd.aA(this.nij).h(23553, jjd.az(this.nij), hso.cxK().bAn().gYY);
         var2.iFL = 3;
         var2.bhQ = var1;
         jjd.aB(this.nij).E(var2);
      }
   }

   private void tI(boolean var1) {
      if (hso.cxK().bAn() != null) {
         eyl var2 = (eyl)jjd.aD(this.nij).h(23553, jjd.aC(this.nij), hso.cxK().bAn().gYY);
         var2.iFL = 5;
         var2.emE = var1;
         jjd.aE(this.nij).E(var2);
      }
   }

   private void tJ(boolean var1) {
      if (hso.cxK().bAn() != null) {
         eyl var2 = (eyl)jjd.aG(this.nij).h(23553, jjd.aF(this.nij), hso.cxK().bAn().gYY);
         var2.iFL = 4;
         var2.ehZ = var1;
         jjd.aH(this.nij).E(var2);
      }
   }

   private void b(boolean var1, boolean var2, boolean var3) {
      eks var4 = (eks)jjd.aJ(this.nij).h(13858, jjd.aI(this.nij), lcr.qBX);
      var4.itj = false;
      var4.itk = var1;
      var4.itl = var2;
      var4.itm = false;
      var4.itn = true;
      jjd.aK(this.nij).F(var4);
   }

   private void tK(boolean var1) {
      bjk var2 = (bjk)jjd.aL(this.nij).bzx().bzt().d(lcr.qCl);
      var2.setEnabled(var1);
   }

   private void tL(boolean var1) {
      if (hso.cxK().bAn() != null) {
         eyl var2 = (eyl)jjd.aN(this.nij).h(23553, jjd.aM(this.nij), hso.cxK().bAn().gYY);
         var2.iFL = 6;
         var2.EnableSprintFOV = var1;
         jjd.aO(this.nij).E(var2);
      }
   }

   private void tM(boolean var1) {
      ias var2 = hso.cxK().cxP().cyJ().cJm();
      if (var2 != null) {
         var2.py(var1);
      }

      iik var3 = hso.cxK().cxP().cyJ().cIP();
      if (var3 != null) {
         var3.py(var1);
      }
   }

   private void tN(boolean var1) {
      hso.cxK().cxP().cyJ().cHN().cKp();
   }

   private void dIo() {
      List var1 = lpd.rHs.exJ();
      String var2 = "";

      for (int var3 = 0; var3 < var1.size(); var3++) {
         var2 = var2 + ((Locale)var1.get(var3)).getDisplayName(lpd.rHs.exJ().get(lpd.rHs.exK()));
         if (var3 != var1.size() - 1) {
            var2 = var2 + ";";
         }
      }

      this.nij.a("GameOptionsDivision_setLanguages", new Object[]{var2});
   }

   private void UT(int var1) {
      if (var1 != -1) {
         lpd.rHs.adW(var1);
         this.dIo();
      }
   }

   private void c(Boolean var1) {
      gzd var2 = (gzd)jjd.aQ(this.nij).h(20230, jjd.aP(this.nij), lcr.qCa);
      var2.b(var1);
      jjd.aR(this.nij).F(var2);
   }

   private void d(Boolean var1) {
      if (hyn.cyJ().cHN() != null) {
         hyn.cyJ().cHN().pw(var1);
      }
   }
}
