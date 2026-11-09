/*
 * Decompiled with CFR.
 */
public class fg
extends ej {
    private loz Qh = null;

    public fg() {
        super(8);
        this.DP = 14;
    }

    public loz gx() {
        return this.Qh;
    }

    @Override
    public Object getValue() {
        return this.Qh;
    }

    public void b(loz loz2) {
        this.Qh = loz2;
        if (this.DQ != null) {
            this.DQ.e(this);
        }
    }

    @Override
    public void setValue(Object object) {
        if (object == null || object instanceof loz) {
            this.Qh = (loz)object;
            if (this.DQ != null) {
                this.DQ.e(this);
            }
        } else {
            lfn.b(5, "SFStringInstanceAttribute", "setValue() : Object is not an SFStringInstance, it is a " + object.getClass().getSimpleName());
            assert (false);
        }
    }

    @Override
    public String fj() {
        return null;
    }

    @Override
    public boolean aq(String string) {
        this.Qh = loz.Bg(string);
        if (this.Qh == null) {
            return false;
        }
        if (this.Qh.exz().compareTo(lqm.sdM.getIdentifier()) == 0) {
            this.Qh = null;
        }
        return true;
    }

    @Override
    public ej fm() {
        fg fg2 = new fg();
        fg2.b(this.Qh);
        fg2.setType(this.Type);
        return fg2;
    }

    @Override
    public ej fn() {
        return this.fm();
    }
}

