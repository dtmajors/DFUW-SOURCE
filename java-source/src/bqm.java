/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class bqm {
    private static final Map<b, bqq[]> dBX = new EnumMap<b, bqq[]>(b.class);
    public static final String dBY = "SFInventoryPlayerServer";
    public static final String dBZ = "SFInventoryStorageServer";
    private static final String[] dCa = new String[]{"SFInventoryPlayerServer", "SFInventoryStorageServer"};
    public static final int dCb = 1;
    public static final int dCc = 2;
    public static final int dCd = 4;
    public static final int dCe = 8;
    public static final int dCf = 16;
    public static final int dCg = 32;
    public static final int dCh = 64;
    public static final int dCi = 1;
    public static final int dCj = 2;
    public static final int dCk = 3;
    public static final int dCl = 4;
    public static final int dCm = 5;
    public static final int dCn = 6;
    public static final int dCo = 7;
    public static final int dCp = 8;
    public static final int dCq = 9;
    public static final int dCr = 10;
    public static final int dCs = 11;
    public static final int dCt = 12;
    public static final int dCu = 13;
    public static final int dCv = 14;
    public static final int dCw = 15;
    public static final int dCx = 16;
    public static final int dCy = 17;
    public static final int dCz = 18;
    public static final int dCA = 19;
    public static final int dCB = 20;
    public static final int dCC = 21;
    public static final int dCD = 22;
    public static final int dCE = 23;
    public static final int dCF = 24;
    public static final int dCG = 25;
    public static final int dCH = 26;
    public static final int dCI = 27;
    public static final int dCJ = 28;
    public static final int dCK = 29;
    public static final int dCL = 30;
    public static final int dCM = 31;
    public static final int dCN = 32;
    public static final int dCO = 33;
    public static final int dCP = 34;
    public static final int dCQ = 35;
    public static final int dCR = 36;
    public static final int dCS = 37;
    public static final int dCT = 38;
    public static final int dCU = 39;
    public static final int dCV = 40;
    public static final int dCW = 41;
    public static final int dCX = 42;
    public static final int dCY = 43;
    public static final int dCZ = 44;
    public static final int dDa = 45;
    public static final int dDb = 46;
    public static final int dDc = 47;
    public static final int dDd = 48;
    public static final int dDe = 49;
    public static final int dDf = 50;
    public static final int dDg = 51;
    public static final int dDh = 52;
    public static final int dDi = 53;
    public static final int dDj = 54;
    public static final int dDk = 55;
    private static List<String> dDl = null;
    private static Map dDm = lcn.emw();
    private static les ResourceTree = lea.enW();
    public static final double dDn = 5.0;
    public static final double dDo = 2.5;
    public static final double dDp = 20.0;
    public static final double dDq = 3.5;
    public static final double dDr = 10.0;
    public static final double dDs = 7.5;
    public static final double dDt = 3.0;
    public static final double dDu = 1.0;
    public static final double dDv = 0.5;
    public static final double dDw = 0.1;
    public static final double dDx = 0.1;
    public static final double dDy = 300.0;
    public static float dDz = 350.0f;
    public static final int dDA = 500;
    public static final int dDB = 1000000000;
    public static final float dDC = 1.0f;
    public static final int dDD = 6;
    public static final int dDE = 5;
    public static final int dDF = 999;
    public static final int dDG = 2000;
    public static final float dDH = 0.5f;
    public static final float dDI = 0.025f;
    public static final boolean dDJ = false;
    public static final float dDK = 1.0f;
    public static final float dDL = 2.9f;
    public static final float dDM = 1.6f;
    public static final float dDN = 0.2f;
    public static final int dDO = 1;
    public static final int dDP = 3;
    public static final int dDQ = 100;
    public static final boolean dDR = true;
    private static Map<Integer, bse> dDS = lcn.emw();
    public static final int dDT = 15;
    private static bqm dDU = new bqm();

    public static boolean a(b b2, b b3, b b4, b b5, boolean bl2, int n) {
        if (b2 == null) {
            lfn.b(5, "SFInventoryConstants", "canMoveItem() FromRootInventoryType is null.");
            return false;
        }
        if (b3 == null) {
            lfn.b(5, "SFInventoryConstants", "canMoveItem() FromInventoryType is null.");
            return false;
        }
        if (b4 == null) {
            lfn.b(5, "SFInventoryConstants", "canMoveItem() ToRootInventoryType is null.");
            return false;
        }
        if (b5 == null) {
            lfn.b(5, "SFInventoryConstants", "canMoveItem() ToInventoryType is null.");
            return false;
        }
        if (n <= 0) {
            lfn.b(5, "SFInventoryConstants", "canMoveItem() ItemResourceType is invalid.");
            return false;
        }
        if (!b.isValidRootInventoryType(b2)) {
            lfn.b(5, "SFInventoryConstants", "canMoveItem() FromRootInventoryType=" + (Object)((Object)b2) + " is not a valid root inventorytype.");
            return false;
        }
        if (!b.isValidRootInventoryType(b4)) {
            lfn.b(5, "SFInventoryConstants", "canMoveItem() ToRootInventoryType=" + (Object)((Object)b4) + " is not a valid root inventorytype.");
            return false;
        }
        b b6 = b.isWithinBackpack(b2) ? b3 : b2;
        b b7 = b.isWithinBackpack(b4) ? b5 : b4;
        bqq[] bqqArray = dBX.get((Object)b6);
        if (bqqArray == null) {
            lfn.b(5, "SFInventoryConstants", "canMoveItem() No rules defined for FromType " + (Object)((Object)b6));
            return false;
        }
        boolean bl3 = false;
        int n2 = bqqArray.length;
        for (int i = 0; i < n2; ++i) {
            if (bqqArray[i].big != b7) continue;
            bl3 = true;
            if (!b.isWithinBackpack(b2)) {
                bl3 = true;
            } else if (b.isWithinBackpack(b4)) {
                bl3 = true;
            } else if (cug.vL((int)n)) {
                bl3 = false;
            }
            if (b7 != b.dEO || cug.us((int)n)) continue;
            bl3 = false;
        }
        return bl3;
    }

    public static boolean a(b b2, hc hc2) {
        switch (b2) {
            case dEq: 
            case dEr: 
            case dEH: 
            case dEB: 
            case dEA: 
            case dEx: {
                return false;
            }
            case dEw: {
                return hc2 != null && hc2.li();
            }
        }
        return true;
    }

    private void auA() {
        bqq[] bqqArray = new bqq[]{};
        dBX.put(b.dEm, bqqArray);
        bqqArray = new bqq[]{new bqq(b.dEm), new bqq(b.dEn), new bqq(b.dEo), new bqq(b.dEp), new bqq(b.dER), new bqq(b.dES), new bqq(b.dEs), new bqq(b.dEJ), new bqq(b.dEL), new bqq(b.dEt), new bqq(b.dEu), new bqq(b.dEv), new bqq(b.dEw), new bqq(b.dEy), new bqq(b.dEz), new bqq(b.dEN), new bqq(b.dEO), new bqq(b.dEP), new bqq(b.dEQ)};
        dBX.put(b.dEn, bqqArray);
        bqqArray = new bqq[]{new bqq(b.dEm), new bqq(b.dEn)};
        dBX.put(b.dEt, bqqArray);
        dBX.put(b.dEu, bqqArray);
        dBX.put(b.dEv, bqqArray);
        dBX.put(b.dEw, bqqArray);
        dBX.put(b.dEy, bqqArray);
        dBX.put(b.dEz, bqqArray);
        dBX.put(b.dEA, bqqArray);
        dBX.put(b.dEx, bqqArray);
        dBX.put(b.dEB, bqqArray);
        dBX.put(b.dEC, bqqArray);
        dBX.put(b.dED, bqqArray);
        dBX.put(b.dEE, bqqArray);
        dBX.put(b.dEF, bqqArray);
        dBX.put(b.dEG, bqqArray);
        dBX.put(b.dEH, bqqArray);
        bqqArray = new bqq[]{new bqq(b.dEm), new bqq(b.dEn), new bqq(b.dEo), new bqq(b.dEP)};
        dBX.put(b.dEo, bqqArray);
        bqqArray = new bqq[]{new bqq(b.dEm), new bqq(b.dEn), new bqq(b.dEp), new bqq(b.dER), new bqq(b.dES), new bqq(b.dEP)};
        dBX.put(b.dEp, bqqArray);
        bqqArray = new bqq[]{new bqq(b.dEm), new bqq(b.dEn), new bqq(b.dEp), new bqq(b.dER), new bqq(b.dES), new bqq(b.dEP)};
        dBX.put(b.dER, bqqArray);
        bqqArray = new bqq[]{new bqq(b.dEm), new bqq(b.dEn), new bqq(b.dEp), new bqq(b.dER), new bqq(b.dES), new bqq(b.dEP)};
        dBX.put(b.dES, bqqArray);
        bqqArray = new bqq[]{new bqq(b.dEn), new bqq(b.dEq), new bqq(b.dEP)};
        dBX.put(b.dEq, bqqArray);
        bqqArray = new bqq[]{new bqq(b.dEn), new bqq(b.dEr), new bqq(b.dEP)};
        dBX.put(b.dEr, bqqArray);
        bqqArray = new bqq[]{new bqq(b.dEm), new bqq(b.dEn), new bqq(b.dEs), new bqq(b.dEP)};
        dBX.put(b.dEs, bqqArray);
        bqqArray = new bqq[]{};
        dBX.put(b.dEI, bqqArray);
        bqqArray = new bqq[]{new bqq(b.dEm), new bqq(b.dEn), new bqq(b.dEo), new bqq(b.dEp), new bqq(b.dER), new bqq(b.dES), new bqq(b.dEs), new bqq(b.dEt), new bqq(b.dEw), new bqq(b.dEu), new bqq(b.dEv), new bqq(b.dEy), new bqq(b.dEz), new bqq(b.dEP)};
        dBX.put(b.dEJ, bqqArray);
        bqqArray = new bqq[]{};
        dBX.put(b.dEK, bqqArray);
        bqqArray = new bqq[]{new bqq(b.dEn), new bqq(b.dEL), new bqq(b.dEP)};
        dBX.put(b.dEr, bqqArray);
        bqqArray = new bqq[]{new bqq(b.dEm), new bqq(b.dEn), new bqq(b.dEN), new bqq(b.dEO), new bqq(b.dEP)};
        dBX.put(b.dEN, bqqArray);
        bqqArray = new bqq[]{new bqq(b.dEm), new bqq(b.dEn), new bqq(b.dEN), new bqq(b.dEO), new bqq(b.dEP)};
        dBX.put(b.dEO, bqqArray);
        bqqArray = new bqq[]{new bqq(b.dEm), new bqq(b.dEn), new bqq(b.dEo), new bqq(b.dEp), new bqq(b.dER), new bqq(b.dES), new bqq(b.dEs), new bqq(b.dEJ), new bqq(b.dEL), new bqq(b.dEt), new bqq(b.dEu), new bqq(b.dEv), new bqq(b.dEw), new bqq(b.dEy), new bqq(b.dEz), new bqq(b.dEN), new bqq(b.dEO), new bqq(b.dEP), new bqq(b.dEQ)};
        dBX.put(b.dEP, bqqArray);
        bqqArray = new bqq[]{new bqq(b.dEm), new bqq(b.dEn), new bqq(b.dEP), new bqq(b.dEQ)};
        dBX.put(b.dEQ, bqqArray);
    }

    public static boolean gb(String string) {
        if (string == null) {
            lfn.b(5, "SFInventoryConstants", "validateInventoryClassName() ClassName is null.");
            return false;
        }
        for (int i = 0; i < dCa.length; ++i) {
            if (!dCa[i].equalsIgnoreCase(string)) continue;
            return true;
        }
        lfn.b(5, "SFInventoryConstants", "validateInventoryClassName() ClassName '" + string + "' is invalid.");
        return false;
    }

    public static boolean lW(int n) {
        return (n & 1) > 0;
    }

    public static boolean lX(int n) {
        return (n & 2) > 0;
    }

    public static boolean lY(int n) {
        return (n & 4) > 0;
    }

    public static boolean lZ(int n) {
        return (n & 8) > 0;
    }

    public static boolean ma(int n) {
        return (n & 0x10) > 0;
    }

    public static boolean mb(int n) {
        return (n & 0x20) > 0;
    }

    public static boolean mc(int n) {
        return (n & 0x40) > 0;
    }

    private static List<String> auB() {
        if (dDl == null) {
            dDl = lcn.emv();
            String[] stringArray = new String[]{"Undefined NPC", "NPC None", "NPC Arcanist", "NPC Baker 01", "NPC Baker 02", "NPC Butcher 01", "NPC Butcher 02", "NPC Blacksmith", "NPC Gemcutter", "NPC Herbalist", "NPC Innkeeper", "NPC Shipwright", "NPC Shopkeeper", "NPC Stable Master", "NPC Thaumaturgist", "NPC Workshop", "NPC Mage Trainer", "NPC Melee Trainer", "NPC Ranged Trainer", "NPC Rogue Trainer", "NPC Fighter's Guild Representative", "NPC Healer", "NPC Librarian", "NPC Mage Guild Representative", "NPC Pedestrian Female", "NPC Pedestrian Male", "NPC Guard Archer", "NPC Guard Elite", "NPC Guard Private", "NPC Guard Sergeant", "NPC Guard Lieutenant", "NPC Captain", "NPC Citizent", "NPC Councilman", "NPC General", "NPC Guildmaster", "NPC High Priest", "NPC Merchant", "NPC Noble", "NPC Army Officer 01", "NPC Army Officer 02", "NPC Robe Wearing 01", "NPC Robe Wearing 02", "NPC Citizen 01", "NPC Citizen 02", "NPC Shopkeeper 01", "NPC Shopkeeper 02", "NPC Shopkeeper 03", "NPC Mage Guild 01", "NPC Mage Guild 02", "NPC Fighter Guild 01", "NPC Fighter Guild 02", "NPC Blacksmith 01", "NPC Blacksmith 02", "NCP TradingRoute 01", "NPC Player House Vendor 01"};
            for (int i = 0; i < stringArray.length; ++i) {
                dDl.add(stringArray[i]);
            }
        }
        return dDl;
    }

    public static int gc(String string) {
        if (string == null) {
            lfn.b(5, "SFInventoryConstants", "getNPCType() NPCName is null.");
            return -1;
        }
        List<String> list = bqm.auB();
        for (int i = 0; i < list.size(); ++i) {
            if (!list.get(i).equalsIgnoreCase(string)) continue;
            return i;
        }
        return -1;
    }

    public static int gd(String string) {
        List<String> list = bqm.auB();
        list.add(string);
        return list.size() - 1;
    }

    public static String md(int n) {
        List<String> list = bqm.auB();
        if (n < 0 || n >= list.size()) {
            lfn.b(5, "SFInventoryConstants", "getNPCName() NPCType is invalid.");
            return null;
        }
        return list.get(n);
    }

    public static String[] auC() {
        List<String> list = bqm.auB();
        int n = 2;
        String[] stringArray = new String[list.size() - n];
        for (int i = 0; i < stringArray.length; ++i) {
            stringArray[i] = list.get(i + n);
        }
        return stringArray;
    }

    public static int[] ge(String string) {
        if (string == null) {
            lfn.b(5, "SFInventoryConstants", "getShaderParameters() ShaderName is null.");
            return null;
        }
        bqj bqj2 = (bqj)dDm.get(string);
        if (bqj2 == null) {
            return null;
        }
        return bqj2.duz;
    }

    private void auD() {
        this.a("ShaderAnim.xml", new int[]{352, 354});
        this.a("ShaderAnimArmour.xml", new int[]{1232, 1234});
        this.a("ShaderAnimFace.xml", new int[]{352, 354});
    }

    private void a(String string, int[] nArray) {
        assert (string != null);
        assert (nArray != null);
        bqj bqj2 = new bqj(string, nArray);
        dDm.put(string, bqj2);
    }

    public static bse me(int n) {
        while (n > 0) {
            bse bse2 = dDS.get(n);
            if (bse2 != null) {
                return bse2;
            }
            n = ResourceTree.uW(n);
        }
        return null;
    }

    private void auE() {
        int[] nArray = null;
        int[] nArray2 = null;
        nArray = new int[]{1328, 1104, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 5824, 11280, 14096, 14112};
        bse bse2 = new bse(nArray2, nArray, true, true, false);
        dDS.put(cug.fjw, bse2);
        nArray = new int[]{1328, 1232, 1234, 1104, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 1232, 1234, 11280, 14096, 14112};
        bse2 = new bse(nArray2, nArray, true, true, false);
        dDS.put(cug.fmT, bse2);
        bse2 = new bse(nArray2, nArray, true, true, false);
        dDS.put(cug.fjN, bse2);
        nArray = new int[]{1328, 1360, 1104, 9472, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 1360, 9472, 11280, 14096, 14112};
        bse2 = new bse(nArray2, nArray, false, false, false);
        dDS.put(cug.fnn, bse2);
        nArray = new int[]{1328, 1232, 1234, 1104, 11024, 11280, 13216, 14096, 14112};
        nArray2 = new int[]{1328, 1232, 1234, 11280, 13216, 14096, 14112};
        bse2 = new bse(nArray2, nArray, true, true, true);
        dDS.put(cug.fjr, bse2);
        nArray = new int[]{1328, 1232, 1234, 1104, 11024, 11280, 13216, 14096, 14112};
        nArray2 = new int[]{1328, 1232, 1234, 11280, 13216, 14096, 14112};
        bse2 = new bse(nArray2, nArray, true, true, true);
        dDS.put(cug.fjl, bse2);
        nArray = new int[]{1328, 1104, 11280, 13216, 14096, 14112};
        nArray2 = new int[]{1328, 11280, 13216, 14096, 14112};
        bse2 = new bse(nArray2, nArray, true, true, true);
        dDS.put(cug.fuc, bse2);
        nArray = new int[]{1328, 1104, 11280, 1232, 1234, 13200, 14096, 14112};
        nArray2 = new int[]{1328, 11280, 1232, 1234, 13200, 14096, 14112};
        bse2 = new bse(nArray2, nArray, true, false, false);
        dDS.put(cug.fjm, bse2);
        nArray = new int[]{1328, 1232, 1234, 1104, 9360, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 1232, 1234, 9360, 11280, 14096, 14112};
        bse2 = new bse(nArray2, nArray, true, true, false);
        dDS.put(cug.fkF, bse2);
        nArray = new int[]{1328, 640, 1104, 11280, 624, 14096, 14112};
        nArray2 = new int[]{1328, 640, 11280, 624, 14096, 14112};
        bse2 = new bse(nArray2, nArray, false, false, false);
        dDS.put(cug.fiz, bse2);
        nArray = new int[]{1328, 1104, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 11280, 14096, 14112};
        bse2 = new bse(nArray2, nArray, false, false, false);
        dDS.put(cug.fkd, bse2);
        nArray = new int[]{1328, 10384, 1104, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 10384, 11280, 14096, 14112};
        bse2 = new bse(nArray2, nArray, false, false, false);
        dDS.put(cug.fqM, bse2);
        nArray = new int[]{1328, 1232, 1234, 624, 640, 1104, 688, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 1232, 1234, 624, 640, 688, 11280, 14096, 14112};
        bse2 = new bse(nArray2, nArray, true, false, false);
        dDS.put(cug.fiB, bse2);
        nArray = new int[]{1328, 624, 640, 1104, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 624, 640, 11280, 14096, 14112};
        bse2 = new bse(nArray2, nArray, false, false, false);
        dDS.put(cug.fiD, bse2);
        nArray = new int[]{1328, 1104, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 11280, 14096, 14112};
        bse2 = new bse(nArray2, nArray, false, false, false);
        dDS.put(cug.fpL, bse2);
        nArray = new int[]{1328, 9632, 9648, 1248, 1104, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 9632, 9648, 1248, 11280, 14096, 14112};
        bse2 = new bse(nArray2, nArray, false, false, false);
        dDS.put(cug.fpN, bse2);
        dDS.put(cug.fpO, bse2);
        nArray = new int[]{1328, 1248, 1104, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 1248, 14096, 14112};
        bse2 = new bse(nArray2, nArray, false, false, false);
        dDS.put(cug.fwp, bse2);
        dDS.put(cug.fwq, bse2);
        dDS.put(cug.fwr, bse2);
        nArray = new int[]{1328, 10976, 1104, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 10976, 11280, 14096, 14112};
        bse2 = new bse(nArray2, nArray, false, false, false);
        dDS.put(cug.fkR, bse2);
        nArray = new int[]{1328, 624, 640, 1104, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 624, 640, 11280, 14096, 14112};
        bse2 = new bse(nArray2, nArray, false, false, false);
        dDS.put(cug.fiK, bse2);
        nArray = new int[]{1328, 624, 640, 1232, 1234, 1104, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 624, 640, 1232, 1234, 11280, 14096, 14112};
        bse2 = new bse(nArray2, nArray, false, false, false);
        dDS.put(cug.ful, bse2);
        nArray = new int[]{1328, 1232, 1234, 1104, 624, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 1232, 1234, 624, 11280, 14096, 14112};
        bse2 = new bse(nArray2, nArray, false, false, false);
        dDS.put(cug.fmO, bse2);
        nArray = new int[]{1328, 1232, 1234, 624, 640, 1104, 688, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 1232, 1234, 624, 640, 688, 11280, 14096, 14112};
        bse2 = new bse(nArray2, nArray, true, false, false);
        dDS.put(cug.fiu, bse2);
        dDS.put(cug.fiC, bse2);
        nArray = new int[]{1328, 624, 640, 1104, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 624, 640, 688, 11280, 14096, 14112};
        bse2 = new bse(nArray2, nArray, false, false, false);
        dDS.put(cug.fiE, bse2);
        dDS.put(cug.fiF, bse2);
        nArray = new int[]{10368, 11280, 14096, 14112};
        nArray2 = new int[]{10368, 11280, 14096, 14112};
        bse2 = new bse(nArray2, nArray, false, false, false);
        dDS.put(cug.fjP, bse2);
        nArray = new int[]{1328, 1104, 13616, 11280, 14096, 14112};
        nArray2 = new int[]{1328, 13616, 11280, 14096, 14112};
        bse2 = new bse(nArray2, nArray, false, false, false);
        dDS.put(cug.fqN, bse2);
    }

    private bqm() {
        this.auA();
        this.auD();
        this.auE();
    }

    public static boolean c(b b2) {
        switch (b2) {
            case dEp: 
            case dER: 
            case dES: 
            case dEn: 
            case dEo: 
            case dEs: {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ les auF() {
        return ResourceTree;
    }
}

