/*
 * Decompiled with CFR.
 */
public class bv
extends bg {
    private String Filename;
    private int eT;
    private int eU;
    private String eV;

    public bv(String string, int n, int n2, String string2) {
        this.Filename = string;
        this.eT = n;
        this.eU = n2;
        this.eV = string2;
    }

    public bv(String string, int n, int n2, String string2, Throwable throwable) {
        super(null, throwable);
        this.Filename = string;
        this.eT = n;
        this.eU = n2;
        this.eV = string2;
    }

    @Override
    public String getMessage() {
        assert (super.getMessage() == null);
        return this.Filename + ", Line " + this.eT + ", Column " + this.eU + ": " + this.eV;
    }
}

