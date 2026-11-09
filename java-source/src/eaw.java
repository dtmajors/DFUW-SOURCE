/*
 * Decompiled with CFR.
 */
public class eaw
extends ebq
implements dxu {
    private int aqs = -1;
    private ldv ade = null;
    private ldv aDk = null;
    private boolean ikM = false;
    private int crZ = -1;
    private String bhD = null;
    private ljq bhF = null;
    private float bhG = 0.0f;
    private int ikN;
    private int ikO;
    private int ctp = ayb.cvi.ordinal();

    eaw() {
        super(17416);
    }

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n2) {
        this.aqs = n2;
    }

    public ldv acm() {
        return this.aDk;
    }

    public void ci(ldv ldv2) {
        this.aDk = ldv2;
    }

    public ldv iG() {
        return this.ade;
    }

    public void ch(ldv ldv2) {
        this.ade = ldv2;
    }

    public boolean bFf() {
        return this.ikM;
    }

    public void jR(boolean bl) {
        this.ikM = bl;
    }

    public int Xx() {
        return this.crZ;
    }

    public void iq(int n2) {
        this.crZ = n2;
    }

    public String Xt() {
        return this.bhD;
    }

    public void cz(String string) {
        this.bhD = string;
    }

    public ljq Xv() {
        return this.bhF;
    }

    public void al(ljq ljq2) {
        this.bhF = ljq2;
    }

    public final float Xu() {
        return this.bhG;
    }

    public final void X(float f2) {
        this.bhG = f2;
    }

    public final int bFg() {
        return this.ikN;
    }

    public final void Dv(int n2) {
        this.ikN = n2;
    }

    public final int bFh() {
        return this.ikO;
    }

    public final void Dw(int n2) {
        this.ikO = n2;
    }

    public ayb Xz() {
        return ayb.getValueByOrdinal(this.ctp);
    }

    public void a(ayb ayb2) {
        this.ctp = ayb2 == null ? ayb.cvi.ordinal() : ayb2.ordinal();
    }
}

