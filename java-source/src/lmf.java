/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.awt.Color;

public final class lmf
extends Enum<lmf> {
    public static final /* enum */ lmf rEt = new lmf(null, 1.0f, 1.0f, 1.0f, lql.rUa);
    public static final /* enum */ lmf rEu = new lmf(new Color(0, 255, 0), 1.1f, 0.1f, 0.82f, lql.sdF);
    public static final /* enum */ lmf rEv = new lmf(new Color(63, 191, 0), 1.2f, 0.3f, 0.64f, lql.sdG);
    public static final /* enum */ lmf rEw = new lmf(new Color(127, 127, 0), 1.3f, 1.0f, 0.46f, lql.sdH);
    public static final /* enum */ lmf rEx = new lmf(new Color(191, 63, 0), 1.4f, 1.45f, 0.28f, lql.sdI);
    public static final /* enum */ lmf rEy = new lmf(new Color(255, 0, 0), 1.5f, 3.5f, 0.1f, lql.sdJ);
    public static final /* enum */ lmf rEz = new lmf(new Color(10, 10, 10), 1.0f, 0.0f, 1.0f, lql.sdK);
    private Color rEA = null;
    private float rEB = 1.0f;
    private float rEC = 1.0f;
    private float rED = 1.0f;
    private lox NameString = null;
    private static final /* synthetic */ lmf[] rEE;

    public static lmf[] values() {
        return (lmf[])rEE.clone();
    }

    public static lmf valueOf(String string) {
        return Enum.valueOf(lmf.class, string);
    }

    public Color euP() {
        return this.rEA;
    }

    public float c(lmc lmc2) {
        switch (lmc2) {
            case rEm: {
                return this.rEB;
            }
            case rEn: {
                return this.rEC;
            }
            case rEo: {
                return this.rED;
            }
        }
        return 1.0f;
    }

    public String cu() {
        return this.NameString == null ? null : this.NameString.getIdentifier();
    }

    private lmf(Color color, float f, float f2, float f3, lox lox2) {
        this.rEA = color;
        this.rEB = f;
        this.rEC = f2;
        this.rED = f3;
    }

    public String toString() {
        return lcw.ena() || lcw.enb() ? this.NameString.bD(new Object[0]).exA() : super.toString();
    }

    public static lmf[] getKnownDangerLevels() {
        return new lmf[]{rEz, rEu, rEv, rEw, rEx, rEy};
    }

    public static boolean isValidOrdinal(int n) {
        return n >= 0 && n <= lmf.values().length;
    }

    public static lmf getValueByOrdinal(int n) {
        return lmf.isValidOrdinal(n) ? lmf.values()[n] : rEt;
    }

    public static lmf getValueByName(String string) {
        assert (string != null);
        if (string.equalsIgnoreCase(rEu.name())) {
            return rEu;
        }
        if (string.equalsIgnoreCase(rEz.name())) {
            return rEz;
        }
        if (string.equalsIgnoreCase(rEw.name())) {
            return rEw;
        }
        if (string.equalsIgnoreCase(rEx.name())) {
            return rEx;
        }
        if (string.equalsIgnoreCase(rEy.name())) {
            return rEy;
        }
        if (string.equalsIgnoreCase(rEv.name())) {
            return rEv;
        }
        return null;
    }

    static {
        rEE = new lmf[]{rEt, rEu, rEv, rEw, rEx, rEy, rEz};
    }
}

