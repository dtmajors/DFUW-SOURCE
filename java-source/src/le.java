/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Set;

public class le
extends mgs<le> {
    public static final short asJ = 23;
    public static final char asL = '0';
    public static final char asM = '1';
    public static final char asK = '2';
    private boolean asN = false;

    public le(short s, short s2, short s3) {
        super(s, s2, s3);
    }

    private le(short s, short s2, short s3, mgt mgt2) {
        super(s, s2, s3, mgt2);
    }

    protected le c(short s, short s2, short s3, mgt mgt2) {
        return new le(s, s2, s3, mgt2);
    }

    public void a(lgs lgs2) {
        if (lgs2 == null) {
            return;
        }
        if (this.isLeaf()) {
            if (this.asN) {
                if (lgs2.cf > this.Dwa) {
                    lgs2.cf = this.Dwa;
                }
                if (lgs2.cg > this.Dwb) {
                    lgs2.cg = this.Dwb;
                }
                if (lgs2.cf + lgs2.rmN < this.Dwa + this.Dwc) {
                    lgs2.rmN = this.Dwa + this.Dwc - lgs2.cf;
                }
                if (lgs2.cg + lgs2.H < this.Dwb + this.Dwc) {
                    lgs2.H = this.Dwb + this.Dwc - lgs2.cg;
                }
            }
        } else if (this.Dwe != null) {
            ((le)this.Dwe).a(lgs2);
        }
        if (this.Dwd != null) {
            ((le)this.Dwd).a(lgs2);
        }
    }

    public boolean b(float f, float f2) {
        if (this.ao(f, f2)) {
            if (this.Dwe != null) {
                return ((le)this.Dwe).b(f, f2);
            }
            return this.asN;
        }
        if (this.Dwd != null) {
            return ((le)this.Dwd).b(f, f2);
        }
        return false;
    }

    public boolean d(float f, float f2, float f3) {
        if (this.ao(f, f2) || this.L(f, f2, f3)) {
            if (this.Dwe != null) {
                return ((le)this.Dwe).d(f, f2, f3);
            }
            return this.asN;
        }
        if (this.Dwd != null) {
            return ((le)this.Dwd).d(f, f2, f3);
        }
        return false;
    }

    public void B(List<lgs> list) {
        if (this.asN) {
            list.add(this.eyS());
        }
        if (this.Dwe != null) {
            ((le)this.Dwe).B(list);
        }
        if (this.Dwd != null) {
            ((le)this.Dwd).B(list);
        }
    }

    public void c(Set<le> set) {
        if (this.isLeaf()) {
            if (this.asN) {
                set.add(this);
            }
        } else if (this.Dwe != null) {
            ((le)this.Dwe).c(set);
        }
        if (this.Dwd != null) {
            ((le)this.Dwd).c(set);
        }
    }

    @Override
    protected boolean hasData() {
        return this.asN;
    }

    @Override
    protected boolean oH() {
        return this.Dwc > 23;
    }

    @Override
    protected boolean oI() {
        return false;
    }

    @Override
    protected void oJ() {
    }

    @Override
    public void a(StringBuilder stringBuilder) {
        stringBuilder.append((char)(this.Dwe == null ? (this.asN ? 49 : 50) : 48));
        if (this.Dwe != null) {
            ((le)this.Dwe).a(stringBuilder);
        }
        if (this.Dwd != null) {
            ((le)this.Dwd).a(stringBuilder);
        }
    }

    @Override
    public void parse(String string) {
        this.c(string, 0);
    }

    @Override
    protected int c(String string, int n) {
        switch (string.charAt(n)) {
            case '2': {
                this.asN = false;
                this.Dwe = null;
                break;
            }
            case '0': {
                this.eyT();
                break;
            }
            case '1': {
                this.asN = true;
                this.Dwe = null;
            }
        }
        if (this.Dwe != null) {
            ++n;
            n = ((le)this.Dwe).c(string, n);
        }
        if (this.Dwd != null) {
            ++n;
            n = ((le)this.Dwd).c(string, n);
        }
        return n;
    }

    @Override
    protected /* synthetic */ mgs b(short s, short s2, short s3, mgt mgt2) {
        return this.c(s, s2, s3, mgt2);
    }
}

