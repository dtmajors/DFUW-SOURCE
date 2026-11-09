/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class bkd {
    public static int dqx;
    public static int dqy;
    public static int dqz;
    public static int dqA;
    public static int dqB;
    public static int dqC;
    public static int dqD;
    public static int dqE;
    public static int dqF;
    public static int dqG;
    public static int dqH;
    public static int dqI;
    public static int dqJ;
    public static int dqK;
    public static int dqL;
    public static int dqM;
    public static int dqN;
    public static int dqO;
    public static int dqP;
    public static int dqQ;
    public static int dqR;
    public static int dqS;
    public static int dqT;
    public static int dqU;
    public static int dqV;
    public static int dqW;
    public static int dqX;
    public static int dqY;
    public static int dqZ;
    public static int dra;
    public static int drb;
    public static int drc;
    public static int drd;
    public static int dre;
    public static int drf;
    public static int drg;
    public static int drh;
    public static int dri;
    public static int drj;
    public static int drk;
    public static int drl;
    public static int drm;
    private static les dqt;

    private bkd() {
    }

    public static final void anZ() {
        dqx = bkd.fP("f_Gank Creature");
        dqy = bkd.fP("f_Perform Advanced Effect");
        dqz = bkd.fP("f_Perform Simple Effect");
        dqA = bkd.fP("f_Revive Creature");
        dqB = bkd.fP("f_Start Area Infinite Effect");
        dqC = bkd.fP("f_Start AreaInstantEffect");
        dqD = bkd.fP("f_Start Area Timed Effect");
        dqE = bkd.fP("f_Start FlameThrower Effect");
        dqF = bkd.fP("f_Start LineInstantEffect");
        dqG = bkd.fP("f_Start LineInfiniteEffect");
        dqH = bkd.fP("f_Trigger GuardTower");
        dqJ = bkd.fP("f_Remove InventoryItem");
        dqK = bkd.fP("f_Use Object");
        dqL = bkd.fP("f_Change Visual Feature");
        dqM = bkd.fP("f_Create Construct");
        dqN = bkd.fP("f_Create Corpse");
        dqO = bkd.fP("f_Create Equipment");
        dqP = bkd.fP("f_Create Resource");
        dqQ = bkd.fP("f_Create Skill");
        dqR = bkd.fP("f_Resource Functions");
        dqS = bkd.fP("f_Spawn Resource Mesh");
        dqT = bkd.fP("f_Start Area Pickup Spawner");
        dqU = bkd.fP("f_Start Monster Session");
        dqV = bkd.fP("f_Start Player Session");
        dqW = bkd.fP("f_Start Wildlife Session");
        dqX = bkd.fP("f_Play Monster");
        dqY = bkd.fP("f_Recall of Player");
        dqZ = bkd.fP("f_Set GodMode of Player");
        dra = bkd.fP("f_Set Player Access Level");
        drb = bkd.fP("f_Teleport to Player");
        drc = bkd.fP("f_Teleport to Position");
        dqI = bkd.fP("f_BreakFall");
        dre = bkd.fP("f_Summon Player");
        drf = bkd.fP("f_Summon Friend");
        drd = bkd.fP("f_perform true damage");
        drg = bkd.fP("f_perform player linking");
        drh = bkd.fP("f_perform object linking");
        dri = bkd.fP("f_perform sacrifice effect");
        drj = bkd.fP("f_perform reset cooldowns");
        drk = bkd.fP("f_craft object");
        drl = bkd.fP("f_perform delayed effect");
        drm = bkd.fP("f_create tectonic shift");
    }

    private static int fP(String string) {
        assert (string != null);
        int n = dqt.getType(string);
        if (n <= 0) {
            lfn.b(5, "SFFunctionConstants", "getFunctionType() FunctionName '" + string + "' is invalid.");
            assert (false);
            return -1;
        }
        return n;
    }

    public static String[] arg() {
        ArrayList arrayList = lcn.emv();
        bkd.a(dqt.eqq(), arrayList);
        return arrayList.toArray(new String[arrayList.size()]);
    }

    private static void a(ler ler2, List list) {
        ler ler3 = dqt.g(ler2);
        while (ler3 != null) {
            list.add(ler3.getName());
            bkd.a(ler3, list);
            ler3 = dqt.h(ler3);
        }
    }

    static {
        dqt = lea.enU();
    }
}

