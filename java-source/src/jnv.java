/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class jnv
extends btk {
    dqf nFy = null;
    dqe nEk = new dqe(this);
    dqg nEl = null;
    private boolean eiy;

    public jnv() {
        this.nFy = new dqf(this);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        this.nEk.cleanUp();
    }

    public void b(dqg dqg2) {
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
        this.d(dqg2);
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

    private void d(dqg dqg2) {
        this.nFy.a(dqg2);
        amo[] amoArray = this.nFy.btb();
        this.nEk.iu(true);
        this.nEk.b(amoArray);
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
        this.d(this.nEl);
        this.nEl = null;
    }
}

