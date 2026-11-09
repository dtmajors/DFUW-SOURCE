/*
 * Decompiled with CFR.
 */
public class cjg
extends cjf {
    private boolean[] eDU = new boolean[]{false, false, false, false};

    public cjg() {
        super(cjo.DIRECTION);
    }

    public boolean g(boolean[] blArray) {
        if (blArray == null) {
            return false;
        }
        for (int i = 0; i < 4; ++i) {
            boolean bl = blArray[i];
            if (!bl || bl == this.eDU[i]) continue;
            this.eDU[i] = true;
            return true;
        }
        return false;
    }

    public cjg aQa() {
        super.aPZ();
        cjg cjg2 = (cjg)super.aPZ();
        cjg2.eDU = new boolean[this.eDU.length];
        for (int i = 0; i < this.eDU.length; ++i) {
            cjg2.eDU[i] = this.eDU[i];
        }
        cjg2.ayN = this.ayN;
        return cjg2;
    }

    @Override
    public /* synthetic */ cjf aPZ() {
        return this.aQa();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.aQa();
    }
}

