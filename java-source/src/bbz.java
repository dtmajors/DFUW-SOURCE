/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public final class bbz
extends Enum<bbz> {
    public static final /* enum */ bbz cSV = new bbz(256, lpv.rUq);
    public static final /* enum */ bbz cSW = new bbz(512, lpv.rUr);
    public static final /* enum */ bbz cSX = new bbz(768, lpv.rUs);
    public static final /* enum */ bbz cSY = new bbz(1024, lpv.rUt);
    public static final /* enum */ bbz cSZ = new bbz(1280, lpv.rUu);
    public static final /* enum */ bbz cTa = new bbz(1536, lpv.rUv);
    public static final /* enum */ bbz cTb = new bbz(1792, lpv.rUw);
    public static final /* enum */ bbz cTc = new bbz(2048, lpv.rUx);
    public static final /* enum */ bbz cTd = new bbz(2304, lpv.rUy);
    public static final /* enum */ bbz cTe = new bbz(2560, lpv.rUz);
    private static final int cTf = 1048320;
    private int ID = 0;
    private lox cTg = null;
    private EnumSet<bca> cTh = null;
    private static final /* synthetic */ bbz[] cTi;

    public static bbz[] values() {
        return (bbz[])cTi.clone();
    }

    public static bbz valueOf(String string) {
        return Enum.valueOf(bbz.class, string);
    }

    public int getID() {
        return this.ID;
    }

    public lox Zv() {
        return this.cTg;
    }

    public EnumSet<bca> akH() {
        return EnumSet.copyOf(this.cTh);
    }

    public boolean contains(int n) {
        return bbz.getCategoryFromPermissionID(n) == this;
    }

    public boolean d(bca bca2) {
        return bca2 == null ? false : this.cTh.contains((Object)bca2);
    }

    public bca kf(int n) {
        if (!this.contains(n)) {
            return null;
        }
        for (bca bca2 : this.cTh) {
            if (bca2.getID() != n) continue;
            return bca2;
        }
        return null;
    }

    private bbz(int n2, lox lox2) {
        this.ID = n2;
        this.cTg = lox2;
    }

    static void registerPermission(bca bca2) {
        bbz bbz2 = bbz.getCategoryFromPermission(bca2);
        if (bbz2 == null) {
            lfn.b(5, bbz.class.getSimpleName(), "setupPermission() : Could Not Locate Category for Permission!!!... Permission = " + (Object)((Object)bca2));
            assert (false);
            return;
        }
        if (bbz2.cTh == null) {
            bbz2.cTh = EnumSet.noneOf(bca.class);
        }
        if (!bbz2.cTh.add(bca2)) {
            lfn.b(5, bbz.class.getSimpleName(), "setupPermission() : Failed to Add Permission to Category!!!.. Permission = " + (Object)((Object)bca2) + ", Category = " + (Object)((Object)bbz2));
            assert (false);
            return;
        }
    }

    public static bbz getCategoryFromPermission(bca bca2) {
        if (bca2 == null) {
            return null;
        }
        int n = bca2.getID() & 0xFFF00;
        for (bbz bbz2 : bbz.values()) {
            if (bbz2.getID() != n) continue;
            return bbz2;
        }
        return null;
    }

    public static bbz getCategoryFromPermissionID(int n) {
        int n2 = n & 0xFFF00;
        for (bbz bbz2 : bbz.values()) {
            if (bbz2.getID() != n2) continue;
            return bbz2;
        }
        return null;
    }

    public static List<String> getCategoryNames() {
        ArrayList<String> arrayList = lcn.emv();
        if (lcw.ena() || lcw.enb()) {
            for (bbz bbz2 : bbz.values()) {
                arrayList.add(bbz2.Zv().bD(new Object[0]).exA().toUpperCase());
            }
        }
        return arrayList;
    }

    static {
        cTi = new bbz[]{cSV, cSW, cSX, cSY, cSZ, cTa, cTb, cTc, cTd, cTe};
    }
}

