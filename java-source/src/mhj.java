/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.List;

public class mhj
extends mgs<mhj> {
    public static final short asJ = 23;
    public static final int DwT = 2;
    public static final int DwU = 4;
    public static final int DwV = 8;
    private int DwW = 0;

    private static boolean gj(int n, int n2) {
        if (n2 == cug.fkT || n2 == 2) {
            return (n & 2) == 2;
        }
        if (n2 == cug.fkS || n2 == 4) {
            return (n & 4) == 4;
        }
        if (n2 == cug.fkU || n2 == 8) {
            return (n & 8) == 8;
        }
        return false;
    }

    public mhj(short s, short s2, short s3) {
        super(s, s2, s3);
    }

    private mhj(short s, short s2, short s3, mgt mgt2) {
        super(s, s2, s3, mgt2);
    }

    protected mhj i(short s, short s2, short s3, mgt mgt2) {
        return new mhj(s, s2, s3, mgt2);
    }

    public void f(List<lgs> list, int n) {
        if (mhj.gj(this.DwW, n)) {
            list.add(this.eyS());
        }
        if (this.Dwe != null) {
            ((mhj)this.Dwe).f(list, n);
        }
        if (this.Dwd != null) {
            ((mhj)this.Dwd).f(list, n);
        }
    }

    @Override
    protected boolean hasData() {
        return this.DwW > 0;
    }

    @Override
    protected boolean oH() {
        if (this.Dwc <= 23) {
            return false;
        }
        return this.isLeaf();
    }

    @Override
    protected boolean oI() {
        if (this.Dwe == null) {
            return false;
        }
        return ((mhj)this.Dwe).DwW == ((mhj)((mhj)this.Dwe).Dwd).DwW && ((mhj)((mhj)this.Dwe).Dwd).DwW == ((mhj)((mhj)((mhj)this.Dwe).Dwd).Dwd).DwW && ((mhj)((mhj)((mhj)this.Dwe).Dwd).Dwd).DwW == ((mhj)((mhj)((mhj)((mhj)this.Dwe).Dwd).Dwd).Dwd).DwW;
    }

    @Override
    protected void oJ() {
        if (this.Dwe == null) {
            return;
        }
        this.DwW = ((mhj)this.Dwe).DwW;
    }

    @Override
    public void a(StringBuilder stringBuilder) {
        stringBuilder.append((this.DwW < 10 ? "0" : "") + Integer.toString(this.DwW));
        if (this.Dwe != null) {
            ((mhj)this.Dwe).a(stringBuilder);
        }
        if (this.Dwd != null) {
            ((mhj)this.Dwd).a(stringBuilder);
        }
    }

    @Override
    public void parse(String string) {
        this.c(string, 0);
    }

    @Override
    protected int c(String string, int n) {
        this.DwW = Integer.parseInt("" + string.charAt(n) + string.charAt(n + 1));
        switch (this.DwW) {
            case 0: {
                this.eyT();
                break;
            }
            default: {
                this.Dwe = null;
            }
        }
        if (this.Dwe != null) {
            n = ((mhj)this.Dwe).c(string, n + 2);
        }
        if (this.Dwd != null) {
            n = ((mhj)this.Dwd).c(string, n + 2);
        }
        return n;
    }

    @Override
    protected /* synthetic */ mgs b(short s, short s2, short s3, mgt mgt2) {
        return this.i(s, s2, s3, mgt2);
    }
}

