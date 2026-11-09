/*
 * Decompiled with CFR.
 */
import java.util.List;
import java.util.Set;

public class lc
extends mgs<lc> {
    public static final short asJ = 23;
    public static final char asK = '0';
    public static final char asL = '1';
    public static final char asM = '2';
    private boolean asN = false;

    public lc(short s, short s2, short s3) {
        super(s, s2, s3);
    }

    private lc(short s, short s2, short s3, mgt mgt2) {
        super(s, s2, s3, mgt2);
    }

    protected lc a(short s, short s2, short s3, mgt mgt2) {
        return new lc(s, s2, s3, mgt2);
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
            ((lc)this.Dwe).a(lgs2);
        }
        if (this.Dwd != null) {
            ((lc)this.Dwd).a(lgs2);
        }
    }

    public void c(float f, float f2, float f3) {
        if (!this.asN && (this.ao(f, f2) || this.L(f, f2, f3))) {
            if (this.Dwe == null) {
                if (this.eyT()) {
                    ((lc)this.Dwe).c(f, f2, f3);
                } else {
                    this.asN = true;
                }
            } else {
                ((lc)this.Dwe).c(f, f2, f3);
                if (((lc)this.Dwe).asN) {
                    this.eyU();
                }
            }
        }
        if (this.Dwd != null) {
            ((lc)this.Dwd).c(f, f2, f3);
        }
    }

    public void a(float f, float f2, float f3, List<lgs> list) {
        if (!this.asN && (this.ao(f, f2) || this.L(f, f2, f3))) {
            if (this.Dwe == null) {
                if (this.eyT()) {
                    ((lc)this.Dwe).a(f, f2, f3, list);
                } else {
                    this.asN = true;
                    list.add(this.eyS());
                }
            } else {
                ((lc)this.Dwe).a(f, f2, f3, list);
                if (((lc)this.Dwe).asN) {
                    this.eyU();
                }
            }
        }
        if (this.Dwd != null) {
            ((lc)this.Dwd).a(f, f2, f3, list);
        }
    }

    public void a(le le2) {
        if (!this.asN) {
            if (this.a((mgs<?>)le2)) {
                this.asN = true;
                if (this.Dwe != null) {
                    this.Dwe = null;
                }
            } else if (this.b(le2)) {
                if (this.isLeaf()) {
                    if (this.eyT()) {
                        ((lc)this.Dwe).a(le2);
                    } else {
                        this.asN = true;
                    }
                } else {
                    ((lc)this.Dwe).a(le2);
                    if (((lc)this.Dwe).asN) {
                        this.eyU();
                    }
                }
            }
        }
        if (this.Dwd != null) {
            ((lc)this.Dwd).a(le2);
        }
    }

    public void a(le le2, List<lgs> list) {
        if (!this.asN) {
            if (this.a((mgs<?>)le2)) {
                this.asN = true;
                list.add(this.eyS());
                if (this.Dwe != null) {
                    this.Dwe = null;
                }
            } else if (this.b(le2)) {
                if (this.isLeaf()) {
                    if (this.eyT()) {
                        ((lc)this.Dwe).a(le2, list);
                    } else {
                        this.asN = true;
                        list.add(this.eyS());
                    }
                } else {
                    ((lc)this.Dwe).a(le2, list);
                    if (((lc)this.Dwe).asN) {
                        this.eyU();
                    }
                }
            }
        }
        if (this.Dwd != null) {
            ((lc)this.Dwd).a(le2, list);
        }
    }

    public boolean b(float f, float f2) {
        if (this.ao(f, f2)) {
            if (this.Dwe != null) {
                return ((lc)this.Dwe).b(f, f2);
            }
            return this.asN;
        }
        if (this.Dwd != null) {
            return ((lc)this.Dwd).b(f, f2);
        }
        return false;
    }

    public void B(List<lgs> list) {
        if (this.asN) {
            list.add(this.eyS());
        }
        if (this.Dwe != null) {
            ((lc)this.Dwe).B(list);
        }
        if (this.Dwd != null) {
            ((lc)this.Dwd).B(list);
        }
    }

    @Override
    protected boolean hasData() {
        return this.asN;
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
        return ((lc)this.Dwe).asN == ((lc)((lc)this.Dwe).Dwd).asN && ((lc)((lc)this.Dwe).Dwd).asN == ((lc)((lc)((lc)this.Dwe).Dwd).Dwd).asN && ((lc)((lc)((lc)this.Dwe).Dwd).Dwd).asN == ((lc)((lc)((lc)((lc)this.Dwe).Dwd).Dwd).Dwd).asN;
    }

    @Override
    protected void oJ() {
        if (this.Dwe == null) {
            return;
        }
        this.asN = ((lc)this.Dwe).asN;
    }

    @Override
    public boolean b(Set<le> set) {
        if (this.isLeaf()) {
            if (this.asN) {
                for (le le2 : set) {
                    if (!this.b(le2)) continue;
                    return true;
                }
            }
        } else {
            for (le le3 : set) {
                if (!this.a((mgs<?>)le3)) continue;
                return true;
            }
            if (this.Dwe != null && ((lc)this.Dwe).b(set)) {
                return true;
            }
        }
        return this.Dwd != null && ((lc)this.Dwd).b(set);
    }

    public boolean a(Set<le> set, float f) {
        if ((float)this.Dwc >= f) {
            if (this.isLeaf()) {
                if (this.asN) {
                    for (le le2 : set) {
                        if (!this.b(le2)) continue;
                        return true;
                    }
                }
            } else {
                for (le le3 : set) {
                    if (!this.a((mgs<?>)le3)) continue;
                    return true;
                }
                if (this.Dwe != null && ((lc)this.Dwe).a(set, f)) {
                    return true;
                }
            }
        }
        return this.Dwd != null && ((lc)this.Dwd).a(set, f);
    }

    @Override
    public void a(StringBuilder stringBuilder) {
        stringBuilder.append((char)(this.Dwe == null ? (this.asN ? 50 : 48) : 49));
        if (this.Dwe != null) {
            ((lc)this.Dwe).a(stringBuilder);
        }
        if (this.Dwd != null) {
            ((lc)this.Dwd).a(stringBuilder);
        }
    }

    @Override
    public void parse(String string) {
        this.c(string, 0);
    }

    @Override
    protected int c(String string, int n) {
        switch (string.charAt(n)) {
            case '0': {
                this.asN = false;
                this.Dwe = null;
                break;
            }
            case '1': {
                this.eyT();
                break;
            }
            case '2': {
                this.asN = true;
                this.Dwe = null;
            }
        }
        if (this.Dwe != null) {
            ++n;
            n = ((lc)this.Dwe).c(string, n);
        }
        if (this.Dwd != null) {
            ++n;
            n = ((lc)this.Dwd).c(string, n);
        }
        return n;
    }

    @Override
    protected /* synthetic */ mgs b(short s, short s2, short s3, mgt mgt2) {
        return this.a(s, s2, s3, mgt2);
    }
}

