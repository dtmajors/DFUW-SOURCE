/*
 * Decompiled with CFR.
 */
public class hek {
    private final ldl kaY = new ldl();
    public final lip kef;
    private ldv dbx;
    private lip keg;
    private lip keh;
    private lhu dMU;
    private lcq kei;
    private int Qw;
    private float aGr;
    private float kej;

    public hek(lip lip2) {
        this.kef = lip2;
    }

    public final lbl<lbn> cec() {
        return this.kaY;
    }

    public final ldv cbG() {
        return this.dbx;
    }

    public final lip cfy() {
        return this.keg == null ? ljg.roH : this.keg;
    }

    public final lip cfz() {
        return this.keh == null ? ljg.roH : this.keh;
    }

    public final lhu cfA() {
        return this.dMU == null ? lhu.rnR : this.dMU;
    }

    public final lcq cfB() {
        return this.kei == null ? lcq.COLORSHIFT_NEUTRAL : this.kei;
    }

    public final int getAlignment() {
        return this.Qw;
    }

    public final float Ua() {
        return this.aGr;
    }

    public final float cfC() {
        return this.kej;
    }

    public final void a(ldv ldv2, lip lip2, lip lip3, lip lip4, lhu lhu2, lcq lcq2, int n, float f2, float f3) {
        assert (this.kef.i(lip2));
        boolean bl = false;
        if (!lin.i(this.dbx, ldv2)) {
            this.dbx = ldv2;
            bl = true;
        }
        if (!lin.i(lip3, this.keg)) {
            this.keg = lip3;
            bl = true;
        }
        if (!lin.i(lip4, this.keh)) {
            this.keh = lip4;
            bl = true;
        }
        if (!lhu.a(lhu2, this.dMU)) {
            this.dMU = lhu2;
            bl = true;
        }
        if (!lcq.c(this.kei, lcq2)) {
            this.kei = lcq2;
            bl = true;
        }
        if (this.Qw != n) {
            this.Qw = n;
            bl = true;
        }
        if (this.aGr != f2) {
            this.aGr = f2;
            bl = true;
        }
        if (this.kej != f3) {
            this.kej = f3;
            bl = true;
        }
        if (bl) {
            this.kaY.enp();
        }
    }

    public boolean b(hek hek2) {
        return this.dbx.equals(hek2.dbx);
    }

    public boolean equals(Object object) {
        if (object instanceof hek) {
            return this.b((hek)object);
        }
        assert (false) : object;
        return false;
    }

    public int hashCode() {
        return this.dbx.hashCode();
    }
}

