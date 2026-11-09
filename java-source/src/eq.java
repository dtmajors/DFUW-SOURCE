/*
 * Decompiled with CFR.
 */
public class eq
extends ej {
    protected boolean Pp = false;

    public eq() {
        super(0);
        this.DP = 1;
    }

    public boolean getBooleanValue() {
        return this.Pp;
    }

    public void x(boolean bl) {
        if (this.Pp == bl) {
            return;
        }
        boolean bl2 = this.Pp;
        this.Pp = bl;
        if (this.DQ != null) {
            this.DQ.a(this, bl2);
        }
    }

    @Override
    public final Object getValue() {
        return this.getBooleanValue();
    }

    @Override
    public final void setValue(Object object) {
        if (object == null) {
            lfn.b(5, "SFBooleanAttribute", "setValue() Value is null.");
        } else if (object instanceof Boolean) {
            this.x((Boolean)object);
        } else {
            lfn.b(5, "SFBooleanAttribute", "setValue() Value is not a Boolean, it is: " + object.getClass().getName());
        }
    }

    @Override
    public ej fm() {
        eq eq2 = new eq();
        this.a(eq2);
        return eq2;
    }

    @Override
    public ej fn() {
        return this.fm();
    }

    public final void fB() {
        this.x(!this.Pp);
    }

    public String toString() {
        return Boolean.toString(this.getBooleanValue());
    }

    @Override
    protected void a(ej ej2) {
        super.a(ej2);
        eq eq2 = (eq)ej2;
        eq2.x(this.getBooleanValue());
    }

    @Override
    public final String fj() {
        return "" + this.getBooleanValue();
    }

    @Override
    public final boolean aq(String string) {
        this.x(Boolean.parseBoolean(string));
        return true;
    }
}

