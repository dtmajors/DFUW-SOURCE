/*
 * Decompiled with CFR.
 */
public class ffy
extends fgb
implements dxu {
    private int ResourceType = 0;
    private int iLs = 1;
    private ljq Position = null;
    private lgl Rotation = null;
    private int aqs = -1;
    private boolean iLt = false;
    private boolean dUO = false;
    private boolean ikP = false;
    private ldv ilU = null;
    private int iLu = -1;
    private int iLv = -1;
    public String aGB = null;
    public float aGr = 0.0f;
    public long aXU = 0L;

    ffy() {
        super(8449);
    }

    public int az() {
        return this.ResourceType;
    }

    public void l(int n) {
        this.ResourceType = n;
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

    public int bOV() {
        return this.iLs;
    }

    public void GA(int n) {
        this.iLs = n;
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public boolean aBu() {
        return this.dUO;
    }

    public void eV(boolean bl) {
        this.dUO = bl;
    }

    public boolean bOW() {
        return this.iLt;
    }

    public void la(boolean bl) {
        this.iLt = bl;
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

    public int bOX() {
        return this.iLu;
    }

    public void GB(int n) {
        this.iLu = n;
    }

    public int bOY() {
        return this.iLv;
    }

    public void GC(int n) {
        this.iLv = n;
    }
}

