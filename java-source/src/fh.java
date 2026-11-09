/*
 * Decompiled with CFR.
 */
public class fh
extends ej {
    private ljq Qi = null;

    public fh() {
        super(6);
        this.DP = 12;
    }

    public ljq gy() {
        return this.Qi;
    }

    public void L(ljq ljq2) {
        if (lin.i(this.Qi, ljq2)) {
            return;
        }
        this.Qi = ljq2;
        if (this.DQ != null) {
            this.DQ.e(this);
        }
    }

    @Override
    public ej fm() {
        fh fh2 = new fh();
        this.a(fh2);
        return fh2;
    }

    @Override
    public ej fn() {
        return this.fm();
    }

    @Override
    public Object getValue() {
        return this.Qi;
    }

    @Override
    public void setValue(Object object) {
        if (object == null) {
            this.L(null);
        } else if (object instanceof ljq) {
            this.L((ljq)object);
        } else {
            lfn.b(5, "SFVector3Attribute", "setValue() Value is not an SFVector3, it is: " + object.getClass().getName());
        }
    }

    public String toString() {
        if (this.Qi == null) {
            return "null";
        }
        return this.Qi.toString();
    }

    @Override
    protected void a(ej ej2) {
        super.a(ej2);
        fh fh2 = (fh)ej2;
        fh2.L(this.Qi);
    }

    @Override
    public final String fj() {
        if (this.Qi == null) {
            return "null";
        }
        return this.Qi.toString();
    }

    @Override
    public final boolean aq(String string) {
        if (string.equalsIgnoreCase("null")) {
            this.L(null);
        } else {
            ljq ljq2 = ljq.Aw(string);
            if (ljq2 == null) {
                lfn.b(5, "SFVector3Attribute", "setDataAsString(): Data '" + string + "' isn't a valid SFVector3");
                return false;
            }
            this.L(ljq2);
        }
        return true;
    }
}

