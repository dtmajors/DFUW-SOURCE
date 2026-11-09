/*
 * Decompiled with CFR.
 */
public class bze
extends bzi {
    private int edx = 0;
    private boolean edy = false;

    public int aFf() {
        return this.edx;
    }

    public void oi(int n) {
        this.edx = n;
    }

    public boolean aFg() {
        return this.edy;
    }

    public void fn(boolean bl) {
        this.edy = bl;
    }

    public boolean equals(Object object) {
        if (object instanceof bze) {
            bze bze2 = (bze)object;
            if (this.edc != bze2.aER()) {
                return false;
            }
            if (this.edx != bze2.aFf()) {
                return false;
            }
            return this.edy == bze2.aFg();
        }
        return false;
    }

    @Override
    public boolean a(byx byx2) {
        assert (this.edx > 0);
        bzc bzc2 = byx2.aDe();
        if (bzc2 == null) {
            return false;
        }
        switch (this.edx) {
            case 1: {
                if (this.edc) {
                    return this.edy != bzc2.edl;
                }
                return this.edy == bzc2.edl;
            }
            case 2: {
                if (this.edc) {
                    return this.edy != bzc2.aEy();
                }
                return this.edy == bzc2.aEy();
            }
            case 3: {
                if (this.edc) {
                    return this.edy != bzc2.edm;
                }
                return this.edy == bzc2.edm;
            }
            case 4: {
                if (this.edc) {
                    return this.edy != bzc2.edn;
                }
                return this.edy == bzc2.edn;
            }
            case 5: {
                if (this.edc) {
                    return this.edy != bzc2.edo;
                }
                return this.edy == bzc2.edo;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        assert (this.edx > 0);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SFPhysicsStateRequirement: ");
        stringBuilder.append(super.toString());
        stringBuilder.append(" PhysicsStateRequirementType='");
        stringBuilder.append(byw.od(this.edx));
        stringBuilder.append("' StateValue=");
        stringBuilder.append(this.edy);
        return stringBuilder.toString();
    }

    @Override
    protected void a(bzi bzi2) {
        super.a(bzi2);
        bze bze2 = (bze)bzi2;
        bze2.oi(this.edx);
        bze2.fn(this.edy);
    }
}

