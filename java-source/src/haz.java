/*
 * Decompiled with CFR.
 */
public class haz
extends hac {
    public static final int jzP = 0;
    public static final int WARNING_MESSAGE = 1;
    public static final int ERROR_MESSAGE = 2;
    public static final int jzQ = 3;
    private String jzR = "No Status Message";
    private String jzS = "No title";
    private boolean jzT = false;
    private int jpq = 0;
    public boolean jzU = true;
    public int jzV = 0;
    public int jzW = 0;

    haz() {
        super(4098);
    }

    public String caD() {
        return this.jzR;
    }

    public void lU(String string) {
        this.jzR = string;
    }

    public String caE() {
        return this.jzS;
    }

    public void lV(String string) {
        this.jzS = string;
    }

    public boolean caF() {
        return this.jzT;
    }

    public void mT(boolean bl) {
        this.jzT = bl;
    }

    public int getMessageType() {
        return this.jpq;
    }

    public void setMessageType(int n) {
        this.jpq = n;
    }

    @Override
    public String toString() {
        return "<HTML><B>" + this.jzS + " :</B> " + this.jzR + "</HTML>";
    }
}

