/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cew
 *  cxd
 *  jps
 */
public class jqd
extends btk
implements cek {
    public static final int nRB = 1;
    public static final int nRC = 2;
    public static final int nRD = 3;
    public static final int nRE = 4;
    private final jps bqG;
    private final jpx hcu;
    private cew dLR = null;
    private final jqc nRF;
    private final les aqN = lea.enZ();
    private double eqn = 0.0;
    private final double eql = 0.7;
    int nRG = 2;

    public jqd(jpx jpx2, jps jps2) {
        this.bqG = jps2;
        this.hcu = jpx2;
        this.nRF = new jqc(this.hcu);
    }

    public final cew axF() {
        return this.dLR;
    }

    public final void b(cew cew2) {
        this.dLR = cew2;
    }

    public final jqc dQe() {
        return this.nRF;
    }

    public final ldv aKS() {
        return ((ceg)this.dLR.aJN()).aKS();
    }

    public final int aLa() {
        return ((ceg)this.dLR.aJN()).aLa();
    }

    public final byv aEP() {
        if (this.dLR == null) {
            return null;
        }
        return this.dLR.aLU().aEP();
    }

    public final void dQT() {
        float f;
        ljq ljq2 = null;
        if (this.nRF.dQR()) {
            f = jqb.nRl;
            if (this.nRF.dQS()) {
                if (this.nRF.nRw) {
                    f = jqb.nRm;
                } else {
                    assert (this.nRF.nRx);
                    f = jqb.nRk;
                }
            } else {
                f = jqb.nRl;
            }
            f *= (float)this.MessageDelegator.arc().qwh;
            ljq2 = new ljq();
            if (this.nRF.ecU[0]) {
                ljq2.x += f;
            }
            if (this.nRF.ecU[1]) {
                ljq2.x -= f;
            }
            if (this.nRF.ecU[2]) {
                ljq2.y -= f;
            }
            if (this.nRF.ecU[3]) {
                ljq2.y += f;
            }
            if (this.nRF.ecU[4]) {
                ljq2.rlV += f;
            }
            if (this.nRF.ecU[5]) {
                ljq2.rlV -= f;
            }
        }
        if (ljq2 != null) {
            f = ljq2.x;
            float f2 = ljq2.y;
            float f3 = ljq2.rlV;
            ljq2.x = -f2;
            ljq2.y = f3;
            ljq2.rlV = -f;
        } else {
            ljq2 = ljq.roQ;
        }
        if (this.dLR.aAG() != null && !this.dLR.aMk()) {
            ljq ljq3 = this.dLR.aAG().aw().eq(ljq2);
            kky kky2 = (kky)this.MessageDelegator.h(1025);
            kky2.Rs = this.dLR.aAG().axa();
            kky2.pHF = 4;
            kky2.pHG = ljq3.x;
            kky2.pHH = ljq3.y;
            kky2.pHI = ljq3.rlV;
            kky2.rb = 0.0f;
            kky2.rc = 0.0f;
            kky2.rd = 0.0f;
            kky2.pHJ = 1.0f;
            kky2.ts(this.GUID);
            kky2.wD(false);
            this.MessageDelegator.a(kky2);
        }
    }

    public final void dQU() {
        boolean[] blArray = new boolean[6];
        System.arraycopy(this.nRF.ecU, 0, blArray, 0, blArray.length);
        if (this.nRF.nRr) {
            blArray[5] = true;
        }
        if (this.nRF.nRt) {
            // empty if block
        }
        if (this.nRF.nRs) {
            blArray[0] = true;
        }
        if (blArray[0] && blArray[1]) {
            blArray[0] = false;
            blArray[1] = false;
        }
        if (blArray[2] && blArray[3]) {
            blArray[2] = false;
            blArray[3] = false;
        }
        if (blArray[4] && blArray[5]) {
            blArray[4] = false;
            blArray[5] = false;
        }
        int n = this.aLa();
        byv byv2 = this.aEP();
        if (!(this.aFd() || byv2.Uu() && n != 1 && n != 5 && n != 6 && n != 7)) {
            if (byv2.aEy()) {
                this.n(blArray);
            } else {
                this.m(blArray);
                if (this.nRF.nRz.nPZ) {
                    this.hcu.amX();
                    this.nRF.nRz.nPZ = false;
                    this.dLR.amX();
                }
            }
        }
        this.nRF.nRp = this.nRF.nRn;
        this.nRF.nRq = this.nRF.nRo;
        this.nRF.nRt = false;
    }

    private boolean a(boolean[] blArray, int n) {
        for (int i = 0; i < n; ++i) {
            if (!blArray[i]) continue;
            return true;
        }
        return false;
    }

    private int dQV() {
        if (this.aEP().Uv()) {
            return cxd.fHA;
        }
        return cxd.fHu;
    }

    private int VG(int n) {
        byv byv2 = this.aEP();
        assert (!byv2.aEy());
        switch (byv2.vO()) {
            case 1: {
                int n2 = this.aLa();
                if (n2 == 1) {
                    return cxd.fHG;
                }
                if (n2 == 5) {
                    return cxd.fHL;
                }
                if (n2 == 6) {
                    return cxd.fHM;
                }
                if (n2 == 7) {
                    return cxd.fHL;
                }
                if (n2 == 8) {
                    return -1;
                }
                return -1;
            }
            case 2: {
                return cxd.fHq;
            }
            case 3: {
                return cxd.fHr;
            }
            case 4: {
                switch (n) {
                    case 2: {
                        return cxd.fHD;
                    }
                    case 3: 
                    case 4: {
                        if (this.dLR.aJx()) {
                            return cxd.fHD;
                        }
                        return cxd.fHB;
                    }
                }
                return -1;
            }
            case 6: {
                switch (n) {
                    case 2: {
                        return cxd.fHK;
                    }
                    case 3: 
                    case 4: {
                        if (this.dLR.aJx()) {
                            return cxd.fHK;
                        }
                        return cxd.fHE;
                    }
                }
                return -1;
            }
        }
        return -1;
    }

    private int VH(int n) {
        byv byv2 = this.aEP();
        assert (byv2.aEy());
        switch (byv2.vO()) {
            case 1: {
                int n2 = this.aLa();
                if (n2 == 1) {
                    return cxd.fHG;
                }
                return -1;
            }
            case 2: {
                return cxd.fHq;
            }
            case 4: {
                switch (n) {
                    case 2: 
                    case 3: 
                    case 4: {
                        return cxd.fHw;
                    }
                }
                return -1;
            }
            case 7: {
                switch (n) {
                    case 2: 
                    case 3: 
                    case 4: {
                        return cxd.fHI;
                    }
                }
                return -1;
            }
        }
        return -1;
    }

    private void m(boolean[] blArray) {
        assert (blArray != null);
        boolean bl = false;
        if (this.a(blArray, 6)) {
            boolean bl2;
            boolean bl3;
            if (blArray[5]) {
                this.nRF.nRn = 2;
            } else if (blArray[1]) {
                this.nRF.nRn = 2;
            } else if (blArray[2] || blArray[3]) {
                this.nRF.nRn = this.nRF.nRx ? 2 : 3;
                if (this.aEP().Uv() && !blArray[0] && !blArray[1]) {
                    blArray[0] = true;
                    this.nRF.nRn = 2;
                }
            } else if (this.nRF.dQS()) {
                assert (this.nRF.nRw != this.nRF.nRx);
                this.nRF.nRn = this.nRF.nRw ? 4 : 2;
            } else {
                this.nRF.nRn = this.nRF.nRx ? 2 : 3;
            }
            boolean bl4 = true;
            if (this.nRF.nRt) {
                bl4 = true;
            } else if (!this.nRF.nRy) {
                bl4 = true;
            } else if (this.nRF.nRn == this.nRF.nRp) {
                bl4 = false;
            } else {
                bl3 = this.nRF.nRp == 4 || this.nRF.nRp == 3;
                bl2 = this.nRF.nRn == 4 || this.nRF.nRn == 3;
                bl4 = !bl3 || !bl2;
            }
            this.nRF.nRo = this.VG(this.nRF.nRn);
            if (bl4) {
                this.nRF.nRA = false;
            }
            if (!bl4 && !this.nRF.nRA) {
                if (this.dLR != null && this.dLR.aJz() != null && this.dLR.aJz().yI(this.nRF.nRo)) {
                    this.nRF.nRA = true;
                } else {
                    bl4 = true;
                }
            }
            boolean bl5 = bl3 = this.nRF.nRn == 4;
            if (this.nRF.nRo == cxd.fHB) {
                bl3 = true;
            }
            bl2 = this.b(blArray, 4);
            boolean bl6 = this.b(blArray, 5);
            if (bl4) {
                int n = this.aLa();
                if (!bl2 && !bl6 || n == 6) {
                    this.a(this.nRF.nRo, blArray, bl3);
                }
            } else {
                this.b(this.nRF.nRo, blArray, bl3);
            }
            byv byv2 = this.aEP();
            if (this.nRF.ecU[4]) {
                if (byv2.vO() == 2) {
                    this.a(this.nRF.nRo, blArray, bl3);
                } else {
                    int n = this.dQV();
                    this.VD(n);
                }
                this.nRF.ecU[4] = false;
                bl = true;
            } else if (this.nRF.ecU[5]) {
                if (!this.nRF.nPX && !byv2.Uv()) {
                    this.dQX();
                }
            } else {
                bl = true;
            }
            this.nRF.nRy = !bl6;
        } else if (this.nRF.nRy) {
            bl = true;
            this.VI(this.nRF.nRq);
            this.nRF.nRy = false;
            this.nRF.nRn = 1;
            this.nRF.nRo = 0;
        } else {
            bl = true;
        }
        if (bl && this.nRF.nPX && !this.nRF.nRr) {
            this.dQZ();
        }
    }

    private void n(boolean[] blArray) {
        assert (blArray != null);
        if (this.a(blArray, 6)) {
            this.nRF.nRn = blArray[4] || blArray[5] ? 3 : (blArray[2] || blArray[3] ? 3 : (blArray[1] ? 3 : (this.nRF.nRw ? 4 : 3)));
            boolean bl = !this.nRF.nRy;
            this.nRF.nRo = this.VH(this.nRF.nRn);
            if (this.nRF.nRo >= 0) {
                boolean bl2;
                boolean bl3 = bl2 = this.nRF.nRn == 4;
                if (bl) {
                    this.a(this.nRF.nRo, blArray, bl2);
                } else {
                    this.b(this.nRF.nRo, blArray, bl2);
                }
                this.nRF.nRy = true;
            }
        } else if (this.nRF.nRy) {
            this.VI(this.nRF.nRq);
            this.nRF.nRy = false;
            this.nRF.nRn = 1;
            this.nRF.nRo = 0;
        }
    }

    private boolean aFd() {
        if (this.dLR == null) {
            return true;
        }
        return this.dLR.aMh().aFd();
    }

    private boolean dQW() {
        byv byv2 = this.dLR.aLU().aEP();
        switch (byv2.vQ()) {
            case 1: {
                return false;
            }
            case 3: {
                return true;
            }
            case 2: {
                return false;
            }
            case 4: {
                return false;
            }
        }
        lfn.b(5, "SFPlayerMovementHandler", "isCreateFirstPersonCameraController() Unhandled weaponmode provided: '" + byv2.aEs() + "'");
        return false;
    }

    private boolean bPN() {
        return this.dLR.aJB().bkm();
    }

    private boolean b(boolean[] blArray, int n) {
        for (int i = 0; i < 6; ++i) {
            if (!(i == n ? !blArray[i] : blArray[i])) continue;
            return false;
        }
        return true;
    }

    private void a(boolean bl, boolean[] blArray, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (bl) {
            stringBuilder.append("Start [");
        } else {
            stringBuilder.append("Update [");
        }
        if (blArray[0]) {
            stringBuilder.append(" Forward");
        }
        if (blArray[1]) {
            stringBuilder.append(" Backward");
        }
        if (blArray[2]) {
            stringBuilder.append(" Left");
        }
        if (blArray[3]) {
            stringBuilder.append(" Right");
        }
        switch (n) {
            case 2: {
                stringBuilder.append(" ] Slow");
                break;
            }
            case 3: {
                stringBuilder.append(" ] Normal");
                break;
            }
            case 4: {
                stringBuilder.append(" ] Fast");
                break;
            }
            default: {
                return;
            }
        }
    }

    private void n(ldv ldv2, int n, int n2) {
        assert (ldv2 != null);
        assert (n > 0);
        assert (n2 > 0);
        fix fix2 = (fix)this.MessageDelegator.h(2822, this.GUID, ldv2);
        fix2.bpX = n;
        fix2.bpZ = n2;
        this.MessageDelegator.F(fix2);
    }

    private void VD(int n) {
        assert (n > 0);
        gjt gjt2 = (gjt)this.MessageDelegator.h(4617, this.GUID, this.dLR.getGUID());
        gjt2.SkillType = n;
        this.MessageDelegator.F(gjt2);
    }

    private void VI(int n) {
        assert (n > 0);
        gjv gjv2 = (gjv)this.MessageDelegator.h(4618, this.GUID, this.dLR.getGUID());
        gjv2.SkillType = n;
        gjv2.jjt = false;
        gjv2.jju = false;
        this.MessageDelegator.F(gjv2);
    }

    public boolean dQX() {
        if (this.nRF.nPX) {
            assert (false);
            return false;
        }
        if (!this.dQY()) {
            return false;
        }
        this.n(this.dLR.getGUID(), 5, 3);
        this.nRF.nPX = true;
        return true;
    }

    public boolean dQY() {
        double d2 = this.MessageDelegator.arc().rgz;
        if (d2 < this.eqn) {
            return false;
        }
        this.eqn = d2 + 0.7;
        return true;
    }

    private void a(int n, boolean[] blArray, boolean bl) {
        assert (blArray != null);
        if (n <= 0) {
            return;
        }
        gjt gjt2 = (gjt)this.MessageDelegator.h(4617, this.GUID, this.dLR.getGUID());
        gjt2.SkillType = n;
        gjt2.aZF = 3;
        gjt2.ecU = blArray;
        gjt2.gcv = bl;
        this.MessageDelegator.F(gjt2);
    }

    public void dQZ() {
        if (!this.nRF.nPX) {
            assert (false);
            return;
        }
        this.n(this.dLR.getGUID(), 5, 6);
        this.nRF.nPX = false;
    }

    private void dRa() {
        assert (this.nRF.nRy);
        assert (this.nRF.nRq > 0);
        this.VI(this.nRF.nRq);
        this.nRF.nRy = false;
        this.nRF.nRn = 1;
        this.nRF.nRo = 0;
    }

    private void b(int n, boolean[] blArray, boolean bl) {
        assert (blArray != null);
        if (n <= 0) {
            lfn.b(5, "SFPlayerMovementHandler", "updateMovementSkill() SkillType is invalid.");
            return;
        }
        gjz gjz2 = (gjz)this.MessageDelegator.h(4619, this.GUID, this.dLR.getGUID());
        gjz2.SkillType = n;
        gjz2.aZF = 3;
        gjz2.ecU = blArray;
        gjz2.gcv = bl;
        this.MessageDelegator.F(gjz2);
    }

    @Override
    public void aLz() {
        this.nRF.nRt = true;
    }

    @Override
    public final void pp(int n) {
        switch (n) {
            case 1: 
            case 2: {
                break;
            }
            case 3: {
                if (this.bqG == null) break;
                this.bqG.ag(0.0f, 0.0f);
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                break;
            }
            default: {
                lfn.b(5, "SFPlayerMovementHandler", "notifyFlyingModeChanged() Unhandled flyingmode provided: '" + byw.nR(n) + "'");
                return;
            }
        }
    }

    @Override
    public final void oU(int n) {
        switch (n) {
            case 1: {
                this.hcu.uy(this.dQW());
                break;
            }
            case 2: {
                this.nRF.nRr = false;
                this.nRF.nRs = false;
                this.bqG.a(jps.a.nPD);
                break;
            }
            case 3: {
                this.nRF.nRr = false;
                this.nRF.nRs = false;
                this.bqG.a(jps.a.nPB);
                break;
            }
            case 4: {
                break;
            }
            case 5: {
                this.nRF.nRr = false;
                this.nRF.nRs = false;
                break;
            }
            default: {
                lfn.b(5, "SFPlayerMovementHandler", "notifyLifeModeChanged() Unhandled lifemode provided: '" + byw.nT(n) + "'");
                return;
            }
        }
    }

    @Override
    public final void b(int n, int n2, ldv ldv2, int n3) {
        byv byv2 = this.aEP();
        if (byv2 == null) {
            lfn.b(5, "SFPlayerMovementHandler", "notifyPostureModeChanged() ObjectState is null.");
            return;
        }
        if (this.nRF.nRy) {
            this.dRa();
        }
        block0 : switch (n2) {
            case 1: {
                if (ldv2 == null) {
                    lfn.b(5, "SFPlayerMovementHandler", "notifyPostureModeChanged(ATTACHED) ExternalObjectGUID is null.");
                    return;
                }
                switch (n3) {
                    case 1: {
                        this.bqG.a(jps.a.nPz);
                        this.bqG.td(ldv2);
                        break block0;
                    }
                    case 3: {
                        this.bqG.a(jps.a.nPA);
                        break block0;
                    }
                    case 5: {
                        this.bqG.a(jps.a.nPF);
                        break block0;
                    }
                    case 6: {
                        this.bqG.a(jps.a.nPF);
                        break block0;
                    }
                    case 7: 
                    case 8: {
                        this.bqG.a(jps.a.nPF);
                        break block0;
                    }
                }
                lfn.b(5, "SFPlayerMovementHandler", "notifyPostureModeChanged(ATTACHED) Invalid ExternalObjectType provided: " + n3);
                assert (false);
                return;
            }
            case 2: {
                break;
            }
            case 3: {
                this.bqG.ut(true);
                break;
            }
            case 4: {
                if (ldv2 == null) {
                    lfn.b(5, "SFPlayerMovementHandler", "notifyPostureModeChanged(MOUNTED) ExternalObjectGUID is null.");
                    return;
                }
                switch (n3) {
                    case 4: {
                        this.bqG.a(jps.a.nPG);
                        break;
                    }
                    default: {
                        lfn.b(5, "SFPlayerMovementHandler", "notifyPostureModeChanged(MOUNTED) Invalid ExternalObjectType provided: " + n3);
                        assert (false);
                        return;
                    }
                }
                this.bqG.td(ldv2);
                break;
            }
            case 5: {
                this.hcu.a(jpx.a.nQJ);
                this.bqG.a(jps.a.nPD);
                break;
            }
            case 6: {
                if (byv2.Uu()) {
                    assert (ldv2 != null);
                    n3 = 0;
                    ldv2 = null;
                } else if (byv2.Uv()) {
                    assert (ldv2 != null);
                    n3 = 0;
                    ldv2 = null;
                } else if (n == 5) {
                    this.hcu.a(jpx.a.nQG);
                }
                if (byv2.vM() == 2) break;
                boolean bl = this.bqG.dPB();
                if (bl) {
                    this.bqG.dPF();
                    break;
                }
                this.bqG.dPG();
                break;
            }
            case 7: {
                if (n != 4) break;
                boolean bl = this.bqG.dPB();
                if (bl) {
                    this.bqG.dPF();
                    break;
                }
                this.bqG.dPG();
                break;
            }
            default: {
                lfn.b(5, "SFPlayerMovementHandler", "notifyPostureModeChanged() Unhandled posturemode provided: '" + byw.nV(n2) + "'");
                return;
            }
        }
        if (n == 3) {
            this.bqG.ut(false);
        }
    }

    @Override
    public final void aE(int n, int n2) {
        byv byv2 = this.aEP();
        if (byv2 == null) {
            return;
        }
        boolean bl = false;
        boolean bl2 = false;
        switch (n) {
            case 3: 
            case 4: {
                bl2 = true;
            }
        }
        switch (n2) {
            case 1: {
                if (!bl2) break;
                bl = true;
                break;
            }
            case 2: {
                if (!bl2) break;
                bl = true;
                break;
            }
            case 3: {
                if (bl2) break;
                bl = true;
                break;
            }
            case 4: {
                if (bl2) break;
                bl = true;
                break;
            }
            default: {
                lfn.b(5, "SFPlayerMovementHandler", "notifyWaterContactModeChanged() Unhandled watercontactmode provided: '" + byw.nY(n2) + "'");
                return;
            }
        }
        if (bl && this.nRF.nRy) {
            assert (this.nRF.nRq > 0);
            this.VI(this.nRF.nRq);
            this.nRF.nRy = false;
            this.nRF.nRn = 1;
            this.nRF.nRo = 0;
        }
    }

    @Override
    public final void pq(int n) {
        byv byv2 = this.aEP();
        if (byv2 == null) {
            return;
        }
        if (!byv2.isAlive()) {
            return;
        }
        if (this.hcu.dQg() == jpx.a.nQH) {
            return;
        }
        block0 : switch (n) {
            case 1: {
                switch (byv2.vO()) {
                    case 2: 
                    case 6: {
                        this.bqG.dPG();
                        break block0;
                    }
                    case 3: {
                        this.bqG.dPG();
                        this.bqG.ut(true);
                        break block0;
                    }
                    case 4: {
                        break block0;
                    }
                    case 7: {
                        this.bqG.dPG();
                        break block0;
                    }
                }
                lfn.b(5, "SFPlayerMovementHandler", "notifyWeaponModeChanged() Unhandled posturemode provided in spell mode: " + byv2.aEq());
                return;
            }
            case 3: {
                switch (byv2.vO()) {
                    case 2: 
                    case 6: {
                        this.bqG.dPF();
                        break block0;
                    }
                    case 3: {
                        this.bqG.dPF();
                        this.bqG.ut(true);
                        break block0;
                    }
                    case 4: {
                        break block0;
                    }
                    case 7: {
                        this.bqG.dPF();
                        break block0;
                    }
                }
                lfn.b(5, "SFPlayerMovementHandler", "notifyWeaponModeChanged() Unhandled posturemode provided in spell mode: " + byv2.aEq());
                return;
            }
            case 2: {
                switch (byv2.vO()) {
                    case 2: 
                    case 3: 
                    case 6: {
                        if (this.bPN()) {
                            this.bqG.dPG();
                            break block0;
                        }
                        this.bqG.dPF();
                        break block0;
                    }
                    case 4: {
                        break block0;
                    }
                    case 7: {
                        if (this.bPN()) {
                            this.bqG.dPG();
                            break block0;
                        }
                        this.bqG.dPF();
                        break block0;
                    }
                }
                lfn.b(5, "SFPlayerMovementHandler", "notifyWeaponModeChanged() Unhandled posturemode provided in combat mode: " + byv2.aEq());
                return;
            }
            case 4: {
                switch (byv2.vO()) {
                    case 3: 
                    case 6: {
                        this.bqG.dPG();
                        break block0;
                    }
                    case 4: {
                        break block0;
                    }
                    case 7: {
                        this.bqG.dPG();
                        break block0;
                    }
                }
                lfn.b(5, "SFPlayerMovementHandler", "notifyWeaponModeChanged() Unhandled posturemode provided in tool mode: " + byv2.aEq());
                return;
            }
            default: {
                lfn.b(5, "SFPlayerMovementHandler", "notifyWeaponModeChanged() Unhandled weaponmode provided: '" + byw.ob(n) + "'");
                return;
            }
        }
    }

    private lgl tg(ldv ldv2) {
        amf amf2 = this.MessageDelegator.bzx().bzt().d(ldv2);
        if (amf2 == null) {
            return null;
        }
        return ((cbx)amf2).aAG().aw();
    }
}

