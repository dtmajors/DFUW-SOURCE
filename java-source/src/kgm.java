/*
 * Decompiled with CFR.
 */
public class kgm
extends kgh {
    public static final int pnw = 1;
    public static final int pnx = 2;
    public static final int pny = 3;
    public static final int pnz = 1;
    public static final int pnA = 2;
    private int Type;
    private String pnB;
    private String bQc;
    private boolean pnC = false;
    private int pnD = 0;

    public int dXt() {
        return this.pnD;
    }

    public void WQ(int n) {
        this.pnD = n;
    }

    public boolean dXu() {
        return this.pnC;
    }

    public void vB(boolean bl) {
        this.pnC = bl;
    }

    public kgm() {
        this.ed = 2;
    }

    public String getDirectory() {
        return this.pnB;
    }

    public void setDirectory(String string) {
        this.pnB = string;
    }

    public String getPrefix() {
        return this.bQc;
    }

    public void setPrefix(String string) {
        this.bQc = string;
    }

    public int getType() {
        return this.Type;
    }

    public void setType(int n) {
        this.Type = n;
    }
}

