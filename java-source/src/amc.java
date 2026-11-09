/*
 * Decompiled with CFR.
 */
public class amc
extends btk {
    protected static final int bud = 0;
    public static final int bue = 0;
    public static final int buf = 0;
    public static final int bug = 1;
    public static final int buh = 2;
    private static final cqi[] bui = new cqi[0];
    protected static final amd buj = new amd(amc.class, null, "LogicObjectGeneric", bui, null);
    private int buk;
    private amd bul;
    private Object[] bum;

    public static final String gE(int n) {
        switch (n) {
            case 0: {
                return "Undefined";
            }
            case 1: {
                return "Client";
            }
            case 2: {
                return "Server";
            }
            case 3: {
                return "Client&Server";
            }
        }
        assert (false) : n;
        return "Invalid(" + n + ")";
    }

    public amc(amd amd2) {
        this.bul = amd2;
        int n = this.bul.getPropertyCount();
        this.bum = new Object[n];
        for (int i = 0; i < n; ++i) {
            this.bum[i] = this.bul.gH(i).getDefaultValue();
        }
    }

    public final void gF(int n) {
        assert (!this.Initialized);
        assert (n == 1 || n == 2);
        assert (this.buk == 0);
        this.buk = n;
    }

    @Override
    public final void initialize() {
        assert (!this.Initialized);
        assert (!this.Initialized);
        assert (!this.CleanedUp);
        super.initialize();
        assert (this.Initialized);
        this.FF();
        this.Initialized = true;
    }

    @Override
    public final void cleanUp() {
        assert (this.Initialized);
        assert (this.Initialized);
        assert (!this.CleanedUp);
        this.FG();
        super.cleanUp();
        assert (this.Initialized);
        assert (this.CleanedUp);
        this.Initialized = false;
    }

    public final amd FC() {
        return this.bul;
    }

    public final Object gG(int n) {
        return this.bum[n];
    }

    public final Object dl(String string) {
        int n = this.FC().dm(string);
        if (n == -1) {
            return null;
        }
        return this.bum[n];
    }

    public final void a(int n, Object object) {
        assert (this.bul.gH(n).u(object) == 0);
        if (this.c(this.bum[n], object)) {
            return;
        }
        Object object2 = this.bum[n];
        this.bum[n] = object;
        this.b(n, object2);
    }

    public final Object[] FD() {
        Object[] objectArray = new Object[this.bum.length];
        System.arraycopy(this.bum, 0, objectArray, 0, this.bum.length);
        return objectArray;
    }

    public final amc FE() {
        amc amc2 = this.FC().FJ();
        amc2.a(this);
        return amc2;
    }

    public final void a(amc amc2) {
        assert (amc2.bul.a(this.bul));
        int n = this.bul.getPropertyCount();
        for (int i = 0; i < n; ++i) {
            this.a(i, amc2.gG(i));
        }
    }

    @Override
    public void receiveMessage(dxq dxq2) {
        assert (this.Initialized);
        super.receiveMessage(dxq2);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(1024);
        stringBuilder.append("{SFLogicObjectGeneric: super=");
        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append("LogicObjectGenericClass.getName()=");
        stringBuilder.append(this.bul.getName());
        stringBuilder.append(",");
        stringBuilder.append("GUID=");
        stringBuilder.append(this.GUID);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof amc)) {
            return false;
        }
        amc amc2 = (amc)object;
        if (!amc2.bul.a(this.bul)) {
            return false;
        }
        int n = this.bul.getPropertyCount();
        for (int i = 0; i < n; ++i) {
            if (this.c(this.bum[i], amc2.bum[i])) continue;
            return false;
        }
        return this.GUID.equals(amc2.getGUID());
    }

    public int compareTo(Object object) {
        assert (object instanceof amc);
        assert (((amc)object).bul.a(this.bul));
        amc amc2 = (amc)object;
        int n = this.bul.getPropertyCount();
        for (int i = 0; i < n; ++i) {
            assert (this.bum[i] instanceof Comparable) : i;
            assert (amc2.bum[i] instanceof Comparable);
            int n2 = ((Comparable)this.bum[i]).compareTo(amc2.bum[i]);
            if (n2 == 0) continue;
            return n2;
        }
        return 0;
    }

    protected void FF() {
        assert (this.Initialized);
    }

    protected void FG() {
        assert (this.Initialized);
    }

    protected void b(int n, Object object) {
        if (!this.FH() || this.Initialized) {
            // empty if block
        }
    }

    protected final boolean FH() {
        return (this.buk & 2) != 0;
    }

    protected final boolean FI() {
        return (this.buk & 1) != 0;
    }

    private dxq k(int n, ldv ldv2) {
        dxq dxq2 = this.MessageDelegator.h(n, this.GUID, ldv2);
        assert (dxq2 != null);
        assert (dxq2.bEz() == n);
        return dxq2;
    }

    private boolean c(Object object, Object object2) {
        if (object == null && object2 == null) {
            return true;
        }
        if (object == null) {
            return false;
        }
        return object.equals(object2);
    }
}

