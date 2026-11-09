/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 */
public class du
extends btk
implements bto {
    private ljq mZ = null;
    private float Radius = 1200.0f;
    private ljq na = new ljq(1.5707964f, 1.5707964f, 0.0f);
    private float nb = 200.0f;
    private ljq nc = null;
    private ljq nd = null;
    private ljq ne = null;
    private double nf = 0.0;
    private double ng = 2.0;

    @Override
    public void initialize() {
        if (this.ObserverObjects != null && this.ObserverObjects.isEmpty()) {
            lfn.b(5, this.getClass().getName(), "No Observer Objects to Controll!");
        }
    }

    @Override
    public void doTick(ldz ldz2) {
        if (this.ObserverObjects != null && !this.ObserverObjects.isEmpty()) {
            if (this.mZ == null) {
                ldv ldv2 = (ldv)this.ObserverObjects.get(0);
                amf amf2 = this.MessageDelegator.d(ldv2);
                if (amf2 instanceof dqk) {
                    this.mZ = ((dqk)amf2).av();
                    this.nc = ljq.A(this.mZ, this.Radius);
                    this.nd = ljq.A(this.mZ, this.Radius);
                    this.ne = ljq.A(this.mZ, this.Radius);
                } else if (amf2 instanceof drx) {
                    this.mZ = ((drx)amf2).av();
                    this.nc = ljq.A(this.mZ, this.Radius);
                    this.nd = ljq.A(this.mZ, this.Radius);
                    this.ne = ljq.A(this.mZ, this.Radius);
                } else {
                    lfn.b(5, this.getClass().getName(), "ObserverObject NOT WorldMeshObject!");
                    return;
                }
            }
            int n = this.ObserverObjects.size();
            for (int i = 0; i < n; ++i) {
                this.b(ldz2.qwh, ldz2.rgz, (ldv)this.ObserverObjects.get(i));
            }
        }
    }

    private void b(double d2, double d3, ldv ldv2) {
        ljq ljq2 = new ljq();
        ljq ljq3 = new ljq();
        this.a(d3, ljq2, ljq3);
        kky kky2 = (kky)this.MessageDelegator.h(1025);
        kky2.pHG = ljq2.x;
        kky2.pHH = ljq2.y;
        kky2.pHI = ljq2.rlV;
        lgl lgl2 = new lgl(ljq3);
        kky2.rb = lgl2.x;
        kky2.rc = lgl2.y;
        kky2.rd = lgl2.rlV;
        kky2.pHJ = lgl2.rlW;
        kky2.hC(ldv2);
        kky2.ts(this.GUID);
        kky2.wD(false);
        kky2.pHF = 8;
        this.MessageDelegator.a(kky2);
    }

    private void a(double d2, ljq ljq2, ljq ljq3) {
        if (d2 > this.nf) {
            this.cT();
            this.nf = d2 + this.ng;
        }
        double d3 = 1.0 - (this.nf - d2) / this.ng;
        ljq ljq4 = ljq.c(this.nc, this.nd, this.ne, (float)d3);
        ljq2.eu(ljq4);
        this.a(d3, ljq3);
    }

    public void cT() {
        this.nc = this.ne;
        this.nd = new ljq(this.ne.x + (this.ne.x - this.nd.x), this.ne.y + (this.ne.y - this.nd.y), this.ne.rlV + (this.ne.rlV - this.nd.rlV));
        this.ne = ljq.A(this.nd, this.nb);
    }

    public void a(double d2, ljq ljq2) {
        ljq ljq3 = ljq.d(this.nc, this.nd, this.ne, (float)d2);
        ljq3.normalize();
        ljq2.x = this.na.x + (float)Math.atan2(ljq3.y, ljq3.rlV);
        ljq2.y = this.na.y + (float)Math.atan2(ljq3.y, ljq3.rlV);
        ljq2.rlV = this.na.rlV + 0.0f;
    }
}

