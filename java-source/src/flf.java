/*
 * Decompiled with CFR.
 */
public class flf
extends fmm {
    public static final int iPo = 1;
    public static final int iPp = 2;
    private int Type = 0;
    private ldv aCK = new ldv(0L);
    private int iPq = 0xFFFFFF;
    private String aFo = "";

    flf() {
        super(8009);
    }

    public int getType() {
        return this.Type;
    }

    public void setType(int n) {
        this.Type = n;
    }

    public int Hr() {
        return this.iPq;
    }

    public void setColor(int n) {
        this.iPq = n;
    }

    public String getText() {
        return this.aFo;
    }

    public void setText(String string) {
        this.aFo = string;
    }

    public ldv awM() {
        return this.aCK;
    }

    public void pJ(ldv ldv2) {
        this.aCK = ldv2;
    }
}

