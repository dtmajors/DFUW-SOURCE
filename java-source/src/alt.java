/*
 * Decompiled with CFR.
 */
public abstract class alt {
    public static final float bsy = -3.0f;
    public static final float bsz = -2.0f;
    public static final int bsA = 1;
    public static final int bsB = 2;
    public static final int bsC = 4;
    private ldv GUID = null;
    private double bsD = 0.0;
    private int aYE = 0;
    private int bsE = 0;
    private int bsF = 0;
    private ldv aYF = null;
    private int bsG = 0;
    private int aYC = 0;
    private int aYG = 0;
    private int aYH = 0;
    private ldv Xe = null;
    private int[] bsH = null;
    private ldv[] bsI = null;

    public final ldv getGUID() {
        assert (this.GUID != null);
        return this.GUID;
    }

    public final void setGUID(ldv ldv2) {
        assert (ldv2 != null);
        assert (this.GUID == null);
        this.GUID = ldv2;
    }

    public final double DV() {
        return this.bsD;
    }

    public final void x(double d2) {
        this.bsD = d2;
    }

    public final int DW() {
        return this.aYE;
    }

    public final void ga(int n) {
        this.aYE = n;
    }

    public final int DX() {
        return this.bsE;
    }

    public final void gb(int n) {
        this.bsE = n;
    }

    public final int DY() {
        return this.bsF;
    }

    public final void gc(int n) {
        this.bsF = n;
    }

    public final ldv DZ() {
        return this.aYF;
    }

    public final void cP(ldv ldv2) {
        this.aYF = ldv2;
    }

    public final int Ea() {
        return this.bsG;
    }

    public final void gd(int n) {
        assert (n > 0);
        this.bsG = n;
    }

    public final int Eb() {
        return this.aYC;
    }

    public final void ge(int n) {
        this.aYC = n;
    }

    public final int CD() {
        return this.aYG;
    }

    public final void fJ(int n) {
        this.aYG = n;
    }

    public final int Ec() {
        return this.aYH;
    }

    public final void gf(int n) {
        this.aYH = n;
    }

    public final ldv mq() {
        return this.Xe;
    }

    public final void aX(ldv ldv2) {
        this.Xe = ldv2;
    }

    public final int[] Ed() {
        return this.bsH;
    }

    public final void h(int[] nArray) {
        this.bsH = nArray;
    }

    public final ldv[] Ee() {
        return this.bsI;
    }

    public final void d(ldv[] ldvArray) {
        this.bsI = ldvArray;
    }

    public final alt Ef() {
        alt alt2;
        block2: {
            alt2 = null;
            try {
                Class<?> clazz = this.getClass();
                alt2 = (alt)clazz.newInstance();
                this.g(alt2);
            }
            catch (Exception exception) {
                lfn.b(5, "SFModifier", "createCopy() Unable to create copy of modifier.");
                lfn.b(5, "SFModifier", "createCopy() Exception: " + exception);
                if ($assertionsDisabled) break block2;
                throw new AssertionError();
            }
        }
        return alt2;
    }

    public final boolean equals(Object object) {
        assert (this.GUID != null);
        if (object instanceof alt) {
            alt alt2 = (alt)object;
            assert (alt2.getGUID() != null);
            return this.GUID.equals(alt2.getGUID());
        }
        assert (false);
        return false;
    }

    public final String CE() {
        return lea.enT().getName(this.aYG);
    }

    public final String Eg() {
        return alv.gk(this.aYE);
    }

    public final boolean Eh() {
        return (this.bsE & 1) > 0;
    }

    public final boolean Ei() {
        return this.bsD == -3.0;
    }

    public final boolean Ej() {
        return (this.bsE & 2) > 0;
    }

    public final boolean Ek() {
        if (this.bsD <= 0.0) {
            return false;
        }
        return !this.Eh();
    }

    public final boolean El() {
        return (this.bsE & 4) > 0;
    }

    public final boolean gu() {
        return this.bsD == -2.0;
    }

    protected void g(alt alt2) {
        alt2.x(this.bsD);
        alt2.ga(this.aYE);
        alt2.gb(this.bsE);
        alt2.gc(this.bsF);
        alt2.fJ(this.aYG);
        alt2.h(this.bsH);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFModifier: GUID=");
        stringBuilder.append(this.GUID);
        stringBuilder.append(" ExpirationTime=");
        stringBuilder.append(this.bsD);
        stringBuilder.append(" Layer='");
        stringBuilder.append(this.Eg());
        stringBuilder.append("' ModifierConfigType=");
        stringBuilder.append(this.bsE);
        stringBuilder.append(" NumberOfTicks=");
        stringBuilder.append(this.bsF);
        stringBuilder.append(" CauseSkillType='");
        stringBuilder.append(lea.enZ().getName(this.aYC));
        stringBuilder.append("' EffectType='");
        stringBuilder.append(lea.enT().getName(this.aYG));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }
}

