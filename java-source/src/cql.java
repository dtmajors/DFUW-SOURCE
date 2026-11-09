/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class cql
extends cqi {
    public cql(hc hc2, int n, String string, boolean bl, ldc ldc2, lip lip2) {
        super(hc2, n, string, bl, ldc2, ldc.class, lip2);
    }

    @Override
    protected Object hQ(String string) {
        return ldc.zk(string);
    }

    @Override
    public final lip x(Object object) {
        assert (object instanceof ldc);
        ldc ldc2 = (ldc)object;
        return new ljg(ldc2.x + "," + ldc2.y + "," + ldc2.rlV);
    }

    @Override
    protected uk aYJ() {
        return null;
    }

    @Override
    protected Object y(Object object) {
        return new ldc((ldc)object);
    }

    @Override
    protected boolean aYK() {
        return true;
    }

    @Override
    protected Object f(Object object, Object object2) {
        ldc ldc2 = (ldc)object;
        ldc ldc3 = (ldc)object2;
        ljq ljq2 = new ljq(lcw.ah((float)ldc2.x, (float)ldc3.x), lcw.ah((float)ldc2.y, (float)ldc3.y), lcw.ah((float)ldc2.rlV, (float)ldc3.rlV));
        ljq2.normalize();
        return new ldc(ljq2);
    }

    @Override
    protected boolean aYM() {
        return true;
    }

    @Override
    protected Object b(Object[] objectArray, float[] fArray) {
        ljq ljq2 = new ljq(0.0f, 0.0f, 0.0f);
        for (int i = 0; i < objectArray.length; ++i) {
            ldc ldc2 = (ldc)objectArray[i];
            ljq2.x += ldc2.x * fArray[i];
            ljq2.y += ldc2.y * fArray[i];
            ljq2.rlV += ldc2.rlV * fArray[i];
        }
        ljq2.normalize();
        return new ldc(ljq2);
    }

    @Override
    protected boolean aYL() {
        return true;
    }

    @Override
    protected Object c(Object object, Object object2, float f2) {
        return this.a((ldc)object, (ldc)object2, f2);
    }

    private ldc a(ldc ldc2, ldc ldc3, float f2) {
        float f3 = ldc3.x;
        if (f3 < ldc2.x) {
            f3 += (float)Math.PI * 2;
        }
        f3 = ldc2.x + (f3 - ldc2.x) * f2;
        float f4 = ldc3.y;
        if (f4 < ldc2.y) {
            f4 += (float)Math.PI * 2;
        }
        f4 = ldc2.y + (f4 - ldc2.y) * f2;
        float f5 = ldc3.rlV;
        if (f5 < ldc2.rlV) {
            f5 += (float)Math.PI * 2;
        }
        f5 = ldc2.rlV + (f5 - ldc2.rlV) * f2;
        return new ldc(f3, f4, f5);
    }
}

