/*
 * Decompiled with CFR.
 */
public class aaw {
    private wy bbg = null;
    private int ID = -1;
    private int bcT = -1;
    private int bcU = -1;
    private int PC = -1;

    public wy wF() {
        return this.bbg;
    }

    public int getID() {
        return this.ID;
    }

    public int xL() {
        return this.bcT;
    }

    public aaz xM() {
        return this.bbg == null ? null : this.bbg.dE(this.bcT);
    }

    public int xN() {
        return this.bcU;
    }

    public aaz xO() {
        return this.bbg == null ? null : this.bbg.dE(this.bcU);
    }

    public int getValue() {
        return this.PC;
    }

    public aaw(wy wy2, int n, int n2, int n3, int n4) {
        this.bbg = wy2;
        this.ID = n;
        this.bcT = n2;
        this.bcU = n3;
        this.PC = n4;
    }

    public void c(boolean bl, boolean bl2) {
        if (this.bbg == null) {
            lfn.b(5, this.getClass().getSimpleName(), "transmit() : Quest is Null!!!... Edge = " + this);
            assert (false);
            return;
        }
        if (!(this.bbg instanceof wz)) {
            lfn.b(5, this.getClass().getSimpleName(), "transmit() : Quest is Not Active!!!... Quest = " + this.bbg + ", Edge = " + this);
            assert (false);
            return;
        }
        aaz aaz2 = this.xO();
        if (aaz2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "transmit() : To-Node Not Found!!!... Quest = " + this.bbg + ", Edge = " + this);
            assert (false);
            return;
        }
        aaz2.a(this.ID, this.PC, bl, bl2);
    }

    public aaw g(wy wy2) {
        return new aaw(wy2, this.ID, this.bcT, this.bcU, this.PC);
    }
}

