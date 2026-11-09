/*
 * Decompiled with CFR.
 */
public class cjc {
    private static String dnY = "Sanguine";
    private static String doa = "Cor Ymirhal";
    private static String dod = "Charidin";
    private static String dnZ = "Flaming Skull";
    private static String dob = "Amurran";
    private static String doc = "Shoal";
    private static String eDF = "Lord Mayor Tomas Starkissed";
    private static String eDG = "Lord Artisan Ordgrimm";
    private static String eDH = "High Steward Syla Mizithra";
    private static String eDI = "Izkruul The Fray Chief";
    private static String eDJ = "Alpha Regent Tivasta Farscent";
    private static String eDK = "Grim Speaker Methax";

    public static String qJ(int n) {
        switch (n) {
            case 3: {
                return dnY;
            }
            case 1: {
                return doc;
            }
            case 2: {
                return doa;
            }
            case 4: {
                return dob;
            }
            case 5: {
                return dod;
            }
            case 6: {
                return dnZ;
            }
        }
        assert (false);
        return null;
    }

    public static final String qK(int n) {
        switch (n) {
            case 3: {
                return eDF;
            }
            case 1: {
                return eDK;
            }
            case 2: {
                return eDG;
            }
            case 4: {
                return eDJ;
            }
            case 5: {
                return eDH;
            }
            case 6: {
                return eDI;
            }
        }
        assert (false);
        return null;
    }
}

