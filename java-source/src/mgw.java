/*
 * Decompiled with CFR.
 */
import java.text.NumberFormat;

public class mgw
extends mgs<mgw> {
    public static final float bbM = 4.0f;
    public static float bbN = 5.75f;
    public static final int Dwm = 0;
    public static final int Dwn = 999;
    private int Dwo = 999;
    private float Dwp = 0.0f;
    private float Dwq = 0.0f;
    private float Dwr = 0.0f;

    public mgw(float f, float f2, float f3) {
        super((short)f, (short)f2, (short)f3);
        this.Dwp = f;
        this.Dwq = f2;
        this.Dwr = f3;
    }

    private mgw(float f, float f2, float f3, mgt mgt2) {
        super((short)f, (short)f2, (short)f3, mgt2);
        this.Dwp = mgt2.ap(f, f3);
        this.Dwq = mgt2.aq(f2, f3);
        this.Dwr = mgt2.ol(f3);
    }

    protected mgw f(short s, short s2, short s3, mgt mgt2) {
        return new mgw((float)s, (float)s2, (float)s3, mgt2);
    }

    protected mgw a(float f, float f2, float f3, mgt mgt2) {
        return new mgw(f, f2, f3, mgt2);
    }

    @Override
    public boolean eyT() {
        if (!this.oH()) {
            return false;
        }
        this.Dwe = this.a(this.Dwp, this.Dwq, this.Dwr, mgt.Dwg);
        ((mgw)this.Dwe).Dwd = this.a(this.Dwp, this.Dwq, this.Dwr, mgt.Dwh);
        ((mgw)((mgw)this.Dwe).Dwd).Dwd = this.a(this.Dwp, this.Dwq, this.Dwr, mgt.Dwi);
        ((mgw)((mgw)((mgw)this.Dwe).Dwd).Dwd).Dwd = this.a(this.Dwp, this.Dwq, this.Dwr, mgt.Dwj);
        return true;
    }

    @Override
    protected boolean ao(float f, float f2) {
        if (super.ao(f, f2)) {
            return true;
        }
        return f >= this.Dwp && f < this.Dwp + this.Dwr && f2 >= this.Dwq && f2 < this.Dwq + this.Dwr;
    }

    public int ar(float f, float f2) {
        if (this.ao(f, f2)) {
            if (this.Dwe != null) {
                return ((mgw)this.Dwe).ar(f, f2);
            }
            return this.Dwo;
        }
        if (this.Dwd != null) {
            return ((mgw)this.Dwd).ar(f, f2);
        }
        return 0;
    }

    @Override
    protected boolean hasData() {
        return this.Dwo != 999;
    }

    @Override
    protected boolean oH() {
        if (this.Dwr <= bbN) {
            return false;
        }
        return this.isLeaf();
    }

    @Override
    protected boolean oI() {
        if (this.Dwe == null) {
            return false;
        }
        return ((mgw)this.Dwe).Dwo == ((mgw)((mgw)this.Dwe).Dwd).Dwo && ((mgw)((mgw)this.Dwe).Dwd).Dwo == ((mgw)((mgw)((mgw)this.Dwe).Dwd).Dwd).Dwo && ((mgw)((mgw)((mgw)this.Dwe).Dwd).Dwd).Dwo == ((mgw)((mgw)((mgw)((mgw)this.Dwe).Dwd).Dwd).Dwd).Dwo;
    }

    @Override
    protected void oJ() {
        if (this.Dwe == null) {
            return;
        }
        this.Dwo = ((mgw)this.Dwe).Dwo;
    }

    @Override
    public void a(StringBuilder stringBuilder) {
        NumberFormat numberFormat = NumberFormat.getIntegerInstance();
        numberFormat.setMinimumIntegerDigits(3);
        stringBuilder.append(numberFormat.format(this.Dwo));
        if (this.Dwe != null) {
            ((mgw)this.Dwe).a(stringBuilder);
        }
        if (this.Dwd != null) {
            ((mgw)this.Dwd).a(stringBuilder);
        }
    }

    @Override
    public void parse(String string) {
        this.c(string, 0);
    }

    @Override
    protected int c(String string, int n) {
        this.Dwo = Integer.parseInt("" + string.charAt(n) + string.charAt(n + 1) + string.charAt(n + 2));
        switch (this.Dwo) {
            case 999: {
                this.eyT();
                break;
            }
            default: {
                this.Dwe = null;
            }
        }
        if (this.Dwe != null) {
            n = ((mgw)this.Dwe).c(string, n + 3);
        }
        if (this.Dwd != null) {
            n = ((mgw)this.Dwd).c(string, n + 3);
        }
        return n;
    }

    @Override
    protected /* synthetic */ mgs b(short s, short s2, short s3, mgt mgt2) {
        return this.f(s, s2, s3, mgt2);
    }
}

