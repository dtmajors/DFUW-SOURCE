/*
 * Decompiled with CFR.
 */
public class fd
extends ej {
    private fc Qf = null;

    public fd() {
        super(5);
        this.DP = 9;
    }

    @Override
    public Object getValue() {
        return this.Qf;
    }

    @Override
    public void setValue(Object object) {
        if (object instanceof fc) {
            this.Qf = (fc)object;
        } else {
            lfn.b(5, "SFPositionalInfoAttribute", "setValue() Value is not a SFPositionalInfo, it is: " + object.getClass().getName());
        }
    }

    @Override
    public ej fm() {
        fd fd2 = new fd();
        this.a(fd2);
        return fd2;
    }

    @Override
    public ej fn() {
        return this.fm();
    }

    public String toString() {
        if (this.Qf != null) {
            return this.Qf.toString();
        }
        return "SFPositionalInfoAttribute: Value=null";
    }

    @Override
    protected void a(ej ej2) {
        super.a(ej2);
        if (this.Qf != null) {
            fd fd2 = (fd)ej2;
            fd2.setValue(this.Qf.gv());
        }
    }

    @Override
    public final String fj() {
        assert (false);
        return null;
    }

    @Override
    public final boolean aq(String string) {
        assert (false);
        return false;
    }
}

