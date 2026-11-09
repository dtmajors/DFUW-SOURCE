/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  hyn
 */
import spenefett.hid.gui.serialization.dto.SFGUIElementDTO;

public class ifq
extends hzk {
    public static final int lBN = 8;
    private static final String lRJ = "TrackedFeat";
    private hwn[] lRK = new hwn[8];
    private boolean lRL = true;
    private boolean lRM = false;

    public ifq() {
        super("FeatsBar", "FeatsBar.swf");
        this.OQ(0xFFFFFFFF & ~(jnz.nGw | jnz.nGx));
        this.a(hya.lmp, true);
        this.a(hyb.lmC);
        for (int i2 = 0; i2 < 8; ++i2) {
            this.a(lRJ + i2, hsu.ldg, -1);
        }
    }

    public boolean QE(int n) {
        ign ign2;
        int n2 = this.QI(n);
        if (n2 < 0) {
            return false;
        }
        this.QH(n2);
        ign ign3 = ign2 = ifq.cyJ().cHR() != null ? igq.QK(n) : null;
        return ign2 != null;
    }

    public boolean QF(int n) {
        int n2 = this.QI(n);
        if (n2 < 0) {
            return false;
        }
        this.a(n2, null);
        return true;
    }

    public void QG(int n) {
        int n2 = this.QI(n);
        if (n2 >= 0) {
            return;
        }
        int n3 = this.cSH();
        if (n3 < 0) {
            n3 = 0;
        }
        this.dE(n3, n);
    }

    public hyn s(int n, int n2, String string) {
        if (this.lRM || ifq.cxP().czu()) {
            return null;
        }
        if (string == null) {
            return null;
        }
        hwl hwl2 = new hwl(string);
        int n3 = this.QI(hwl2.cck);
        if (n3 < 0) {
            return null;
        }
        ifq.cyJ().X(hwl2.cck, true);
        return null;
    }

    public void cSE() {
        this.a("showFeatsUnlocked", new Object[0]);
    }

    public ign cSF() {
        int n = this.cSJ();
        return n >= 0 ? this.lRK[n].cBm() : null;
    }

    public void cSG() {
        if (this.lRL) {
            return;
        }
        this.lRL = true;
        this.cSK();
    }

    protected void cBa() {
        super.cBa();
        for (int i2 = 0; i2 < 8; ++i2) {
            Integer n = this.nh(lRJ + i2);
            if (n != null && n >= 0) {
                this.dE(i2, n);
            }
            this.QH(i2);
        }
    }

    protected void g(int n, int n2, String string) {
        ifq.cyJ().cHU().cSp();
        this.lRM = true;
    }

    protected void e(int n, int n2, String string) {
        this.lRM = false;
    }

    @Override
    protected boolean og(String string) {
        hwl hwl2 = new hwl(string);
        return this.QI(hwl2.cck) >= 0;
    }

    @Override
    protected ifg of(String string) {
        hwk hwk2 = new hwk(string);
        int n = this.QI(hwk2.getId());
        if (n < 0) {
            return null;
        }
        ifq.cyJ().cHU().cSp();
        this.lRM = false;
        ifh ifh2 = new ifh(this.lRK[n], (int)hwk2.cBe(), (int)hwk2.cBf());
        return ifh2;
    }

    @Override
    protected boolean a(hzk hzk2, ifg ifg2, String string) {
        if (string == null) {
            return false;
        }
        if (hzk2 != this && hzk2 != ifq.cyJ().cIJ() && hzk2 != ifq.cyJ().cHU()) {
            return false;
        }
        if (string.startsWith("slot")) {
            return true;
        }
        hwl hwl2 = new hwl(string);
        return this.QI(hwl2.cck) >= 0;
    }

    @Override
    protected boolean b(hzk hzk2, ifg ifg2, String string) {
        this.cqF();
        ifg2.cqF();
        if (string == null) {
            return false;
        }
        if (hzk2 != this && hzk2 != ifq.cyJ().cIJ() && hzk2 != ifq.cyJ().cHU()) {
            return false;
        }
        if (string.startsWith("slot")) {
            hwn hwn2 = (hwn)((ifh)ifg2).cQm();
            int n = this.QI(hwn2.cBm().getId());
            if (n >= 0) {
                this.a(n, null);
            }
            int n2 = this.qe(string);
            this.a(n2, hwn2);
            ign ign2 = igq.QK(hwn2.cBm().getId());
            return true;
        }
        hwl hwl2 = new hwl(string);
        int n = this.QI(hwl2.cck);
        if (n >= 0) {
            int n3;
            hwn hwn3 = (hwn)((ifh)ifg2).cQm();
            int n4 = this.QI(hwn3.cBm().getId());
            if (n4 == n) {
                return true;
            }
            if (n4 >= 0) {
                this.a(n4, null);
            }
            if (this.lRK[n] != null && (n3 = this.cSH()) >= 0) {
                this.a(n3, this.lRK[n]);
                ign ign3 = igq.QK(this.lRK[n].cBm().getId());
            }
            this.a(n, hwn3);
            ign ign4 = igq.QK(hwn3.cBm().getId());
            return true;
        }
        return false;
    }

    @Override
    protected void d(ifg ifg2) {
        if (this.intersects(ifg2.cSh(), ifg2.cSi())) {
            return;
        }
        ifh ifh2 = (ifh)ifg2;
        hwn hwn2 = (hwn)ifh2.cQm();
        int n = this.QI(hwn2.cBm().getId());
        this.a(n, null);
    }

    private void QH(int n) {
        if (this.lRK[n] != null) {
            ign ign2 = this.lRK[n].cBm();
            SFGUIElementDTO sFGUIElementDTO = igq.QK(ign2.getId()).cBj();
            if (ign2.cTI() != null) {
                sFGUIElementDTO.iconName = ign2.cTI().cTp();
            }
            this.a("setItem", new Object[]{n, sFGUIElementDTO});
            if (n == 0 && !ifq.cxP().cyJ().cHT().a(igm.lSL)) {
                ifq.cxP().cyJ().cHT().c(ign2);
            }
        } else {
            this.a("setItem", new Object[]{n, null});
            if (n == 0 && !ifq.cxP().cyJ().cHT().a(igm.lSL)) {
                ifq.cxP().cyJ().cHT().cSs();
            }
        }
    }

    private void a(int n, hwn hwn2) {
        this.lRK[n] = hwn2;
        this.QH(n);
        this.w(lRJ + n, hwn2 != null ? hwn2.cBm().getId() : -1);
        this.cSK();
    }

    private int QI(int n) {
        for (int i2 = 0; i2 < 8; ++i2) {
            if (this.lRK[i2] == null || this.lRK[i2].cBm().getId() != n) continue;
            return i2;
        }
        return -1;
    }

    private int cSH() {
        for (int i2 = 0; i2 < 8; ++i2) {
            if (this.lRK[i2] != null) continue;
            return i2;
        }
        return -1;
    }

    private int qe(String string) {
        return Integer.valueOf(string.substring(4, 5));
    }

    @llk
    private void _flashFxFinished(int n) {
        ign ign2;
        ign ign3 = ign2 = ifq.cyJ().cHR() != null ? igq.QK(n) : null;
        if (ign2 == null) {
            return;
        }
        if (!ign2.isCompleted()) {
            return;
        }
        int n2 = this.QI(n);
        if (n2 < 0) {
            return;
        }
        this.a(n2, null);
    }

    private void dE(int n, int n2) {
        ign ign2 = igq.QK(n2);
        if (ign2 == null) {
            return;
        }
        this.a(n, ign2.cTs());
    }

    private void QJ(int n) {
        this.a("activateTrackingFeat", new Object[]{n});
    }

    private void cSI() {
        this.a("deactivateTrackingFeat", new Object[0]);
    }

    public int cSJ() {
        for (int i2 = 0; i2 < this.lRK.length; ++i2) {
            hwn hwn2 = this.lRK[i2];
            if (hwn2 == null) continue;
            return i2;
        }
        return -1;
    }

    private void cSK() {
        if (!this.lRL) {
            return;
        }
        int n = this.cSJ();
        if (n >= 0) {
            this.QJ(n);
            ifq.cyJ().cHT().c(this.lRK[n].cBm());
        } else {
            this.cSI();
            ifq.cyJ().cHT().cSs();
            if (!ifq.cyJ().cIK().cTh()) {
                ifq.cyJ().cHT().a(ifm.lRr);
            }
        }
    }
}

