/*
 * Decompiled with CFR.
 */
import java.util.Map;

public class byw {
    public static final int dZE = 0;
    public static final String dZF = "Any Value";
    public static final int dZG = 1;
    public static final int dZH = 2;
    public static final int dZI = 3;
    public static final int dZJ = 4;
    public static final int dZK = 5;
    public static final int dZL = 6;
    public static final int dZM = 7;
    private static final String[] dZN = new String[]{"Undefined ModeType", "ModeType FlyingMode", "ModeType LeaningMode", "ModeType LifeMode", "ModeType MovementMode", "ModeType PostureMode", "ModeType WaterContactMode", "ModeType WeaponMode"};
    public static final int dZO = 1;
    public static final int dZP = 2;
    public static final int dZQ = 3;
    public static final int dZR = 4;
    public static final int dZS = 5;
    public static final int dZT = 6;
    private static final String[] dZU = new String[]{"Undefined FlyingMode", "FlyingMode Falling", "FlyingMode Flying", "FlyingMode Grounded", "FlyingMode In Water", "FlyingMode Jumping", "FlyingMode Evade"};
    public static final int dZV = 1;
    public static final int dZW = 2;
    public static final int dZX = 3;
    private static final String[] dZY = new String[]{"Undefined LeaningMode", "LeaningMode Left", "LeaningMode Right", "LeaningMode Straight"};
    public static final int dZZ = 1;
    public static final int eaa = 2;
    public static final int eab = 3;
    public static final int eac = 4;
    public static final int ead = 5;
    public static final int eae = 6;
    private static final String[] eaf = new String[]{"Undefined LifeMode", "LifeMode Alive", "LifeMode GankMode", "LifeMode Dying", "LifeMode Dead", "LifeMode Limbo", "LifeMode Intermediate"};
    public static final int eag = 1;
    public static final int eah = 2;
    public static final int eai = 3;
    public static final int eaj = 4;
    private static final String[] eak = new String[]{"Undefined MovementMode", "MovementMode Idle", "MovementMode Slow", "MovementMode Normal", "MovementMode Fast"};
    public static final int eal = 1;
    public static final int eam = 2;
    public static final int ean = 3;
    public static final int eao = 4;
    public static final int eap = 5;
    public static final int eaq = 6;
    public static final int ear = 7;
    private static final String[] eas = new String[]{"Undefined PostureMode", "PostureMode Attached", "PostureMode Climbing", "PostureMode Crouching", "PostureMode Mounted", "PostureMode Resting", "PostureMode Standing", "PostureMode Swimming"};
    public static final int eat = 1;
    public static final int eau = 2;
    public static final int eav = 3;
    public static final int eaw = 4;
    private static final String[] eax = new String[]{"Undefined WaterContactMode", "WaterContactMode No Water Contact", "WaterContactMode Touching Water", "WaterContactMode On Water Surface", "WaterContactMode Submerged In Water"};
    public static final int eay = 1;
    public static final int eaz = 2;
    public static final int eaA = 3;
    public static final int eaB = 4;
    private static final String[] eaC = new String[]{"Undefined WeaponMode", "WeaponMode Unarmed", "WeaponMode Combat", "WeaponMode Spell", "WeaponMode Tool"};
    public static final int eaD = 1;
    public static final int eaE = 2;
    public static final int eaF = 3;
    public static final int eaG = 4;
    public static final int eaH = 5;
    private static final String[] eaI = new String[]{"Undefined Requirement", "JumpSkillRequirement", "ObjectStateRequirement", "PhysicsStateRequirement", "MovementSkillRequirement", "EvadeSkillRequirement"};
    public static final int eaJ = 1;
    public static final int eaK = 2;
    public static final int eaL = 3;
    public static final int eaM = 4;
    public static final int eaN = 5;
    private static final String[] eaO = new String[]{"Undefined PhysicsStateRequirement", "PhysicsStateRequirement Contact", "PhysicsStateRequirement In The Water", "PhysicsStateRequirement LadderContact", "PhysicsStateRequirement Rest", "PhysicsStateRequirement Stable"};
    private static byw eaP = new byw();

    public static int gJ(String string) {
        if (string == null) {
            lfn.b(5, "SFObjectStateConstants", "getModeType() ModeName is null.");
            return -1;
        }
        int n = dZN.length;
        for (int i = 1; i < n; ++i) {
            if (!dZN[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFObjectStateConstants", "getModeType() ModeName '" + string + "' is invalid.");
        return -1;
    }

    public static String nQ(int n) {
        if (n <= 0 || n >= dZN.length) {
            lfn.b(5, "SFStateConstants", "getModeName() ModeType is invalid.");
            return null;
        }
        return dZN[n];
    }

    public static int n(int n, String string) {
        if (n < 0) {
            lfn.b(5, "SFObjectStateConstants", "getModeValue() ModeType is invalid.");
            return -1;
        }
        if (string == null || string.trim().equals("")) {
            lfn.b(5, "SFObjectStateConstants", "getModeValue() ModeValueName is invalid.");
            return -1;
        }
        switch (n) {
            case 1: {
                return byw.gK(string);
            }
            case 2: {
                return byw.gL(string);
            }
            case 3: {
                return byw.gM(string);
            }
            case 4: {
                return byw.gN(string);
            }
            case 5: {
                return byw.gO(string);
            }
            case 6: {
                return byw.gP(string);
            }
            case 7: {
                return byw.gQ(string);
            }
        }
        lfn.b(5, "SFObjectStateConstants", "getModeValue() ModeType is invalid: " + n);
        assert (false);
        return -1;
    }

    public static String az(int n, int n2) {
        switch (n) {
            case 1: {
                return byw.nR(n2);
            }
            case 2: {
                return byw.nS(n2);
            }
            case 3: {
                return byw.nT(n2);
            }
            case 4: {
                return byw.nU(n2);
            }
            case 5: {
                return byw.nV(n2);
            }
            case 6: {
                return byw.nY(n2);
            }
            case 7: {
                return byw.ob(n2);
            }
        }
        lfn.b(5, "SFObjectStateConstants", "getModeValueName() ModeType is invalid: " + n);
        assert (false);
        return null;
    }

    public static int gK(String string) {
        if (string == null) {
            lfn.b(5, "SFObjectStateConstants", "getFlyingMode() FlyingModeName is null.");
            return -1;
        }
        int n = dZU.length;
        for (int i = 1; i < n; ++i) {
            if (!dZU[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFObjectStateConstants", "getFlyingMode() FlyingModeName '" + string + "' is invalid.");
        return -1;
    }

    public static String nR(int n) {
        if (n <= 0 || n >= dZU.length) {
            lfn.b(5, "SFObjectStateConstants", "getFlyingModeName() FlyingMode is invalid.");
            return null;
        }
        return dZU[n];
    }

    public static int gL(String string) {
        if (string == null) {
            lfn.b(5, "SFObjectStateConstants", "getLeaningMode() LeaningModeName is null.");
            return -1;
        }
        int n = dZY.length;
        for (int i = 1; i < n; ++i) {
            if (!dZY[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFObjectStateConstants", "getLeaningMode() LeaningModeName '" + string + "' is invalid.");
        return -1;
    }

    public static String nS(int n) {
        if (n <= 0 || n >= dZY.length) {
            lfn.b(5, "SFObjectStateConstants", "getLeaningModeName() LeaningMode is invalid.");
            return null;
        }
        return dZY[n];
    }

    public static int gM(String string) {
        if (string == null) {
            lfn.b(5, "SFObjectStateConstants", "getLifeMode() LifeModeName is null.");
            return -1;
        }
        int n = eaf.length;
        for (int i = 1; i < n; ++i) {
            if (!eaf[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFObjectStateConstants", "getLifeMode() LifeModeName '" + string + "' is invalid.");
        return -1;
    }

    public static String nT(int n) {
        if (n <= 0 || n >= eaf.length) {
            lfn.b(5, "SFObjectStateConstants", "getLifeModeName() LifeMode is invalid.");
            return null;
        }
        return eaf[n];
    }

    public static int gN(String string) {
        if (string == null) {
            lfn.b(5, "SFObjectStateConstants", "getMovementMode() MovementModeName is null.");
            return -1;
        }
        int n = eak.length;
        for (int i = 1; i < n; ++i) {
            if (!eak[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFObjectStateConstants", "getMovementMode() MovementModeName '" + string + "' is invalid.");
        return -1;
    }

    public static String nU(int n) {
        if (n <= 0 || n >= eak.length) {
            lfn.b(5, "SFObjectStateConstants", "getMovementModeName() MovementMode is invalid.");
            return null;
        }
        return eak[n];
    }

    public static int gO(String string) {
        if (string == null) {
            lfn.b(5, "SFObjectStateConstants", "getPostureMode() PostureModeName is null.");
            return -1;
        }
        int n = eas.length;
        for (int i = 1; i < n; ++i) {
            if (!eas[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFObjectStateConstants", "getPostureMode() PostureModeName '" + string + "' is invalid.");
        return -1;
    }

    public static String nV(int n) {
        if (n <= 0 || n >= eas.length) {
            lfn.b(5, "SFObjectStateConstants", "getPostureModeName() PostureMode is invalid.");
            return null;
        }
        return eas[n];
    }

    public static boolean nW(int n) {
        return n == 3;
    }

    public static boolean nX(int n) {
        switch (n) {
            case 4: {
                return true;
            }
        }
        return false;
    }

    public static int gP(String string) {
        if (string == null) {
            lfn.b(5, "SFObjectStateConstants", "getWaterContactMode() WaterContactModeName is null.");
            return -1;
        }
        int n = eax.length;
        for (int i = 1; i < n; ++i) {
            if (!eax[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFObjectStateConstants", "getWaterContactMode() WaterContactModeName '" + string + "' is invalid.");
        return -1;
    }

    public static String nY(int n) {
        if (n <= 0 || n >= eax.length) {
            lfn.b(5, "SFObjectStateConstants", "getWaterContactModeName() WaterContactMode is invalid.");
            return null;
        }
        return eax[n];
    }

    public static boolean nZ(int n) {
        switch (n) {
            case 1: {
                return true;
            }
            case 2: 
            case 3: 
            case 4: {
                return false;
            }
        }
        lfn.b(5, "SFObjectStateConstants", "hasNoWaterContact() Invalid watercontactmode provided: " + n);
        assert (false);
        return false;
    }

    public static boolean oa(int n) {
        switch (n) {
            case 1: 
            case 2: {
                return false;
            }
            case 3: 
            case 4: {
                return true;
            }
        }
        lfn.b(5, "SFObjectStateConstants", "isInTheWater() Invalid watercontactmode provided: " + n);
        assert (false);
        return false;
    }

    public static int gQ(String string) {
        if (string == null) {
            lfn.b(5, "SFObjectStateConstants", "getWeaponMode() WeaponModeName is null.");
            return -1;
        }
        int n = eaC.length;
        for (int i = 1; i < n; ++i) {
            if (!eaC[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFObjectStateConstants", "getWeaponMode() WeaponModeName '" + string + "' is invalid.");
        return -1;
    }

    public static String ob(int n) {
        if (n <= 0 || n >= eaC.length) {
            lfn.b(5, "SFObjectStateConstants", "getWeaponModeName() WeaponMode is invalid.");
            return null;
        }
        return eaC[n];
    }

    public static int gR(String string) {
        if (string == null) {
            lfn.b(5, "SFObjectStateConstants", "getRequirementType() RequirementName is null.");
            return -1;
        }
        int n = eaI.length;
        for (int i = 1; i < n; ++i) {
            if (!eaI[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFObjectStateConstants", "getRequirementType() RequirementName '" + string + "' is invalid.");
        return -1;
    }

    public static String oc(int n) {
        if (n <= 0 || n >= eaI.length) {
            lfn.b(5, "SFObjectStateConstants", "getRequirementName() RequirementType is invalid.");
            return null;
        }
        return eaI[n];
    }

    public static String od(int n) {
        if (n <= 0 || n >= eaO.length) {
            lfn.b(5, "SFObjectStateConstants", "getPhysicsStateRequirementName() PhysicsStateRequirementType is invalid.");
            return null;
        }
        return eaO[n];
    }

    private byw() {
        this.aEI();
        this.aEJ();
    }

    private void a(bxv bxv2) {
        assert (bxv2 != null);
        assert (bxv2.aDS() != null);
        assert (bxh.aDg()[bxv2.aDS().ordinal()] == null);
        bxh.aDg()[bxv2.aDS().ordinal()] = bxv2;
    }

    private void aEI() {
        Map<b, bxn> map = bxh.aDf();
        bxn bxn2 = new bxn(b.ebc);
        bxn2.a(new bxo(a.eaQ, 1507713));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebd);
        bxn2.a(new bxo(a.eaQ, 1310808));
        bxn2.a(new bxo(a.eaR, 721172));
        bxn2.a(new bxo(a.eaV, 721173));
        bxn2.a(new bxo(a.eaT, 721174));
        bxn2.a(new bxo(a.eaX, 721175));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebe);
        bxn2.a(new bxo(a.eaQ, 131091));
        bxn2.a(new bxo(a.eaR, 524309));
        bxn2.a(new bxo(a.eaS, 524309));
        bxn2.a(new bxo(a.eaT, 524309));
        bxn2.a(new bxo(a.eaU, 524313));
        bxn2.a(new bxo(a.eaV, 524313));
        bxn2.a(new bxo(a.eaW, 524313));
        bxn2.a(new bxo(a.eaX, 524309));
        bxn2.a(new bxo(a.eaY, 524309));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebf);
        bxn2.a(new bxo(a.eaQ, 1442189));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebg);
        bxn2.a(new bxo(a.eaQ, 393293));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebh);
        bxn2.a(new bxo(a.eaQ, 65566));
        bxn2.a(new bxo(a.eaR, 0x100191));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebi);
        bxn2.a(new bxo(a.eaQ, 65566));
        bxn2.a(new bxo(a.eaR, 1048616));
        bxn2.a(new bxo(a.eaS, 1048616));
        bxn2.a(new bxo(a.eaT, 1048616));
        bxn2.a(new bxo(a.eaX, 1048616));
        bxn2.a(new bxo(a.eaY, 1048616));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebj);
        bxn2.a(new bxo(a.eaQ, 65566));
        bxn2.a(new bxo(a.eaR, 983072));
        bxn2.a(new bxo(a.eaS, 983072));
        bxn2.a(new bxo(a.eaT, 983072));
        bxn2.a(new bxo(a.eaU, 983076));
        bxn2.a(new bxo(a.eaV, 983076));
        bxn2.a(new bxo(a.eaW, 983076));
        bxn2.a(new bxo(a.eaX, 983072));
        bxn2.a(new bxo(a.eaY, 983072));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebk);
        bxn2.a(new bxo(a.eaQ, 65597));
        bxn2.a(new bxo(a.eaR, 1048979));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebl);
        bxn2.a(new bxo(a.eaQ, 65597));
        bxn2.a(new bxo(a.eaR, 1048647));
        bxn2.a(new bxo(a.eaS, 1048647));
        bxn2.a(new bxo(a.eaT, 1048647));
        bxn2.a(new bxo(a.eaX, 1048647));
        bxn2.a(new bxo(a.eaY, 1048647));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebm);
        bxn2.a(new bxo(a.eaQ, 65597));
        bxn2.a(new bxo(a.eaR, 983103));
        bxn2.a(new bxo(a.eaS, 983103));
        bxn2.a(new bxo(a.eaT, 983103));
        bxn2.a(new bxo(a.eaU, 983107));
        bxn2.a(new bxo(a.eaV, 983107));
        bxn2.a(new bxo(a.eaW, 983107));
        bxn2.a(new bxo(a.eaX, 983103));
        bxn2.a(new bxo(a.eaY, 983103));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebn);
        bxn2.a(new bxo(a.eaQ, 65566));
        bxn2.a(new bxo(a.eaR, 0x100191));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebo);
        bxn2.a(new bxo(a.eaQ, 65566));
        bxn2.a(new bxo(a.eaR, 1048616));
        bxn2.a(new bxo(a.eaS, 1048616));
        bxn2.a(new bxo(a.eaT, 1048616));
        bxn2.a(new bxo(a.eaX, 1048616));
        bxn2.a(new bxo(a.eaY, 1048616));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebp);
        bxn2.a(new bxo(a.eaQ, 65566));
        bxn2.a(new bxo(a.eaR, 983072));
        bxn2.a(new bxo(a.eaS, 983072));
        bxn2.a(new bxo(a.eaT, 983072));
        bxn2.a(new bxo(a.eaU, 983076));
        bxn2.a(new bxo(a.eaV, 983076));
        bxn2.a(new bxo(a.eaW, 983076));
        bxn2.a(new bxo(a.eaX, 983072));
        bxn2.a(new bxo(a.eaY, 983072));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebq);
        bxn2.a(new bxo(a.eaQ, 65582));
        bxn2.a(new bxo(a.eaR, 1048978));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebr);
        bxn2.a(new bxo(a.eaQ, 65582));
        bxn2.a(new bxo(a.eaR, 1048632));
        bxn2.a(new bxo(a.eaS, 1048632));
        bxn2.a(new bxo(a.eaT, 1048632));
        bxn2.a(new bxo(a.eaX, 1048632));
        bxn2.a(new bxo(a.eaY, 1048632));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebs);
        bxn2.a(new bxo(a.eaQ, 65582));
        bxn2.a(new bxo(a.eaR, 983088));
        bxn2.a(new bxo(a.eaS, 983088));
        bxn2.a(new bxo(a.eaT, 983088));
        bxn2.a(new bxo(a.eaU, 983092));
        bxn2.a(new bxo(a.eaV, 983092));
        bxn2.a(new bxo(a.eaW, 983092));
        bxn2.a(new bxo(a.eaX, 983088));
        bxn2.a(new bxo(a.eaY, 983088));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebt);
        bxn2.a(new bxo(a.eaQ, 327937));
        bxn2.a(new bxo(a.eaR, 917763));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebu);
        bxn2.a(new bxo(a.eaQ, 328075));
        bxn2.a(new bxo(a.eaR, 262410));
        bxn2.a(new bxo(a.eaV, 262410));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebv);
        bxn2.a(new bxo(a.eaQ, 327937));
        bxn2.a(new bxo(a.eaR, 262404));
        bxn2.a(new bxo(a.eaV, 262405));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebx);
        bxn2.a(new bxo(a.eaQ, 327927));
        bxn2.a(new bxo(a.eaR, 262393));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebz);
        bxn2.a(new bxo(a.eaQ, 327927));
        bxn2.a(new bxo(a.eaR, 327927));
        bxn2.a(new bxo(a.eaV, 262395));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.eby);
        bxn2.a(new bxo(a.eaQ, 327927));
        bxn2.a(new bxo(a.eaR, 262394));
        bxn2.a(new bxo(a.eaV, 262395));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebA);
        bxn2.a(new bxo(a.eaQ, 327918));
        bxn2.a(new bxo(a.eaR, 917746));
        bxn2.a(new bxo(a.eaV, 262397));
        bxn2.a(new bxo(a.eaZ, 327918));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebC);
        bxn2.a(new bxo(a.eaQ, 327918));
        bxn2.a(new bxo(a.eaR, 327918));
        bxn2.a(new bxo(a.eaV, 262397));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebB);
        bxn2.a(new bxo(a.eaQ, 327918));
        bxn2.a(new bxo(a.eaR, 262396));
        bxn2.a(new bxo(a.eaV, 262397));
        bxn2.a(new bxo(a.eaZ, 327918));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebE);
        bxn2.a(new bxo(a.eaQ, 328234));
        bxn2.a(new bxo(a.eaR, 262701));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebG);
        bxn2.a(new bxo(a.eaQ, 328234));
        bxn2.a(new bxo(a.eaR, 328234));
        bxn2.a(new bxo(a.eaV, 262700));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebF);
        bxn2.a(new bxo(a.eaQ, 328234));
        bxn2.a(new bxo(a.eaR, 262699));
        bxn2.a(new bxo(a.eaV, 262700));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebH);
        bxn2.a(new bxo(a.eaQ, 328229));
        bxn2.a(new bxo(a.eaR, 262695));
        bxn2.a(new bxo(a.eaV, 262702));
        bxn2.a(new bxo(a.eaZ, 328229));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebJ);
        bxn2.a(new bxo(a.eaQ, 328229));
        bxn2.a(new bxo(a.eaR, 328229));
        bxn2.a(new bxo(a.eaV, 262702));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebI);
        bxn2.a(new bxo(a.eaQ, 328229));
        bxn2.a(new bxo(a.eaR, 262694));
        bxn2.a(new bxo(a.eaV, 262702));
        bxn2.a(new bxo(a.eaZ, 328229));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebM);
        bxn2.a(new bxo(a.eaQ, 1376551));
        bxn2.a(new bxo(a.eaR, 786726));
        bxn2.a(new bxo(a.eaS, 786726));
        bxn2.a(new bxo(a.eaT, 786726));
        bxn2.a(new bxo(a.eaU, 786725));
        bxn2.a(new bxo(a.eaV, 786725));
        bxn2.a(new bxo(a.eaW, 786725));
        bxn2.a(new bxo(a.eaX, 786726));
        bxn2.a(new bxo(a.eaY, 786726));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebK);
        bxn2.a(new bxo(a.eaQ, 1376551));
        bxn2.a(new bxo(a.eaR, 786730));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebL);
        bxn2.a(new bxo(a.eaQ, 1376551));
        bxn2.a(new bxo(a.eaR, 786962));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebN);
        bxn2.a(new bxo(a.eaR, 0x100190));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebO);
        bxn2.a(new bxo(a.eaQ, 65539));
        bxn2.a(new bxo(a.eaR, 0x10000E));
        bxn2.a(new bxo(a.eaS, 0x10000E));
        bxn2.a(new bxo(a.eaT, 0x10000E));
        bxn2.a(new bxo(a.eaX, 0x10000E));
        bxn2.a(new bxo(a.eaY, 0x10000E));
        map.put(bxn2.dYR, bxn2);
        bxn2 = new bxn(b.ebP);
        bxn2.a(new bxo(a.eaQ, 65539));
        bxn2.a(new bxo(a.eaR, 983046));
        bxn2.a(new bxo(a.eaS, 983046));
        bxn2.a(new bxo(a.eaT, 983046));
        bxn2.a(new bxo(a.eaU, 983050));
        bxn2.a(new bxo(a.eaV, 983050));
        bxn2.a(new bxo(a.eaW, 983050));
        bxn2.a(new bxo(a.eaX, 983046));
        bxn2.a(new bxo(a.eaY, 983046));
        map.put(bxn2.dYR, bxn2);
    }

    private void aEJ() {
        this.a(new bxw(b.ebc));
        this.a(new bxx(b.ebd));
        this.a(new bxy(b.ebe));
        this.a(new byc(b.ebf));
        this.a(new byc(b.ebg));
        this.a(new bxz(b.ebh));
        this.a(new bya(b.ebi));
        this.a(new byb(b.ebj));
        this.a(new bxz(b.ebk));
        this.a(new bya(b.ebl));
        this.a(new byb(b.ebm));
        this.a(new bxz(b.ebn));
        this.a(new bya(b.ebo));
        this.a(new byb(b.ebp));
        this.a(new bxz(b.ebq));
        this.a(new bya(b.ebr));
        this.a(new byb(b.ebs));
        this.a(new byd(b.ebt));
        this.a(new bye(b.ebu));
        this.a(new bye(b.ebv));
        this.a(new byd(b.ebw));
        this.a(new byd(b.ebx));
        this.a(new bye(b.ebz));
        this.a(new bye(b.eby));
        this.a(new byd(b.ebA));
        this.a(new bye(b.ebC));
        this.a(new bye(b.ebB));
        this.a(new byd(b.ebD));
        this.a(new byd(b.ebE));
        this.a(new bye(b.ebG));
        this.a(new bye(b.ebF));
        this.a(new byd(b.ebH));
        this.a(new bye(b.ebJ));
        this.a(new bye(b.ebI));
        this.a(new byf(b.ebK));
        this.a(new byf(b.ebL));
        this.a(new byg(b.ebM));
        this.a(new bxz(b.ebN));
        this.a(new bya(b.ebO));
        this.a(new byb(b.ebP));
    }
}

