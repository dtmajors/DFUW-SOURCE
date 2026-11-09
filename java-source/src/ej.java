/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  ep
 */
import java.util.List;

public abstract class ej {
    protected int DP;
    private int kM;
    protected int Type = -1;
    protected el DQ = null;

    public ej(int n) {
        this.kM = n;
        this.DP = 0;
    }

    private ej() {
    }

    public final int fh() {
        return this.DP;
    }

    public final int getDataType() {
        return this.kM;
    }

    public final int getType() {
        return this.Type;
    }

    public final void setType(int n) {
        if (n < 0) {
            lfn.b(5, "SFAttribute", "setType() AttributeType is invalid.");
            return;
        }
        this.Type = n;
    }

    public final el fi() {
        return this.DQ;
    }

    public final void a(el el2) {
        this.DQ = el2;
    }

    public abstract String fj();

    public abstract boolean aq(String var1);

    public int hashCode() {
        return this.getValue().hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        ej ej2 = (ej)object;
        if (this.Type != ej2.Type) {
            return false;
        }
        return lin.i(this.getValue(), ej2.getValue());
    }

    public final String fk() {
        return pr.b(':', this.getName(), this.fh(), this.fj());
    }

    public static ej ar(String string) {
        List<String> list = pr.a(':', string);
        if (list == null || list.size() != 3) {
            lfn.b(5, "SFAttribute", "fromDBString: Can't parse '" + string + "'");
            return null;
        }
        int n = -1;
        try {
            n = Integer.parseInt(list.get(1));
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFAttribute", "fromDBString: Can't parse '" + string + "'");
            return null;
        }
        ej ej2 = ep.aD((int)n);
        if (ej2 == null) {
            lfn.b(5, "SFAttribute", "fromDBString: Can't parse '" + string + "'");
            return null;
        }
        int n2 = ep.as((String)list.get(0));
        if (n2 < 0) {
            lfn.b(5, "SFAttribute", "fromDBString: Can't parse '" + string + "'");
            return null;
        }
        ej2.setType(n2);
        if (!ej2.aq(list.get(2))) {
            lfn.b(5, "SFAttribute", "fromDBString: Can't parse '" + string + "'");
            return null;
        }
        return ej2;
    }

    public final String getName() {
        return ep.aM((int)this.Type);
    }

    public final String fl() {
        return ep.aN((int)this.kM);
    }

    public abstract ej fm();

    public abstract ej fn();

    public abstract Object getValue();

    public abstract void setValue(Object var1);

    public String fo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": Name='");
        stringBuilder.append(this.getName());
        stringBuilder.append("' DataType='");
        stringBuilder.append(this.fl());
        stringBuilder.append("' Value=");
        stringBuilder.append(this.toString());
        return stringBuilder.toString();
    }

    protected void a(ej ej2) {
        ej2.setType(this.Type);
    }
}

