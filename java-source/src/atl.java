/*
 * Decompiled with CFR.
 */
public class atl
extends ato {
    public static final int bYB = 45;
    public static final int bYC = 8;
    public static final int bYD = 512;
    public static final int bYE = 100;
    public static final int bYF = 0;
    public static final int bYG = 100;
    private int bYH = 45;
    private int bYI = 100;

    @Override
    public void a(atk atk2) {
        if (atk2.Vi().getValue() != this.Vn()) {
            this.ib(atk2.Vi().getValue());
            this.Vo();
        }
        if (atk2.Vm().getValue() != this.Vq()) {
            this.ic(atk2.Vm().getValue());
            this.Vp();
        }
    }

    @Override
    public void b(atk atk2) {
    }

    public int Vn() {
        return this.bYH;
    }

    public int ib(int n) {
        if (n < 8) {
            n = 8;
        }
        if (n > 512) {
            n = 512;
        }
        this.bYH = n;
        return this.bYH;
    }

    private void Vo() {
        kil kil2 = this.Vv();
        kil2.XS(128);
        kil2.XR(this.Vn());
        this.MessageDelegator.a(kil2);
    }

    private void Vp() {
        kil kil2 = this.Vv();
        kil2.XS(1024);
        float f2 = (float)this.Vq() / 100.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        kil2.md(f2);
        this.MessageDelegator.a(kil2);
    }

    public final int Vq() {
        return this.bYI;
    }

    public final int ic(int n) {
        if (n > 100) {
            n = 100;
        }
        if (n < 0) {
            n = 0;
        }
        this.bYI = n;
        return this.bYI;
    }
}

