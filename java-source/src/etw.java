/*
 * Decompiled with CFR.
 */
public class etw
extends euk
implements dxu {
    private int aqs = -1;
    private ldv isO = null;
    private int ijz = hc.aaz.ordinal();
    private ldv cMX = null;
    private String cMY = null;
    private ldv[] cXa = null;
    private int aEL = -1;
    private float iCS = -1.0f;

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

    public ldv aiK() {
        return this.cMX;
    }

    public void pd(ldv ldv2) {
        this.cMX = ldv2;
    }

    public String aiL() {
        return this.cMY;
    }

    public void kt(String string) {
        this.cMY = string;
    }

    public ldv[] bMb() {
        return this.cXa;
    }

    public void A(ldv[] ldvArray) {
        this.cXa = ldvArray;
    }

    public int bMc() {
        return this.aEL;
    }

    public void Fi(int n) {
        this.aEL = n;
    }

    public float bMd() {
        return this.iCS;
    }

    public void iN(float f) {
        this.iCS = f;
    }

    etw() {
        super(20009);
    }
}

