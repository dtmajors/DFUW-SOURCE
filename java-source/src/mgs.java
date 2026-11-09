/*
 * Decompiled with CFR.
 */
public abstract class mgs<T extends mgs> {
    protected short Dwa = 0;
    protected short Dwb = 0;
    protected short Dwc = 0;
    protected T Dwd = null;
    protected T Dwe = null;

    public lgs eyS() {
        return new lgs(this.Dwa, this.Dwb, this.Dwc, this.Dwc);
    }

    protected mgs(short s, short s2, short s3) {
        this.Dwa = s;
        this.Dwb = s2;
        this.Dwc = s3;
    }

    protected mgs(short s, short s2, short s3, mgt mgt2) {
        this.Dwa = mgt2.b(s, s3);
        this.Dwb = mgt2.c(s2, s3);
        this.Dwc = mgt2.k(s3);
    }

    protected abstract T b(short var1, short var2, short var3, mgt var4);

    public boolean isLeaf() {
        return this.Dwe == null;
    }

    public boolean eyT() {
        if (!this.oH()) {
            return false;
        }
        this.Dwe = this.b(this.Dwa, this.Dwb, this.Dwc, mgt.Dwg);
        ((mgs)this.Dwe).Dwd = this.b(this.Dwa, this.Dwb, this.Dwc, mgt.Dwh);
        ((mgs)((mgs)this.Dwe).Dwd).Dwd = this.b(this.Dwa, this.Dwb, this.Dwc, mgt.Dwi);
        ((mgs)((mgs)((mgs)this.Dwe).Dwd).Dwd).Dwd = this.b(this.Dwa, this.Dwb, this.Dwc, mgt.Dwj);
        return true;
    }

    public boolean eyU() {
        if (!this.oI()) {
            return false;
        }
        this.oJ();
        this.Dwe = null;
        return true;
    }

    protected abstract boolean hasData();

    protected abstract boolean oH();

    protected abstract boolean oI();

    protected abstract void oJ();

    protected boolean ao(float f, float f2) {
        return f >= (float)this.Dwa && f < (float)(this.Dwa + this.Dwc) && f2 >= (float)this.Dwb && f2 < (float)(this.Dwb + this.Dwc);
    }

    protected boolean L(float f, float f2, float f3) {
        float f4;
        float f5;
        float f6 = lew.A(f, this.Dwa, this.Dwa + this.Dwc);
        float f7 = f - f6;
        float f8 = f7 * f7 + (f5 = f2 - (f4 = lew.A(f2, this.Dwb, this.Dwb + this.Dwc))) * f5;
        return f8 <= f3 * f3;
    }

    protected boolean a(mgs<?> mgs2) {
        return this.Dwa == mgs2.Dwa && this.Dwb == mgs2.Dwb && this.Dwc == mgs2.Dwc;
    }

    protected boolean b(mgs<?> mgs2) {
        return this.Dwa <= mgs2.Dwa && this.Dwb <= mgs2.Dwb && this.Dwc >= mgs2.Dwc && this.Dwa + this.Dwc >= mgs2.Dwa + mgs2.Dwc && this.Dwb + this.Dwc >= mgs2.Dwb + mgs2.Dwc;
    }

    public abstract void a(StringBuilder var1);

    public abstract void parse(String var1);

    protected abstract int c(String var1, int var2);
}

