/*
 * Decompiled with CFR.
 */
public class awr {
    final awg crP = new awg();
    final awc crQ = new awc();
    final aws crR;

    public awr(aws aws2) {
        this.crR = aws2;
    }

    public awg Xr() {
        return this.crP;
    }

    public awc Xs() {
        return this.crQ;
    }

    public boolean c(awi awi2) {
        return this.crP.c(awi2);
    }

    public aws d(awi awi2) {
        aws aws2 = this.crQ.a(awi2);
        if (aws2 == null || aws2 == aws.Continue) {
            aws2 = this.crR;
        }
        return aws2;
    }
}

