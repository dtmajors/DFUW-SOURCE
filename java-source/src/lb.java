/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class lb
extends mgr<lc> {
    public static final float asG = 500.0f;
    public static final float asH = 150.0f;
    private lgs asI = null;

    public lb() {
        this.DvZ = new lc((short)this.DvY.cf, (short)this.DvY.cg, (short)this.DvY.rmN);
    }

    @Override
    protected void oF() {
        if (this.asI == null) {
            this.asI = new lgs(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        ((lc)this.DvZ).a(this.asI);
    }

    @Override
    public void oG() {
        this.DvZ = new lc((short)this.DvY.cf, (short)this.DvY.cg, (short)this.DvY.rmN);
    }

    public void W(ljq ljq2) {
        ((lc)this.DvZ).c(lb.oh(ljq2.x), lb.oi(ljq2.rlV), 150.0f);
        if (this.asI == null) {
            this.asI = new lgs(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            this.asI.cf = Integer.MAX_VALUE;
            this.asI.cg = Integer.MAX_VALUE;
            this.asI.rmN = Integer.MIN_VALUE;
            this.asI.H = Integer.MIN_VALUE;
        }
        ((lc)this.DvZ).a(this.asI);
    }

    public void b(ljq ljq2, float f) {
        ((lc)this.DvZ).c(lb.oh(ljq2.x), lb.oi(ljq2.rlV), f);
        if (this.asI == null) {
            this.asI = new lgs(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            this.asI.cf = Integer.MAX_VALUE;
            this.asI.cg = Integer.MAX_VALUE;
            this.asI.rmN = Integer.MIN_VALUE;
            this.asI.H = Integer.MIN_VALUE;
        }
        ((lc)this.DvZ).a(this.asI);
    }

    public void b(ljq ljq2, float f, List<lgs> list) {
        ((lc)this.DvZ).a(lb.oh(ljq2.x), lb.oi(ljq2.rlV), f, list);
        for (lgs lgs2 : list) {
            if (this.asI != null) {
                if (this.asI.cf > lgs2.cf) {
                    this.asI.cf = lgs2.cf;
                }
                if (this.asI.cg > lgs2.cg) {
                    this.asI.cg = lgs2.cg;
                }
                if (this.asI.cf + this.asI.rmN < lgs2.cf + lgs2.rmN) {
                    this.asI.rmN = lgs2.cf + lgs2.rmN - this.asI.cf;
                }
                if (this.asI.cg + this.asI.H < lgs2.cg + lgs2.H) {
                    this.asI.H = lgs2.cg + lgs2.H - this.asI.cg;
                }
            }
            lgs2.cf = (int)lb.oj(lgs2.cf);
            lgs2.cg = (int)lb.ok(lgs2.cg);
        }
        if (this.asI == null) {
            this.asI = new lgs(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
            ((lc)this.DvZ).a(this.asI);
        }
    }

    public boolean U(ljq ljq2) {
        return ((lc)this.DvZ).b(lb.oh(ljq2.x), lb.oi(ljq2.rlV));
    }

    public List<lgs> oA() {
        ArrayList<lgs> arrayList = lcn.emv();
        ((lc)this.DvZ).B(arrayList);
        for (lgs lgs2 : arrayList) {
            lgs2.cf = (int)lb.oj(lgs2.cf);
            lgs2.cg = (int)lb.ok(lgs2.cg);
        }
        return arrayList;
    }

    public boolean b(ld ld2) {
        if (ld2 == null) {
            return false;
        }
        if (this.asI != null && ld2.oL() != null && !this.asI.x(ld2.oL())) {
            return false;
        }
        return ((lc)this.DvZ).b(ld2.oM());
    }

    public boolean a(ld ld2, float f) {
        if (ld2 == null) {
            return false;
        }
        if (this.asI != null && ld2.oL() != null) {
            if (!this.asI.x(ld2.oL())) {
                return false;
            }
            lgs lgs2 = this.asI.w(ld2.oL());
            if ((float)lgs2.rmN < f && (float)lgs2.H < f) {
                return false;
            }
        }
        return ((lc)this.DvZ).a(ld2.oM(), f);
    }

    public void c(ld ld2) {
        for (le le2 : ld2.oM()) {
            ((lc)this.DvZ).a(le2);
        }
    }

    public void a(ld ld2, List<lgs> list) {
        ArrayList<lgs> arrayList = lcn.emv();
        for (le object : ld2.oM()) {
            ((lc)this.DvZ).a(object, arrayList);
        }
        for (lgs lgs2 : arrayList) {
            if (this.asI != null) {
                if (this.asI.cf > lgs2.cf) {
                    this.asI.cf = lgs2.cf;
                }
                if (this.asI.cg > lgs2.cg) {
                    this.asI.cg = lgs2.cg;
                }
                if (this.asI.cf + this.asI.rmN < lgs2.cf + lgs2.rmN) {
                    this.asI.rmN = lgs2.cf + lgs2.rmN - this.asI.cf;
                }
                if (this.asI.cg + this.asI.H < lgs2.cg + lgs2.H) {
                    this.asI.H = lgs2.cg + lgs2.H - this.asI.cg;
                }
            }
            lgs2.cf = (int)lb.oj(lgs2.cf);
            lgs2.cg = (int)lb.ok(lgs2.cg);
        }
        list.addAll(arrayList);
    }
}

