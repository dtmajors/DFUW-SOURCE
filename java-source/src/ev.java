/*
 * Decompiled with CFR.
 */
public class ev
extends ej {
    private ldv PB = null;

    public ev() {
        super(4);
        this.DP = 7;
    }

    public ldv fP() {
        return this.PB;
    }

    public void F(ldv ldv2) {
        if (lin.i(this.PB, ldv2)) {
            return;
        }
        this.PB = ldv2;
        if (this.DQ != null) {
            this.DQ.e(this);
        }
    }

    @Override
    public ej fm() {
        ev ev2 = new ev();
        this.a(ev2);
        return ev2;
    }

    @Override
    public ej fn() {
        return this.fm();
    }

    @Override
    public Object getValue() {
        return this.PB;
    }

    @Override
    public void setValue(Object object) {
        if (object == null) {
            this.F(null);
        } else if (object instanceof ldv) {
            this.F((ldv)object);
        } else {
            lfn.b(5, "SFGUIDAttribute", "setValue() Value is not an SFGUID, it is: " + object.getClass().getName());
        }
    }

    public String toString() {
        if (this.PB == null) {
            return "null";
        }
        return this.PB.toString();
    }

    @Override
    protected void a(ej ej2) {
        super.a(ej2);
        ev ev2 = (ev)ej2;
        ev2.F(this.PB);
    }

    @Override
    public final String fj() {
        if (this.PB == null) {
            return "null";
        }
        return this.PB.toString();
    }

    @Override
    public final boolean aq(String string) {
        if (string.equalsIgnoreCase("null")) {
            this.setValue(null);
        } else {
            ldv ldv2 = ldv.zq(string);
            if (ldv2 == null) {
                lfn.b(5, "SFGUIDAttribute", "setDataAsString(): Data '" + string + "' isn't a valid GUID");
                return false;
            }
            this.setValue(ldv2);
        }
        return true;
    }
}

