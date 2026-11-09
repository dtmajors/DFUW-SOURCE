/*
 * Decompiled with CFR.
 */
public class kga
extends kgh {
    public static final int plc = 1;
    public static final int pld = 2;
    public static final int ple = 4;
    private int Type;
    private String plf = "";
    private ldv GUID = new ldv(0L);

    public int getType() {
        return this.Type;
    }

    public void setType(int n) {
        this.Type = n;
    }

    public String dWu() {
        return this.plf;
    }

    public void wH(String string) {
        this.plf = string;
    }

    public ldv getGUID() {
        return this.GUID;
    }

    public void setGUID(ldv ldv2) {
        this.GUID = ldv2;
    }

    public kga() {
        this.ed = 19;
    }
}

