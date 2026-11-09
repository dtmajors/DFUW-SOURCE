/*
 * Decompiled with CFR.
 */
public abstract class cqi {
    public static final int eUM = 0;
    public static final int eUN = 1;
    public static final int eUO = 2;
    public static final int eUP = 3;
    private int cck;
    private String Name;
    private boolean eUQ;
    private Object crG;
    private Class eUR;
    private lip bZO;
    public final hc eUS;

    public cqi(hc hc2, int n, String string, boolean bl, Object object, Class clazz, lip lip2) {
        assert (object == null || object.getClass() == clazz);
        this.cck = n;
        this.Name = string;
        this.eUQ = bl;
        this.crG = object;
        this.eUR = clazz;
        this.bZO = lip2;
        this.eUS = hc2;
    }

    public final int anD() {
        return this.cck;
    }

    public final String getPropertyName() {
        return this.Name;
    }

    public final lip aYB() {
        return this.bZO;
    }

    public final boolean aYC() {
        return this.eUQ;
    }

    public final Class aYD() {
        return this.eUR;
    }

    public final Object getDefaultValue() {
        if (this.crG == null) {
            return null;
        }
        return this.v(this.crG);
    }

    public final int u(Object object) {
        return this.w(object);
    }

    public final String sD(int n) {
        return this.sE(n);
    }

    public final Object hP(String string) {
        Object object = this.hQ(string);
        assert (object == null || object.getClass() == this.eUR);
        return object;
    }

    public final uk aYE() {
        return this.aYJ();
    }

    public final Object v(Object object) {
        assert (object == null || object.getClass() == this.eUR);
        if (object == null) {
            return null;
        }
        Object object2 = this.y(object);
        assert (this.eUR.isInstance(object2));
        return object2;
    }

    public final boolean aYF() {
        return this.aYK();
    }

    public final Object e(Object object, Object object2) {
        assert (this.aYF());
        assert (object == null || object.getClass() == this.eUR);
        assert (object2 == null || object2.getClass() == this.eUR);
        if (object == null && object2 == null) {
            return null;
        }
        Object object3 = object == null ? this.y(object2) : (object2 == null ? this.y(object) : this.f(object, object2));
        assert (object3.getClass() == this.eUR);
        return object3;
    }

    public final boolean aYG() {
        return this.aYL();
    }

    public final Object b(Object object, Object object2, float f2) {
        assert (this.aYG());
        assert (object == null || object.getClass() == this.eUR);
        assert (object2 == null || object2.getClass() == this.eUR);
        if (object == null && object2 == null) {
            return null;
        }
        if (object == null) {
            return object2;
        }
        if (object2 == null) {
            return object;
        }
        Object object3 = this.c(object, object2, f2);
        assert (object3.getClass() == this.eUR);
        return object3;
    }

    public final boolean aYH() {
        return this.aYM();
    }

    public final Object a(Object[] objectArray, float[] fArray) {
        assert (this.aYH());
        assert (this.a(objectArray, this.eUR));
        assert (objectArray.length == fArray.length);
        assert (objectArray.length == 3 || objectArray.length == 4);
        for (int i = 0; i < objectArray.length; ++i) {
            if (objectArray[i] != null) continue;
            return null;
        }
        Object object = this.b(objectArray, fArray);
        assert (object == null || object.getClass() == this.eUR);
        return object;
    }

    public final boolean aYI() {
        return this.aYN();
    }

    public final Object bm(Object[] objectArray) {
        assert (this.aYI());
        assert (this.a(objectArray, this.eUR));
        assert (objectArray.length == 3 || objectArray.length == 4);
        Object object = this.bn(objectArray);
        assert (object.getClass() == this.eUR);
        return object;
    }

    protected int w(Object object) {
        if (object == null) {
            if (!this.eUQ) {
                return 1;
            }
        } else if (!this.eUR.isInstance(object)) {
            return 2;
        }
        return 0;
    }

    protected String sE(int n) {
        switch (n) {
            case 0: {
                return "VALIDITY_OK";
            }
            case 2: {
                return "VALIDITY_WRONG_CLASS";
            }
        }
        assert (false) : n;
        return "VALIDITY_UNKNOWN";
    }

    protected abstract Object hQ(String var1);

    public abstract lip x(Object var1);

    protected abstract uk aYJ();

    protected abstract Object y(Object var1);

    protected boolean aYK() {
        return false;
    }

    protected Object f(Object object, Object object2) {
        assert (false);
        return null;
    }

    protected boolean aYL() {
        return false;
    }

    protected Object c(Object object, Object object2, float f2) {
        assert (false);
        return null;
    }

    protected boolean aYM() {
        return false;
    }

    protected Object b(Object[] objectArray, float[] fArray) {
        assert (false);
        return null;
    }

    protected boolean aYN() {
        return false;
    }

    protected Object bn(Object[] objectArray) {
        assert (false);
        return null;
    }

    private boolean a(Object[] objectArray, Class clazz) {
        for (int i = 0; i < objectArray.length; ++i) {
            if (objectArray[i] == null || objectArray[i].getClass() == clazz) continue;
            return false;
        }
        return true;
    }
}

