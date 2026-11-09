/*
 * Decompiled with CFR.
 */
public class gdd
extends gdb {
    public static final int jdX = 1;
    public static final int jdY = 2;
    private int iOS = 0;
    private int jdZ = 0;
    private ldv ayy = null;
    private ldv jea = null;
    private boolean jdC = false;
    private int[] jeb = null;
    private int SkillType = -1;

    gdd() {
        super(10262);
    }

    public int bTG() {
        return this.jdZ;
    }

    public void IP(int n) {
        this.jdZ = n;
    }

    public ldv bTH() {
        return this.jea;
    }

    public void qd(ldv ldv2) {
        this.jea = ldv2;
    }

    public ldv qH() {
        return this.ayy;
    }

    public void iy(ldv ldv2) {
        this.ayy = ldv2;
    }

    public String[] bTI() {
        String[] stringArray = null;
        if (this.jeb == null) {
            return stringArray;
        }
        stringArray = new String[this.jeb.length];
        for (int i = 0; i < this.jeb.length; ++i) {
            stringArray[i] = lea.enW().getName(this.jeb[i]);
        }
        return stringArray;
    }

    public boolean bTB() {
        return this.jdC;
    }

    public void lI(boolean bl) {
        this.jdC = bl;
    }

    public int[] bTJ() {
        return this.jeb;
    }

    public void ap(int[] nArray) {
        this.jeb = nArray;
    }

    public int asH() {
        return this.iOS;
    }

    public void IQ(int n) {
        this.iOS = n;
    }

    public final int zg() {
        return this.SkillType;
    }

    public final void eI(int n) {
        this.SkillType = n;
    }
}

