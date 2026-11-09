/*
 * Decompiled with CFR.
 */
import java.util.List;

public class lme
extends mgs<lme> {
    public static final short asJ = 23;
    private lmf rEs = lmf.rEt;

    public lme(short s, short s2, short s3) {
        super(s, s2, s3);
    }

    private lme(short s, short s2, short s3, mgt mgt2) {
        super(s, s2, s3, mgt2);
    }

    protected lme e(short s, short s2, short s3, mgt mgt2) {
        return new lme(s, s2, s3, mgt2);
    }

    public void a(float f, float f2, float f3, lmf lmf2) {
        if (this.rEs != lmf2 && (this.ao(f, f2) || this.L(f, f2, f3))) {
            if (this.Dwe == null) {
                if (this.eyT()) {
                    ((lme)this.Dwe).a(f, f2, f3, lmf2);
                } else {
                    this.rEs = lmf2;
                }
            } else {
                ((lme)this.Dwe).a(f, f2, f3, lmf2);
                if (((lme)this.Dwe).hasData()) {
                    this.eyU();
                }
            }
        }
        if (this.Dwd != null) {
            ((lme)this.Dwd).a(f, f2, f3, lmf2);
        }
    }

    public lmf am(float f, float f2) {
        if (this.ao(f, f2)) {
            if (this.Dwe != null) {
                return ((lme)this.Dwe).am(f, f2);
            }
            return this.rEs;
        }
        if (this.Dwd != null) {
            return ((lme)this.Dwd).am(f, f2);
        }
        return lmf.rEt;
    }

    public void a(List<lgs> list, lmf lmf2) {
        if (this.rEs == lmf2) {
            list.add(this.eyS());
        }
        if (this.Dwe != null) {
            ((lme)this.Dwe).a(list, lmf2);
        }
        if (this.Dwd != null) {
            ((lme)this.Dwd).a(list, lmf2);
        }
    }

    @Override
    protected boolean hasData() {
        return this.rEs != lmf.rEt;
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
        return ((lme)this.Dwe).rEs == ((lme)((lme)this.Dwe).Dwd).rEs && ((lme)((lme)this.Dwe).Dwd).rEs == ((lme)((lme)((lme)this.Dwe).Dwd).Dwd).rEs && ((lme)((lme)((lme)this.Dwe).Dwd).Dwd).rEs == ((lme)((lme)((lme)((lme)this.Dwe).Dwd).Dwd).Dwd).rEs;
    }

    @Override
    protected void oJ() {
        if (this.Dwe == null) {
            return;
        }
        this.rEs = ((lme)this.Dwe).rEs;
    }

    @Override
    public void a(StringBuilder stringBuilder) {
        stringBuilder.append(this.rEs.ordinal());
        if (this.Dwe != null) {
            ((lme)this.Dwe).a(stringBuilder);
        }
        if (this.Dwd != null) {
            ((lme)this.Dwd).a(stringBuilder);
        }
    }

    @Override
    public void parse(String string) {
        this.c(string, 0);
    }

    @Override
    protected int c(String string, int n) {
        int n2 = Integer.parseInt("" + string.charAt(n));
        this.rEs = lmf.getValueByOrdinal(n2);
        switch (this.rEs) {
            case rEt: {
                this.eyT();
                break;
            }
            default: {
                this.Dwe = null;
            }
        }
        if (this.Dwe != null) {
            ++n;
            n = ((lme)this.Dwe).c(string, n);
        }
        if (this.Dwd != null) {
            ++n;
            n = ((lme)this.Dwd).c(string, n);
        }
        return n;
    }

    @Override
    protected /* synthetic */ mgs b(short s, short s2, short s3, mgt mgt2) {
        return this.e(s, s2, s3, mgt2);
    }
}

