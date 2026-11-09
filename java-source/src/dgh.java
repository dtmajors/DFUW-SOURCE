/*
 * Decompiled with CFR.
 */
public class dgh
extends dgb {
    private int gqc = 0;
    private int gqd = 0;
    private int gqe = 0;
    private int gqf = 0;
    private int gqg = 0;
    private int gqh = 0;
    private int gqi = 0;
    private int gqj = 0;

    public int getState0() {
        return this.gqc;
    }

    public void setState0(int n2) {
        this.gqc = n2;
    }

    public int getState1() {
        return this.gqd;
    }

    public void setState1(int n2) {
        this.gqd = n2;
    }

    public int getState2() {
        return this.gqe;
    }

    public void setState2(int n2) {
        this.gqe = n2;
    }

    public int getState3() {
        return this.gqf;
    }

    public void setState3(int n2) {
        this.gqf = n2;
    }

    public int getValue0() {
        return this.gqg;
    }

    public void setValue0(int n2) {
        this.gqg = n2;
    }

    public int getValue1() {
        return this.gqh;
    }

    public void setValue1(int n2) {
        this.gqh = n2;
    }

    public int getValue2() {
        return this.gqi;
    }

    public void setValue2(int n2) {
        this.gqi = n2;
    }

    public int getValue3() {
        return this.gqj;
    }

    public void setValue3(int n2) {
        this.gqj = n2;
    }

    public dgh() {
        this.gpB = (short)4;
    }

    @Override
    public void updateAtom(float f2) {
        dey dey2;
        if (gpF == null) {
            return;
        }
        if (gpF.blo() == 11) {
            dey2 = (dfm)gpF;
            ((dfm)dey2).bJ(this.gqc, this.gqg);
            ((dfm)dey2).bK(this.gqd, this.gqh);
            ((dfm)dey2).bL(this.gqe, this.gqi);
            ((dfm)dey2).bM(this.gqf, this.gqj);
        }
        if (gpF.blo() == 25) {
            dey2 = (dfg)gpF;
            ((dfg)dey2).bJ(this.gqc, this.gqg);
            ((dfg)dey2).bK(this.gqd, this.gqh);
            ((dfg)dey2).bL(this.gqe, this.gqi);
            ((dfg)dey2).bM(this.gqf, this.gqj);
        }
        if (gpF.blo() == 14) {
            dey2 = (dfo)gpF;
            ((dfo)dey2).bJ(this.gqc, this.gqg);
            ((dfo)dey2).bK(this.gqd, this.gqh);
            ((dfo)dey2).bL(this.gqe, this.gqi);
            ((dfo)dey2).bM(this.gqf, this.gqj);
        }
    }
}

