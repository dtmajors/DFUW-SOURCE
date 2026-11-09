/*
 * Decompiled with CFR.
 */
public class gmt
extends gmz {
    public static final int jml = 0;
    public static final int jmm = 1;
    public static final int jmn = 2;
    public static final int jmo = 3;
    private int iXS = 0;

    public int getErrorCode() {
        return this.iXS;
    }

    public void JY(int n) {
        this.iXS = n;
    }

    public String bWd() {
        switch (this.iXS) {
            case 0: {
                return "No Error";
            }
            case 1: {
                return "Invalid Request Type";
            }
            case 2: {
                return "Request Already Being Processed";
            }
            case 3: {
                return "perations in Progress, Cannot Restart Now!";
            }
        }
        return "Unknown Error!";
    }

    gmt() {
        super(3620);
    }
}

