/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class hpe
extends hoy {
    private final boolean kUJ;
    private boolean Initialized;
    private c kUK;
    private String aFo;
    private List<String> kUL;

    public hpe(hnc hnc2, String string, lgg lgg2, lhf lhf2, c c2, String string2) {
        this(hnc2, string, lgg2, lhf2, c2, string2, true);
    }

    public hpe(hnc hnc2, String string, lgg lgg2, lhf lhf2, c c2, String string2, boolean bl) {
        super(hnc2, string, lgg2, lhf2, hnc2.crM().cqc());
        assert (c2 != null);
        assert (string2 != null);
        this.kUK = c2;
        this.aFo = string2;
        this.kUJ = bl;
        this.cuU().a(this.kUK);
        this.kUL = new ArrayList<String>();
        this.kUL.add("");
        this.cuY();
    }

    public final hmh cuU() {
        return (hmh)((Object)this.cqc());
    }

    public final boolean cuV() {
        return this.kUK instanceof d;
    }

    public final int getLineCount() {
        return this.kUL.size();
    }

    public final String NJ(int n) {
        return this.kUL.get(n);
    }

    public final int NK(int n) {
        int n2 = this.kUL.get(n).length();
        if (n < this.kUL.size() - 1) {
            --n2;
        }
        return n2;
    }

    public final String getText() {
        return this.aFo;
    }

    public final boolean mV(String string) {
        assert (string != null);
        if (string.equals(this.aFo)) {
            return false;
        }
        this.aFo = string;
        this.cuY();
        return true;
    }

    public final c cuW() {
        assert (this.Initialized);
        return this.kUK;
    }

    public int cuX() {
        return this.kLu.a((hnb)this.kUK.jFE, (String)"Gg").H;
    }

    public lgg NL(int n) {
        int n2;
        int n3 = 0;
        for (n2 = 0; n2 < this.kUL.size(); ++n2) {
            int n4 = n3 + this.kUL.get(n2).length();
            if (n2 == this.kUL.size() - 1 ? n <= n4 : n < n4) break;
            n3 = n4;
        }
        if (n2 >= this.kUL.size()) {
            n2 = this.kUL.size() - 1;
        }
        return new lgg(n - n3, n2);
    }

    public int J(lgg lgg2) {
        int n = 0;
        for (int i = 0; i < lgg2.cg && i < this.kUL.size(); ++i) {
            int n2 = this.kUL.get(i).length();
            n += n2;
        }
        return n += lgg2.cf;
    }

    public lgg K(lgg lgg2) {
        int n = lgg2.cg;
        if (n >= this.kUL.size()) {
            n = this.kUL.size() - 1;
        }
        int n2 = this.u(this.kUL.get(n), lgg2.cf);
        n *= this.cuX();
        e e2 = (e)this.kUK;
        switch (e2.kUY) {
            case kUS: {
                break;
            }
            case kUT: {
                n += this.getHeight() - n;
                break;
            }
            case kUU: {
                n += (this.getHeight() - n) / 2;
                break;
            }
            default: {
                assert (false) : e2.kUY;
                break;
            }
        }
        return new lgg(n2, n);
    }

    public lgg L(lgg lgg2) {
        int n = lgg2.cg / this.cuX();
        if (n >= this.kUL.size()) {
            n = this.kUL.size() - 1;
        }
        String string = this.kUL.get(n);
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = this.NK(n);
        while (n4 < n5) {
            n3 = this.u(string, n2);
            if (n3 >= lgg2.cf) {
                n5 = n2;
            } else {
                n4 = n2 + 1;
            }
            n2 = (n4 + n5) / 2;
        }
        if (n2 > 0 && (n3 = this.u(string, n2)) > lgg2.cf) {
            n4 = n3 - lgg2.cf;
            assert (n4 > 0);
            n5 = this.u(string, n2 - 1);
            assert (n5 <= lgg2.cf);
            if (lgg2.cf - n5 < n4) {
                --n2;
            }
        }
        return new lgg(n2, n);
    }

    public lgg NM(int n) {
        lgg lgg2 = this.NL(n);
        lgg lgg3 = this.K(lgg2);
        return lgg3;
    }

    public final int M(lgg lgg2) {
        lgg lgg3 = this.L(lgg2);
        int n = this.J(lgg3);
        return n;
    }

    public final void a(c c2) {
        assert (this.Initialized);
        assert (c2 != null);
        this.kUK = c2;
        this.cuU().a(this.kUK);
    }

    @Override
    protected void FF() {
        assert (!this.Initialized);
        this.Initialized = true;
        super.FF();
        this.H(this.kUK.dMT);
        this.mU(true);
        if (this.cuV()) {
            this.cuY();
        }
    }

    @Override
    protected void FG() {
        assert (this.Initialized);
        this.mU(false);
        this.Initialized = false;
        super.FG();
    }

    @Override
    protected void cce() {
        assert (this.Initialized);
        super.cce();
        if (this.cuV()) {
            this.cuY();
        }
    }

    @Override
    protected void bd(List<lfg> list) {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private void cuY() {
        if (this.cuV()) {
            this.kUL = this.kLu.b(this.kUK.jFE, this.aFo, ((d)this.kUK).kUW, this.getWidth(), this.kUJ);
            this.cuU().mV(this.kLu.a(this.kUL, this.kUJ));
        } else {
            this.kUL.set(0, this.aFo);
            this.cuU().mV(this.aFo);
        }
    }

    private int u(String string, int n) {
        String string2 = string.substring(0, n > string.length() ? string.length() : n);
        lhf lhf2 = this.kLu.a(this.kUK.jFE, string2);
        int n2 = lhf2.rmN;
        e e2 = (e)this.kUK;
        switch (e2.kUX) {
            case kUO: {
                break;
            }
            case kUP: {
                int n3 = this.kLu.a((hnb)this.kUK.jFE, (String)string).rmN;
                n2 = this.getWidth() - n3 + n2;
                break;
            }
            case kUQ: {
                int n4 = this.kLu.a((hnb)this.kUK.jFE, (String)string).rmN;
                n2 = (this.getWidth() - n4) / 2 + n2;
                break;
            }
            default: {
                assert (false) : e2.kUX;
                break;
            }
        }
        return n2;
    }

    private void mU(boolean bl) {
        assert (lda.yk(bl));
    }
}

