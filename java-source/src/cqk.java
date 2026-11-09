/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
public class cqk
extends cqi {
    public cqk(hc hc2, int n, String string, boolean bl, lcq lcq2, lip lip2) {
        super(hc2, n, string, bl, lcq2, lcq.class, lip2);
    }

    @Override
    protected Object hQ(String string) {
        return lcq.zd(string);
    }

    @Override
    public final lip x(Object object) {
        assert (object instanceof lcq);
        lcq lcq2 = (lcq)object;
        return new ljg(lcq2.r + "," + lcq2.g + "," + lcq2.b + "," + lcq2.a);
    }

    @Override
    protected uk aYJ() {
        return new uc();
    }

    @Override
    protected Object y(Object object) {
        return new lcq((lcq)object);
    }

    @Override
    protected boolean aYK() {
        return true;
    }

    @Override
    protected Object f(Object object, Object object2) {
        lcq lcq2 = (lcq)object;
        lcq lcq3 = (lcq)object2;
        lcq lcq4 = new lcq(lcw.ah((float)lcq2.r, (float)lcq3.r), lcw.ah((float)lcq2.g, (float)lcq3.g), lcw.ah((float)lcq2.b, (float)lcq3.b), lcw.ah((float)lcq2.a, (float)lcq3.a));
        lcq4 = lcq4.emS();
        return lcq4;
    }

    @Override
    protected boolean aYM() {
        return true;
    }

    @Override
    protected Object b(Object[] objectArray, float[] fArray) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (int i = 0; i < objectArray.length; ++i) {
            lcq lcq2 = (lcq)objectArray[i];
            f2 += lcq2.r * fArray[i];
            f3 += lcq2.g * fArray[i];
            f4 += lcq2.b * fArray[i];
            f5 += lcq2.a * fArray[i];
        }
        return new lcq(f2, f3, f4, f5).emS();
    }

    @Override
    protected boolean aYN() {
        return true;
    }

    @Override
    protected Object bn(Object[] objectArray) {
        lcq[] lcqArray = new lcq[objectArray.length];
        for (int i = 0; i < objectArray.length; ++i) {
            lcqArray[i] = (lcq)objectArray[i];
        }
        lcq lcq2 = lcq.b(lcqArray);
        return lcq2;
    }

    @Override
    protected boolean aYL() {
        return true;
    }

    @Override
    protected Object c(Object object, Object object2, float f2) {
        return lcq.a((lcq)object, (lcq)object2, f2);
    }
}

