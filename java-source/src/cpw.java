/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  bpq
 */
public class cpw
extends cpu
implements brb {
    private btn eHi = null;
    private long dBq = 0L;
    int[] eUp = new int[]{83886290, 0x50000AA, 83886249, 83886260, 83886252, 83886283, 83886187, 83886474};
    double eUq = 0.0;
    double eUr = 0.0;

    public cpw() {
        super(true);
    }

    @Override
    public ldv asa() {
        return this.getGUID();
    }

    @Override
    public int asb() {
        return 0;
    }

    public void c(btn btn2) {
        this.eHi = btn2;
    }

    public void d(btn btn2) {
        this.eHi = null;
    }

    @Override
    public void doTick(ldz ldz2) {
    }

    private void sB(int n) {
        if (this.MessageDelegator.arc().rgz - this.eUr < 2.0) {
            return;
        }
        dzv dzv2 = (dzv)this.MessageDelegator.h(7425, this.GUID, this.KY());
        dzv2.dTs = n;
        this.MessageDelegator.H(dzv2);
        this.eUr = this.MessageDelegator.arc().rgz;
    }

    public void cleanUp() {
        if (this.dwJ != null) {
            this.MessageDelegator.hd(this.dwJ.getGUID());
        }
        super.cleanUp();
    }

    public void receiveMessage(dxq dxq2) {
        if (this.eHi != null && this.eHi.a(dxq2, (btk)((Object)this))) {
            return;
        }
        switch (dxq2.bEz()) {
            case 11777: {
                if (Math.random() > 0.3) {
                    this.sB(83886247);
                }
                this.dwJ.receiveMessage(dxq2);
                break;
            }
            case 4878: {
                if (Math.random() > 0.3) {
                    this.sB(83886248);
                }
                this.dwJ.receiveMessage(dxq2);
                break;
            }
            case 20228: {
                this.a((gzg)dxq2);
                break;
            }
            case 26632: {
                this.a((frq)dxq2);
                break;
            }
            case 8001: {
                this.a((fnv)dxq2);
                break;
            }
            default: {
                super.receiveMessage(dxq2);
            }
        }
    }

    private void a(gzg gzg2) {
        gzh gzh2 = (gzh)this.MessageDelegator.h(20229, this.getGUID(), gzg2.aO());
        this.MessageDelegator.b(gzg2, gzh2);
        gzh2.Ri = gzg2.Ri;
        gzh2.dxp = false;
        this.MessageDelegator.F(gzh2);
    }

    private void a(frq frq2) {
        bpq bpq2 = (bpq)this.aYl().lk(128);
        if (bpq2 != null) {
            bpq2.receiveMessage((dxq)frq2);
        }
    }

    private void a(fnv fnv2) {
        bpq bpq2 = (bpq)this.aYl().lk(128);
        if (bpq2 != null) {
            bpq2.receiveMessage((dxq)fnv2);
        }
    }

    public void c(kec kec2) {
        bpq bpq2 = (bpq)this.aYl().lk(128);
        if (bpq2 == null) {
            return;
        }
        bpq2.a(kec2);
        this.dBq = kec2.piN;
    }

    public kec aYm() {
        bpq bpq2 = (bpq)this.aYl().lk(128);
        if (bpq2 == null) {
            return null;
        }
        kec kec2 = new kec();
        kec2.piN = this.dBq;
        bpq2.b(kec2);
        return kec2;
    }

    public void Hy() {
        this.aIw();
        bpq bpq2 = (bpq)this.aYl().lk(128);
        if (bpq2 != null) {
            bpq2.c(this.aAG().av());
        }
    }

    public void N(long l2) {
        this.dBq = l2;
    }

    public long auq() {
        return this.dBq;
    }
}

