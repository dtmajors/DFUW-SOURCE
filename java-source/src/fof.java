/*
 * Decompiled with CFR.
 */
public abstract class fof
extends dxq {
    private String Filename = null;

    fof() {
        super(11520);
    }

    fof(int n) {
        super(n);
    }

    public String bsl() {
        return this.Filename;
    }

    public void cd(String string) {
        this.Filename = string;
    }
}

