/*
 * Decompiled with CFR.
 */
public abstract class loc
extends lmv {
    public loc(a a2) {
        super(a2);
    }

    public final String getValue() {
        return this.ewA();
    }

    public final boolean AO(String string) {
        if (!this.set_value(string)) {
            return false;
        }
        this.cdX();
        return true;
    }

    public final boolean a(loc loc2) {
        return lin.i(this.getValue(), loc2.getValue());
    }

    @Override
    protected boolean e(lmv lmv2) {
        return this.b((loc)lmv2);
    }

    @Override
    protected boolean f(lmv lmv2) {
        if (lmv2 instanceof loc) {
            return this.a((loc)lmv2);
        }
        return false;
    }

    @Override
    protected boolean d(lfu lfu2) {
        return this.set_value(lfu2.aA("Value", this.getValue()));
    }

    @Override
    protected String dPh() {
        return this.getValue();
    }

    protected abstract String ewA();

    protected abstract void AP(String var1);

    protected boolean b(loc loc2) {
        return this.set_value(loc2.getValue());
    }

    protected boolean set_value(String string) {
        if (string == this.getValue()) {
            return false;
        }
        this.AP(string);
        return true;
    }
}

