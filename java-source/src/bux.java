/*
 * Decompiled with CFR.
 */
public class bux {
    public static final int dPC = 1;
    public static final int dPD = 2;
    public static final int dPE = 4;
    public static final int dPF = 8;
    public static final int dPG = 16;
    public static final int dPH = 32;
    public static final int dPI = 64;
    public static final int dPJ = 128;
    public static final int dPK = 0;
    public static final int dPL = 1;
    public static final int dPM = 2;
    public static final int dPN = 3;
    public static final int dPO = 4;
    private ldv dPP;
    private String dPQ = "";
    private int dvK = -1;
    private int dPR = 0;
    private int ResourceType = -1;
    private ljq Position = null;
    private long dPS = 0L;
    private int dPT = 0;
    private String dPU = "";

    public bux ayQ() {
        bux bux2 = new bux();
        bux2.dPP = this.dPP;
        bux2.dPQ = this.dPQ;
        bux2.dvK = this.dvK;
        bux2.dPR = this.dPR;
        bux2.ResourceType = this.ResourceType;
        if (this.Position != null) {
            bux2.aV(this.Position);
        }
        bux2.dPS = this.dPS;
        bux2.dPT = this.dPT;
        bux2.dPU = this.dPU;
        return bux2;
    }

    public int a(bux bux2, int n) {
        if ((n & 1) != 0 && bux2.av() == null) {
            lfn.b(5, "SFMarker", "copyFields: Source Position is null");
            assert (false);
            return -3;
        }
        if ((n & 4) != 0 && bux2.ayR() == null) {
            lfn.b(5, "SFMarker", "copyFields: Source MarkerType is null");
            assert (false);
            return -3;
        }
        int n2 = 0;
        if (!((n & 1) == 0 || this.av() != null && this.av().ew(bux2.av()))) {
            this.aV(bux2.av());
            n2 |= 1;
        }
        if ((n & 2) != 0 && this.ayS() != bux2.ayS()) {
            this.nd(bux2.ayS());
            n2 |= 2;
        }
        if ((n & 4) != 0 && this.ayR() != bux2.ayR()) {
            this.a(bux2.ayR());
            n2 |= 4;
        }
        if ((n & 8) != 0 && this.az() != bux2.az()) {
            this.l(bux2.az());
            n2 |= 8;
        }
        if ((n & 0x10) != 0 && this.ayT() != bux2.ayT()) {
            this.R(bux2.ayT());
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0 && this.getPriority() != bux2.getPriority()) {
            this.setPriority(bux2.getPriority());
            n2 |= 0x20;
        }
        if ((n & 0x40) != 0 && !this.ayV().equals(bux2.ayV())) {
            this.gp(bux2.ayV());
            n2 |= 0x40;
        }
        if ((n & 0x80) != 0 && !this.ayW().equals(bux2.ayW())) {
            this.gq(bux2.ayW());
            n2 |= 0x80;
        }
        return n2;
    }

    public final ldv getGUID() {
        return this.dPP;
    }

    public final void setGUID(ldv ldv2) {
        this.dPP = ldv2;
    }

    public final bvb ayR() {
        if (this.dvK >= 0 && this.dvK < bvb.dQk.length) {
            return bvb.dQk[this.dvK];
        }
        return null;
    }

    public final void a(bvb bvb2) {
        this.dvK = bvb2 == null ? -1 : bvb2.ordinal();
    }

    public final int ayS() {
        return this.dPR;
    }

    public final void nd(int n) {
        this.dPR = n;
    }

    public final int az() {
        return this.ResourceType;
    }

    public final void l(int n) {
        this.ResourceType = n;
    }

    public final ljq av() {
        return this.Position;
    }

    public final void c(ljq ljq2) {
        this.Position = ljq2;
    }

    public final void aV(ljq ljq2) {
        if (ljq2 == null) {
            this.Position = null;
        } else if (this.Position == null) {
            this.Position = new ljq(ljq2);
        } else {
            this.Position.ex(ljq2);
        }
    }

    public final long ayT() {
        return this.dPS;
    }

    public final void R(long l2) {
        this.dPS = l2;
    }

    public final double ayU() {
        return (double)this.dPS / 1000.0;
    }

    public final void bc(double d2) {
        this.dPS = (long)(d2 * 1000.0);
    }

    public final int getPriority() {
        return this.dPT;
    }

    public final void setPriority(int n) {
        this.dPT = n;
    }

    public final String ayV() {
        return this.dPQ;
    }

    public final void gp(String string) {
        this.dPQ = string == null ? "" : string;
    }

    public final String ayW() {
        return this.dPU;
    }

    public final void gq(String string) {
        this.dPU = string == null ? "" : string;
    }
}

