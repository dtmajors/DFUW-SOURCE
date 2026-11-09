/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  lcr
 */
public class bki
extends bke {
    private boolean dsK = true;
    private fcq dsA = null;
    private ldv dsL = null;
    private ldv dsD = null;

    public bki() {
        this.dsy = bkd.a.drr;
    }

    @Override
    public final void a(int n, fdo fdo2) {
        lhg lhg2;
        if (fdo2 == null) {
            lfn.b(5, "SFAreaInstantEffectFO", "doFunction() FunctionMessage is null.");
            this.Vc();
            return;
        }
        if (fdo2.bEz() != 9224) {
            lfn.b(5, "SFAreaInstantEffectFO", "doFunction() FunctionMessage is not a SFFunctionAreaEffectMessage.");
            lfn.b(5, "SFAreaInstantEffectFO", "doFunction() FromGUID=" + fdo2.aO() + " Message is: " + fdo2.getClass().getName());
            this.Vc();
            return;
        }
        this.dsA = (fcq)fdo2;
        if (this.dsA.dsL != null) {
            this.dsL = this.dsA.dsL;
        }
        if ((lhg2 = (lhg)lea.enZ().acv(this.dsA.aYC)) != null && (lhg2.erV() == cxd.g.fRc && lhg2.erW() == cxd.h.fRo || lhg2.getType() == cxd.fKY)) {
            this.dsD = this.dsA.dsD;
            lfn.b(5, "SFAreaInstantEffectFO", "doFunction() Skill : " + lhg2.getName() + " does not affect source player : " + this.dsD);
        }
        this.ari();
    }

    @Override
    public final void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 4867: {
                this.a((kuo)ktv2);
                this.Vc();
                break;
            }
            default: {
                lfn.b(5, "SFAreaInstantEffectFO", "receiveResponse() Unhandled response received: " + ktv2.getClass().getName());
                return;
            }
        }
    }

    private void a(ldv ldv2, ldv ldv3, ljq ljq2, int n, cxd.f f2, boolean bl2, boolean bl3) {
        assert (ldv2 != null);
        assert (ldv3 != null);
        assert (ljq2 != null);
        assert (f2 != null);
        if (this.a(ldv3, n, this.dsA.dta)) {
            return;
        }
        if (bl2 && f2 == cxd.f.fQY) {
            f2 = cxd.f.fQW;
        }
        this.a(ldv3, ljq2, n, f2, bl3);
    }

    private void a(kuo kuo2) {
        boolean bl2;
        ldv[] ldvArray = kuo2.jnv;
        ldv[] ldvArray2 = kuo2.qdO;
        int[] nArray = kuo2.bqd;
        ljq[] ljqArray = kuo2.ilP;
        int[] nArray2 = kuo2.qdP;
        boolean bl3 = bl2 = aqN.isDescendant(this.dsA.aYC, cxd.fJq) || aqN.isDescendant(this.dsA.aYC, cxd.fKH);
        if (ldvArray == null || ldvArray.length == 0) {
            if (this.dsL != null) {
                this.a(this.dsL, this.dsL, this.dsA.Position, this.dsA.dhr, this.dsA.aCD(), false, true);
            }
            return;
        }
        assert (ldvArray2 != null);
        assert (nArray != null);
        assert (ldvArray.length == ldvArray2.length);
        assert (ldvArray.length == nArray.length);
        assert (ldvArray.length == ljqArray.length);
        assert (ldvArray.length == nArray2.length);
        int n = ldvArray.length;
        for (int i = 0; i < n; ++i) {
            ljq ljq2 = ljqArray[i].esF();
            ljq2.es(new ljq(0.0f, 1.0f, 0.0f));
            if (this.dsL != null && this.dsL.equals(ldvArray2[i])) {
                this.a(this.dsL, this.dsL, ljq2, this.dsA.dhr, this.dsA.aCD(), false, true);
                this.dsL = null;
                continue;
            }
            cxd.f f2 = cxd.f.getHitLocationTypeForHitLocation(nArray2[i]);
            this.a(ldvArray[i], ldvArray2[i], ljq2, nArray[i], f2, bl2, false);
        }
        if (this.dsL != null) {
            this.a(this.dsL, this.dsL, this.dsA.Position, this.dsA.dhr, this.dsA.aCD(), false, true);
        }
    }

    private void a(ldv ldv2, ljq ljq2, int n, cxd.f f2, boolean bl2) {
        assert (ldv2 != null);
        assert (f2 != null);
        if (this.dsD != null && this.dsD.equals(ldv2)) {
            return;
        }
        float f3 = ljq.s(this.dsA.Position, ljq2);
        if (this.dsA.iJl) {
            // empty if block
        }
        float f4 = 1.0f;
        if (!this.dsA.iJl && f3 > this.dsA.Radius * 0.3f && !bl2) {
            f4 = lew.A(1.0f - f3 / (this.dsA.Radius * 1.725f), 0.25f, 1.0f);
        }
        fcw fcw2 = (fcw)this.MessageDelegator.h(9227, this.GUID, this.MessageDelegator.getGUID());
        fcw2.bst = this.dsA.gbe;
        fcw2.aZG = this.dsA.aZG;
        fcw2.akX = ldv2;
        fcw2.aYF = this.dsA.aYF;
        fcw2.bsG = this.dsA.bsG;
        fcw2.aYC = this.dsA.aYC;
        fcw2.Magnitude = this.dsA.Magnitude * f4;
        fcw2.cRI = this.dsA.cRI;
        fcw2.dun = this.dsA.dun;
        fcw2.iJz = this.dsA.iJz;
        fcw2.eKm = this.dsA.eKm;
        fcw2.aSp = this.dsA.aSp;
        fcw2.bRw = this.dsA.bRw;
        fcw2.aYH = this.dsA.aYH;
        fcw2.aYG = this.dsA.aYG;
        fcw2.bsE = this.dsA.bsE;
        fcw2.bRD = this.dsA.bRD;
        fcw2.gpI = this.dsA.gpI;
        fcw2.dup = this.dsA.dup;
        fcw2.aZH = this.dsA.aZH;
        fcw2.duq = this.dsA.duq;
        fcw2.iJy = this.dsA.iJy;
        fcw2.iJA = this.dsA.iJA;
        fcw2.iJB = this.dsA.iJB;
        fcw2.iJC = this.dsA.iJC;
        fcw2.iJD = this.dsA.iJD;
        fcw2.a(f2);
        this.MessageDelegator.H(fcw2);
        if (lew.ak(fcw2.aSp, 1.0E-6f)) {
            return;
        }
        if (!cug.uq((int)n)) {
            return;
        }
        if (this.dsD == null) {
            gjf gjf2 = (gjf)this.MessageDelegator.h(4621, this.GUID, lcr.qCt);
            gjf2.mZ = this.dsA.Position;
            gjf2.hC = ldv2;
            gjf2.jjc = ljq2;
            gjf2.gen = this.dsA.aSp;
            gjf2.Radius = this.dsA.Radius * 1.5f;
            gjf2.jiZ = this.dsA.aYF;
            this.MessageDelegator.F(gjf2);
        } else {
            float f5 = fcw2.aSp;
            ljq ljq3 = new ljq(ljq2);
            ljq3.et(this.dsA.aZH);
            if (this.dsA.bRw == 4) {
                ljq3.y = (float)((double)ljq3.y + 1.2);
            }
            ljq3.normalize();
            if (ljq3.isZero()) {
                ljq3 = new ljq(Math.random(), Math.random(), Math.random());
                ljq3.normalize();
            }
            if (f5 < 0.0f) {
                ljq3.esB();
                f5 = -f5;
            }
            gje gje2 = (gje)this.MessageDelegator.h(4622, this.GUID, lcr.qCt);
            gje2.Ui = ldv2;
            gje2.mx = ljq3;
            gje2.gen = f5;
            gje2.jiZ = this.dsA.aYF;
            this.MessageDelegator.F(gje2);
        }
    }

    private void ari() {
        assert (this.dsA != null);
        kjo kjo2 = (kjo)this.MessageDelegator.h(2819);
        kjo2.ec = this.GUID;
        kjo2.iBr = false;
        kjo2.pDY = 0;
        kjo2.ipF = this.dsA.Position;
        kjo2.gBJ = this.dsA.Radius;
        kjo2.dtb = this.dsA.dtb;
        kjo2.pFi = 10;
        kjo2.pFj = false;
        kjo2.ObjectType = 0;
        if (this.dsA.gdY != null) {
            kjo2.pEs = new ldv[]{this.dsA.gdY};
        }
        this.MessageDelegator.a(kjo2);
    }
}

