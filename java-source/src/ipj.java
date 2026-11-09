/*
 * Decompiled with CFR.
 */
public class ipj
extends ipx {
    private ipk mrU;
    private ipt mrV;

    public ipj(int n, int n2, int n3) {
        this.a(irl.dnr());
        this.mrU = new ipk(n);
        this.W(this.mrU);
        this.mrV = new ipt(n2, n3);
        this.W(this.mrV);
    }

    public ipj() {
        this(0, 0, 1);
    }

    public ipk dlK() {
        return this.mrU;
    }

    public ipt dlL() {
        return this.mrV;
    }
}

