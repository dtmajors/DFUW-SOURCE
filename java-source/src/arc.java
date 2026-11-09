/*
 * Decompiled with CFR.
 */
public class arc {
    private boolean bOc;
    private final int bOd;
    private int bOe;

    public arc(int n, arb arb2) {
        this.bOd = n;
        switch (arb2) {
            case bNX: 
            case bNY: {
                this.bOe = this.bOd + Math.round((float)this.bOd * arw.Sx() * 0.5f);
                break;
            }
            default: {
                this.bOe = this.bOd;
            }
        }
    }

    int QA() {
        return this.bOe;
    }

    public int QB() {
        return this.bOd;
    }
}

