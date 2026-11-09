/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  jnk
 */
public class jnq
extends jnl {
    dqe nEk = new dqe(this);
    dqg nEl = null;
    private boolean nEm = false;
    private boolean eiy;

    jnq(jng jng2, jnr jnr2, dmn dmn2, jnk jnk2) {
        super(jng2, jnr2, dmn2, jnk2);
    }

    @Override
    void dNE() {
        this.nDF = this.nDv.dNJ();
    }

    @Override
    void dNF() {
        this.nDF = this.nDv.dNJ();
    }

    @Override
    void bqx() {
        this.nDF = null;
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.nEk.cleanUp();
    }

    void b(dqg dqg2) {
        if (this.nEl != null) {
            return;
        }
        if (dqg2.gNT == 0) {
            assert (dqg2.gNU != null) : "Null position while adding waypoint";
            this.eiy = dqg2.gNU.y < -1000.0f;
            ljq ljq2 = new ljq(dqg2.gNU.x, dqg2.gNU.y + (float)(this.eiy ? 1 : 1500), dqg2.gNU.rlV);
            ljq ljq3 = new ljq(0.0f, -1.0f, 0.0f);
            this.nEl = dqg2;
            this.g(ljq2, ljq3, this.eiy ? 3.0f : 1000.0f);
            return;
        }
        this.c(dqg2);
    }

    private void g(ljq ljq2, ljq ljq3, float f2) {
        kji kji2 = (kji)this.MessageDelegator.h(2818);
        kji2.wS(true);
        kji2.wT(false);
        kji2.ec = this.GUID;
        kji2.pDY = 0;
        kji2.Yg(2);
        kji2.Yh(2);
        kji2.ca(ljq2);
        kji2.cq(ljq3);
        kji2.setLength(f2);
        this.MessageDelegator.a(kji2);
    }

    private void c(dqg dqg2) {
        assert (this.nDv.dNI());
        enz enz2 = (enz)this.MessageDelegator.h(13918, this.GUID, this.nDF.iG());
        enz2.gNT = dqg2.gNT;
        enz2.gNV = dqg2.gNV;
        enz2.gNU = dqg2.gNU;
        enz2.gNW = dqg2.gNW;
        this.MessageDelegator.F(enz2);
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        if (dxq2.bED() == 32000) {
            this.b((eqr)dxq2);
            return;
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 4866: {
                this.e((kuj)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void b(eqr eqr2) {
        switch (eqr2.bHc()) {
            case 2049: {
                this.a((eqw)eqr2);
                break;
            }
            default: {
                lfn.b(5, this.getClass().getSimpleName(), "handleClanClientUpdateMessage() : Unknown Update Type (" + eqr2.bHc() + ") Received!!!");
                assert (false);
                return;
            }
        }
    }

    private void a(eqw eqw2) {
        this.nEk.iu(true);
        this.nEk.b(eqw2.btb());
    }

    private void e(kuj kuj2) {
        if (this.nEl == null) {
            return;
        }
        if (kuj2.ilP.length < 1) {
            lfn.b(5, this.getClass().getSimpleName(), "_handleLineContainmentResponse() : zero length positions result");
            this.nEl = null;
            return;
        }
        int n = -1;
        float f2 = Float.MAX_VALUE;
        for (int j = 0; j < kuj2.bqd.length; ++j) {
            if (!lea.enW().isDescendant(kuj2.bqd[j], cug.fqn) && kuj2.bqd[j] != cug.fkr && (!this.eiy || !lea.enW().isDescendant(kuj2.bqd[j], cug.fkp)) || !(kuj2.pJh[j] < f2)) continue;
            f2 = kuj2.pJh[j];
            n = j;
        }
        if (n < 0) {
            lfn.b(5, this.getClass().getSimpleName(), "_handleLineContainmentResponse() : no intersection wi");
            this.nEl = null;
            return;
        }
        ljq ljq2 = kuj2.ilP[n];
        assert (ljq2 != null) : "No position found";
        this.nEl.gNU = ljq2;
        this.c(this.nEl);
        this.nEl = null;
    }
}

