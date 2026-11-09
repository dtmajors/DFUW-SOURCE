/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dta
 *  hvj
 *  hyn
 *  hzo
 *  iba
 *  jps
 *  lcr
 *  lcw
 */
import java.util.Collections;
import java.util.List;
import spenefett.hid.gui.serialization.dto.SFAudioOptionsDTO;
import spenefett.hid.gui.serialization.dto.SFGameOptionsDTO;
import spenefett.hid.gui.serialization.dto.SFInputBindingsDTO;
import spenefett.hid.gui.serialization.dto.SFInputOptionsDTO;
import spenefett.hid.gui.serialization.dto.SFVideoOptionsDTO;

public class jjd
extends hzk
implements hyy.c {
    private e nhV = null;
    private d nhW = null;
    private c nhX = null;
    private a nhY = null;
    private b nhZ = null;
    private String nia = "Version";
    List<lfs<Integer, Integer>> lcI = lcn.emv();
    private static final int nib = 20;
    private static final int nic = 20;

    @llk
    private void hack() {
        iba.lDE = true;
        jps jps2 = (jps)this.MessageDelegator.bzx().bzt().d(lcr.qBR);
        if (jps2 != null) {
            jps2.dPU();
        }
        dta dta2 = new dta();
        dta2.setGUID(lcr.qzF);
        dta2.Ca(2);
        this.MessageDelegator.bzx().bzt().c(dta2);
        edm edm2 = (edm)this.MessageDelegator.h(12856, this.GUID, hso.cxK().bAn().gYY);
        edm2.imB = false;
        this.MessageDelegator.F(edm2);
        hso.cxK().a(jnz.nFB);
    }

    protected int dIc() {
        return Math.round(Float.parseFloat(this.nj(this.nia)) * 10.0f);
    }

    protected void US(int n) {
        int n2 = n / 10;
        int n3 = n % 10;
        this.B(this.nia, "" + n2 + "." + n3);
    }

    public List<lfs<Integer, Integer>> cyd() {
        return Collections.unmodifiableList(this.lcI);
    }

    public jjd() {
        super("VideoOptions", "VideoOptions.swf");
        this.OQ(jnz.nGu);
        this.a(hyb.lmC);
        this.a(this.nia, hsu.ldg, "1.0");
        this.nhV = new e(this);
        this.nhW = new d(this);
        this.nhX = new c(this);
        this.nhY = new a(this);
        this.nhZ = new b(this);
    }

    public boolean dId() {
        return this.nk("GO.CompactActionBar");
    }

    public void dIe() {
        this.nhZ.dIe();
    }

    public void initialize() {
        super.initialize();
        if (this.dIc() < 20) {
            this.nhV.fz(this.dIc(), 20);
            this.nhW.fz(this.dIc(), 20);
            this.nhX.fz(this.dIc(), 20);
            this.nhY.fz(this.dIc(), 20);
            this.nhZ.fz(this.dIc(), 20);
            this.US(20);
        }
        this.nhV.dIl();
        this.nhW.dIl();
        this.nhX.dIl();
        this.nhY.dIl();
        this.nhZ.dIl();
        hzo hzo2 = (hzo)jjd.cxO();
        hzo2.cHx().a(hyy.a.lrv, this);
        hso.cxK().cyb();
    }

    public void cleanUp() {
        super.cleanUp();
        hzo hzo2 = (hzo)jjd.cxO();
        hzo2.cHx().b(hyy.a.lrv);
    }

    protected void cBa() {
        super.cBa();
        this.nhV.cBa();
        this.nhW.cBa();
        this.nhX.cBa();
        this.nhY.cBa();
        this.nhZ.cBa();
        this.a("showEnemyNation", new Object[]{lcw.bcB != 1});
    }

    public hzk z(int n, int n2, String string) {
        return null;
    }

    public void receiveWindowResponse(miw miw2) {
    }

    @Override
    public void b(hyy.b b2, int n) {
        hzo hzo2 = (hzo)jjd.cxO();
        if (b2.equals((Object)hyy.b.lsA)) {
            hzo2.cHw().a(hyc.lmN, false);
        }
        if (b2.equals((Object)hyy.b.lsC)) {
            this.a("videoToggleClicked", new Object[0]);
        }
        if (b2.equals((Object)hyy.b.lsD)) {
            this.a("audioToggleClicked", new Object[0]);
        }
        if (b2.equals((Object)hyy.b.lsE)) {
            this.a("inputToggleClicked", new Object[0]);
        }
        if (b2.equals((Object)hyy.b.lsF)) {
            this.a("bindingToggleClicked", new Object[0]);
        }
        if (b2.equals((Object)hyy.b.lsB)) {
            this.a("gameToggleClicked", new Object[0]);
        }
    }

    public boolean a(jmf jmf2) {
        return this.nhX.a(jmf2);
    }

    @llk
    public void clearBinding(String string) {
        this.nhX.clearBinding(string);
    }

    @llk
    public void StartAcceptingInputObjectStateChanges(String string) {
        this.nhX.sr(string);
    }

    public void dIf() {
        this.nhX.dIt();
    }

    protected void cEj() {
        this.nhV.cEj();
        this.nhW.cEj();
        this.nhX.cEj();
        this.nhY.cEj();
        this.nhZ.cEj();
    }

    @llk
    public void trace(String string) {
        lfn.print("Scaleform trace: " + string.replaceAll("\n", ""));
    }

    public void czn() {
        this.nhX.czn();
    }

    @llk
    public void VideoOptionsDivision_processNewOptions(SFVideoOptionsDTO sFVideoOptionsDTO) {
        this.nhV.c(sFVideoOptionsDTO);
    }

    @llk
    public void VideoOptionsDivision_quickButtonClicked(int n) {
        this.nhV.UY(n);
    }

    @llk
    public void VideoOptionsDivision_gammaSliderChanged(String string) {
        this.nhV.kU(Float.parseFloat(string));
    }

    @llk
    public void InputOptionsDivision_processNewOptions(SFInputOptionsDTO sFInputOptionsDTO) {
        this.nhW.b(sFInputOptionsDTO);
    }

    @llk
    public void InputBindingsDivision_defaultsButtonClicked() {
        this.nhX.dIv();
    }

    @llk
    public void InputBindingsDivision_presetChanged(int n) {
        this.nhX.UV(n);
    }

    @llk
    public void InputBindingsDivision_undoBindings() {
        this.nhX.dIx();
    }

    public static String a(jmu jmu2) {
        return SFInputBindingsDTO.nU(jjd.b(jmu2));
    }

    private static String b(jmu jmu2) {
        if (jmu2 == null) {
            return null;
        }
        String string = "";
        if (jmu2.dMM() != null) {
            String[] stringArray;
            for (String string2 : stringArray = jmu2.dMM().toArray(new String[0])) {
                string = string + string2 + ",";
            }
        }
        if (jmu2.dMK() != null) {
            string = string + jmu2.dMK() + ",";
        }
        return string;
    }

    public static String a(jmv.a a2) {
        return jjd.b(a2.iNW);
    }

    @llk
    public void AudioOptionsDivision_processNewOptions(SFAudioOptionsDTO sFAudioOptionsDTO) {
        this.nhY.b(sFAudioOptionsDTO);
    }

    @Override
    public boolean cGG() {
        return true;
    }

    @Override
    public boolean cGH() {
        return true;
    }

    @llk
    public void GameOptionsDivision_processNewOptions(SFGameOptionsDTO sFGameOptionsDTO) {
        this.nhZ.b(sFGameOptionsDTO);
    }

    public boolean dIg() {
        return this.nk("GO.AutoCloseWindows");
    }

    public void cEk() {
        this.a("updateStringAudioOptions", new Object[]{lxl.tsv.bD(new Object[0]).exA()});
        this.a("updateStringGameOptions", new Object[]{lxl.tsx.bD(new Object[0]).exA()});
        this.a("updateStringVideoOptions", new Object[]{lxl.tsw.bD(new Object[0]).exA()});
        this.a("updateStringInputOptions", new Object[]{lxl.tsy.bD(new Object[0]).exA()});
        this.a("updateStringInputBindings", new Object[]{lxl.tsz.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringDisplayFPS", new Object[]{lxn.tsI.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringDisplayPing", new Object[]{lxn.tsJ.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringTargetOpacity", new Object[]{lxn.tsK.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringPartyBGOpacity", new Object[]{lxn.tsL.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringDisplayName", new Object[]{lxn.tsN.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringHitSounds", new Object[]{lxn.tsO.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringSelfClanMemberIndicators", new Object[]{lxn.tsP.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringAlliedClanMemberIndicators", new Object[]{lxn.tsQ.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringHideHelmet", new Object[]{lxn.tsS.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringForceShowHelmets", new Object[]{lxn.tsT.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringShowEnemyNation", new Object[]{lxn.tsU.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringLanguage", new Object[]{lxn.tsV.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringVendorMarkers", new Object[]{lxn.tsW.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringCompactActionBar", new Object[]{lxn.tsX.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringShowBubbles", new Object[]{lxn.tsY.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringQueueActions", new Object[]{lxn.tsZ.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringAutoCloseWindows", new Object[]{lxn.tta.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringOnlyUseLeftAction", new Object[]{lxn.ttb.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringShowFloatingDamage", new Object[]{lxn.ttc.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringEnableSprintFOV", new Object[]{lxn.ttd.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringShowAdvisory", new Object[]{lxn.tte.bD(new Object[0]).exA()});
        this.a("GameOptions_updateStringShowActionBarShortcuts", new Object[]{lxn.ttf.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringResolution", new Object[]{lxq.tvU.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringFullscreen", new Object[]{lxq.tvV.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringVSync", new Object[]{lxq.tvW.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringGamma", new Object[]{lxq.tvX.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringPreset", new Object[]{lxq.tvY.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringCustom", new Object[]{lxq.tvZ.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringShadowMode", new Object[]{lxq.twa.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringShadowQuality", new Object[]{lxq.twb.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringShadowSmoothingQuality", new Object[]{lxq.twc.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringTextureFiltering", new Object[]{lxq.twd.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringEnablePostEffects", new Object[]{lxq.twe.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringEnableAntialias", new Object[]{lxq.twf.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringEnableObjectClipping", new Object[]{lxq.twg.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringEnableAutoOptimization", new Object[]{lxq.twh.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringEnableHighResolutionMap", new Object[]{lxq.twi.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringReflections", new Object[]{lxq.twj.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringSpecialFX", new Object[]{lxq.twk.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringLightShafts", new Object[]{lxq.twx.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringTextureQuality", new Object[]{lxq.twy.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringEnableDepthOfField", new Object[]{lxq.twz.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringShaderQuality", new Object[]{lxq.twA.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringShadowModeDisable", new Object[]{lxq.twl.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringShadowModeCharacterOnly", new Object[]{lxq.twm.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringShadowModeFull", new Object[]{lxq.twn.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringQualityLow", new Object[]{lxq.two.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringQualityMedium", new Object[]{lxq.twp.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringQualityHigh", new Object[]{lxq.twq.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringQualityMax", new Object[]{lxq.twr.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringTextureFilteringLinear", new Object[]{lxq.tws.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringTextureFilteringAnisotropic2x", new Object[]{lxq.twt.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringTextureFilteringAnisotropic4x", new Object[]{lxq.twu.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringTextureFilteringAnisotropic8x", new Object[]{lxq.twv.bD(new Object[0]).exA()});
        this.a("VideoOptionsDivision_updateStringTextureFilteringAnisotropicMax", new Object[]{lxq.tww.bD(new Object[0]).exA()});
        this.a("AudioOptionsDivision_updateStringLabelMasterVolume", new Object[]{lxm.tsB.bD(new Object[0]).exA()});
        this.a("AudioOptionsDivision_updateStringLabelMusicVolume", new Object[]{lxm.tsC.bD(new Object[0]).exA()});
        this.a("AudioOptionsDivision_updateStringLabelEnvironmentalVolume", new Object[]{lxm.tsD.bD(new Object[0]).exA()});
        this.a("AudioOptionsDivision_updateStringLabelWhisperSoundEnabled", new Object[]{lxm.tsE.bD(new Object[0]).exA()});
        this.a("AudioOptionsDivision_updateStringLabelFriendOnlineSoundEnabled", new Object[]{lxm.tsF.bD(new Object[0]).exA()});
        this.a("AudioOptionsDivision_updateStringLabelFriendOfflineSoundEnabled", new Object[]{lxm.tsG.bD(new Object[0]).exA()});
        this.a("InputOptionsDivision_updateStringLabelMouseXSensitivity", new Object[]{lxp.tvO.bD(new Object[0]).exA()});
        this.a("InputOptionsDivision_updateStringLabelMouseYSensitivity", new Object[]{lxp.tvP.bD(new Object[0]).exA()});
        this.a("InputOptionsDivision_updateStringcheckBoxInvertMouseYAxis", new Object[]{lxp.tvQ.bD(new Object[0]).exA()});
        this.a("InputOptionsDivision_updateStringcheckBoxMouseSmoothingEnabled", new Object[]{lxp.tvR.bD(new Object[0]).exA()});
        this.a("InputOptionsDivision_updateStringLabelMouseSmoothingAmount", new Object[]{lxp.tvS.bD(new Object[0]).exA()});
        this.a("InputBindingsDivision_updateStringLabelPresets", new Object[]{lxo.tth.bD(new Object[0]).exA()});
        this.nhX.dIw();
    }

    public static loz h(jmq jmq2) {
        return jjd.d(hso.cxK().cxR().dMc().l(jmq2));
    }

    public static loz d(jmr jmr2) {
        if (jmr2 == null) {
            return null;
        }
        String string = jjd.a(jmr2.iNW);
        if (string == null || string.isEmpty() || lhn.equal(string, "---")) {
            return null;
        }
        return lzb.tNl.bD(string);
    }

    public static String i(jmq jmq2) {
        return jjd.e(hso.cxK().cxR().dMc().l(jmq2));
    }

    public static String e(jmr jmr2) {
        if (jmr2 == null) {
            return null;
        }
        String string = jjd.a(jmr2.iNW);
        if (string == null || string.isEmpty() || lhn.equal(string, "---")) {
            return null;
        }
        return string;
    }

    public boolean dIh() {
        return this.nk("GO.ShowAdvisory");
    }

    public boolean dIi() {
        return this.nk("GO.ShowActionBarShortcuts");
    }

    public void tz(boolean bl) {
        this.q("GO.ShowActionBarShortcuts", bl);
        this.nhZ.tN(bl);
    }

    public /* synthetic */ hyn s(int n, int n2, String string) {
        return this.z(n, n2, string);
    }

    static /* synthetic */ dxr a(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr b(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv c(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr d(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr e(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv f(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr g(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr h(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv i(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr j(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr k(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv l(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr m(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr n(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr o(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr p(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv q(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ ldv r(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr s(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr t(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv u(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr v(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr w(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv x(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr y(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr z(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv A(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr B(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr C(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv D(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr E(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr F(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr G(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv H(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr I(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr J(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr K(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr L(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr M(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr N(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr O(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr P(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr Q(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv R(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr S(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr T(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv U(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr V(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr W(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv X(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr Y(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr Z(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv aa(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr ab(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr ac(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv ad(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr ae(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr af(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr ag(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr ah(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv ai(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr aj(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr ak(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv al(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr am(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv an(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr ao(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr ap(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ hso dIj() {
        return jjd.cFj();
    }

    static /* synthetic */ ldv aq(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr ar(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr as(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr at(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv au(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr av(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr aw(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr ax(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ hvj dIk() {
        return jjd.cxP();
    }

    static /* synthetic */ dxr ay(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv az(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr aA(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr aB(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv aC(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr aD(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr aE(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv aF(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr aG(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr aH(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv aI(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr aJ(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr aK(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr aL(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv aM(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr aN(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr aO(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ ldv aP(jjd jjd2) {
        return jjd2.GUID;
    }

    static /* synthetic */ dxr aQ(jjd jjd2) {
        return jjd2.MessageDelegator;
    }

    static /* synthetic */ dxr aR(jjd jjd2) {
        return jjd2.MessageDelegator;
    }
}

