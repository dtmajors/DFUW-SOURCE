/*
 * Decompiled with CFR.
 */
public class gvw
extends gvy
implements dxu {
    private int aqs = -1;
    public int bRy = -1;
    public int jsB = 0;
    public int jsC = 5;
    public int ResourceType = 0;
    public boolean ikP = false;
    public ljq Position;
    public lgl Rotation;
    public float bRu;
    public coc[] jsD;
    public double iKA = 0.0;
    public ldv ilU = null;

    gvw() {
        super(33025);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public final int az() {
        return this.ResourceType;
    }

    public final void l(int n) {
        this.ResourceType = n;
    }

    public final boolean bFj() {
        return this.ikP;
    }

    public final void jS(boolean bl) {
        this.ikP = bl;
    }

    public final ljq av() {
        return this.Position;
    }

    public final void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public final lgl aw() {
        return this.Rotation;
    }

    public final void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public final ldv bFz() {
        return this.ilU;
    }

    public final void oF(ldv ldv2) {
        this.ilU = ldv2;
    }

    public final double bOK() {
        return this.iKA;
    }

    public final void cA(double d) {
        this.iKA = d;
    }

    public float bYh() {
        return this.bRu;
    }

    public void eD(float f) {
        this.bRu = f;
    }

    public coc[] bYi() {
        return this.jsD;
    }

    public void a(coc[] cocArray) {
        this.jsD = cocArray;
    }

    public float getRadius() {
        return this.jsC;
    }

    public int bYj() {
        return this.bRy;
    }

    public void sh(int n) {
        this.bRy = n;
    }

    public int bYk() {
        return this.jsB;
    }

    public void KM(int n) {
        this.jsB = n;
    }

    public void KN(int n) {
        this.jsC = n;
    }
}

