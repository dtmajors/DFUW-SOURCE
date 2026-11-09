/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class csq
extends cso {
    public static final char fcC = 'x';
    public static final char fcD = '@';
    public static final char fcE = ';';
    public static final int fcF = 1024;
    public static final int fcG = 768;
    public static final int fcH = 60;
    public static final String fcI = Integer.toString(1024) + 'x' + Integer.toString(768) + '@' + Integer.toString(60);
    private String fcJ = fcI;
    public static final String fcK = fcI + ';';
    private String fcL = fcK;
    public static final boolean fcM = false;
    private boolean Fullscreen = false;
    public static final boolean fcN = false;
    private boolean fcO = false;

    @Override
    public void a(cqu cqu2) {
        cse cse2;
        cse cse3;
        if (cqu2.aZw().getValue() != this.baQ()) {
            this.gT(cqu2.aZw().getValue());
            this.baN();
        }
        if (!this.a(cse3 = csq.hU(cqu2.aZu().getValue()), cse2 = csq.hU(this.fcJ), false)) {
            this.hR(cqu2.aZu().getValue());
            this.o(cse3.fb, cse3.fc, cse3.eZR);
        }
    }

    @Override
    public void b(cqu cqu2) {
        cqu2.aZu().AO(this.fcJ);
        cqu2.aZv().AO(this.fcL);
        cqu2.aZw().yP(this.baQ());
    }

    private void baN() {
        kfy kfy2 = this.WY();
        kfy2.WE(32);
        kfy2.vm(this.baQ());
        this.MessageDelegator.b(kfy2);
    }

    private void o(int n, int n2, int n3) {
        kfy kfy2 = this.WY();
        kfy2.WE(64);
        kfy2.WF(n);
        kfy2.WG(n2);
        this.MessageDelegator.b(kfy2);
    }

    private boolean a(cse cse2, cse cse3, boolean bl) {
        if (cse2.fc != cse3.fc) {
            return false;
        }
        if (cse2.fb != cse3.fb) {
            return false;
        }
        return !bl || cse2.eZR == cse3.eZR;
    }

    public String baO() {
        return this.fcJ;
    }

    public void hR(String string) {
        this.fcJ = string;
    }

    public String baP() {
        return this.fcL;
    }

    public void hS(String string) {
        this.fcL = string;
    }

    public boolean baQ() {
        return this.Fullscreen;
    }

    public boolean baR() {
        return this.fcO;
    }

    public void gT(boolean bl) {
        this.Fullscreen = bl;
    }

    public void gU(boolean bl) {
        this.fcO = bl;
    }

    public static String aA(List<cse> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (cse cse2 : list) {
            stringBuilder.append(csq.p(cse2.fb, cse2.fc, cse2.eZR));
            stringBuilder.append(';');
        }
        return stringBuilder.toString();
    }

    public static String p(int n, int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n);
        stringBuilder.append('x');
        stringBuilder.append(n2);
        stringBuilder.append('@');
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public static List<String> hT(String string) {
        ArrayList<String> arrayList = lcn.emv();
        int n = 0;
        int n2 = string.indexOf(59, n);
        assert (n2 >= 0);
        while (n2 > 0) {
            String string2 = string.substring(n, n2);
            arrayList.add(string2);
            n = n2 + 1;
            if (n >= string.length()) break;
            n2 = string.indexOf(59, n);
        }
        return arrayList;
    }

    public static List<cse> aB(List<String> list) {
        ArrayList<cse> arrayList = lcn.abH(list.size());
        for (String string : list) {
            cse cse2 = csq.hU(string);
            if (cse2 != null) {
                arrayList.add(cse2);
                continue;
            }
            assert (false);
        }
        return arrayList;
    }

    public static int a(List<String> list, String string, boolean bl) {
        List<cse> list2 = csq.aB(list);
        cse cse2 = csq.hU(string);
        return csq.a(list2, cse2, bl);
    }

    public static int a(List<cse> list, cse cse2, boolean bl) {
        int n = 0;
        for (cse cse3 : list) {
            if (cse3.fc != cse2.fc) {
                ++n;
                continue;
            }
            if (cse3.fb != cse2.fb) {
                ++n;
                continue;
            }
            if (bl && cse3.eZR != cse2.fb) {
                ++n;
                continue;
            }
            return n;
        }
        return -1;
    }

    public static cse hU(String string) {
        int n = string.indexOf(120);
        if (n < 0) {
            assert (false);
            return null;
        }
        cse cse2 = new cse();
        String string2 = string.substring(0, n).trim();
        try {
            cse2.fb = Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFVideoResolutionOptions", "getDisplayModeFromString() Could not parse this string: " + string2);
            cse2.fb = 1024;
        }
        assert (++n < string.length());
        int n2 = string.indexOf(64);
        if (n2 < 0) {
            assert (false);
            return null;
        }
        assert (n2 > n);
        string2 = string.substring(n, n2).trim();
        try {
            cse2.fc = Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFVideoResolutionOptions", "getDisplayModeFromString() Could not parse this string: " + string2);
            cse2.fc = 768;
        }
        n = n2;
        assert (++n < string.length());
        n2 = string.length();
        assert (n2 > n);
        string2 = string.substring(n, n2).trim();
        try {
            cse2.eZR = Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            lfn.b(5, "SFVideoResolutionOptions", "getDisplayModeFromString() Could not parse this string: " + string2);
            cse2.eZR = 60;
        }
        return cse2;
    }
}

