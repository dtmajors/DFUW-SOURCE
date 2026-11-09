/*
 * Decompiled with CFR.
 */
public class bfk {
    public static int dgf;
    public static int dgg;
    public static int dgh;
    public static int dgi;
    public static int dgj;
    public static int dgk;
    public static int dgl;
    public static int dgm;
    public static int dgn;
    public static int dgo;
    public static int dgp;
    public static int dgq;
    public static int dgr;
    public static int dgs;
    public static int dgt;
    public static int dgu;
    public static int dgv;
    public static int dgw;
    public static int dgx;
    public static int dgy;
    public static int dgz;
    public static int dgA;
    public static int dgB;
    public static int dgC;
    public static int dgD;
    public static int dgE;
    public static int dgF;
    public static int dgG;
    public static int dgH;
    public static int dgI;
    public static int dgJ;
    public static int dgK;
    public static int dgL;
    public static int dgM;
    public static int dgN;
    public static int dgO;
    public static int dgP;
    public static int dgQ;
    public static int dgR;
    public static int dgS;
    public static int dgT;
    public static int dgU;
    public static int dgV;
    public static int dgW;
    public static int dgX;
    public static int dgY;
    public static int dgZ;
    public static int dha;
    public static int dhb;
    public static int dhc;
    public static int dhd;
    public static int dhe;
    public static int dhf;
    public static int dhg;
    public static int dhh;
    public static int dhi;
    public static int dhj;
    public static int dhk;
    public static int dhl;
    public static int dhm;
    public static int dhn;
    public static int dho;
    private static les DX;

    private bfk() {
    }

    public static final void anZ() {
        dgf = bfk.fs("Arcane Damage");
        dgg = bfk.fs("Acid Damage");
        dgh = bfk.fs("Fire Damage");
        dgj = bfk.fs("Lightning Damage");
        dgi = bfk.fs("Cold Damage");
        dgk = bfk.fs("General Damage");
        dgl = bfk.fs("Negative Effect");
        dgm = bfk.fs("Positive Effect");
        dgn = bfk.fs("Weapon Damage");
        dgo = bfk.fs("Infliction");
        dgp = bfk.fs("Curse");
        dgq = bfk.fs("Slow Attack");
        dgr = bfk.fs("Acid Protection Bonus");
        dgs = bfk.fs("Arcane Protection Bonus");
        dgt = bfk.fs("Base Attribute Bonus");
        dgu = bfk.fs("Benefaction");
        dgv = bfk.fs("Cold Protection Bonus");
        dgw = bfk.fs("Fire Protection Bonus");
        dgx = bfk.fs("Health Bonus");
        dgy = bfk.fs("Stamina Bonus");
        dgz = bfk.fs("Health Penalty");
        dgA = bfk.fs("Holy Protection Bonus");
        dgB = bfk.fs("Holy Damage");
        dgC = bfk.fs("Impact Damage");
        dgD = bfk.fs("Lightning Protection Bonus");
        dgE = bfk.fs("Mana Penalty");
        dgF = bfk.fs("Max Health Bonus");
        dgG = bfk.fs("Max Mana Penalty");
        dgH = bfk.fs("Nourishment");
        dgI = bfk.fs("Piercing Damage");
        dgJ = bfk.fs("Poison Damage");
        dgK = bfk.fs("Resting");
        dgL = bfk.fs("Rest Protection Penalty");
        dgM = bfk.fs("Slashing Damage");
        dgN = bfk.fs("Unholy Protection Bonus");
        dgO = bfk.fs("Untouchable");
        dgP = bfk.fs("Water Breathing");
        dgQ = bfk.fs("Aquatic Shot");
        dgR = bfk.fs("Destroyer");
        dgS = bfk.fs("Efficient Archery");
        dgT = bfk.fs("Extension Effects");
        dgU = bfk.fs("Guardsman");
        dgV = bfk.fs("Increased Damage");
        dgW = bfk.fs("Increased Distance");
        dgX = bfk.fs("Increased Velocity");
        dgY = bfk.fs("Jump Shot");
        dgZ = bfk.fs("Mage Killer");
        dha = bfk.fs("Mana Shield");
        dhb = bfk.fs("Master Scout");
        dhc = bfk.fs("Sidestep");
        dhd = bfk.fs("Unfazed");
        dhe = bfk.fs("Strength Bonus");
        dhf = bfk.fs("Dexterity Bonus");
        dhg = bfk.fs("Wisdom Bonus");
        dhh = bfk.fs("Intelligence Bonus");
        dhi = bfk.fs("Leech Modifier");
        dhj = bfk.fs("Critical Chance");
        dhk = bfk.fs("Slow");
        dhl = bfk.fs("Uncanny Armor");
        dhm = bfk.fs("Bastion");
        dhn = bfk.fs("Attunement to Earth");
        dho = bfk.fs("RPB");
    }

    public static final String kE(int n) {
        return DX.getName(n);
    }

    public static final boolean kF(int n) {
        return DX.isDescendant(n, dgl);
    }

    public static int fs(String string) {
        assert (string != null);
        int n = DX.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFEffectConstants", "getEffectType() EffectName '" + string + "' is invalid.");
            return -1;
        }
        return n;
    }

    static {
        DX = lea.enT();
    }
}

