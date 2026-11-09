/*
 * Decompiled with CFR.
 */
public class alu {
    private static final double bsJ = 1000000.0;
    private int aYC = -1;
    private float Magnitude = -1.0f;
    private int aYE = -1;
    private ldv aYF = null;
    private int aYG = 0;
    private int aYH = 0;
    private double bsK = 0.0;
    private double bsL = 0.0;
    private int[] bsM = null;

    public ldv DZ() {
        return this.aYF;
    }

    public void cP(ldv ldv2) {
        this.aYF = ldv2;
    }

    public int CD() {
        return this.aYG;
    }

    public void fJ(int n) {
        this.aYG = n;
    }

    public int Eb() {
        return this.aYC;
    }

    public void ge(int n) {
        this.aYC = n;
    }

    public float uO() {
        return this.Magnitude;
    }

    public void N(float f2) {
        this.Magnitude = f2;
    }

    public int DW() {
        return this.aYE;
    }

    public void ga(int n) {
        this.aYE = n;
    }

    public final int Ec() {
        return this.aYH;
    }

    public final void gf(int n) {
        this.aYH = n;
    }

    public final double Em() {
        return this.bsK;
    }

    public final void y(double d2) {
        this.bsK = d2;
    }

    public final double En() {
        return this.bsL;
    }

    public final void z(double d2) {
        this.bsL = d2;
    }

    public final void gg(int n) {
        if (n <= 0) {
            return;
        }
        if (this.gj(n) >= 0) {
            return;
        }
        if (this.bsM == null) {
            this.bsM = new int[]{n};
        } else {
            int[] nArray = new int[this.bsM.length + 1];
            System.arraycopy(this.bsM, 0, nArray, 0, this.bsM.length);
            nArray[this.bsM.length] = n;
            this.bsM = nArray;
        }
    }

    public final boolean gh(int n) {
        return this.gj(n) >= 0;
    }

    public final alu Eo() {
        alu alu2 = new alu();
        alu2.cP(this.aYF);
        alu2.fJ(this.aYG);
        alu2.gf(this.aYH);
        alu2.y(this.bsK);
        alu2.z(this.bsL);
        alu2.ge(this.aYC);
        alu2.ga(this.aYE);
        alu2.N(this.Magnitude);
        return alu2;
    }

    public final boolean equals(Object object) {
        if (object instanceof alu) {
            alu alu2 = (alu)object;
            return this.b(alu2.DZ(), alu2.CD(), alu2.Ec(), alu2.Em());
        }
        return false;
    }

    public final boolean b(ldv ldv2, int n, int n2, double d2) {
        assert (ldv2 != null);
        assert (n > 0);
        assert (n2 > 0);
        assert (d2 > 0.0);
        if (!ldv2.equals(this.aYF)) {
            return false;
        }
        if (n != this.aYG) {
            return false;
        }
        if (n2 != this.aYH) {
            return false;
        }
        return d2 == this.bsK;
    }

    public boolean hasInfiniteDuration() {
        return this.bsL == -2.0;
    }

    public final double Ep() {
        if (this.bsL == -2.0) {
            return this.bsK + 1000000.0;
        }
        return this.bsK + this.bsL;
    }

    public final lhu Eq() {
        assert (this.aYG > 0);
        les les2 = lea.enT();
        int n = this.aYG;
        ldi ldi2;
        while ((ldi2 = (ldi)les2.acv(n)).atw() == null) {
            if (ldi2.getType() == 0) {
                return null;
            }
            n = les2.uW(n);
        }
        return ldi2.atw();
    }

    public final String CE() {
        return lea.enT().getName(this.aYG);
    }

    public final lip Er() {
        return new ljk(this.CE());
    }

    public final int Es() {
        assert (this.bsM != null);
        return this.bsM.length;
    }

    public final void gi(int n) {
        if (n <= 0) {
            return;
        }
        if (this.bsM == null) {
            return;
        }
        int n2 = this.gj(n);
        if (n2 < 0) {
            return;
        }
        int[] nArray = new int[this.bsM.length - 1];
        int n3 = 0;
        int n4 = this.bsM.length;
        for (int i = 0; i < n4; ++i) {
            if (i == n2) continue;
            nArray[n3] = this.bsM[i];
            ++n3;
        }
        this.bsM = nArray;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFModifierInfo: CauseObjectGUID=");
        stringBuilder.append(this.aYF);
        stringBuilder.append(" Effect='");
        stringBuilder.append(this.CE());
        stringBuilder.append("' SessionID=");
        stringBuilder.append(this.aYH);
        stringBuilder.append(" EffectStartTime=");
        stringBuilder.append(this.bsK);
        stringBuilder.append(" EffectDurationTime=");
        stringBuilder.append(this.bsL);
        stringBuilder.append(" EffectExpirationTime=");
        stringBuilder.append(this.Ep());
        return stringBuilder.toString();
    }

    private int gj(int n) {
        if (this.bsM != null) {
            int n2 = this.bsM.length;
            for (int i = 0; i < n2; ++i) {
                if (this.bsM[i] != n) continue;
                return i;
            }
        }
        return -1;
    }
}

