/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class lkc {
    public Set<Integer> rqc = lcn.emz();
    public float rqd = -1.0f;
    public float rqe = -1.0f;
    public float rqf = -1.0f;
    public float rqg = -1.0f;
    public float rqh = -1.0f;
    public float rqi = -1.0f;
    public int ddW = 100;
    public int Type = 0;

    public Object clone() {
        lkc lkc2 = new lkc();
        lkc2.rqc.addAll(this.rqc);
        lkc2.rqd = this.rqd;
        lkc2.rqe = this.rqe;
        lkc2.rqf = this.rqf;
        lkc2.rqg = this.rqg;
        lkc2.rqh = this.rqh;
        lkc2.rqi = this.rqi;
        lkc2.ddW = this.ddW;
        lkc2.Type = this.Type;
        return lkc2;
    }
}

