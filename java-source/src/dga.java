/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 */
public class dga
extends dey {
    public static final int gpl = 1;
    public static final int gpm = 2;
    public static final int gpn = 4;
    public static final int gpo = 1;
    public static final int gpp = 2;
    public static final int gpq = 4;
    private int gpr = 0;
    private ljq Position = null;
    private ldv gps = null;
    private int gpt = 2;
    private double gpu = 1.0;
    private ljq mZ = null;
    private float Radius = 0.2f;
    private ljq na = new ljq(1.5707964f, 1.5707964f, 0.0f);
    private float nb = 0.4f;
    private ljq nc = null;
    private ljq nd = null;
    private ljq ne = null;
    private double nf = 0.0;
    private double ng = 1.0;
    private int gpv = 20;
    private boolean gpw = true;
    protected boolean gpx = true;
    private float gpy = 1.0f;
    private float gpz = 12.0f;
    private String gpA = "Prop\\All\\all_barrel001.xml";

    dga() {
        this.gnv = 20;
    }

    public int bnd() {
        return this.gpt;
    }

    public void Aj(int n2) {
        if (!this.Initialized) {
            this.gpt = n2;
        }
    }

    public int bne() {
        return this.gpr;
    }

    public void Ak(int n2) {
        this.gpr = n2;
    }

    public String bnf() {
        return this.gpA;
    }

    public void iM(String string) {
        this.gpA = string;
    }

    public double bng() {
        return this.gpu;
    }

    public void bN(double d2) {
        this.gpu = d2;
    }

    public float bnh() {
        return this.gpy;
    }

    public void gz(float f2) {
        this.gpy = f2;
    }

    public float bni() {
        return this.gpz;
    }

    public void gA(float f2) {
        this.gpz = f2;
    }

    @Override
    public void doTick(ldz ldz2) {
        this.blG();
    }

    @Override
    public void initialize() {
        assert (this.Position != null);
        this.gps = null;
        if (this.gps == null) {
            this.gps = this.MessageDelegator.bzv();
        }
    }

    @Override
    public void cleanUp() {
        if (this.gpx) {
            this.MessageDelegator.hd(this.gps);
        }
    }

    protected void a(dey dey2) {
        super.copyValues(dey2);
        dga dga2 = (dga)dey2;
        dga2.Aj(this.gpt);
        dga2.iM(this.gpA);
        dga2.Ak(this.gpr);
        dga2.bN(this.gpu);
        dga2.gA(this.gpz);
        dga2.gz(this.gpy);
    }

    private void iN(String string) {
        dqk dqk2 = new dqk();
        dqk2.setGUID(this.gps);
        dqk2.ju(dqk2.getGUID());
        dqk2.setServerObject(false);
        dqk2.setObjectDescriptionFilename(string);
        dqk2.c(this.Position);
        dqk2.d(new ljq());
        dqk2.setVisible(false);
        this.MessageDelegator.a((amf)dqk2);
    }

    private void blG() {
        if (this.ObserverObjects != null && !this.ObserverObjects.isEmpty()) {
            if ((this.gpt & 1) != 0) {
                this.bnl();
            }
            if ((this.gpt & 2) != 0) {
                this.bnj();
            }
            if ((this.gpt & 4) != 0) {
                this.bnk();
            }
        }
    }

    private void bnj() {
        float f2 = (float)((this.MessageDelegator.arc().rgz - this.oV) / this.eKm);
        if (f2 > 1.0f) {
            return;
        }
        float f3 = this.o(f2, this.gpy, this.gpz);
        fua fua2 = (fua)this.MessageDelegator.h(1029, this.GUID, this.gps);
        fua2.HW(1);
        fua2.setScale(f3);
        this.MessageDelegator.F(fua2);
    }

    private void bnk() {
        if (this.gpr == 0) {
            return;
        }
        double d2 = Math.PI * this.MessageDelegator.arc().qwh * this.gpu;
        ljq ljq2 = new ljq(0.0f, 0.0f, 0.0f);
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        if ((this.gpr & 1) != 0) {
            f2 = (float)d2;
        }
        if ((this.gpr & 2) != 0) {
            f3 = (float)d2;
        }
        if ((this.gpr & 4) != 0) {
            f4 = (float)d2;
        }
        ljq ljq3 = new ljq(f2, f3, f4);
        ftv ftv2 = (ftv)this.MessageDelegator.h(1025, this.GUID, this.gps);
        ftv2.c(ljq2);
        ftv2.a(new lgl(ljq3));
        ftv2.HT(128);
        this.MessageDelegator.F(ftv2);
    }

    private void bnl() {
        ljq ljq2 = new ljq();
        double d2 = this.MessageDelegator.arc().qwh * 0.2;
        ljq2.km((float)d2);
        if (this.ObserverObjects != null && !this.ObserverObjects.isEmpty()) {
            if (this.mZ == null) {
                this.mZ = new ljq(this.Position);
                this.nc = ljq.A(this.mZ, this.Radius);
                this.nd = ljq.A(this.mZ, this.Radius);
                this.ne = ljq.A(this.mZ, this.Radius);
            }
            int n2 = this.ObserverObjects.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                this.b(this.MessageDelegator.arc().qwh, this.MessageDelegator.arc().rgz, (ldv)this.ObserverObjects.get(i2));
            }
        }
    }

    private void b(double d2, double d3, ldv ldv2) {
        ljq ljq2 = new ljq();
        ljq ljq3 = new ljq();
        this.a(d3, ljq2, ljq3);
        ftv ftv2 = (ftv)this.MessageDelegator.h(1025, this.GUID, this.gps);
        ftv2.c(ljq2);
        ftv2.a(new lgl(ljq3));
        ftv2.HT(8);
        this.MessageDelegator.F(ftv2);
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

