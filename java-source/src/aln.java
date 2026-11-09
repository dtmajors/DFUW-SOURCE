/*
 * Decompiled with CFR.
 */
public class aln {
    public static final int brW = 1;
    public static final int brX = 2;
    public static final int brY = 3;
    public static final int brZ = 4;
    public static final int bsa = 5;
    private static final String[] bsb = new String[]{"Undefined ExtraAbility", "Attribute Modifier Enchantment", "Enchantment Template", "Extra Skill Enchantment", "Skill Modifier Enchantment", "Use Ability"};
    public static final int bsc = 1;
    public static final int bsd = 2;
    public static final int bse = 3;
    public static final int bsf = 4;
    public static final int bsg = 5;
    public static final int bsh = 6;
    private static final String[] bsi = new String[]{"Undefined EnchantmentClass", "EnchantmentClass Add Effect", "EnchantmentClass Add Skill Modifier", "EnchantmentClass Baneful", "EnchantmentClass Character Alteration", "EnchantmentClass Item Alteration", "EnchantmentClass Minimum SkillLevel"};
    public static final int bsj = 1;
    public static final int bsk = 2;
    public static final int bsl = 3;
    public static final int bsm = 4;
    public static final int bsn = 5;
    public static final int bso = 6;
    public static final int bsp = 7;
    public static final int bsq = 8;
    public static final int bsr = 9;
    private static final String[] bss = new String[]{"Undefined ItemClass", "ItemClass Accessories", "ItemClass All", "ItemClass Armor", "ItemClass Armor And Accessories", "ItemClass Mage Staffs", "ItemClass Mage Staffs And Accessories", "ItemClass Melee Weapons", "ItemClass Missile Weapons", "ItemClass Weapons"};

    public static int cK(String string) {
        if (string == null) {
            lfn.b(5, "SFExtraAbilityConstants", "getExtraAbilityType() ExtraAbilityName is null.");
            return -1;
        }
        for (int i = 0; i < bsb.length; ++i) {
            if (!bsb[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFExtraAbilityConstants", "getExtraAbilityType() ExtraAbilityName '" + string + "' is invalid.");
        return -1;
    }

    public static String fW(int n) {
        if (n < 0 || n >= bsb.length) {
            lfn.b(5, "SFExtraAbilityConstants", "getExtraAbilityName() ExtraAbilityType is invalid.");
            return null;
        }
        return bsb[n];
    }

    public static int cL(String string) {
        if (string == null) {
            lfn.b(5, "SFExtraAbilityConstants", "getEnchantmentClassType() EnchantmentClassName is null.");
            return -1;
        }
        for (int i = 0; i < bsi.length; ++i) {
            if (!bsi[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFExtraAbilityConstants", "getEnchantmentClassType() EnchantmentClassName '" + string + "' is invalid.");
        return -1;
    }

    public static String fX(int n) {
        if (n < 0 || n >= bsi.length) {
            lfn.b(5, "SFExtraAbilityConstants", "getEnchantmentClassName() EnchantmentClassType is invalid.");
            return null;
        }
        return bsi[n];
    }

    public static String[] DP() {
        String[] stringArray = new String[bsi.length - 1];
        for (int i = 0; i < stringArray.length; ++i) {
            stringArray[i] = bsi[i + 1];
        }
        return stringArray;
    }

    public static int cM(String string) {
        if (string == null) {
            lfn.b(5, "SFExtraAbilityConstants", "getItemClassType() ItemClassName is null.");
            return -1;
        }
        for (int i = 0; i < bss.length; ++i) {
            if (!bss[i].equalsIgnoreCase(string)) continue;
            return i;
        }
        lfn.b(5, "SFExtraAbilityConstants", "getItemClassType() ItemClassName '" + string + "' is invalid.");
        return -1;
    }

    public static String fY(int n) {
        if (n < 0 || n >= bss.length) {
            lfn.b(5, "SFExtraAbilityConstants", "getItemClassName() ItemClassType is invalid.");
            return null;
        }
        return bss[n];
    }

    public static String[] DQ() {
        String[] stringArray = new String[bss.length - 1];
        for (int i = 0; i < stringArray.length; ++i) {
            stringArray[i] = bss[i + 1];
        }
        return stringArray;
    }

    private aln() {
    }
}

