/*
 * Decompiled with CFR.
 */
public class deh {
    private boolean gfg = false;
    private ldv Rs = null;
    private ldv dUK = null;
    private ldv gfh = null;
    private int gfi = 5;
    private int gfj = 0;
    private ljq Position = null;
    private lgl Rotation = null;

    public boolean bkB() {
        return this.gfg;
    }

    public void hJ(boolean bl) {
        this.gfg = bl;
    }

    public ldv oq() {
        return this.Rs;
    }

    public void hC(ldv ldv2) {
        this.Rs = ldv2;
    }

    public ldv bkC() {
        return this.dUK;
    }

    public void mz(ldv ldv2) {
        this.dUK = ldv2;
    }

    public ldv bkD() {
        return this.gfh;
    }

    public void mA(ldv ldv2) {
        this.gfh = ldv2;
    }

    public int bkE() {
        return this.gfi;
    }

    public void zP(int n2) {
        this.gfi = n2;
    }

    public int bkF() {
        return this.gfj;
    }

    public void zQ(int n2) {
        this.gfj = n2;
    }

    public ljq av() {
        return this.Position;
    }

    public void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public lgl aw() {
        return this.Rotation;
    }

    public void a(lgl lgl2) {
        this.Rotation = lgl2;
    }

    public String toString() {
        return "SFReportSensorInfo: ObjectGUID=" + this.Rs + " ReportSensorGUID=" + this.dUK + " Position" + this.Position;
    }
}

