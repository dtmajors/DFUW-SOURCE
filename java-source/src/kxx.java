/*
 * Decompiled with CFR.
 */
public class kxx {
    public static final String qhg = "A";
    public static final String qhh = "CSC";
    public static final String qhi = "CRAFTING";
    public static final String qhj = "EXT";
    public static final String qhk = "GRSE";
    public static final String qhl = "GRSL";
    public static final String qhm = "GRSP";
    public static final String qhn = "GSF";
    public static final String qho = "GSL";
    public static final String qhp = "GSP";
    public static final String qhq = "GC";
    public static final String qhr = "IF";
    public static final String qhs = "MAX";
    public static final String qht = "MIN";
    public static final String qhu = "PG";
    public static final String qhv = "PGV";
    public static final String qhw = "SE";
    public static final String qhx = "IPS";
    public static final String qhy = "SF";
    public static final String qhz = "SL";
    public static final String qhA = "SP";
    public static final String qhB = "STP";
    public static final String qhC = "SC";
    public static final String qhD = "TS";
    public static final String qhE = "WI";
    public static final String qhF = "WIC";
    public static final String qhG = "SPM";
    public static final String qhH = "SCM";
    public static final String qhI = "CTPR";
    public static final String qhJ = "CSM";
    public static final String qhK = "BMA";
    public static final String qhL = "RPI";
    public static final String qhM = "CTPIM";
    public static final String qhN = "HTPIM";
    public static final String qhO = "SSCM";
    public static final String qhP = "CraftingSkillLevel";
    public static final String qhQ = "RecipeDifficulty";
    public static final String qhR = "RecipeDurationMultiplier";
    public static final String qhS = "CraftingSkillLevelMin";
    public static final String qhT = "CraftingSkillLevelMax";
    public static final String qhU = "Class_Start";
    public static final String qhV = "Class_End";
    public static final String qhW = "Class_Compute_SF";
    public static final String qhX = "Class_Compute_GSF";
    public static final String qhY = "Class_Compute_CSF";
    public static final String qhZ = "Class_Contains_SF";
    public static final String qia = "Class_Contains_ASF";
    public static final String qib = "Class_Contains_ASF_End";
    public static final String qic = "Skill_Case_Start";
    public static final String qid = "Skill_Case_End";
    public static final String qie = "Function_Case_Contains";
    public static final String qif = "Function_Case_SF";
    public static final String qig = "Function_Case_GSF";
    public static final String qih = "Function_Case_ACSF";
    public static final String qii = "Class_Compute_1";
    public static final String qij = "Class_Compute_2";
    public static final String qik = "Class_Compute_2_End";
    public static final String qil = "Function_Case_Compute_1";
    public static final String qim = "Function_Case_Compute_2";
    public static final String qin = "Function_Validate";
    public static final String qio = "gamelogicfunction_code_blocks.txt";
    public static final String qip = "playerfunction_code_blocks.txt";
    public static final String qiq = "skillfunction_code_blocks.txt";

    public static boolean xz(String string) {
        if (string.equalsIgnoreCase(qhg) || string.equalsIgnoreCase(qhi) || string.equalsIgnoreCase(qhk) || string.equalsIgnoreCase(qhl) || string.equalsIgnoreCase(qhm) || string.equalsIgnoreCase(qhn) || string.equalsIgnoreCase(qho) || string.equalsIgnoreCase(qhp) || string.equalsIgnoreCase(qhq) || string.equalsIgnoreCase(qhu) || string.equalsIgnoreCase(qhv) || string.equalsIgnoreCase(qhw) || string.equalsIgnoreCase(qhy) || string.equalsIgnoreCase(qhz) || string.equalsIgnoreCase(qhA) || string.equalsIgnoreCase(qhB) || string.equalsIgnoreCase(qhC) || string.equalsIgnoreCase(qhE) || string.equalsIgnoreCase(qhF)) {
            return false;
        }
        if (string.equalsIgnoreCase(qhh) || string.equalsIgnoreCase(qhr) || string.equalsIgnoreCase(qhs) || string.equalsIgnoreCase(qht) || string.equalsIgnoreCase(qhD)) {
            return true;
        }
        lfn.b(5, "SFFunctionGeneratorConstants", "permitsSubExpression() Keyword is invalid: " + string);
        return false;
    }

    private kxx() {
    }
}

