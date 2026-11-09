/*
 * Decompiled with CFR.
 */
public class lcb
implements Cloneable {
    public lkr qvQ;
    public lkr qvR;
    public double qvS;
    public double qvT;
    public float pIs = 1.0f;

    public final Object clone() {
        lcb lcb2 = (lcb)super.clone();
        if (this.qvQ != null) {
            lcb2.qvQ = (lkr)this.qvQ.clone();
        }
        if (this.qvR != null) {
            lcb2.qvR = (lkr)this.qvR.clone();
        }
        return lcb2;
    }
}

