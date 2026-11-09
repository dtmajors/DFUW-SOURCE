/*
 * Decompiled with CFR.
 */
public class crg
extends crj {
    public int eXO = Integer.MIN_VALUE;
    public int eXP = Integer.MIN_VALUE;
    public int eXQ = Integer.MIN_VALUE;

    @Override
    public Object clone() {
        return super.clone();
    }

    public void tc(int n) {
        if (this.eXO < n) {
            this.eXO = n;
        }
    }

    public void td(int n) {
        if (this.eXP < n) {
            this.eXP = n;
        }
    }

    public void te(int n) {
        if (this.eXQ < n) {
            this.eXQ = n;
        }
    }
}

