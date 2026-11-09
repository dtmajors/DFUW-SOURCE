/*
 * Decompiled with CFR.
 */
public class lib
implements Comparable<lib> {
    private final lic kNg;
    private final boolean roe;
    private final ldl rof = new ldl();
    private double dBp;
    private double eKm;
    private boolean aME;

    public lib(lic lic2, boolean bl) {
        assert (lic2 != null);
        this.kNg = lic2;
        this.roe = bl;
    }

    public final boolean isPeriodic() {
        return this.roe;
    }

    public final double esf() {
        return this.dBp;
    }

    public final double Bw() {
        return this.eKm;
    }

    public final void setDuration(double d2) {
        this.eKm = d2;
    }

    public final boolean isStarted() {
        return this.aME;
    }

    public final lbl<lbn> esg() {
        return this.rof;
    }

    public final void ee(double d2) {
        assert (!this.aME);
        this.eKm = d2;
        this.dBp = this.kNg.kAz.emb() + this.eKm;
        this.kNg.b(this);
        this.aME = true;
    }

    public final void ef(double d2) {
        if (this.aME) {
            this.stop();
        }
        this.ee(d2);
    }

    public final void stop() {
        assert (this.aME);
        this.kNg.c(this);
        this.aME = false;
    }

    public final int a(lib lib2) {
        double d2 = this.dBp - lib2.dBp;
        if (d2 < 0.0) {
            return -1;
        }
        if (d2 > 0.0) {
            return 1;
        }
        return 0;
    }

    protected final void esh() {
        this.rof.enp();
        if (this.roe) {
            this.dBp = this.kNg.kAz.emb() + this.eKm;
        }
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((lib)object);
    }
}

