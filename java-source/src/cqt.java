/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class cqt
extends cqi {
    public cqt(hc hc2, int n, String string, boolean bl, ljq ljq2, lip lip2) {
        super(hc2, n, string, bl, ljq2, ljq.class, lip2);
    }

    @Override
    protected Object hQ(String string) {
        return ljq.Au(string);
    }

    @Override
    public final lip x(Object object) {
        assert (object instanceof ljq);
        ljq ljq2 = (ljq)object;
        return new ljg(ljq2.x + "," + ljq2.y + "," + ljq2.rlV);
    }

    @Override
    protected uk aYJ() {
        return new uq();
    }

    @Override
    protected Object y(Object object) {
        return new ljq((ljq)object);
    }

    @Override
    protected boolean aYK() {
        return true;
    }

    @Override
    protected Object f(Object object, Object object2) {
        ljq ljq2 = (ljq)object;
        ljq ljq3 = (ljq)object2;
        ljq ljq4 = new ljq(lcw.ah((float)ljq2.x, (float)ljq3.x), lcw.ah((float)ljq2.y, (float)ljq3.y), lcw.ah((float)ljq2.rlV, (float)ljq3.rlV));
        return ljq4;
    }

    @Override
    protected boolean aYM() {
        return true;
    }

    @Override
    protected Object b(Object[] objectArray, float[] fArray) {
        ljq ljq2 = new ljq(0.0f, 0.0f, 0.0f);
        for (int i = 0; i < objectArray.length; ++i) {
            ljq ljq3 = (ljq)objectArray[i];
            ljq2.x += ljq3.x * fArray[i];
            ljq2.y += ljq3.y * fArray[i];
            ljq2.rlV += ljq3.rlV * fArray[i];
        }
        return ljq2;
    }

    @Override
    protected boolean aYL() {
        return true;
    }

    @Override
    protected Object c(Object object, Object object2, float f2) {
        return this.e((ljq)object, (ljq)object2, f2);
    }

    private ljq e(ljq ljq2, ljq ljq3, float f2) {
        float f3 = ljq3.x;
        if (f3 < ljq2.x) {
            f3 += (float)Math.PI * 2;
        }
        f3 = ljq2.x + (f3 - ljq2.x) * f2;
        float f4 = ljq3.y;
        if (f4 < ljq2.y) {
            f4 += (float)Math.PI * 2;
        }
        f4 = ljq2.y + (f4 - ljq2.y) * f2;
        float f5 = ljq3.rlV;
        if (f5 < ljq2.rlV) {
            f5 += (float)Math.PI * 2;
        }
        f5 = ljq2.rlV + (f5 - ljq2.rlV) * f2;
        return new ljq(f3, f4, f5);
    }
}

