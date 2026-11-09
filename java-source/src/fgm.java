/*
 * Decompiled with CFR.
 */
public abstract class fgm
extends fgp {
    private loz[] iMa = null;

    public loz[] bPs() {
        return this.iMa;
    }

    public void b(loz[] lozArray) {
        this.iMa = lozArray;
    }

    fgm() {
        super(29445);
    }

    protected fgm(int n) {
        super(n);
    }

    public loz bPt() {
        return this.iMa[(int)(lgp.erA().nextFloat() * (float)this.iMa.length)];
    }
}

