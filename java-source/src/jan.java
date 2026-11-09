/*
 * Decompiled with CFR.
 */
public class jan {
    private a mHo;
    private ldv min;
    private int mHp;
    private int mHq;
    private int mHr;
    private int mHs;
    private String mHt;
    private String mHu;
    private int mHv;
    private int mHw;
    private int mHx;
    private int mHy;
    private int mHz;
    private String mHA;
    private String mHB;
    private static jan mHC = new jan(a.mHD);

    public a dvc() {
        return this.mHo;
    }

    public ldv getGUID() {
        return this.min;
    }

    public int az() {
        return this.mHp;
    }

    public int xf() {
        return this.mHq;
    }

    public int bQQ() {
        return this.mHr;
    }

    public int vf() {
        return this.mHs;
    }

    public String dvd() {
        return this.mHt;
    }

    public String dve() {
        return this.mHu;
    }

    public int bRm() {
        return this.mHv;
    }

    public int dvf() {
        return this.mHw;
    }

    public int bcM() {
        return this.mHx;
    }

    public int dvg() {
        return this.mHy;
    }

    public int getStatus() {
        return this.mHz;
    }

    public String dvh() {
        return this.mHA;
    }

    public String dvi() {
        return this.mHB;
    }

    public String dvj() {
        return this.mHt;
    }

    public String toString() {
        return this.mHo.ordinal() + ";" + (this.min != null ? this.min.toString() : ldv.rfe.toString()) + ";" + this.mHp + ";" + this.mHq + ";" + this.mHr + ";" + this.mHs + ";" + (this.mHt != null ? this.mHt : "") + ";" + (this.mHu != null ? this.mHu : "") + ";" + this.mHv + ";" + this.mHw + ";" + this.mHx + ";" + this.mHy + ";" + this.mHz + ";" + (this.mHA != null ? this.mHA : "") + ";" + (this.mHB != null ? this.mHB : "");
    }

    public static a rH(String string) {
        if (string == null) {
            return null;
        }
        int n = string.indexOf(59, 0);
        if (n < 0) {
            return null;
        }
        String string2 = string.substring(0, n);
        if (!string2.matches("\\d+")) {
            return null;
        }
        int n2 = Integer.valueOf(string2);
        if (n2 < 0 || n2 >= a.values().length) {
            return null;
        }
        return a.values()[n2];
    }

    public static jan rI(String string) {
        if (string == null) {
            return null;
        }
        String[] stringArray = string.split(";");
        if (stringArray == null || stringArray.length < 1) {
            return null;
        }
        if (stringArray[0] == null || !stringArray[0].matches("\\d+")) {
            return null;
        }
        a a2 = a.values()[Integer.valueOf(stringArray[0])];
        if (a2 == a.mHD) {
            return mHC;
        }
        if (a2 == a.mHE) {
            if (stringArray.length < 2) {
                return null;
            }
            return new jan(a.mHE, stringArray[1]);
        }
        try {
            if (stringArray.length < 15) {
                return null;
            }
            return new jan(a2, ldv.zq(stringArray[1]), Integer.valueOf(stringArray[2]), Integer.valueOf(stringArray[3]), Integer.valueOf(stringArray[4]), Integer.valueOf(stringArray[5]), stringArray[6], stringArray[7], Integer.valueOf(stringArray[8]), Integer.valueOf(stringArray[9]), Integer.valueOf(stringArray[10]), Integer.valueOf(stringArray[11]), Integer.valueOf(stringArray[12]), stringArray[13], stringArray[14]);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static jan o(lgw lgw2) {
        return new jan(a.mHF, null, lgw2.getType(), 0, 0, 0, null, null, 0, 0, 0, 0, 0, null, null);
    }

    public static jan p(lgw lgw2) {
        return new jan(a.mHG, null, lgw2.getType(), 0, 0, 0, null, null, 0, 0, 0, 0, 0, null, null);
    }

    public static jan a(cvy cvy2) {
        return new jan(cvy2.fBt ? a.mHI : a.mHH, null, cvy2.ResourceType, cvy2.bbL, cvy2.fBn, cvy2.asi, cvy2.fBq, null, cvy2.fBo, 0, cvy2.fBm, cvy2.fBp, cvy2.aEC, cvy2.fBr, cvy2.fBs);
    }

    public static jan rH(ldv ldv2) {
        return new jan(a.mHJ, ldv2, 0, 0, 0, 0, null, null, 0, 0, 0, 0, 0, null, null);
    }

    public static jan Tq(int n) {
        return new jan(a.mHK, null, n, 0, 0, 0, null, null, 0, 0, 0, 0, 0, null, null);
    }

    public static jan b(cvy cvy2) {
        return new jan(a.mHL, null, cvy2.ResourceType, cvy2.bbL, 0, 0, null, null, 0, 0, 0, 0, 0, null, null);
    }

    public static jan c(cvy cvy2) {
        return new jan(a.mHM, null, cvy2.ResourceType, cvy2.bbL, 0, 0, null, null, 0, 0, 0, 0, 0, null, null);
    }

    public static jan d(cvy cvy2) {
        return new jan(cvy2.fBt ? a.mHO : a.mHN, null, cvy2.ResourceType, cvy2.bbL, cvy2.fBn, cvy2.asi, cvy2.fBq, null, cvy2.fBo, 0, cvy2.fBm, cvy2.fBp, cvy2.aEC, cvy2.fBr, cvy2.fBs);
    }

    public static jan e(cvy cvy2) {
        return new jan(a.mHP, null, cvy2.ResourceType, cvy2.bbL, cvy2.fBn, cvy2.asi, null, cvy2.fBq, 0, cvy2.fBo, cvy2.fBm, cvy2.fBp, cvy2.aEC, cvy2.fBr, cvy2.fBs);
    }

    private jan(a a2) {
        this.mHo = a2;
    }

    private jan(a a2, String string) {
        this.mHo = a2;
        this.mHt = string;
    }

    private jan(a a2, ldv ldv2, int n, int n2, int n3, int n4, String string, String string2, int n5, int n6, int n7, int n8, int n9, String string3, String string4) {
        this.mHo = a2;
        this.min = ldv2;
        this.mHp = n;
        this.mHq = n2;
        this.mHr = n3;
        this.mHs = n4;
        this.mHt = string;
        this.mHu = string2;
        this.mHv = n5;
        this.mHw = n6;
        this.mHx = n7;
        this.mHy = n8;
        this.mHz = n9;
        this.mHA = string3;
        this.mHB = string4;
    }
}

