/*
 * Decompiled with CFR.
 */
public class mhd
extends mgs<mhd> {
    public static final float bbM = 4.0f;
    public static float bbN = 5.75f;
    private a DwG = a.DwK;

    public mhd(short s, short s2, short s3) {
        super(s, s2, s3);
    }

    private mhd(short s, short s2, short s3, mgt mgt2) {
        super(s, s2, s3, mgt2);
    }

    protected mhd g(short s, short s2, short s3, mgt mgt2) {
        return new mhd(s, s2, s3, mgt2);
    }

    public boolean as(float f, float f2) {
        if (this.ao(f, f2)) {
            if (this.Dwe != null) {
                return ((mhd)this.Dwe).as(f, f2);
            }
            return this.DwG == a.DwJ;
        }
        if (this.Dwd != null) {
            return ((mhd)this.Dwd).as(f, f2);
        }
        return false;
    }

    @Override
    protected boolean hasData() {
        return this.DwG != a.DwI;
    }

    @Override
    protected boolean oH() {
        if ((float)this.Dwc <= bbN) {
            return false;
        }
        return this.isLeaf();
    }

    @Override
    protected boolean oI() {
        if (this.Dwe == null) {
            return false;
        }
        return ((mhd)this.Dwe).DwG == ((mhd)((mhd)this.Dwe).Dwd).DwG && ((mhd)((mhd)this.Dwe).Dwd).DwG == ((mhd)((mhd)((mhd)this.Dwe).Dwd).Dwd).DwG && ((mhd)((mhd)((mhd)this.Dwe).Dwd).Dwd).DwG == ((mhd)((mhd)((mhd)((mhd)this.Dwe).Dwd).Dwd).Dwd).DwG;
    }

    @Override
    protected void oJ() {
        if (this.Dwe == null) {
            return;
        }
        this.DwG = ((mhd)this.Dwe).DwG;
    }

    @Override
    public void a(StringBuilder stringBuilder) {
        stringBuilder.append(Integer.toString(this.DwG.ordinal()));
        if (this.Dwe != null) {
            ((mhd)this.Dwe).a(stringBuilder);
        }
        if (this.Dwd != null) {
            ((mhd)this.Dwd).a(stringBuilder);
        }
    }

    @Override
    public void parse(String string) {
        this.c(string, 0);
    }

    @Override
    protected int c(String string, int n) {
        this.DwG = a.getValueByOrdinal(Integer.parseInt("" + string.charAt(n)));
        switch (this.DwG) {
            case DwI: {
                this.eyT();
                break;
            }
            default: {
                this.Dwe = null;
            }
        }
        if (this.Dwe != null) {
            n = ((mhd)this.Dwe).c(string, n + 1);
        }
        if (this.Dwd != null) {
            n = ((mhd)this.Dwd).c(string, n + 1);
        }
        return n;
    }

    @Override
    protected /* synthetic */ mgs b(short s, short s2, short s3, mgt mgt2) {
        return this.g(s, s2, s3, mgt2);
    }
}

