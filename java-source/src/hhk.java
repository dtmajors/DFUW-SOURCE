/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cxd
 *  hdm
 *  lcw
 */
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class hhk
extends how {
    public static final int krl = 0;
    public static final int krm = 1;
    public static final int krn = 2;
    public static final int kro = 3;
    public static final int krp = 0;
    public static final int krq = 1;
    public static final int krr = 2;
    public final hpe krs;
    public final hpe krt;
    public final hpe kru;
    public final hpe krv;
    public final hpe krw;
    public final hpe krx;
    public final hpe kry;
    public final hpe krz;
    public final hpe krA;
    public final hpe krB;
    public final hpe krC;
    public final hpe krD;
    public final hpe krE;
    public final hpe krF;
    public final hpe krG;
    public final hpe krH;
    public final hpe krI;
    public final hpe krJ;
    public final hpe krK;
    public final hpe krL;
    public final hpe krM;
    public final hpe[] krN;
    public final hpe krO;
    public final hpe[] krP;
    public final hqy krQ;
    public final hqy krR;
    public final hqy krS;
    public final hdm dXw;
    private Map<Integer, Set<hpe>> krT = lcn.emw();
    private final bwy krU;
    private lbn krV = new lbn(this){
        final /* synthetic */ hhk krY;
        {
            this.krY = hhk2;
        }

        public void W() {
            hhk.a(this.krY);
        }
    };
    private lbn krW = new lbn(this){
        final /* synthetic */ hhk krY;
        {
            this.krY = hhk2;
        }

        public void W() {
            hhk.b(this.krY);
        }
    };
    private lbn krX = new lbn(this){
        final /* synthetic */ hhk krY;
        {
            this.krY = hhk2;
        }

        public void W() {
            hhk.c(this.krY);
        }
    };

    public hhk(hnc hnc2, String string, lgg lgg2, lhf lhf2, hpw.a a2, bwy bwy2) {
        super(hnc2, string, lgg2, lhf2, a2);
        hpe hpe2;
        int n;
        this.dXw = (hdm)hnc2;
        this.krU = bwy2;
        int n2 = 10;
        int n3 = 130;
        int n4 = 10;
        int n5 = lhf2.rmN - 2 * n2;
        int n6 = n3 - 2 * n2;
        int n7 = lhf2.rmN - n3 - n2;
        int n8 = n2 + (n3 - n2) / 2;
        int n9 = n5 - n2 - n8;
        n8 = n3;
        n9 = n7;
        int n10 = 15;
        int n11 = 5;
        this.krs = new hpe(hnc2, "Label PlayerInfo", new lgg(n2, n4), new lhf(n6, n10), this.dXw.kIu, "Player:");
        this.j(this.krs);
        this.krt = new hpe(hnc2, "Text PlayerInfo", new lgg(n3, n4), new lhf(n7, n10), this.dXw.kIv, "");
        this.j(this.krt);
        this.kru = new hpe(hnc2, "Label Online", new lgg(n2, n4 += n10 + n11), new lhf(n6, n10), this.dXw.kIu, "Online:");
        this.j(this.kru);
        this.krv = new hpe(hnc2, "Text Online", new lgg(n3, n4), new lhf(n7, n10), this.dXw.kIv, "");
        this.j(this.krv);
        this.krw = new hpe(hnc2, "Label Clan", new lgg(n2, n4 += n10 + n11), new lhf(n6, n10), this.dXw.kIu, "Clan:");
        this.j(this.krw);
        this.krx = new hpe(hnc2, "Text Clan", new lgg(n3, n4), new lhf(n7, n10), this.dXw.kIv, "");
        this.j(this.krx);
        this.kry = new hpe(hnc2, "Label Modes", new lgg(n2, n4 += n10 + n11), new lhf(n6, n10), this.dXw.kIu, "Modes:");
        this.j(this.kry);
        this.krz = new hpe(hnc2, "Text Modes", new lgg(n3, n4), new lhf(n7, n10), this.dXw.kIv, "");
        this.j(this.krz);
        this.krA = new hpe(hnc2, "Label VitalStats", new lgg(n2, n4 += n10 + n11), new lhf(n6, n10), this.dXw.kIu, "Vital Stats:");
        this.j(this.krA);
        this.krB = new hpe(hnc2, "Text VitalStatsHealth", new lgg(n3, n4), new lhf(n7, n10), this.dXw.kIv, "");
        this.j(this.krB);
        this.krC = new hpe(hnc2, "Text VitalStatsStamina", new lgg(n3, n4 += n10), new lhf(n7, n10), this.dXw.kIv, "");
        this.j(this.krC);
        this.krD = new hpe(hnc2, "Text VitalStatsMana", new lgg(n3, n4 += n10), new lhf(n7, n10), this.dXw.kIv, "");
        this.j(this.krD);
        this.krE = new hpe(hnc2, "Label ResourceTypeAboveBelow", new lgg(n2, n4 += n10 + n11), new lhf(n6, n10), this.dXw.kIu, "Closest objects:");
        this.j(this.krE);
        this.krF = new hpe(hnc2, "Text ResourceTypeAbove", new lgg(n3, n4), new lhf(n7, n10), this.dXw.kIv, "");
        this.j(this.krF);
        this.krG = new hpe(hnc2, "Text ResourceTypeBelow", new lgg(n3, n4 += n10), new lhf(n7, n10), this.dXw.kIv, "");
        this.j(this.krG);
        this.krH = new hpe(hnc2, "Label Position", new lgg(n2, n4 += n10 + n11), new lhf(n6, n10), this.dXw.kIu, "Position:");
        this.j(this.krH);
        this.krI = new hpe(hnc2, "Text Position", new lgg(n3, n4), new lhf(n7, n10), this.dXw.kIv, "");
        this.j(this.krI);
        this.krJ = new hpe(hnc2, "Label Velocity", new lgg(n2, n4 += n10 + n11), new lhf(n6, n10), this.dXw.kIu, "Velocity:");
        this.j(this.krJ);
        this.krK = new hpe(hnc2, "Text Velocity", new lgg(n3, n4), new lhf(n7, n10), this.dXw.kIv, "");
        this.j(this.krK);
        this.krL = new hpe(hnc2, "Label AnimationState", new lgg(n2, n4 += n10 + n11), new lhf(n6, n10), this.dXw.kIu, "Animation States:");
        this.j(this.krL);
        this.krM = new hpe(hnc2, "Text Velocity", new lgg(n3, n4), new lhf(n7, n10), this.dXw.kIv, "");
        this.j(this.krM);
        n4 += n10;
        this.krN = new hpe[10];
        for (n = 0; n < this.krN.length; ++n) {
            hpe2 = new hpe(hnc2, "Text AnimationState " + n, new lgg(n8, n4), new lhf(n9, n10), this.dXw.kIv, "");
            this.j(hpe2);
            this.krN[9 - n] = hpe2;
            n4 += n10;
        }
        this.krO = new hpe(hnc2, "Label SkillHistory", new lgg(n2, n4 += n11), new lhf(n6, n10), this.dXw.kIu, "Skills:");
        this.j(this.krO);
        this.krP = new hpe[10];
        for (n = 0; n < this.krP.length; ++n) {
            hpe2 = new hpe(hnc2, "Text SkillHistory " + n, new lgg(n8, n4), new lhf(n9, n10), this.dXw.kIv, "");
            this.j(hpe2);
            this.krP[9 - n] = hpe2;
            n4 += n10;
        }
        n4 += n11;
        this.krQ = new hqy(hnc2, "Button Attach", new lgg(5, this.getHeight() - 35 - 40 - 40), new lhf(80, 30), hpx.a.kXm, this.dXw.kJK, "Attach");
        this.j(this.krQ);
        this.krQ.cvC().a(true, this.krX);
        this.krS = new hqy(hnc2, "Button ItemList", new lgg(5, this.getHeight() - 35 - 40), new lhf(80, 30), hpx.a.kXm, this.dXw.kJK, "Item List");
        this.j(this.krS);
        this.krS.cvC().a(true, this.krW);
        this.krR = new hqy(hnc2, "Button Teleport", new lgg(5, this.getHeight() - 35), new lhf(80, 30), hpx.a.kXm, this.dXw.kJK, "Teleport");
        this.j(this.krR);
        this.krR.cvC().a(true, this.krV);
        this.a(0, this.krK);
        this.a(0, this.krM);
        this.a(1, this.krC);
        this.a(1, this.krM);
        this.a(2, this.krF);
        this.a(2, this.krG);
    }

    private final void a(int n, hpe hpe2) {
        Set<hpe> set = this.krT.get(n);
        if (set == null) {
            set = lcn.emx();
            this.krT.put(n, set);
        }
        set.add(hpe2);
    }

    public void b(String string, String string2, int n, int n2) {
        String string3 = "[" + string + "] " + string2 + " (" + cg.n(n) + " " + cg.u(n2) + ")";
        this.krt.mV(string3);
    }

    public void f(boolean bl, double d2) {
        String string = bl ? "Online " + this.d(d2, false) : "Offline";
        this.krv.mV(string);
    }

    public void c(ljq ljq2) {
        int n;
        if (ljq2 == null) {
            ljq2 = ljq.roQ;
        }
        lej lej2 = lcw.ec((ljq)ljq2);
        String string = "";
        if (lej2.getX() < 0) {
            n = -lej2.getX();
            string = string + n / 60 + "'" + n % 60 + "\"W";
        } else {
            n = lej2.getX();
            string = string + n / 60 + "'" + n % 60 + "\"E";
        }
        string = string + " ";
        if (lej2.getY() < 0) {
            n = -lej2.getY();
            string = string + n / 60 + "'" + n % 60 + "\"N";
        } else {
            n = lej2.getY();
            string = string + n / 60 + "'" + n % 60 + "\"S";
        }
        string = string + " (" + lcw.dX((ljq)ljq2) + " - " + lcw.ea((ljq)ljq2) + ")";
        this.krI.mV(string);
    }

    public void a(double d2, double d3, boolean bl) {
        String string = String.format("%1.2f", d2) + " m/sec total, " + String.format("%1.2f", d3) + " m/sec horizontal ";
        if (bl) {
            string = string + " (Encumbered)";
        }
        this.krK.mV(string);
    }

    public void a(bwv bwv2) {
        if (bwv2 == null) {
            this.krM.mV("");
        } else {
            this.krM.mV(bwv2.getName());
        }
    }

    public void aZ(List<bwv> list) {
        int n = 0;
        int n2 = list.size() - this.krN.length;
        while (n < this.krN.length) {
            if (n2 < 0 || n2 >= list.size()) {
                this.krN[n].mV("");
            } else {
                bwv bwv2 = list.get(n2);
                String string = "[" + this.d(bwv2.dXe, true) + "] " + bwv2.getName();
                this.krN[n].mV(string);
            }
            ++n;
            ++n2;
        }
    }

    public void ba(List<bxb> list) {
        int n = 0;
        int n2 = list.size() - this.krP.length;
        while (n < this.krP.length) {
            if (n2 < 0 || n2 >= list.size()) {
                this.krP[n].mV("");
            } else {
                bxb bxb2 = list.get(n2);
                String string = "[" + this.d(bxb2.dXe, true) + "]";
                string = bxb2.dYe ? string + " Start " : string + " Stop ";
                string = string + cxd.xu((int)bxb2.SkillType) + " (" + String.format("%1.1f", Float.valueOf(bxb2.SkillLevel)) + ")";
                this.krP[n].mV(string);
            }
            ++n;
            ++n2;
        }
    }

    public void t(String string, int n) {
        String string2 = string == null ? "<none>" : bbs.getValueByOrdinal(n).toString() + " of '" + string + "'";
        this.krx.mV(string2);
    }

    private final String Mx(int n) {
        String string;
        switch (n) {
            case -1: {
                string = "<unknown>";
                break;
            }
            case 0: {
                string = "none";
                break;
            }
            default: {
                lgw lgw2 = (lgw)lea.enW().acv(n);
                if (lgw2 == null) {
                    string = "<invalid>";
                    break;
                }
                string = lgw2.getName();
                if (string != null && !string.trim().isEmpty()) break;
                string = "<no desc>";
            }
        }
        return string;
    }

    public void cr(int n, int n2) {
        this.krF.mV(this.Mx(n) + " above player");
        this.krG.mV(this.Mx(n2) + " below player");
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.krB.mV(String.format("%1.1f / %1.1f health", Float.valueOf(f2), Float.valueOf(f3)));
        this.krC.mV(String.format("%1.1f / %1.1f stamina", Float.valueOf(f4), Float.valueOf(f5)));
        this.krD.mV(String.format("%1.1f / %1.1f mana", Float.valueOf(f6), Float.valueOf(f7)));
    }

    private String d(double d2, boolean bl) {
        int n = (int)d2;
        int n2 = (int)((d2 - (double)n) * 1000.0);
        int n3 = n % 60;
        int n4 = (n /= 60) % 60;
        int n5 = n /= 60;
        if (bl) {
            return String.format("%02d:%02d:%02d.%03d", n5, n4, n3, n2);
        }
        return String.format("%02d:%02d:%02d", n5, n4, n3);
    }

    private String j(String string, int n, int n2) {
        String string2 = byw.az(n2, n);
        if (string2 == null) {
            string2 = "<Invalid " + n2 + "/" + n + ">";
        } else {
            int n3 = string2.indexOf(32);
            if (n3 > 0) {
                string2 = string2.substring(n3 + 1);
            }
        }
        if (string == null || string.isEmpty()) {
            return string2;
        }
        return string + ", " + string2;
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        String string = null;
        string = this.j(string, n3, 3);
        string = this.j(string, n5, 5);
        string = this.j(string, n4, 4);
        string = this.j(string, n, 1);
        string = this.j(string, n7, 7);
        if (n6 != 1) {
            string = this.j(string, n6, 6);
        }
        this.krz.mV(string);
    }

    public void aE(int[] nArray) {
        IdentityHashMap<Object, Integer> identityHashMap = new IdentityHashMap<Object, Integer>();
        for (Set<hpe> object2 : this.krT.values()) {
            for (Object object : object2) {
                identityHashMap.put(object, 0);
            }
        }
        for (int i = 0; i < nArray.length; ++i) {
            Set<hpe> set;
            if (nArray[i] == 0 || (set = this.krT.get(i)) == null) continue;
            for (Object object : set) {
                if (nArray[i] <= (Integer)identityHashMap.get(object)) continue;
                identityHashMap.put(object, nArray[i]);
            }
        }
        for (hpe hpe2 : identityHashMap.keySet()) {
            Object object;
            int n = (Integer)identityHashMap.get(hpe2);
            object = null;
            switch (n) {
                case 0: {
                    object = this.dXw.kIv;
                    break;
                }
                case 1: {
                    object = this.dXw.kIw;
                    break;
                }
                case 2: {
                    object = this.dXw.kIx;
                    break;
                }
                default: {
                    object = hpe2.cuW();
                }
            }
            hpe2.a((hpe.c)object);
        }
    }

    private final void clp() {
        this.krU.aCS();
    }

    private final void clq() {
        this.krU.aCU();
    }

    private final void clr() {
        this.krU.aCT();
    }

    static /* synthetic */ void a(hhk hhk2) {
        hhk2.clp();
    }

    static /* synthetic */ void b(hhk hhk2) {
        hhk2.clq();
    }

    static /* synthetic */ void c(hhk hhk2) {
        hhk2.clr();
    }
}

