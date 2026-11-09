/*
 * Decompiled with CFR.
 */
public class ero
extends erq
implements dxu {
    public static final int izJ = 0;
    public static final int izK = 1;
    public static final int izL = 2;
    private int aqs = -1;
    private int izM = -1;
    private int izN = -1;
    private String izO = null;
    private ljq izP = null;
    private boolean izQ = false;
    private String izR = null;

    @Override
    public int aVk() {
        return this.aqs;
    }

    @Override
    public void sk(int n) {
        this.aqs = n;
    }

    public hc bLc() {
        return hc.getAccessLevelType(this.izM);
    }

    public void h(hc hc2) {
        this.izM = hc2 == null ? -1 : hc2.ordinal();
    }

    public int bLd() {
        return this.izN;
    }

    public void EO(int n) {
        this.izN = n;
    }

    public String bLe() {
        return this.izO;
    }

    public void ko(String string) {
        this.izO = string;
    }

    public ljq bLf() {
        return this.izP;
    }

    public void cE(ljq ljq2) {
        this.izP = ljq2;
    }

    public boolean bLg() {
        return this.izQ;
    }

    public void kI(boolean bl) {
        this.izQ = bl;
    }

    public String bLh() {
        return this.izR;
    }

    public void kp(String string) {
        this.izR = string;
    }

    ero() {
        super(16659);
    }

    public int EP(int n) {
        switch (n) {
            case 48: {
                return 0;
            }
            case 49: {
                return 1;
            }
            case 50: {
                return 2;
            }
        }
        return -1;
    }
}

