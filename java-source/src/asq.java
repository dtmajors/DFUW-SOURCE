/*
 * Decompiled with CFR.
 */
import java.util.Set;

public class asq {
    public float bVJ = 0.0f;
    public float bVK = 0.0f;
    public int bVL = 1;
    public float bVM = 2.0f;
    public float bVN = 1.0f;
    public boolean bIC = false;
    public boolean bVO = true;
    private Set<Integer> bVP;
    private Set<Integer> bVQ;

    public Set<Integer> TP() {
        return this.bVP;
    }

    public void e(Set<Integer> set) {
        if (this.bVQ != null) {
            set.removeAll(this.bVQ);
        }
        this.bVP = set;
    }

    public Set<Integer> TQ() {
        return this.bVQ;
    }

    public void f(Set<Integer> set) {
        if (this.bVP != null) {
            set.removeAll(this.bVP);
        }
        this.bVQ = set;
    }
}

