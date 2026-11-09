/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  lcr
 *  lcw
 *  mcs
 */
public class ajs
extends akt {
    private float bpU = 0.0f;
    protected ljq aZD = null;

    public ajs() {
        this.bog = ajb.b.boJ;
        this.TC = "SFLineTargetingConstraint";
    }

    public void CK() {
        jpx jpx2;
        bun bun2;
        if (this.boj.bfF()) {
            this.bqO = true;
            return;
        }
        if (this.boj.aJz().bgR() == null) {
            lfn.b(5, this.TC, "initializeConstraint() Player object is null.");
            this.bok = mcs.uzK.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        if (this.boj.aJz().bgR().aAG() == null) {
            lfn.b(5, this.TC, "initializeConstraint() Mesh object is null.");
            this.bok = mcs.uzK.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        if (this.boj.aJz().bgR().aAG().azb() == null) {
            lfn.b(5, this.TC, "initializeConstraint() Position is null.");
            this.bok = mcs.uzK.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        bun bun3 = (bun)this.boj.getMessageDelegator().bzx().bzt().d(lcr.qBP);
        if (bun3 == null) {
            lfn.b(5, this.TC, "initializeConstraint() Targeting Manager is null.");
            this.bok = mcs.uzK.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        this.bqM = bun3.ayq();
        if (this.bqM == null) {
            lfn.b(5, this.TC, "initializeConstraint() InfoAssembler is null.");
            this.bok = mcs.uzK.bD(new Object[0]);
            this.bqN = true;
            return;
        }
        if (!this.bqL.zJ(this.bqM.az())) {
            this.bok = this.CR();
            this.bqN = true;
            return;
        }
        this.akX = this.bqM.KY();
        if (this.akX == null) {
            lfn.b(5, this.TC, "initializeConstraint() No Target mesh object guid.");
            this.bok = this.CR();
            this.bqN = true;
            return;
        }
        this.aZD = this.bqM.av();
        if (this.aZD == null) {
            lfn.b(5, this.TC, "initializeConstraint() No Target position.");
            this.bok = this.CQ();
            this.bqN = true;
            return;
        }
        amf amf2 = this.Co().getMessageDelegator().bzx().bzt().d(lcr.qBP);
        if (amf2 instanceof bun && (bun2 = (bun)amf2) != null && (jpx2 = bun2.ayy()) != null && !jpx2.d(this.bqM.axQ(), this.bqM.az())) {
            this.bok = this.CQ();
            this.bqN = true;
            return;
        }
    }

    @Override
    protected boolean BU() {
        jpx jpx2;
        bun bun2;
        Object object;
        if (this.boj.bfF()) {
            return true;
        }
        if (!this.bqO) {
            this.CK();
            this.bqO = true;
        }
        if (this.bqN) {
            return false;
        }
        if (this.bqM == null) {
            lfn.b(5, this.TC, "checkConstraint() Info assember is null.");
            return false;
        }
        if (this.akX == null) {
            lfn.b(5, this.TC, "checkConstraint() No Target mesh object guid.");
            assert (false);
            return false;
        }
        if (this.aZD == null) {
            lfn.b(5, this.TC, "checkConstraint() No Target player position.");
            assert (false);
            return false;
        }
        if (this.boj.aJz().bgR() == null) {
            lfn.b(5, this.TC, "checkConstraint() POS is null.");
            this.bok = mcs.uzK.bD(new Object[0]);
            return false;
        }
        if (this.boj.aJz().bgR().aAG() == null) {
            lfn.b(5, this.TC, "checkConstraint() Mesh object is null.");
            this.bok = mcs.uzK.bD(new Object[0]);
            return false;
        }
        ljq ljq2 = this.boj.aJz().yS(this.boj.zg());
        if (ljq2 == null) {
            lfn.b(5, this.TC, "checkConstraint() Position is invalid.");
            this.bok = mcs.uzK.bD(new Object[0]);
            return false;
        }
        lgl lgl2 = this.boj.aJz().yT(this.boj.zg());
        if (lgl2 == null) {
            lfn.b(5, this.TC, "checkConstraint() Rotation is invalid.");
            this.bok = mcs.uzK.bD(new Object[0]);
            return false;
        }
        if (this.akX.equals(this.bqM.KY()) && (object = this.Co().getMessageDelegator().bzx().bzt().d(lcr.qBP)) instanceof bun && (bun2 = (bun)object) != null && ((jpx2 = bun2.ayy()) == null || jpx2.d(this.bqM.axQ(), this.bqM.az()))) {
            return true;
        }
        object = (kji)this.boj.getMessageDelegator().h(2818);
        ((kji)object).wS(true);
        ((kji)object).wT(false);
        ((kji)object).ec = this.boj.getGUID();
        ((kji)object).pDY = 0;
        ((kji)object).Yg(2);
        ((kji)object).Yh(4);
        ((kji)object).ca(ljq2);
        ((kji)object).cq(dba.gbx);
        ((kji)object).a(lgl2);
        ((kji)object).setLength(this.bpU);
        ((kji)object).pEL = false;
        this.boj.getMessageDelegator().a((khd)object);
        return true;
    }

    private void handleLineContainmentResponse(kuj kuj2) {
        Object object;
        if (kuj2.bqd == null) {
            this.bok = this.CR();
            this.bqN = true;
            return;
        }
        if (kuj2.bqd.length <= 0) {
            this.bok = this.CR();
            this.bqN = true;
            return;
        }
        float f2 = 2.14748365E9f;
        boolean bl = false;
        for (int i = 0; i < kuj2.qdO.length; ++i) {
            object = kuj2.jnv[i];
            if (!((ldv)object).equals(this.akX)) continue;
            bl = true;
            f2 = kuj2.pJh[i];
            break;
        }
        if (bl) {
            jpx jpx2;
            amf amf2 = this.Co().getMessageDelegator().bzx().bzt().d(lcr.qBP);
            if (amf2 instanceof bun && (object = (bun)amf2) != null && (jpx2 = ((bun)object).ayy()) != null && !jpx2.d(this.bqM.axQ(), this.bqM.az())) {
                this.bok = this.CQ();
                this.bqN = true;
                return;
            }
            return;
        }
        this.bok = this.CR();
        this.bqN = true;
    }

    public loz CQ() {
        int n = this.Co().zg();
        if (lcw.bcB == 2) {
            if (n == cxd.fJt) {
                return mcs.uBG.bD(new Object[0]);
            }
            if (n == cxd.fJu) {
                return mcs.uBF.bD(new Object[0]);
            }
            if (n == cxd.fJv) {
                return mcs.uBC.bD(new Object[0]);
            }
            if (n == cxd.fJx) {
                if (this.bqM.az() == cug.fqB) {
                    return mcs.uBD.bD(new Object[0]);
                }
                if (this.bqM.az() == cug.fqC) {
                    return mcs.uBE.bD(new Object[0]);
                }
            }
        }
        return mcs.uBB.bD(new Object[0]);
    }

    public loz CR() {
        int n = this.Co().zg();
        if (lcw.bcB == 2) {
            if (n == cxd.fJt) {
                return mcs.uBz.bD(new Object[0]);
            }
            if (n == cxd.fJu) {
                return mcs.uBy.bD(new Object[0]);
            }
            if (n == cxd.fJv) {
                return mcs.uBw.bD(new Object[0]);
            }
            if (n == cxd.fJx) {
                return mcs.uBx.bD(new Object[0]);
            }
        }
        return mcs.uBv.bD(new Object[0]);
    }

    @Override
    public boolean o(dxq dxq2) {
        return false;
    }

    @Override
    public boolean a(ktv ktv2) {
        int n = ktv2.egT();
        switch (n) {
            case 4866: {
                this.handleLineContainmentResponse((kuj)ktv2);
                return true;
            }
        }
        return false;
    }

    @Override
    protected void a(aja aja2) {
        super.a(aja2);
        ajs ajs2 = (ajs)aja2;
        ajs2.al(this.bpU);
    }

    @Override
    public void reset() {
        super.reset();
        this.aZD = null;
    }

    public final void al(float f2) {
        this.bpU = f2;
    }

    public final float CO() {
        return this.bpU;
    }
}

