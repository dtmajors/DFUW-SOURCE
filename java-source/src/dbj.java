/*
 * Decompiled with CFR.
 */
import java.util.List;

public abstract class dbj {
    private dbb gcf = null;
    private ddj gad = null;
    private ljq gcg = null;
    private lgl gch = null;
    private boolean gci = false;
    private int aYH = 0;
    private dbl gcj = null;
    private List<dbk> gck = null;

    public final dbb biN() {
        return this.gcf;
    }

    public final void a(dbb dbb2) {
        this.gcf = dbb2;
    }

    public final ddj bhM() {
        return this.gad;
    }

    public final void a(ddj ddj2) {
        this.gad = ddj2;
    }

    public final ljq aGr() {
        return this.gcg;
    }

    public final void bI(ljq ljq2) {
        this.gcg = ljq2;
    }

    public final lgl biO() {
        return this.gch;
    }

    public final void z(lgl lgl2) {
        this.gch = lgl2;
    }

    public final boolean biP() {
        return this.gci;
    }

    public final void hB(boolean bl) {
        this.gci = bl;
    }

    public final int Ec() {
        return this.aYH;
    }

    public final void gf(int n2) {
        this.aYH = n2;
    }

    public final dbl biQ() {
        return this.gcj;
    }

    public final void a(dbl dbl2) {
        this.gcj = dbl2;
    }

    public final void a(dbk dbk2) {
        if (this.gck == null) {
            this.gck = lcn.abH(1);
        }
        this.gck.add(dbk2);
    }

    public final dbk[] biR() {
        if (this.gck == null) {
            return null;
        }
        return this.gck.toArray(new dbk[this.gck.size()]);
    }

    public abstract boolean d(ddu var1);

    public abstract boolean biS();

    public abstract ddu mt(ldv var1);

    public abstract void mu(ldv var1);

    public abstract void mv(ldv var1);
}

