/*
 * Decompiled with CFR.
 */
public class auk
implements lbr {
    private static final String ccz = "<UNUSED>";
    private static final String ccA = "TS";
    private static final String ccB = "T";
    private static final String ccC = "NT";
    private static final String ccD = "NS";
    private static final String ccE = "NC";
    private static final String ccF = "NP";
    private static final String ccG = "OC";
    private static final String ccH = "FN";
    private static final String ccI = "TN";
    private static final String ccJ = "TT";
    private static final String ccK = "CN";
    private static final String ccL = "CL";
    private static final String ccM = "PX";
    private static final String ccN = "PY";
    private static final String ccO = "PZ";
    public long aEW;
    public String aFo;
    public String ccP = null;
    public aud.b ccQ;
    public int ccR;
    public String[] ccS;
    public String ccT;
    public String ccU;
    public String ccV;
    public aud.a ccW;
    public String add = null;
    public int ccX = 0;
    public int ccY = -1;
    public ljq Position = null;
    public ldv Ri;
    public static dsu alW = null;

    public static auk b(lfu lfu2) {
        long l2 = 0L;
        String string = null;
        aud.b b2 = null;
        int n = 0;
        String[] stringArray = null;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        aud.a a2 = null;
        String string5 = null;
        int n2 = 0;
        ljq ljq2 = null;
        l2 = lfu2.b(ccA, 0L);
        string = lfu2.aA(ccB, "");
        int n3 = lfu2.ad(ccC, -1);
        if (n3 != -1 && aud.b.isValidOrdinal(n3)) {
            b2 = aud.b.getValue(n3);
            n = lfu2.ad(ccD, 0);
            n3 = lfu2.ad(ccE, -1);
            if (n3 != -1) {
                stringArray = new String[n3];
                for (int i = 0; i < n3; ++i) {
                    stringArray[i] = lfu2.aA(ccF + i, "");
                }
            }
        }
        if ((string2 = lfu2.aA(ccG, ccz)).equals(ccz)) {
            string2 = null;
        }
        if ((string3 = lfu2.aA(ccH, ccz)).equals(ccz)) {
            string3 = null;
        }
        if ((string4 = lfu2.aA(ccI, ccz)).equals(ccz)) {
            string4 = null;
        }
        if ((n3 = lfu2.ad(ccJ, -1)) != -1) {
            a2 = aud.a.getValue(n3);
        }
        string5 = lfu2.aA(ccK, ccz);
        if (string5.equals(ccz)) {
            string5 = null;
        } else {
            n2 = lfu2.ad(ccL, 0);
        }
        float f2 = lfu2.e(ccM, -1.0f);
        float f3 = lfu2.e(ccN, -1.0f);
        float f4 = lfu2.e(ccO, -1.0f);
        if (!(lew.B(f2, -1.0f, 0.01f) && lew.B(f3, -1.0f, 0.01f) && lew.B(f4, -1.0f, 0.01f))) {
            ljq2 = new ljq(f2, f3, f4);
        }
        if (b2 == null) {
            return new auk(l2, string, string3, string4, a2, string5, n2, -1, ljq2, ldv.rfe);
        }
        return new auk(l2, string, b2, n, stringArray, string2);
    }

    public void c(lfu lfu2) {
        lfu2.b(ccA, this.aEW);
        lfu2.aA(ccB, this.aFo);
        if (this.ccQ != null) {
            lfu2.ad(ccC, this.ccQ.ordinal());
            lfu2.ad(ccD, this.ccR);
            if (this.ccS != null) {
                lfu2.ad(ccE, this.ccS.length);
                for (int i = 0; i < this.ccS.length; ++i) {
                    lfu2.aA(ccF + i, this.ccS[i]);
                }
            }
        } else {
            lfu2.ad(ccC, -1);
        }
        if (this.ccT != null) {
            lfu2.aA(ccG, this.ccT);
        }
        if (this.ccU != null) {
            lfu2.aA(ccH, this.ccU);
        }
        if (this.ccV != null) {
            lfu2.aA(ccI, this.ccV);
        }
        if (this.ccW != null) {
            lfu2.ad(ccJ, this.ccW.ordinal());
        } else {
            lfu2.ad(ccJ, -1);
        }
        if (this.add != null) {
            lfu2.aA(ccK, this.add);
            lfu2.ad(ccL, this.ccX);
        }
        if (this.Position != null) {
            lfu2.e(ccM, this.Position.x);
            lfu2.e(ccN, this.Position.y);
            lfu2.e(ccO, this.Position.rlV);
        } else {
            lfu2.e(ccM, -1.0f);
            lfu2.e(ccN, -1.0f);
            lfu2.e(ccO, -1.0f);
        }
    }

    public auk() {
    }

    public auk(long l2, String string, aud.b b2, int n, String[] stringArray, String string2) {
        this.aEW = l2;
        this.aFo = string;
        this.ccQ = b2;
        this.ccR = n;
        this.ccS = stringArray;
        this.ccV = null;
        this.ccU = null;
        this.ccW = null;
        this.ccT = string2;
    }

    public auk(long l2, String string, String string2, String string3, aud.a a2, String string4, int n, int n2, ljq ljq2, ldv ldv2) {
        this.aEW = l2;
        this.aFo = string;
        this.ccQ = null;
        this.ccR = -1;
        this.ccS = null;
        this.ccU = string2 == null ? "" : string2;
        this.ccV = string3 == null ? "" : string3;
        this.ccW = a2;
        this.add = string4;
        this.ccX = n;
        this.ccY = n2;
        this.Position = ljq2;
        this.ccT = null;
        this.Ri = ldv2;
    }

    @Override
    public boolean a(lfu lfu2) {
        this.aEW = lfu2.b("TimeStamp", this.aEW);
        int n = lfu2.ad("NotificationType", this.ccQ == null ? -1 : this.ccQ.ordinal());
        this.ccQ = n < 0 ? null : aud.b.getValue(n);
        if (this.ccQ != null) {
            this.ccR = lfu2.ad("NotificationSubType", this.ccR);
            if (lfu2.eqA()) {
                int n2 = lfu2.ad("ParameterCount", 0);
                this.ccS = new String[n2];
                for (int i = 0; i < n2; ++i) {
                    this.ccS[i] = lfu2.aA("Parameter" + i, "");
                }
            } else {
                int n3 = this.ccS == null ? 0 : this.ccS.length;
                lfu2.ad("ParameterCount", n3);
                for (int i = 0; i < n3; ++i) {
                    lfu2.aA("Parameter" + i, this.ccS[i]);
                }
            }
        } else {
            n = lfu2.ad("TargetType", this.ccW == null ? -1 : this.ccW.ordinal());
            this.ccW = n < 0 ? null : aud.a.getValue(n);
            this.ccU = lfu2.aA("From", this.ccU == null ? "" : this.ccU);
            this.ccV = lfu2.aA("To", this.ccV == null ? "" : this.ccV);
        }
        return lfu2.eqA();
    }

    public String Wd() {
        if (this.ccP == null) {
            return this.aFo;
        }
        return this.ccP;
    }
}

