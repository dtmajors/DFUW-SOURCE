/*
 * Decompiled with CFR.
 */
public class dqr
extends btk {
    private ljq be = null;
    private lgl dpi = null;
    private boolean dVa = false;
    private int[] dUZ = new int[0];
    private boolean dUO = false;
    private boolean dUX = false;
    private boolean dUP = false;
    private boolean dUQ = false;
    private boolean gPg = false;
    private ljq dVh = null;
    private boolean dVb = false;
    private int dVc = 10;
    private float Radius = 10.0f;
    private float gPh = 0.7853982f;
    private float gPi = 100.0f;
    private int dUM = 0;
    private int dUN = 5;
    private float dVi = 500.0f;
    private int dVf = 10;
    private float dVg = 0.31415927f;
    private ldv dUR = null;
    private ldv Uj = null;
    private ljq dUS = null;
    private lgl dUT = null;
    private boolean dUU = false;
    private boolean dUW = false;
    private boolean gPj = false;
    private boolean dUV = true;
    private boolean dUY = false;

    public void iP(boolean bl) {
        this.gPj = bl;
    }

    public void aBl() {
        assert (this.MessageDelegator != null);
        this.dUX = false;
        this.dUW = true;
        kli kli2 = (kli)this.MessageDelegator.h(1037);
        kli2.ts(this.getGUID());
        kli2.hC(this.Uj);
        int n = 1;
        n = this.dUP ? (n |= 0x20) : (this.dUQ ? (n |= 0x40) : (n |= 0x10));
        n = this.dUO ? (n |= 0x400) : (n |= 0x200);
        kli2.setType(n);
        kli2.c(this.be);
        kli2.a(this.dpi);
        kli2.aM(this.dUZ);
        kli2.wY(this.dVb);
        kli2.bg(this.dVh);
        kli2.my(this.dVi);
        kli2.setRadius(this.Radius);
        kli2.YO(this.dVc);
        kli2.eY(this.dVa);
        kli2.YP(this.dVf);
        kli2.mx(this.dVg);
        kli2.wZ(false);
        kli2.xa(false);
        this.MessageDelegator.a(kli2);
    }

    public void n(lgl lgl2) {
        ljq ljq2 = new ljq(0.0f, 0.0f, 1.0f);
        lgl lgl3 = new lgl(lgl2);
        this.dVh = lgl.a(lgl3, ljq2);
        this.dVh.normalize();
    }

    public void a(kuz kuz2) {
        if (kuz2.getResult() != 0) {
            ++this.dUM;
            if (this.dUM >= this.dUN) {
                if (!this.dUV) {
                    this.dUY = false;
                    this.dUW = false;
                    this.dUX = true;
                    return;
                }
                this.dUS = this.be;
                this.dUT = new lgl();
                kky kky2 = (kky)this.MessageDelegator.h(1025);
                kky2.jM(false);
                kky2.wD(false);
                kky2.hC(this.Uj);
                kky2.ts(this.getGUID());
                ljq ljq2 = new ljq(this.dUS);
                ljq2.y -= 1.0f;
                kky2.pHG = ljq2.x;
                kky2.pHH = ljq2.y;
                kky2.pHI = ljq2.rlV;
                ljq ljq3 = this.dpi.eqT();
                ljq3.rlV = 0.0f;
                ljq3.x = 0.0f;
                lgl lgl2 = new lgl(ljq3);
                assert (lgl2.eqP());
                kky2.rb = lgl2.x;
                kky2.rc = lgl2.y;
                kky2.rd = lgl2.rlV;
                kky2.pHJ = lgl2.rlW;
                kky2.pHF = 1;
                this.MessageDelegator.a(kky2);
                this.dUW = false;
                this.dUX = true;
                this.dUY = true;
                return;
            }
            this.Radius *= (float)(this.dUM + 1);
            if (this.dUM > 2) {
                this.dVb = true;
            }
            this.aBl();
            return;
        }
        this.dUW = false;
        this.dUX = true;
        this.dUY = true;
        this.dUS = kuz2.ehi();
        this.dUT = kuz2.ehj();
    }

    public int[] aBx() {
        return this.dUZ;
    }

    public void v(int[] nArray) {
        this.dUZ = nArray;
    }

    public ldv ane() {
        return this.Uj;
    }

    public void jY(ldv ldv2) {
        this.Uj = ldv2;
    }

    public boolean bup() {
        return this.gPg;
    }

    public void iQ(boolean bl) {
        this.gPg = bl;
    }

    public lgl apV() {
        return this.dpi;
    }

    public void d(lgl lgl2) {
        this.dpi = lgl2;
    }

    public boolean aBy() {
        return this.dVa;
    }

    public void eY(boolean bl) {
        this.dVa = bl;
    }

    public ljq aBz() {
        return this.dVh;
    }

    public void bg(ljq ljq2) {
        this.dVh = ljq2;
    }

    public boolean aBu() {
        return this.dUO;
    }

    public void eV(boolean bl) {
        this.dUO = bl;
    }

    public ljq Ky() {
        return this.be;
    }

    public void bf(ljq ljq2) {
        this.be = ljq2;
    }

    public boolean aBv() {
        return this.dUP;
    }

    public void eW(boolean bl) {
        this.dUP = bl;
    }

    public boolean aBw() {
        return this.dUQ;
    }

    public void eX(boolean bl) {
        this.dUQ = bl;
    }

    public ldv aBr() {
        return this.dUR;
    }

    public void jZ(ldv ldv2) {
        this.dUR = ldv2;
    }

    public boolean aBm() {
        return this.dUX;
    }

    public boolean aBn() {
        return this.dUW;
    }

    public ljq aBp() {
        return this.dUS;
    }

    public lgl aBq() {
        return this.dUT;
    }

    public boolean aBs() {
        return this.dUU;
    }

    public void eT(boolean bl) {
        this.dUU = bl;
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        super.receiveMessage(dxq2);
    }

    @Override
    public void receiveResourceResponse(ktf ktf2) {
        super.receiveResourceResponse(ktf2);
    }

    @Override
    public void receiveResponse(ktv ktv2) {
        switch (ktv2.egT()) {
            case 1028: {
                this.a((kuz)ktv2);
                break;
            }
            default: {
                super.receiveResponse(ktv2);
            }
        }
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
    }

    public float getRadius() {
        return this.Radius;
    }

    public void setRadius(float f2) {
        this.Radius = f2;
    }

    public boolean aBt() {
        return this.dUV;
    }

    public void eU(boolean bl) {
        this.dUV = bl;
    }

    public boolean aBo() {
        return this.dUY;
    }

    public void eS(boolean bl) {
        this.dUY = bl;
    }
}

