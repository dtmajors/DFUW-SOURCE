/*
 * Decompiled with CFR.
 */
public class gzb
extends gze
implements dxu {
    private int aqs = -1;
    private boolean ikP = false;
    private ljq Position = null;
    private lgl Rotation = null;
    private String jvy = null;
    private boolean jvz = true;
    private ldv ilU = null;

    gzb() {
        super(20225);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
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

    public boolean bFj() {
        return this.ikP;
    }

    public void jS(boolean bl) {
        this.ikP = bl;
    }

    public ldv bFz() {
        return this.ilU;
    }

    public void oF(ldv ldv2) {
        this.ilU = ldv2;
    }

    public String bYq() {
        return this.jvy;
    }

    public void ln(String string) {
        this.jvy = string;
    }

    public boolean bYr() {
        return this.jvz;
    }

    public void ms(boolean bl) {
        this.jvz = bl;
    }
}

