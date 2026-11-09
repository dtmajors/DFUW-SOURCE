/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
public class alc {
    public static final int bqR = 5;
    public static final float bqS = 5.0f;
    public static final int bqT = 1;
    public static final float bqU = 100.0f;
    public static final float bqV = 0.0f;
    public static final float bqW = -100.0f;
    public static final float bqX = 100.0f;
    public static final float bqY = 10.0f;
    public static final float bqZ = 10.0f;
    public static final float bra = 50.0f;
    public static final int brb = 50;
    public static final int brc = 0;
    public static final int brd = 1;
    public static final int bre = 2;
    public static final int brf = 3;
    public static final csv brg = new csv();
    public static final csv brh = new csv();
    private static final alk[] bri = new alk[((a[])a.class.getEnumConstants()).length];
    private static les ResourceTree = lea.enW();
    private static alc brj = new alc();

    public static boolean a(bsh bsh2, a a2, float f2) {
        assert (a2 != null);
        assert (bsh2 != null);
        assert (f2 >= 1.0f && f2 <= 100.0f);
        if (alc.b(a2) && !alc.j(bsh2.az(), f2)) {
            return false;
        }
        switch (a2) {
            case brm: 
            case brn: 
            case bro: 
            case brp: {
                return !bsh2.ad(1616);
            }
            case brq: 
            case brr: 
            case brs: 
            case brt: {
                return !bsh2.ad(1600);
            }
            case bru: 
            case brv: 
            case brw: 
            case brx: {
                return !bsh2.ad(1584);
            }
        }
        return true;
    }

    public static boolean j(int n, float f2) {
        float f3 = 0.0f;
        if (ResourceTree.isDescendant(n, cug.fkG)) {
            f3 = 5.0f;
        } else {
            et et2 = (et)cug.bh((int)n, (int)1088);
            if (et2 == null) {
                lfn.b(5, "SFEnchantmentConstants", "containsValidQuality() Could not find 'Quality' for '" + ResourceTree.getName(n) + "'");
                return false;
            }
            f3 = et2.fN();
        }
        float f4 = alc.ao(f2);
        return f3 <= f4;
    }

    public static b[] fT(int n) {
        if (!cug.uy((int)n)) {
            return new b[0];
        }
        if (ResourceTree.isDescendant(n, cug.fjl)) {
            return new b[]{b.brF};
        }
        if (ResourceTree.isDescendant(n, cug.fiu)) {
            return new b[]{b.brE, b.brF, b.brG};
        }
        if (ResourceTree.isDescendant(n, cug.fiB)) {
            return new b[]{b.brE, b.brF, b.brG};
        }
        if (ResourceTree.isDescendant(n, cug.fiC)) {
            if (ResourceTree.isDescendant(n, cug.fiI)) {
                return new b[]{b.brE, b.brF};
            }
            return new b[]{b.brE, b.brF, b.brG};
        }
        if (ResourceTree.isDescendant(n, cug.fmV)) {
            return new b[]{b.brF};
        }
        if (ResourceTree.isDescendant(n, cug.fmW)) {
            return new b[]{b.brF};
        }
        if (ResourceTree.isDescendant(n, cug.fkF)) {
            return new b[]{b.brF};
        }
        lfn.b(5, "SFEnchantmentConstants", "getAvailableEnchantmentTypes() Invalid resource provided: '" + ResourceTree.getName(n) + "'");
        return new b[0];
    }

    public static final alk a(a a2) {
        if (a2 == null) {
            lfn.b(5, "SFEnchantmentConstants", "getEnchantmentSlotInfo() EnchantmentSlotType is null.");
            return null;
        }
        return bri[a2.ordinal()];
    }

    public static ctw cH(String string) {
        if (string == null) {
            lfn.b(5, "SFEnchantmentConstants", "getRecipeEnchantment() RecipeName is null.");
            return null;
        }
        for (ctw ctw2 : lea.eoe().values()) {
            if (!ctw2.Name.equalsIgnoreCase(string)) continue;
            return ctw2;
        }
        return null;
    }

    public static cty cI(String string) {
        if (string == null) {
            lfn.b(5, "SFEnchantmentConstants", "getRecipeTransmutation() RecipeName is null.");
            return null;
        }
        for (cty cty2 : lea.eof().values()) {
            if (!cty2.Name.equalsIgnoreCase(string)) continue;
            return cty2;
        }
        return null;
    }

    public static boolean b(a a2) {
        switch (a2) {
            case brm: 
            case brq: 
            case bru: 
            case brl: {
                return false;
            }
        }
        return true;
    }

    public static boolean a(a a2, int n) {
        assert (a2 != null);
        alk alk2 = alc.a(a2);
        return n >= alk2.brR;
    }

    private static float ao(float f2) {
        if (f2 < 1.0f || f2 > 100.0f) {
            lfn.b(5, "SFEnchantmentConstants", "getMaximumQuality() SkillLevel is invalid.");
            return 0.0f;
        }
        if (f2 < 25.0f) {
            return 1.0f;
        }
        if (f2 < 50.0f) {
            return 2.0f;
        }
        if (f2 < 75.0f) {
            return 3.0f;
        }
        if (f2 < 100.0f) {
            return 4.0f;
        }
        return 5.0f;
    }

    private static int cJ(String string) {
        assert (string != null);
        ald ald2 = lea.zt(string);
        if (ald2 == null) {
            lfn.b(5, "SFEnchantmentConstants", "getEnchantmentInfoType() EnchantmentInfoName '" + string + "' is invalid.");
            assert (false);
            return -1;
        }
        return ald2.Type;
    }

    private alc() {
        this.init();
    }

    private void init() {
        alc.brg.bnM = 0;
        alc.brg.fdT = false;
        alc.brg.fdU = 0.02f;
        alc.brg.fdW = -0.1f;
        alc.brg.fdV = 0.05f;
        alc.brg.fdX = -0.02f;
        alc.brh.bnM = 640;
        alc.brh.fdT = true;
        alc.brh.fdU = 0.05f;
        alc.brh.fdW = 0.0f;
        alc.brh.fdV = 0.25f;
        alc.brh.fdX = 0.2f;
        alc.bri[0] = new alk(a.brl, 1, cug.fkd);
        alc.bri[1] = new alk(a.brm, 1, cug.fkG);
        alc.bri[2] = new alk(a.brn, 5, cug.fkH);
        alc.bri[3] = new alk(a.bro, 5, cug.fkH);
        alc.bri[4] = new alk(a.brp, 5, cug.fkH);
        alc.bri[5] = new alk(a.brq, 1, cug.fkG);
        alc.bri[6] = new alk(a.brr, 5, cug.fkH);
        alc.bri[7] = new alk(a.brs, 5, cug.fkH);
        alc.bri[8] = new alk(a.brt, 5, cug.fkH);
        alc.bri[9] = new alk(a.bru, 1, cug.fkG);
        alc.bri[10] = new alk(a.brv, 5, cug.fkH);
        alc.bri[11] = new alk(a.brw, 5, cug.fkH);
        alc.bri[12] = new alk(a.brx, 5, cug.fkH);
    }
}

