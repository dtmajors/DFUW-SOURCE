/*
 * Decompiled with CFR.
 */
public class irs {
    private static final String mvy = "ProgressBarBackground";
    private static final String mvz = "ProgressBarForeground";
    private static final String mvA = "ProgressBarForegroundGlow";
    private static final String mvB = "ProgressBarSeparatorGlow";
    private static final String mvC = "ProgressBarLeadingEdgeGlow";
    public static final double mvD = 0.35;
    private boolean mvE = false;
    private String mbL = "ProgressBarBackground";
    private String mbM = "ProgressBarForeground";
    private String mvF = "ProgressBarForegroundGlow";
    private String mvG = "ProgressBarSeparatorGlow";
    private String mbN = "ProgressBarLeadingEdgeGlow";
    private int mvH = 1;
    private int mvI = 0;
    private int mvJ = 0;
    private int mvK = 1;
    private int mvL = 0;
    private boolean mvM = false;
    private double mvN = 1.0;
    private boolean mvO = false;
    private boolean mvP = false;
    private double mvQ = 1.0;
    private boolean mvR = false;
    private double mvS = 1.0;
    private boolean mvT = false;
    private boolean mvU = false;
    private boolean mvV = false;
    private double mvW = 0.35;
    private boolean mvX = false;
    private boolean mvY = false;
    private isf mvZ = isf.mwM;
    private int mwa = 10;
    private int mwb = 0xD8D8D8;
    private String mwc = null;

    public String dcO() {
        return this.mbL;
    }

    public void qu(String string) {
        if (this.mvE) {
            return;
        }
        this.mbL = string;
    }

    public String dnO() {
        return this.mbM;
    }

    public void ra(String string) {
        if (this.mvE) {
            return;
        }
        this.mbM = string;
    }

    public String dnP() {
        return this.mvF;
    }

    public void rb(String string) {
        if (this.mvE) {
            return;
        }
        this.mvF = string == null || string.trim().isEmpty() ? mvA : string.trim();
    }

    public String dnQ() {
        return this.mvG;
    }

    public void rc(String string) {
        if (this.mvE) {
            return;
        }
        this.mvG = string == null || string.trim().isEmpty() ? mvB : string.trim();
    }

    public String dnR() {
        return this.mbN;
    }

    public void rd(String string) {
        if (this.mvE) {
            return;
        }
        this.mbN = string == null || string.trim().isEmpty() ? mvC : string.trim();
    }

    public int dnS() {
        return this.mvH;
    }

    public void Sn(int n) {
        if (this.mvE) {
            return;
        }
        this.mvH = n < 1 ? 1 : n;
    }

    public int dnT() {
        return this.mvI;
    }

    public void So(int n) {
        if (this.mvE) {
            return;
        }
        this.mvI = n < 0 ? 0 : n;
    }

    public int dnU() {
        return this.mvJ;
    }

    public void Sp(int n) {
        if (this.mvE) {
            return;
        }
        this.mvJ = n < 0 ? 0 : (n > 0xFFFFFF ? 0xFFFFFF : n);
    }

    public int dnV() {
        return this.mvK;
    }

    public void Sq(int n) {
        if (this.mvE) {
            return;
        }
        this.mvK = n < 1 ? 1 : n;
    }

    public int dnW() {
        return this.mvL;
    }

    public void Sr(int n) {
        if (this.mvE) {
            return;
        }
        this.mvL = n < 0 ? 0 : n;
    }

    public boolean dnX() {
        return this.mvM;
    }

    public void se(boolean bl) {
        if (this.mvE) {
            return;
        }
        this.mvM = bl;
    }

    public double dnY() {
        return this.mvN;
    }

    public void dr(double d2) {
        if (this.mvE) {
            return;
        }
        this.mvN = d2 <= 0.0 ? 0.1 : d2;
    }

    public boolean dnZ() {
        return this.mvO;
    }

    public void sf(boolean bl) {
        if (this.mvE) {
            return;
        }
        this.mvO = bl;
    }

    public boolean doa() {
        return this.mvP;
    }

    public void sg(boolean bl) {
        if (this.mvE) {
            return;
        }
        this.mvP = bl;
    }

    public double dob() {
        return this.mvQ;
    }

    public void ds(double d2) {
        if (this.mvE) {
            return;
        }
        this.mvQ = d2 < 0.0 ? 0.1 : d2;
    }

    public boolean doc() {
        return this.mvR;
    }

    public void sh(boolean bl) {
        if (this.mvE) {
            return;
        }
        this.mvR = bl;
    }

    public double dod() {
        return this.mvS;
    }

    public void dt(double d2) {
        if (this.mvE) {
            return;
        }
        this.mvS = d2;
    }

    public boolean doe() {
        return this.mvT;
    }

    public void si(boolean bl) {
        if (this.mvE) {
            return;
        }
        this.mvT = bl;
    }

    public boolean dof() {
        return this.mvU;
    }

    public void sj(boolean bl) {
        if (this.mvE) {
            return;
        }
        this.mvU = bl;
    }

    public boolean dog() {
        return this.mvV;
    }

    public void sk(boolean bl) {
        if (this.mvE) {
            return;
        }
        this.mvV = bl;
    }

    public double doh() {
        return this.mvW;
    }

    public void du(double d2) {
        if (this.mvE) {
            return;
        }
        this.mvW = Math.max(d2, 0.0);
    }

    public boolean doi() {
        return this.mvX;
    }

    public void sl(boolean bl) {
        if (this.mvE) {
            return;
        }
        this.mvX = bl;
    }

    public boolean doj() {
        return this.mvY;
    }

    public void sm(boolean bl) {
        if (this.mvE) {
            return;
        }
        this.mvY = bl;
    }

    public isf dok() {
        return this.mvZ;
    }

    public void a(isf isf2) {
        if (this.mvE) {
            return;
        }
        this.mvZ = isf2;
    }

    public int dol() {
        return this.mwa;
    }

    public void Ss(int n) {
        if (this.mvE) {
            return;
        }
        this.mwa = n;
    }

    public int dom() {
        return this.mwb;
    }

    public void St(int n) {
        if (this.mvE) {
            return;
        }
        this.mwb = n;
    }

    public String don() {
        return this.mwc;
    }

    public void re(String string) {
        if (this.mvE) {
            return;
        }
        this.mwc = string;
    }

    void doo() {
        this.mvE = true;
    }
}

