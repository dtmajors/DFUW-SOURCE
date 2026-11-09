/*
 * Decompiled with CFR.
 */
public class kdk
extends kcz {
    private String phb = null;
    private int ioP = 0;
    private lmn phc = null;

    public String toString() {
        String string = "SFMiddlewareSQLResultMessage ConnectionName=" + this.phb + " Context=" + this.ioP;
        string = this.phc == null ? string + " Result=null" : string + " Result=" + this.phc;
        return string;
    }

    kdk() {
        super(260);
    }

    public String dVq() {
        return this.phb;
    }

    public void wA(String string) {
        this.phb = string;
    }

    public int getContext() {
        return this.ioP;
    }

    public void setContext(int n) {
        this.ioP = n;
    }

    public lmn dVr() {
        return this.phc;
    }

    public void c(lmn lmn2) {
        this.phc = lmn2;
    }
}

