/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ayd
 *  azn
 *  cug
 */
import java.util.Map;

public class bbg
extends btk {
    private static final boolean cQp = false;
    private final ayd cCy;
    private azn cwP = null;
    private Map<ldv, bbf> cQq = lcn.emw();
    private int cQr = 0;
    private dpv cQs = null;
    private double cQt = 0.0;
    private int cQu = -1;
    private boolean cQv = false;

    public boolean ZR() {
        return this.cQq.isEmpty();
    }

    public int ajM() {
        return this.cQq.size();
    }

    public ayk[] aaD() {
        ayk[] aykArray = new ayk[this.cQq.size()];
        int n = 0;
        for (bbf bbf2 : this.cQq.values()) {
            aykArray[n++] = new ayk(bbf2);
        }
        return aykArray;
    }

    public double ajN() {
        return this.cQs == null ? 0.0 : this.MessageDelegator.arc().rgz - (this.cQs.bss() - this.cQt);
    }

    public double ajO() {
        return this.cQq.isEmpty() ? 0.0 : this.MessageDelegator.arc().rgz + this.cQt;
    }

    public int ajP() {
        return this.cQs == null ? 0 : 100 - (int)(this.cQt / this.cQs.bss() * 100.0);
    }

    public int ajQ() {
        return this.cQs == null ? -1 : this.cQs.getID();
    }

    public int ajR() {
        return this.cQr;
    }

    public void jT(int n) {
        if (this.cQq.isEmpty()) {
            dpv dpv2 = jvv.Wj(n);
            if (dpv2 != null) {
                this.cQs = dpv2;
            }
            this.cQt = this.cQs.bss();
            this.cwP.jk(521);
            this.cwP.jk(522);
        }
        this.cQr = n;
        this.cwP.jk(523);
    }

    public bbg(ayd ayd2, azn azn2) {
        this.cCy = ayd2;
        this.cwP = azn2;
        this.e(0, 0.0);
    }

    private void e(int n, double d2) {
        this.cQs = jvv.Wj(n);
        if (this.cQs == null) {
            this.cQs = jvv.dTS();
            this.cQt = this.cQs.bss();
            this.cwP.jk(521);
            this.cwP.jk(522);
        } else {
            this.cQt = this.cQs.bss() - d2;
            if (this.cQt < 0.0) {
                this.cQt = 0.0;
            }
            this.cwP.jk(522);
        }
        if (jvv.Wj(this.cQr) == null) {
            this.cQr = this.cQs.getID();
            this.cwP.jk(523);
        }
    }

    public void a(nn nn2) {
        nn2.aEb = this.cQs == null ? 0 : this.cQs.getID();
        nn2.aEc = this.cQr;
        nn2.aEd = this.cQs == null ? 0.0 : this.cQs.bss() - this.cQt;
    }

    public void b(nn nn2) {
        this.cQr = nn2.aEc;
        this.e(nn2.aEb, nn2.aEd);
        this.cQu = this.ajP();
        for (bbf bbf2 : this.cQq.values()) {
            this.go(bbf2.ajD());
        }
        this.cQv = true;
    }

    public void doTick(ldz ldz2) {
        if (!this.cQv) {
            return;
        }
        if (this.cQq.isEmpty()) {
            return;
        }
        this.cQt -= ldz2.qwh;
        if (this.cQt <= 0.0) {
            this.cQt = 0.0;
            for (bbf bbf2 : this.cQq.values()) {
                this.go(bbf2.ajD());
            }
            if (this.cQs.getID() != this.cQr) {
                Object object = jvv.Wj(this.cQr);
                if (object == null) {
                    this.cQr = this.cQs.getID();
                    object = this.cQs;
                }
                this.cQs = object;
                this.cwP.jk(521);
            }
            this.cQt = this.cQs.bss();
            this.cwP.jk(522);
        } else if (this.ajP() != this.cQu) {
            this.cQu = this.ajP();
            for (bbf bbf3 : this.cQq.values()) {
                this.go(bbf3.ajD());
            }
        }
    }

    public void ajS() {
        for (bbf bbf2 : this.cQq.values()) {
            ldv ldv2 = bbf2.ajJ();
            if (ldv2 == null || bbf2.ajI() != null && !bbf2.ajI().equals("Unknown")) continue;
            bbr bbr2 = this.cCy.dR(ldv2);
            if (bbr2 == null) {
                bbf2.gm(null);
                continue;
            }
            bbf2.fj(bbr2.akp());
        }
    }

    public void b(bbr bbr2) {
        if (bbr2 == null) {
            return;
        }
        if (this.cQq.isEmpty()) {
            return;
        }
        for (bbf bbf2 : this.cQq.values()) {
            if (!ldv.au(bbf2.ajJ(), bbr2.abB())) continue;
            bbf2.fj(bbr2.akp());
        }
    }

    public void acz() {
        for (ldv ldv2 : this.cQq.keySet()) {
            exo exo2 = (exo)this.MessageDelegator.h(24074, this.getGUID(), ldv2);
            exo2.ade = this.cCy.getGUID();
            this.MessageDelegator.F(exo2);
        }
        this.cQq.clear();
    }

    public void acA() {
        if (this.cQq.isEmpty()) {
            return;
        }
        for (bbf bbf2 : this.cQq.values()) {
            this.gn(bbf2.ajD());
        }
    }

    private void gn(ldv ldv2) {
        exr exr2 = (exr)this.MessageDelegator.h(24076, this.GUID, ldv2);
        exr2.ch(this.cCy.getGUID());
        exr2.cD(this.cCy.iV());
        this.MessageDelegator.F(exr2);
    }

    private void go(ldv ldv2) {
        exv exv2 = (exv)this.MessageDelegator.h(24077, this.GUID, ldv2);
        exv2.ct(this.cQs.bss() - this.cQt);
        exv2.FF(this.cQs.getID());
        exv2.cu(this.MessageDelegator.arc().rgz);
        this.MessageDelegator.F(exv2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        switch (dxq2.bEz()) {
            case 24068: {
                this.a((exs)dxq2);
                break;
            }
            case 24070: {
                this.a((ext)dxq2);
                break;
            }
            case 24069: {
                this.a((exw)dxq2);
                break;
            }
            case 24071: {
                this.a((exp)dxq2);
                break;
            }
            case 24075: {
                this.a((exu)dxq2);
                break;
            }
            case 7956: {
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(exs exs2) {
        assert (exs2.cQg != null);
        bbr bbr2 = this.cCy.dR(exs2.iFc);
        switch (exs2.gKV) {
            case 1: {
                bbf bbf2 = this.cQq.get(exs2.cQg);
                if (bbf2 == null) {
                    lfn.b(5, "SFClanControlPointManager", "handleControlPointRegisterMessage() : Re-Registration Notification Received, But Control-Point Info Not Found!!!... Clan = " + this.cCy.toString() + ", ControlPoint = " + exs2.cQk + " [" + exs2.cQg + "]");
                    assert (false);
                    break;
                }
                bbf2.gm(bbr2 == null ? null : bbr2.abB());
                bbf2.fj(bbr2 == null ? "Unknown" : bbr2.akp());
                if (exs2.dzL != null && exs2.dzL.length > 0 && exs2.dzM != null && exs2.dzM.length > 0) {
                    this.cCy.a(exs2.dzL, exs2.dzM, bqy.dGf, bda.a(exs2, bbf2, bbr2, this.MessageDelegator), true);
                }
                if (bbr2 == null) {
                    this.cCy.i(mau.ueG.bD(bbf2.ajH()));
                } else {
                    this.cCy.i(mau.ueF.bD(new Object[]{bbr2.abP(), bbr2.akp(), bbf2.ajH()}));
                }
                this.cCy.f(mau.ueH.bD(this.cCy.iV(), bbf2.ajH()));
                this.cwP.a(1281, bbf2);
                this.cQv = true;
                break;
            }
            case 3: {
                assert (!this.cQq.containsKey(exs2.cQg));
                bbf bbf3 = new bbf();
                bbf3.gl(exs2.cQg);
                bbf3.aI(exs2.cQh);
                bbf3.jR(exs2.cQi);
                bbf3.jS(exs2.cQj);
                bbf3.fi(exs2.cQk);
                bbf3.gm(exs2.iFc);
                bbf3.fj(bbr2 == null ? "Unknown" : bbr2.akp());
                this.cQq.put(exs2.cQg, bbf3);
                if (!this.cQv) break;
                this.go(bbf3.ajD());
                break;
            }
            case 2: {
                if (this.cQq.containsKey(exs2.cQg)) {
                    return;
                }
                bbf bbf4 = new bbf();
                bbf4.gl(exs2.cQg);
                bbf4.aI(exs2.cQh);
                bbf4.jR(exs2.cQi);
                bbf4.jS(exs2.cQj);
                bbf4.fi(exs2.cQk);
                bbf4.gm(bbr2 == null ? null : bbr2.abB());
                bbf4.fj(bbr2 == null ? "Unknown" : bbr2.akp());
                this.cQq.put(exs2.cQg, bbf4);
                if (exs2.dzL != null && exs2.dzL.length > 0 && exs2.dzM != null && exs2.dzM.length > 0) {
                    this.cCy.a(exs2.dzL, exs2.dzM, bqy.dGf, bda.a(exs2, bbf4, bbr2, this.MessageDelegator), true);
                }
                if (bbr2 == null) {
                    this.cCy.i(mau.ueD.bD(bbf4.ajH()));
                } else {
                    this.cCy.i(mau.ueC.bD(new Object[]{bbr2.abP(), bbr2.akp(), bbf4.ajH()}));
                }
                this.cCy.f(mau.ueE.bD(this.cCy.iV(), bbf4.ajH()));
                this.go(bbf4.ajD());
                this.cwP.a(1281, bbf4);
                if (this.cQq.size() == 1) {
                    this.cwP.jk(522);
                }
                this.cQv = true;
                break;
            }
            default: {
                lfn.b(5, "SFClanControlPointManager", "handleControlPointClanRegisterMessage() : Unhandled Reason Received!!!... Reason = " + exs2.gKV);
                assert (false);
                return;
            }
        }
        if (this.cQq.size() == 1 && this.cCy.aal() == 0 && this.cCy.aaH() == 0) {
            this.cCy.aaI();
        }
    }

    private void a(ext ext2) {
        assert (ext2.cQg != null);
        bbf bbf2 = this.cQq.remove(ext2.cQg);
        if (bbf2 == null) {
            lfn.b(5, "SFClanControlPointManager", "handleControlPointClanRemoveMessage() : Clan does NOT own this controlpoint");
            return;
        }
        switch (ext2.iFf) {
            case 1: {
                this.cCy.i(mau.ueI.bD(bbf2.ajH()));
                this.cCy.f(mau.ueJ.bD(this.cCy.iV(), bbf2.ajH()));
                break;
            }
            case 2: {
                this.cCy.i(mau.ueK.bD(ext2.aET, bbf2.ajH()));
                this.cCy.f(mau.ueL.bD(ext2.aET, bbf2.ajH(), this.cCy.iV()));
                break;
            }
            default: {
                lfn.b(5, "SFClanControlPointManager", "handleControlPointClanRemoveMessage() : Unhandled Reason Received!!!... RemovalReason = " + ext2.iFf);
                assert (false);
                break;
            }
        }
        this.cwP.a(1283, bbf2);
    }

    private void a(exw exw2) {
        assert (this.cQq.containsKey(exw2.cQg));
        bbf bbf2 = this.cQq.get(exw2.cQg);
        if (bbf2 == null) {
            lfn.b(5, "SFClanControlPointManager", "handleControlPointClanUpdateMessage() : Could not find this controlpointinfo: " + exw2.cQg);
            assert (false);
            return;
        }
        switch (exw2.ija) {
            case 2: 
            case 4: {
                bbf2.jR(exw2.iFq);
                bbf2.jS(exw2.cQj);
                this.cCy.i(mau.ueM.bD(bbf2.ajH(), bbf2.ajG()));
                break;
            }
            case 1: {
                bbr bbr2 = this.cCy.dR(bbf2.ajJ());
                int n = exw2.iFp;
                int n2 = 0;
                if (bbr2 != null && (n2 = exw2.iFp - (n = exw2.iFp / 2)) < 0) {
                    n2 = 0;
                }
                if (n > 0) {
                    this.cCy.a(cug.fkb, n, bqy.dGe, bda.a(bbf2, n, this.MessageDelegator), true);
                    this.cCy.i(mau.ueN.bD(n, cug.fkb, bbf2.ajH()));
                }
                if (exw2.iFr != null && exw2.iFr.length > 0) {
                    this.cCy.a(exw2.iFr, exw2.iFs, bqy.dGe, bda.a(exw2, bbf2, this.MessageDelegator), true);
                    for (int i = 0; i < exw2.iFr.length; ++i) {
                        this.cCy.i(mau.ueO.bD(bbf2.ajH(), exw2.iFs[i], exw2.iFr[i]));
                    }
                }
                if (n2 <= 0 || bbr2 == null) break;
                fmz fmz2 = (fmz)this.MessageDelegator.h(7955, this.getGUID(), bbr2.abB());
                fmz2.bqd = new int[]{cug.fkb};
                fmz2.iIY = new int[]{n2};
                fmz2.iQG = null;
                fmz2.b(bqy.dGe);
                this.MessageDelegator.F(fmz2);
                this.cCy.i(mau.ueP.bD(new Object[]{bbr2.abP(), bbr2.akp(), n2, cug.fkb, bbf2.ajH()}));
                this.cCy.b(mau.ueQ.bD(n2, cug.fkb, bbf2.ajH()), bbr2.abB());
                break;
            }
            case 3: {
                this.cCy.i(mau.ueS.bD(bbf2.ajH()));
                this.cwP.a(1282, bbf2);
                break;
            }
            case 5: {
                break;
            }
            default: {
                assert (false) : "Unknown type: " + exw2.ija;
                break;
            }
        }
    }

    private void a(exp exp2) {
        exq exq2 = (exq)this.MessageDelegator.h(24072, this.getGUID(), exp2.aO());
        this.MessageDelegator.b(exp2, exq2);
        if (this.cQq.isEmpty()) {
            this.MessageDelegator.F(exq2);
            return;
        }
        exq2.iEX = new String[this.cQq.size()];
        exq2.iET = new ldv[this.cQq.size()];
        exq2.iEW = new String[this.cQq.size()];
        exq2.iEU = new ljq[this.cQq.size()];
        exq2.iEV = new int[this.cQq.size()];
        int n = 0;
        for (bbf bbf2 : this.cQq.values()) {
            exq2.iEX[n] = bbf2.ajI();
            exq2.iET[n] = bbf2.ajD();
            exq2.iEW[n] = bbf2.ajH();
            exq2.iEU[n] = bbf2.ajE();
            exq2.iEV[n] = bbf2.ajF();
            ++n;
        }
        this.MessageDelegator.F(exq2);
    }

    private void a(exu exu2) {
        bbf bbf2 = this.cQq.get(exu2.ajD());
        if (bbf2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "handleControlPointClanResourceStealerNotificationMessage() : Cannot Find Control-Point!!!... ControlPointGUID = " + exu2.ajD());
            assert (false);
            return;
        }
        bbf2.q(exu2.ajK(), exu2.ajL());
        this.cwP.a(bbf2.ajK() == null ? 1285 : 1284, bbf2);
    }
}

