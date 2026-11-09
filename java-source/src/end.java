/*
 * Decompiled with CFR.
 */
public class end
extends emr
implements dxu {
    private int aqs = -1;
    private int ivm = bcd.cVo.ordinal();
    private ldv isO = null;
    private String aEN = null;
    private String ivn = null;
    private bcb cAy = null;
    private int ijz = hc.aaz.ordinal();
    private boolean ivo = false;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public bcd bIX() {
        return bcd.getValueByOrdinal(this.ivm);
    }

    public void a(bcd bcd2) {
        this.ivm = bcd2 == null ? this.ivm : bcd2.ordinal();
    }

    public ldv bHL() {
        return this.isO;
    }

    public void oS(ldv ldv2) {
        this.isO = ldv2;
    }

    public String zo() {
        return this.aEN;
    }

    public void ke(String string) {
        this.aEN = string;
    }

    public String bIY() {
        return this.ivn;
    }

    public void kf(String string) {
        this.ivn = string;
    }

    public bcb abG() {
        return this.cAy;
    }

    public void e(bcb bcb2) {
        this.cAy = bcb2;
    }

    public hc bEN() {
        return hc.getAccessLevelType(this.ijz);
    }

    public void f(hc hc2) {
        this.ijz = hc2 == null ? this.ijz : hc2.ordinal();
    }

    public boolean bIZ() {
        return this.ivo;
    }

    public void kC(boolean bl) {
        this.ivo = bl;
    }

    end() {
        super(13878);
    }
}

