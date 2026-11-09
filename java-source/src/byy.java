/*
 * Decompiled with CFR.
 */
public class byy
extends bzi {
    private int bpX = 0;
    private int bpZ = 0;

    public int CS() {
        return this.bpX;
    }

    public void fK(int n) {
        this.bpX = n;
    }

    public int CU() {
        return this.bpZ;
    }

    public void fO(int n) {
        this.bpZ = n;
    }

    public boolean equals(Object object) {
        if (object instanceof byy) {
            byy byy2 = (byy)object;
            if (this.edc != byy2.aER()) {
                return false;
            }
            if (this.bpX != byy2.CS()) {
                return false;
            }
            return this.bpZ == byy2.CU();
        }
        return false;
    }

    @Override
    public boolean a(byx byx2) {
        assert (this.bpX > 0);
        assert (this.bpZ > 0);
        byv byv2 = byx2.aEP();
        switch (this.bpX) {
            case 1: {
                if (this.edc) {
                    return this.bpZ != byv2.vK();
                }
                return this.bpZ == byv2.vK();
            }
            case 2: {
                if (this.edc) {
                    return this.bpZ != byv2.vL();
                }
                return this.bpZ == byv2.vL();
            }
            case 3: {
                if (this.edc) {
                    return this.bpZ != byv2.vM();
                }
                return this.bpZ == byv2.vM();
            }
            case 4: {
                if (this.edc) {
                    return this.bpZ != byv2.vN();
                }
                return this.bpZ == byv2.vN();
            }
            case 5: {
                if (this.edc) {
                    return this.bpZ != byv2.vO();
                }
                return this.bpZ == byv2.vO();
            }
            case 6: {
                if (this.edc) {
                    return this.bpZ != byv2.vP();
                }
                return this.bpZ == byv2.vP();
            }
            case 7: {
                if (this.edc) {
                    return this.bpZ != byv2.vQ();
                }
                return this.bpZ == byv2.vQ();
            }
        }
        return false;
    }

    @Override
    public String toString() {
        assert (this.bpX > 0);
        assert (this.bpZ > 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFObjectStateRequirement: ");
        stringBuilder.append(super.toString());
        stringBuilder.append(" Mode='");
        stringBuilder.append(byw.nQ(this.bpX));
        stringBuilder.append("' ModeValue='");
        stringBuilder.append(byw.az(this.bpX, this.bpZ));
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    @Override
    protected void a(bzi bzi2) {
        super.a(bzi2);
        byy byy2 = (byy)bzi2;
        byy2.fK(this.bpX);
        byy2.fO(this.bpZ);
    }
}

