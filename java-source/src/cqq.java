/*
 * Decompiled with CFR.
 */
public class cqq
extends cqi {
    public cqq(hc hc2, int n, String string, boolean bl, lgl lgl2, lip lip2) {
        super(hc2, n, string, bl, lgl2, lgl.class, lip2);
    }

    @Override
    protected Object hQ(String string) {
        return lgl.zF(string);
    }

    @Override
    public final lip x(Object object) {
        assert (object instanceof lgl);
        lgl lgl2 = (lgl)object;
        return new ljg(lgl2.x + "," + lgl2.y + "," + lgl2.rlV + "," + lgl2.rlW);
    }

    @Override
    protected uk aYJ() {
        return new um();
    }

    @Override
    protected Object y(Object object) {
        return new lgl((lgl)object);
    }

    @Override
    protected boolean aYK() {
        return true;
    }

    @Override
    protected Object f(Object object, Object object2) {
        lgl lgl2 = (lgl)object;
        assert (lgl2.isNormalized());
        lgl lgl3 = (lgl)object2;
        assert (lgl3.isNormalized());
        lgl lgl4 = new lgl(lgl2.x + lgl3.x, lgl2.y + lgl3.y, lgl2.rlV + lgl3.rlV, lgl2.rlW + lgl3.rlW);
        lgl4.normalize();
        return lgl4;
    }

    @Override
    protected boolean aYL() {
        return true;
    }

    @Override
    protected Object c(Object object, Object object2, float f2) {
        return this.a((lgl)object, (lgl)object2, f2);
    }

    private lgl a(lgl lgl2, lgl lgl3, float f2) {
        lgl lgl4 = new lgl();
        lgl4.c(lgl2, lgl3, f2);
        assert (lgl4.isNormalized());
        return lgl4;
    }
}

