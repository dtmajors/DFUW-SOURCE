/*
 * Decompiled with CFR.
 */
public class yv
extends mgs<yv> {
    public static final float bbM = 4.0f;
    public static float bbN = 5.75f;
    public static final char asL = '0';
    public static final char asM = '1';
    public static final char asK = '2';
    private boolean asN = false;

    public yv(short s, short s2, short s3) {
        super(s, s2, s3);
    }

    private yv(short s, short s2, short s3, mgt mgt2) {
        super(s, s2, s3, mgt2);
    }

    protected yv d(short s, short s2, short s3, mgt mgt2) {
        return new yv(s, s2, s3, mgt2);
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
            ((yv)this.Dwe).a(lgs2);
        }
        if (this.Dwd != null) {
            ((yv)this.Dwd).a(lgs2);
        }
    }

    public boolean b(float f2, float f3) {
        if (this.ao(f2, f3)) {
            if (this.Dwe != null) {
                return ((yv)this.Dwe).b(f2, f3);
            }
            return this.asN;
        }
        if (this.Dwd != null) {
            return ((yv)this.Dwd).b(f2, f3);
        }
        return false;
    }

    public boolean d(float f2, float f3, float f4) {
        if (this.ao(f2, f3) || this.L(f2, f3, f4)) {
            if (this.Dwe != null) {
                return ((yv)this.Dwe).d(f2, f3, f4);
            }
            return this.asN;
        }
        if (this.Dwd != null) {
            return ((yv)this.Dwd).d(f2, f3, f4);
        }
        return false;
    }

    @Override
    protected boolean hasData() {
        return this.asN;
    }

    @Override
    protected boolean oH() {
        return (float)this.Dwc > bbN;
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
            ((yv)this.Dwe).a(stringBuilder);
        }
        if (this.Dwd != null) {
            ((yv)this.Dwd).a(stringBuilder);
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
            n = ((yv)this.Dwe).c(string, n);
        }
        if (this.Dwd != null) {
            ++n;
            n = ((yv)this.Dwd).c(string, n);
        }
        return n;
    }

    @Override
    protected /* synthetic */ mgs b(short s, short s2, short s3, mgt mgt2) {
        return this.d(s, s2, s3, mgt2);
    }
}

