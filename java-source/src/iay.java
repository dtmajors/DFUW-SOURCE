/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  iba
 *  lcr
 */
import java.util.List;

public class iay
extends btk
implements bto {
    private ldv hs;
    private List<ljq> ht;
    private List<lgl> hu;
    private List<Integer> hv = lcn.emv();
    private List<Integer> hw = lcn.emv();
    private List<Float> hx = lcn.emv();
    private int lDb = 0;
    private int lDc = 0;
    private int lDd = 0;
    private int lDe = 0;
    private boolean fE = true;
    private boolean hz;
    private boolean lDf = false;
    private final iba lwn;
    private int lDg = -1;
    private int lDh = -1;
    private a lDi = a.lDv;
    private a lDj = a.lDv;
    private int lDk = -1;
    private int lDl = -1;
    private boolean lDm = false;
    private float lDn = 0.0f;
    private lgl lDo = null;
    private lgl lDp = null;
    private lgl lDq = null;
    private ljq lDr = null;
    private ljq lDs = null;
    private ljq lDt = null;

    public iay(iba iba2) {
        int n;
        lgl lgl2;
        ljq ljq2;
        cp cp2;
        int n2;
        int n3;
        this.lwn = iba2;
        this.ht = lcn.emv();
        this.hu = lcn.emv();
        this.hv = lcn.emv();
        int n4 = 0;
        int n5 = iaz.iq.length;
        for (n3 = 0; n3 < n5; ++n3) {
            n2 = iaz.iq[n3];
            cp2 = (cp)this.lwn.cLw().get(cg.n(n2));
            ljq2 = cp2.bk();
            lgl2 = new lgl(cp2.bq());
            this.ht.add(ljq2);
            this.hu.add(lgl2);
            this.hv.add(n4);
            ++n4;
        }
        for (n3 = 0; n3 < n5; ++n3) {
            n2 = iaz.iq[n3];
            cp2 = (cp)this.lwn.cLw().get(cg.n(n2));
            ljq2 = cp2.bi();
            lgl2 = new lgl(cp2.bo());
            this.ht.add(ljq2);
            this.hu.add(lgl2);
            this.hv.add(n4);
            ++n4;
            ljq2 = cp2.bg();
            lgl2 = new lgl(cp2.bm());
            this.ht.add(ljq2);
            this.hu.add(lgl2);
            this.hv.add(n4);
            ++n4;
        }
        for (n3 = 0; n3 < n5; ++n3) {
            n2 = iaz.iq[n3];
            cp2 = (cp)this.lwn.cLw().get(cg.n(n2));
            ljq2 = cp2.bj();
            lgl2 = new lgl(cp2.bp());
            this.ht.add(ljq2);
            this.hu.add(lgl2);
            this.hv.add(n4);
            ++n4;
            ljq2 = cp2.bh();
            lgl2 = new lgl(cp2.bn());
            this.ht.add(ljq2);
            this.hu.add(lgl2);
            this.hv.add(n4);
            ++n4;
        }
        this.lDb = n4;
        for (n3 = 0; n3 < n5; ++n3) {
            n2 = iaz.iq[n3];
            cp2 = (cp)this.lwn.cLw().get(cg.n(n2));
            ljq2 = cp2.bT();
            lgl2 = new lgl(cp2.bU());
            this.ht.add(ljq2);
            this.hu.add(lgl2);
            this.hv.add(n4);
            ++n4;
            ljq2 = cp2.bR();
            lgl2 = new lgl(cp2.bS());
            this.ht.add(ljq2);
            this.hu.add(lgl2);
            this.hv.add(n4);
            ++n4;
        }
        this.lDc = n4;
        for (n3 = 0; n3 < n5; ++n3) {
            n2 = iaz.iq[n3];
            cp2 = (cp)this.lwn.cLw().get(cg.n(n2));
            ljq2 = cp2.cb();
            lgl2 = new lgl(cp2.cc());
            this.ht.add(ljq2);
            this.hu.add(lgl2);
            this.hv.add(n4);
            ++n4;
            ljq2 = cp2.bZ();
            lgl2 = new lgl(cp2.ca());
            this.ht.add(ljq2);
            this.hu.add(lgl2);
            this.hv.add(n4);
            ++n4;
        }
        this.lDd = n4;
        for (n3 = 0; n3 < n5; ++n3) {
            n2 = iaz.iq[n3];
            cp2 = (cp)this.lwn.cLw().get(cg.n(n2));
            ljq2 = cp2.bX();
            lgl2 = new lgl(cp2.bY());
            this.ht.add(ljq2);
            this.hu.add(lgl2);
            this.hv.add(n4);
            ++n4;
            ljq2 = cp2.bV();
            lgl2 = new lgl(cp2.bW());
            this.ht.add(ljq2);
            this.hu.add(lgl2);
            this.hv.add(n4);
            ++n4;
        }
        this.lDe = n4;
        for (n3 = 0; n3 < n5; ++n3) {
            n2 = iaz.iq[n3];
            cp2 = (cp)this.lwn.cLw().get(cg.n(n2));
            ljq2 = cp2.cf();
            lgl2 = new lgl(cp2.cg());
            this.ht.add(ljq2);
            this.hu.add(lgl2);
            this.hv.add(n4);
            ++n4;
            ljq2 = cp2.cd();
            lgl2 = new lgl(cp2.ce());
            this.ht.add(ljq2);
            this.hu.add(lgl2);
            this.hv.add(n4);
            ++n4;
        }
        this.hw = lcn.emv();
        this.hx = lcn.emv();
        float f = 4.0f;
        for (n2 = 0; n2 < n5; ++n2) {
            this.hw.add(n2);
            if (n2 == n5 - 1) {
                this.hw.add(0);
                continue;
            }
            this.hw.add(n2 + 1);
        }
        n2 = n5;
        for (n = 0; n < n5; ++n) {
            int n6 = n + n + n2;
            this.hw.add(n);
            this.hw.add(n6);
            this.hw.add(n);
            this.hw.add(n6 + 1);
            this.hw.add(n6);
            this.hw.add(n6 + 1);
        }
        n2 = n5 * 3;
        for (n = 0; n < n5; ++n) {
            int n7 = n5 + n + n;
            int n8 = n + n + n2;
            this.hw.add(n7);
            this.hw.add(n8);
            this.hw.add(n7 + 1);
            this.hw.add(n8 + 1);
        }
        for (n = 0; n < this.hw.size(); ++n) {
            this.hx.add(Float.valueOf(4.0f));
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.fE) {
            this.fE = false;
            this.aL();
        }
        if (this.lDm) {
            this.lDn = (float)((double)this.lDn + ldz2.qwh * 2.0);
            ljq ljq2 = null;
            lgl lgl2 = null;
            if (this.lDn > 1.0f) {
                this.lDn = 1.0f;
            }
            lgl2 = new lgl();
            lgl2.c(this.lDo, this.lDq, this.lDn);
            ljq2 = ljq.e(this.lDr, this.lDs, this.lDt, this.lDn);
            this.u(ljq2, lgl2);
            if (this.lDn >= 1.0f) {
                this.lDm = false;
                this.lDn = 0.0f;
            }
        }
    }

    private void aL() {
        int n;
        int[] nArray = new int[this.hv.size()];
        for (int j = 0; j < this.hv.size(); ++j) {
            nArray[j] = this.hv.get(j);
        }
        int[] nArray2 = new int[this.hw.size()];
        for (int j = 0; j < this.hw.size(); ++j) {
            nArray2[j] = this.hw.get(j);
        }
        float[] fArray = new float[this.hx.size()];
        for (n = 0; n < this.hx.size(); ++n) {
            fArray[n] = this.hx.get(n).floatValue();
        }
        n = iaz.PA(this.lwn.cLy());
        int n2 = n - 1;
        if (n == 0) {
            n2 = n + 1;
        }
        if (n == -1) {
            lfn.b(5, this.getClass().getSimpleName(), "setupController() : Problem with keyponts");
            n = 1;
            n2 = 0;
        }
        this.hs = this.MessageDelegator.bzv();
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        lfn.print("***receiveResponse type = " + ktv2.egT());
        switch (ktv2.egT()) {
            case 2307: {
                this.b((ktm)ktv2);
                break;
            }
            case 2304: {
                this.c((ktm)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    private void b(ktm ktm2) {
        this.lwn.cLW();
    }

    private void c(ktm ktm2) {
        lfn.print("***handleCameraResponse");
        this.lwn.cLW();
    }

    private int f(int n, int n2, boolean bl) {
        int n3 = iaz.PA(n);
        this.lDk = this.lDl;
        this.lDl = n;
        if (n2 == -1) {
            return n3;
        }
        int n4 = iaz.iq.length;
        if (bl) {
            return 3 * n4 + n3 * 2 + n2;
        }
        return n4 + n3 * 2 + n2;
    }

    private int a(int n, int n2, a a2) {
        int n3 = iaz.PA(n);
        this.lDk = this.lDl;
        this.lDl = n;
        this.lDi = this.lDj;
        this.lDj = a2;
        if (n2 == -1 || n2 == 0) {
            return this.lDb + n3 * 2;
        }
        switch (a2) {
            case lDv: {
                return this.lDb + n3 * 2 + (n2 - 1);
            }
            case lDx: {
                return this.lDc + n3 * 2 + (n2 - 1);
            }
            case lDw: {
                return this.lDd + n3 * 2 + (n2 - 1);
            }
            case lDy: {
                return this.lDe + n3 * 2 + (n2 - 1);
            }
        }
        return this.lDb;
    }

    public void g(int n, int n2, boolean bl) {
        int n3 = this.f(n, n2, bl);
        lfn.print("***CurrentKeyPointID = " + this.lDh + " KeyPointID " + n3);
        if (n3 == this.lDh) {
            this.lwn.cLW();
            return;
        }
        this.lDg = this.lDh;
        this.lDh = n3;
        this.Z(n3, false);
    }

    public void b(int n, int n2, a a2) {
        int n3 = this.a(n, n2, a2);
        if (n3 == this.lDh) {
            this.lwn.cLW();
            return;
        }
        this.lDg = this.lDh;
        this.lDh = n3;
        this.Z(n3, this.lDi == this.lDj && this.lDj == a.lDv && this.lDk == this.lDl);
    }

    private void Z(int n, boolean bl) {
        if (bl && this.lDg != -1) {
            this.lDm = true;
            this.lDo = this.hu.get(this.lDg);
            this.lDq = this.hu.get(n);
            this.lDr = this.ht.get(this.lDg);
            this.lDt = this.ht.get(n);
            this.lDp = new lgl();
            this.lDp.c(this.lDo, this.lDq, 0.5f);
            this.lDs = ljq.e(this.lDr, this.lDt, 0.5f);
            this.lDp.Y(new lgl(new ljq(0.0f, 1.0f, 0.0f), 0.5f));
            this.lDs.es(new ljq(-4.5f, 0.5f, 1.0f));
        } else {
            this.u(this.ht.get(n), this.hu.get(n));
        }
    }

    private void u(ljq ljq2, lgl lgl2) {
        if (ljq2 == null || lgl2 == null) {
            return;
        }
        kis kis2 = (kis)this.MessageDelegator.h(2049);
        kis2.HT(12);
        kis2.ts(this.GUID);
        kis2.oG(lcr.rg);
        kis2.c(ljq2);
        kis2.a(lgl2);
        this.MessageDelegator.a(kis2);
    }

    private void a(ljq ljq2, lgl lgl2) {
        if (this.hs == null) {
            return;
        }
        int n = this.ht.indexOf(ljq2);
        assert (n != -1);
        kin kin2 = (kin)this.MessageDelegator.h(2053);
        kin2.XT(64);
        kin2.oG(lcr.rg);
        kin2.ts(this.GUID);
        kin2.e(this.hs);
        kin2.XV(n);
        this.MessageDelegator.a(kin2);
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        kio kio2 = (kio)this.MessageDelegator.h(2057);
        kio2.XW(2);
        kio2.oG(lcr.rg);
        kio2.ts(this.GUID);
        kio2.e(this.hs);
        this.MessageDelegator.a(kio2);
    }
}

