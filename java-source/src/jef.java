/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 *  hzo
 *  iak
 */
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;
import spenefett.hid.gui.serialization.dto.SFTooltipBaseDTO;

public class jef
extends hzk
implements hwf {
    protected static hxg mTH = new hxg();
    protected a mTI = a.mTV;
    private static final String mTJ = "RMEL";
    private static final String mTK = "RMELBS";
    protected boolean mTL = false;
    int mTM = -1;
    int mTN = -1;
    int gNT = -1;
    protected boolean mTO = false;
    protected jmq mTP;
    protected static int mTQ = 0;
    int mTR = -1;

    public jef(boolean bl) {
        super("RadialMenu" + mTQ, "RadialMenu.swf");
        ++mTQ;
        this.a(hya.lmt, false);
        this.OQ(jnz.nGh);
        this.a(hxu.lle);
        this.a(hyb.lmG);
    }

    @llk
    protected void hide() {
        lfn.b(5, "SFRadialMenuWindow", "hide() scaleformlogger hide called");
        hso.cxK().cxP().h((hyn)this);
        hso.cxK().a(jnz.nFE);
        this.setVisible(false);
    }

    @llk
    protected void allocateAction(int n) {
        hwm hwm2 = mTH.l(this.mTM, this.mTN, this.gNT, n);
        if (hwm2 != null && hso.cxK().cxP().cyZ().cAx() != 4) {
            this.cHN().a(this.gNT, hwm2, n, false);
        }
        this.hide();
    }

    @llk
    protected void resetAction() {
        cxc cxc2 = jef.cxP().cyZ().cAd();
        this.cHN().a(this.gNT, (hwm)(cxc2 != null ? new hwv(cxc2) : null), -1, false);
        this.g(this.mTP);
        this.hide();
    }

    public void b(int n, int n2, int n3, boolean bl) {
        if (n != this.mTM || n2 != this.mTN || n3 != this.gNT || bl) {
            this.mTM = n;
            this.mTN = n2;
            this.gNT = n3;
            for (int i = 0; i < hxg.ljv; ++i) {
                hwm hwm2 = mTH.l(n, n2, n3, i);
                this.a(i, hwm2);
                hxg.a a2 = mTH.k(n, n2, n3, i);
                this.a("setConfigButton", new Object[]{i, 0, a2.ljy});
                this.a("setConfigButton", new Object[]{i, 1, a2.ljz});
                this.a("setConfigButton", new Object[]{i, 2, a2.ljA});
            }
        }
    }

    protected iak cHN() {
        hzo hzo2 = (hzo)jef.cxO();
        return hzo2.cHN();
    }

    protected void g(jmq jmq2) {
    }

    protected void cGz() {
        this.a("setScreenSize", new Object[]{Float.valueOf(this.cEN().W), Float.valueOf(this.cEN().H)});
    }

    public void initialize() {
        super.initialize();
        jef.cxP().cyZ().a((hwf)this);
    }

    public void cleanUp() {
        super.cleanUp();
        if (jef.cxP() != null && jef.cxP().cyZ() != null) {
            jef.cxP().cyZ().b((hwf)this);
        }
    }

    protected void cBa() {
        super.cBa();
        this.cGz();
        boolean bl = this == jef.cyJ().cHX() || this == jef.cyJ().cHY();
        this.a("showConfigButtons", new Object[]{bl});
        if (this.mTM != -1) {
            this.b(this.mTM, this.mTN, this.gNT, true);
        }
    }

    protected void cEa() {
        this.cGz();
    }

    @Override
    protected void cDZ() {
        super.cDZ();
    }

    protected void b(int n, int n2, int n3, String string) {
        if (hso.cxK().cxN() == jnz.nFH) {
            this.a("handleMouseMove", new Object[]{n, n2});
        }
    }

    public void ccp() {
        this.a("applyChanges", new Object[0]);
    }

    protected void cEl() {
        super.cEl();
    }

    public void b(int n, int n2, int n3, int n4, hwm hwm2) {
        jef.cyJ().cHV().B(mTJ + String.valueOf(n) + String.valueOf(n2) + String.valueOf(n3) + String.valueOf(n4), hwm2 == null ? "" : hwm2.toString());
    }

    public void b(int n, int n2, int n3, int n4, int n5, boolean bl) {
        jef.cyJ().cHV().B(mTK + String.valueOf(n) + String.valueOf(n2) + String.valueOf(n3) + String.valueOf(n4) + String.valueOf(n5), bl ? "1" : "0");
    }

    public void a(int n, hwm hwm2) {
        if (this.mTM == -1) {
            return;
        }
        SFGUIElementDTO sFGUIElementDTO = null;
        if (hwm2 != null) {
            sFGUIElementDTO = hwm2.cBj();
            sFGUIElementDTO.id = n;
            if (hwm2.cBk() < 0.0f) {
                sFGUIElementDTO.progress = -1.0;
            }
            sFGUIElementDTO.progressColor = 0xFF0000;
            sFGUIElementDTO.progressTrackColor = 0xFFFFFF;
        }
        this.a("setAllocateActionInfo", new Object[]{n, sFGUIElementDTO});
    }

    @Override
    public boolean b(hzk hzk2, ifg ifg2, String string) {
        hwv hwv2;
        String[] stringArray = string.split(";");
        if (!stringArray[0].equals("slot")) {
            return false;
        }
        int n = Integer.valueOf(stringArray[1]);
        ifh ifh2 = (ifh)ifg2;
        hwm hwm2 = ifh2.cQm();
        if (hwm2 instanceof hwv && !(hwv2 = (hwv)hwm2).cCo()) {
            return false;
        }
        if (hzk2 instanceof iew) {
            hwm2 = hwm2.cBl();
        }
        hwv2 = jef.cyJ();
        int n2 = hso.cxK().cxP().cyZ().ki().getIndex();
        for (int i = 0; i < jej.mUd; ++i) {
            for (int j = 0; j < 2; ++j) {
                hwm hwm3;
                jef jef2 = j == 0 ? hwv2.cHX() : hwv2.cHY();
                jef jef3 = null;
                if (n2 == this.mTM) {
                    jef jef4 = jef3 = j == 0 ? hwv2.cHV() : hwv2.cHW();
                }
                if ((hwm3 = mTH.l(this.mTM, this.mTN, j, i)) == null || !hwm3.b(hwm2)) continue;
                jef2.a(i, null);
                if (jef3 == null) continue;
                jef3.a(i, null);
            }
        }
        this.a(n, hwm2);
        if (n2 == this.mTM) {
            jef jef5 = null;
            jef5 = this.gNT == 0 ? jef.cyJ().cHV() : jef.cyJ().cHW();
            jef5.a(n, hwm2);
            jef.cyJ().cHN().cKp();
        }
        this.a(hxz.lmf);
        return true;
    }

    @Override
    protected boolean a(hzk hzk2, ifg ifg2, String string) {
        return true;
    }

    @Override
    protected void c(ifg ifg2) {
        this.a(hxz.lmg);
    }

    public void setAction(int n) {
        this.gNT = n;
    }

    protected void cQK() {
        hwm hwm2;
        for (int i = 0; i < hxg.ljv; ++i) {
            hwm2 = mTH.l(this.mTM, this.mTN, this.gNT, i);
            if (hwm2 == null) continue;
            this.a("updateSlot", new Object[]{i, -1, hwm2.getState()});
        }
        cxc cxc2 = hso.cxK().cxP().cyZ().cAd();
        hwm2 = null;
        if (cxc2 != null) {
            hwm2 = new hwv(cxc2);
        }
        this.g(hwm2);
    }

    public void cEc() {
        if (!this.cEU()) {
            this.cQK();
        }
    }

    protected void b(jnz jnz2, jnz jnz3) {
        if (this.cEU()) {
            this.cQK();
        }
    }

    @Override
    public void cf(cxc cxc2) {
    }

    @Override
    public void ck(cxc cxc2) {
    }

    @Override
    public void cl(cxc cxc2) {
    }

    @Override
    public void a(cxc cxc2, float f, double d2) {
        if (this.cEU()) {
            for (int i = 0; i < hxg.ljv; ++i) {
                hwm hwm2 = mTH.l(this.mTM, this.mTN, this.gNT, i);
                if (hwm2 == null || !hwm2.a(cxc2, f, this.MessageDelegator.arc().lpr)) continue;
                this.a("updateSlot", new Object[]{i, Float.valueOf(hwm2.cBk()), hwm2.getState()});
            }
        }
    }

    @Override
    public void c(cxc cxc2, boolean bl) {
        for (int i = 0; i < hxg.ljv; ++i) {
            hwm hwm2 = mTH.l(this.mTM, this.mTN, this.gNT, i);
            if (hwm2 == null || !hwm2.d(cxc2, bl)) continue;
            this.a("updateSlot", new Object[]{i, Float.valueOf(hwm2.cBk()), hwm2.getState()});
        }
    }

    public static hxg dzq() {
        return mTH;
    }

    @Override
    protected boolean og(String string) {
        if (this == jef.cyJ().cHV() || this == jef.cyJ().cHW()) {
            return false;
        }
        String[] stringArray = string.split(";");
        if (!stringArray[0].equals("slot")) {
            return false;
        }
        int n = Integer.valueOf(stringArray[1]);
        hwm hwm2 = mTH.l(this.mTM, this.mTN, this.gNT, n);
        return hwm2 != null;
    }

    @Override
    protected ifg of(String string) {
        int n;
        String[] stringArray = string.split(";");
        if (!stringArray[0].equals("slot")) {
            return null;
        }
        this.mTR = n = Integer.valueOf(stringArray[1]).intValue();
        float f = Float.valueOf(stringArray[2]).floatValue();
        float f2 = Float.valueOf(stringArray[3]).floatValue();
        hwm hwm2 = mTH.l(this.mTM, this.mTN, this.gNT, n);
        ifh ifh2 = new ifh(hwm2, (int)f, (int)f2);
        return ifh2;
    }

    @Override
    protected void d(ifg ifg2) {
        this.a(this.mTR, null);
        int n = hso.cxK().cxP().cyZ().ki().getIndex();
        if (n == this.mTM) {
            jef jef2 = null;
            jef2 = this.gNT == 0 ? jef.cyJ().cHV() : jef.cyJ().cHW();
            jef2.a(this.mTR, null);
            jef.cyJ().cHN().cKp();
        }
    }

    public hyn s(int n, int n2, String string) {
        if (string == null) {
            return null;
        }
        if (this == jef.cyJ().cHV() || this == jef.cyJ().cHW()) {
            return null;
        }
        String[] stringArray = string.split(";");
        if (stringArray[0].startsWith("button")) {
            String string2 = stringArray[0];
            if (string2.equals("button0")) {
                string2 = lxv.tzb.bD(new Object[0]).exA();
            } else if (string2.equals("button1")) {
                string2 = lxv.tzc.bD(new Object[0]).exA();
            } else if (string2.equals("button2")) {
                string2 = lxv.tzd.bD(new Object[0]).exA();
            } else {
                return null;
            }
            SFTooltipBaseDTO sFTooltipBaseDTO = iae.os(string2);
            return new iae(sFTooltipBaseDTO, n, n2, 18, 18);
        }
        if (!stringArray[0].equals("slot")) {
            return null;
        }
        int n3 = Integer.valueOf(stringArray[1]);
        hwm hwm2 = jef.dzq().l(this.mTM, this.mTN, this.gNT, n3);
        if (hwm2 == null) {
            return null;
        }
        if (!(hwm2 instanceof hwv)) {
            return null;
        }
        hwv hwv2 = (hwv)hwm2;
        return new iag(hwv2.zg(), n, n2, true);
    }

    protected boolean d(int n, int n2, String string) {
        return true;
    }

    @Override
    public void i(cxc cxc2, int n) {
    }

    public void g(hwm hwm2) {
        if (hwm2 != null) {
            this.a("setDefaultActionElement", new Object[]{hwm2.cBj()});
        } else {
            this.a("resetDefaultActionElement", new Object[0]);
        }
    }

    @llk
    public void onConfigButtonClicked(int n, int n2, boolean bl) {
        hxg.a a2 = jef.dzq().k(this.mTM, this.mTN, this.gNT, n);
        if (n2 == 0) {
            a2.ljy = bl;
        } else if (n2 == 1) {
            a2.ljz = bl;
        } else if (n2 == 2) {
            a2.ljA = bl;
        }
        this.b(this.mTM, this.mTN, this.gNT, n, n2, bl);
    }

    public hxg.a TT(int n) {
        return mTH.k(this.mTM, this.mTN, this.gNT, n);
    }
}

