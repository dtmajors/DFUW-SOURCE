/*
 * Decompiled with CFR.
 */
public class gdj
extends gdp {
    public static final int jeE = 0;
    public static final int jeF = 1;
    public static final int jeG = 2;
    public static final int jeH = 3;
    public static final int jeI = 4;
    private int jeJ = -1;
    private ldv akU = null;
    private int ResourceType = -1;
    private int SkillType = -1;
    private int Amount = 0;
    private boolean jdC = false;

    gdj() {
        super(10246);
    }

    public ldv nS() {
        return this.akU;
    }

    public void qg(ldv ldv2) {
        this.akU = ldv2;
    }

    public final int az() {
        return this.ResourceType;
    }

    public final void l(int n) {
        this.ResourceType = n;
    }

    public final int zg() {
        return this.SkillType;
    }

    public final void eI(int n) {
        this.SkillType = n;
    }

    public final int bNn() {
        return this.Amount;
    }

    public final void FI(int n) {
        this.Amount = n;
    }

    public final boolean bTB() {
        return this.jdC;
    }

    public final void lI(boolean bl) {
        this.jdC = bl;
    }

    public final int bTP() {
        return this.jeJ;
    }

    public final void IU(int n) {
        this.jeJ = n;
    }
}

