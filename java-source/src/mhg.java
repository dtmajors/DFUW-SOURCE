/*
 * Decompiled with CFR.
 */
import java.text.NumberFormat;

public class mhg
extends mgs<mhg> {
    public static final float bbM = 4.0f;
    public static float bbN = 5.75f;
    public static final int DwR = 999;
    public static final int DwS = 0;
    private int cEh = 0;

    public mhg(short s, short s2, short s3) {
        super(s, s2, s3);
    }

    private mhg(short s, short s2, short s3, mgt mgt2) {
        super(s, s2, s3, mgt2);
    }

    protected mhg h(short s, short s2, short s3, mgt mgt2) {
        return new mhg(s, s2, s3, mgt2);
    }

    public int at(float f, float f2) {
        if (this.ao(f, f2)) {
            if (this.Dwe != null) {
                return ((mhg)this.Dwe).at(f, f2);
            }
            return this.cEh;
        }
        if (this.Dwd != null) {
            return ((mhg)this.Dwd).at(f, f2);
        }
        return 0;
    }

    @Override
    protected boolean hasData() {
        return this.cEh != 0;
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
        return ((mhg)this.Dwe).cEh == ((mhg)((mhg)this.Dwe).Dwd).cEh && ((mhg)((mhg)this.Dwe).Dwd).cEh == ((mhg)((mhg)((mhg)this.Dwe).Dwd).Dwd).cEh && ((mhg)((mhg)((mhg)this.Dwe).Dwd).Dwd).cEh == ((mhg)((mhg)((mhg)((mhg)this.Dwe).Dwd).Dwd).Dwd).cEh;
    }

    @Override
    protected void oJ() {
        if (this.Dwe == null) {
            return;
        }
        this.cEh = ((mhg)this.Dwe).cEh;
    }

    @Override
    public void a(StringBuilder stringBuilder) {
        NumberFormat numberFormat = NumberFormat.getIntegerInstance();
        numberFormat.setMinimumIntegerDigits(3);
        stringBuilder.append(numberFormat.format(this.cEh));
        if (this.Dwe != null) {
            ((mhg)this.Dwe).a(stringBuilder);
        }
        if (this.Dwd != null) {
            ((mhg)this.Dwd).a(stringBuilder);
        }
    }

    @Override
    public void parse(String string) {
        this.c(string, 0);
    }

    @Override
    protected int c(String string, int n) {
        this.cEh = Integer.parseInt("" + string.charAt(n) + string.charAt(n + 1) + string.charAt(n + 2));
        switch (this.cEh) {
            case 0: {
                this.eyT();
                break;
            }
            default: {
                this.Dwe = null;
            }
        }
        if (this.Dwe != null) {
            n = ((mhg)this.Dwe).c(string, n + 3);
        }
        if (this.Dwd != null) {
            n = ((mhg)this.Dwd).c(string, n + 3);
        }
        return n;
    }

    @Override
    protected /* synthetic */ mgs b(short s, short s2, short s3, mgt mgt2) {
        return this.h(s, s2, s3, mgt2);
    }
}

