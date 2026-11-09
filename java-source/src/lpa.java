/*
 * Decompiled with CFR.
 */
public class lpa {
    private static final lpa Instance = new lpa();
    private final String Identifier;

    private lpa() {
        this.Identifier = "";
    }

    protected lpa(String string) {
        this.Identifier = string;
        lpd.rHs.a(this);
    }

    protected static loy b(String string, Class<? extends Enum> clazz) {
        return new loy(clazz, string);
    }

    protected static loy Bh(String string) {
        return new loy(loo.rGG, string);
    }

    protected static loy Bi(String string) {
        return new loy(loo.rGN, string);
    }

    protected static loy Bj(String string) {
        return new loy(loo.rGJ, string);
    }

    protected static loy ah(String string, int n) {
        return new loy(n, string);
    }

    protected static loy Bk(String string) {
        return new loy(loo.rGI, string);
    }

    protected static loy Bl(String string) {
        return new loy(loo.rGK, string);
    }

    protected static loy Bm(String string) {
        return new loy(loo.rGL, string);
    }

    protected static loy Bn(String string) {
        return new loy(loo.rGO, string);
    }

    protected static loy Bo(String string) {
        return new loy(loo.rGP, string);
    }

    protected static loy Bp(String string) {
        return new loy(loo.rGQ, string);
    }

    protected static loy Bq(String string) {
        return new loy(loo.rGR, string);
    }

    protected static loy Br(String string) {
        return new loy(loo.rGS, string);
    }

    protected static loy Bs(String string) {
        return new loy(loo.rGT, string);
    }

    protected static loy Bt(String string) {
        return new loy(loo.rGU, string);
    }

    protected static loy Bu(String string) {
        return new loy(loo.rGV, string);
    }

    protected static loy Bv(String string) {
        return new loy(loo.rGW, string);
    }

    protected static loy Bw(String string) {
        return new loy(loo.rGX, string);
    }

    protected static loy Bx(String string) {
        return new loy(loo.rGY, string);
    }

    protected static loy By(String string) {
        return new loy(loo.rGZ, string);
    }

    protected static loy Bz(String string) {
        return new loy(loo.rHa, string);
    }

    protected static loy BA(String string) {
        return new loy(loo.rHb, string);
    }

    protected static loy BB(String string) {
        return new loy(loo.rHc, string);
    }

    protected final lox BC(String string) {
        return new lox(this.Identifier + "." + string);
    }

    protected final lox a(String string, loy ... loyArray) {
        if (loyArray != null && loyArray.length > 0) {
            return new lox(this.Identifier + "." + string, loyArray);
        }
        return new lox(this.Identifier + "." + string);
    }

    public static void exC() {
        for (Class clazz : lpb.rHn) {
            try {
                Class.forName(clazz.getName());
            }
            catch (ClassNotFoundException classNotFoundException) {
                lfn.b(5, "SFStrings", "initialiseAllStrings: Could not load " + clazz.getName());
                assert (false);
            }
        }
        lpd.rHs.exD();
    }
}

