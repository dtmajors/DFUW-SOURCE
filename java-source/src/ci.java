/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cn
 *  lcr
 */
import java.util.List;

public class ci
extends btk
implements bto {
    private ldv hs;
    private List<ljq> ht;
    private List<lgl> hu;
    private List<Integer> hv = lcn.emv();
    private List<Integer> hw = lcn.emv();
    private List<Float> hx = lcn.emv();
    private boolean fE = true;
    cn hy;
    private boolean hz;

    public ci(cn cn2) {
        this.hy = cn2;
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    private void aL() {
        int n;
        int[] nArray = new int[this.hv.size()];
        for (int i = 0; i < this.hv.size(); ++i) {
            nArray[i] = this.hv.get(i);
        }
        int[] nArray2 = new int[this.hw.size()];
        for (int i = 0; i < this.hw.size(); ++i) {
            nArray2[i] = this.hw.get(i);
        }
        float[] fArray = new float[this.hx.size()];
        for (n = 0; n < this.hx.size(); ++n) {
            fArray[n] = this.hx.get(n).floatValue();
        }
        n = this.ht.indexOf(this.hy.bb());
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
        kin kin2 = (kin)this.MessageDelegator.h(2053);
        kin2.XT(109);
        kin2.oG(lcr.rg);
        kin2.ts(this.GUID);
        kin2.e(this.hs);
        kin2.j(this.ht.toArray(new ljq[this.ht.size()]));
        kin2.b(this.hu.toArray(new lgl[this.hu.size()]));
        kin2.aJ(nArray);
        kin2.aK(nArray2);
        kin2.n(fArray);
        kin2.XU(n2);
        kin2.XV(n);
        this.MessageDelegator.a(kin2);
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.fE) {
            this.fE = false;
            this.aL();
        }
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        if (ktv2.egT() == 2307) {
            this.a((ktm)ktv2);
        } else {
            super.receiveResponse(ktv2);
        }
    }

    private void a(ktm ktm2) {
        lfn.b(0, this.getClass().getSimpleName(), "handlerAnimatedCameraControllerResponse() : Got it! ID = " + ktm2.egP());
        if (this.hz) {
            this.hy.ba();
        }
    }

    public void a(ljq ljq2, lgl lgl2) {
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

    public void d(List<ljq> list) {
        this.ht = list;
    }

    public void e(List<lgl> list) {
        this.hu = list;
    }

    public void e(ldv ldv2) {
        this.hs = ldv2;
    }

    public void f(List<Integer> list) {
        this.hw = list;
    }

    public void g(List<Float> list) {
        this.hx = list;
    }

    public void h(List<Integer> list) {
        this.hv = list;
    }

    public boolean aM() {
        return this.hz;
    }

    public void k(boolean bl) {
        this.hz = bl;
    }
}

