/*
 * Decompiled with CFR.
 */
public class eua
extends euk
implements dxu {
    private int aqs = -1;
    private ldv isO = null;
    private int ijz = hc.aaz.ordinal();
    private bao cMT = null;
    private int gOd = bap.cNc.ordinal();
    private int iCV = 0;
    private float iCW = 0.0f;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public ldv bHL() {
        return this.isO;
    }

    public void oS(ldv ldv2) {
        this.isO = ldv2;
    }

    public hc bEN() {
        return hc.getAccessLevelType(this.ijz);
    }

    public void f(hc hc2) {
        this.ijz = hc2 == null ? this.ijz : hc2.ordinal();
    }

    public bao aiC() {
        return this.cMT;
    }

    public void D(bao bao2) {
        this.cMT = bao2;
    }

    public bap bMg() {
        return bap.getValueByOrdinal(this.gOd);
    }

    public void a(bap bap2) {
        this.gOd = bap2 == null ? this.gOd : bap2.ordinal();
    }

    public int bMh() {
        return this.iCV;
    }

    public void Fj(int n) {
        this.iCV = n;
    }

    public float bMi() {
        return this.iCW;
    }

    public void iO(float f) {
        this.iCW = f;
    }

    eua() {
        super(20015);
    }
}

