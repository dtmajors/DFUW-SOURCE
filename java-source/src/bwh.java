/*
 * Decompiled with CFR.
 */
public class bwh
extends btk {
    private int dUM = 0;
    private int dUN = 5;
    private boolean dUO = false;
    private boolean dUP = false;
    private boolean dUQ = false;
    private ldv dUR = null;
    private ldv Uj = null;
    private ljq dUS = null;
    private lgl dUT = null;
    private boolean dUU = false;
    private boolean dUV = true;
    private boolean dUW = false;
    private boolean dUX = false;
    private boolean dUY = false;
    private int[] dUZ = new int[0];
    private boolean dVa = false;
    private boolean dVb = false;
    private int dVc = 20;
    private ljq be = null;
    private lgl dpi = null;
    private boolean dVd = false;
    private boolean dVe = false;
    private int dVf = 20;
    private float dVg = 0.31415927f;
    private float Radius = 10.0f;
    private ljq dVh = null;
    private float dVi = 500.0f;

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
        kli2.aM(this.dUZ);
        kli2.eU(this.dUV);
        kli2.eY(this.dVa);
        kli2.wY(this.dVb);
        kli2.YO(this.dVc);
        kli2.c(this.be);
        kli2.a(this.dpi);
        kli2.wZ(this.dVd);
        kli2.xa(this.dVe);
        kli2.YP(this.dVf);
        kli2.mx(this.dVg);
        kli2.setRadius(this.Radius);
        kli2.bg(this.dVh);
        kli2.my(this.dVi);
        this.MessageDelegator.a(kli2);
    }

    public void n(lgl lgl2) {
        ljq ljq2 = new ljq(0.0f, 0.0f, 1.0f);
        lgl lgl3 = new lgl(lgl2);
        this.dVh = lgl.a(lgl3, ljq2);
        this.dVh.normalize();
        lfn.b(0, "SFMeshObjectSpawner", "setCharacterDirection() THIS IS ROTATION: " + lgl2.eqT());
        lfn.b(0, "SFMeshObjectSpawner", "setCharacterDirection() THIS IS DIRECTION: " + this.dVh);
    }

    private void a(kuz kuz2) {
        this.dUW = false;
        this.dUX = true;
        boolean bl = this.dUY = kuz2.getResult() == 0;
        if (this.dUY) {
            this.dUS = kuz2.ehi();
            this.dUT = kuz2.ehj();
        }
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

    public boolean aBm() {
        return this.dUX;
    }

    public boolean aBn() {
        return this.dUW;
    }

    public boolean aBo() {
        return this.dUY;
    }

    public void eS(boolean bl) {
        this.dUY = bl;
    }

    public ljq aBp() {
        return this.dUS;
    }

    public lgl aBq() {
        return this.dUT;
    }

    public ldv ane() {
        return this.Uj;
    }

    public void jY(ldv ldv2) {
        this.Uj = ldv2;
    }

    public ldv aBr() {
        return this.dUR;
    }

    public void jZ(ldv ldv2) {
        this.dUR = ldv2;
    }

    public boolean aBs() {
        return this.dUU;
    }

    public void eT(boolean bl) {
        this.dUU = bl;
    }

    public boolean aBt() {
        return this.dUV;
    }

    public void eU(boolean bl) {
        this.dUV = bl;
    }

    public boolean aBu() {
        return this.dUO;
    }

    public void eV(boolean bl) {
        this.dUO = bl;
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

    public int[] aBx() {
        return this.dUZ;
    }

    public void v(int[] nArray) {
        this.dUZ = nArray;
    }

    public boolean aBy() {
        return this.dVa;
    }

    public void eY(boolean bl) {
        this.dVa = bl;
    }

    public ljq Ky() {
        return this.be;
    }

    public void bf(ljq ljq2) {
        this.be = ljq2;
    }

    public lgl apV() {
        return this.dpi;
    }

    public void d(lgl lgl2) {
        this.dpi = lgl2;
    }

    public float getRadius() {
        return this.Radius;
    }

    public void setRadius(float f2) {
        this.Radius = f2;
    }

    public ljq aBz() {
        return this.dVh;
    }

    public void bg(ljq ljq2) {
        this.dVh = ljq2;
    }
}

