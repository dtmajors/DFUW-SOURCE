/*
 * Decompiled with CFR.
 */
public class ktb
extends ktf {
    private String aNb;
    private int ew;

    public ktb() {
        this.qbm = 7;
    }

    public final String getErrorString() {
        return this.aNb;
    }

    public final void kY(String string) {
        this.aNb = string;
    }

    public final int getResult() {
        return this.ew;
    }

    public final void DR(int n) {
        this.ew = n;
    }

    public String toString() {
        return "SFResourceLevelPreProcessResponse: Result = " + this.ew + ", ErrorString = " + this.aNb;
    }
}

