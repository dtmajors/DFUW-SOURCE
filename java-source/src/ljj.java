/*
 * Decompiled with CFR.
 */
public class ljj
extends lip {
    private final int roK;

    protected ljj() {
        this.roK = -1;
    }

    public ljj(int n) {
        this.roK = n;
    }

    @Override
    public String esy() {
        return "[Handle=" + Integer.toString(this.roK) + "]";
    }

    public boolean a(ljj ljj2) {
        return this.roK == ljj2.roK;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof ljj) {
            return this.a((ljj)object);
        }
        assert (false);
        return super.equals(object);
    }
}

