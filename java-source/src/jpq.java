/*
 * Decompiled with CFR.
 */
import java.util.ArrayList;
import java.util.List;

public class jpq {
    public static int nNM;
    public static int nNN;
    public static int nNO;
    public static int nNP;
    public static int nNQ;
    public static int nNR;
    public static int nNS;
    public static int nNT;
    public static int nNU;
    public static int nNV;
    public static int nNW;
    public static int nNX;
    public static int nNY;
    public static int nNZ;
    public static int nOa;
    public static int nOb;
    public static int nOc;
    public static int nOd;
    public static int nOe;
    public static int nOf;
    public static int nOg;
    public static int nOh;
    public static int nOi;
    public static int nOj;
    public static int nOk;
    public static int nOl;
    public static int nOm;
    public static int nOn;
    public static int nOo;
    public static int nOp;
    public static int nOq;
    public static int nOr;
    public static int nOs;
    public static int nOt;
    public static int nOu;
    public static int nOv;
    public static int nOw;
    public static int nOx;
    public static int nOy;
    public static int nOz;
    public static int nOA;
    public static int nOB;
    public static int nOC;
    public static int nOD;
    public static int nOE;
    public static int nOF;
    public static int nOG;
    public static int nOH;
    public static int nOI;
    public static int nOJ;
    public static int nOK;
    public static int nOL;
    public static int nOM;
    public static int nON;
    public static int nOO;
    public static int nOP;
    public static int nOQ;
    private static les nOR;

    private jpq() {
    }

    public static final void anZ() {
        nNM = jpq.tc("a_CoordinatorActions");
        nNN = jpq.tc("a_MovementActions");
        nNO = jpq.tc("a_RotationActions");
        nNP = jpq.tc("a_TestActions");
        nNQ = jpq.tc("a_Request_EngineData");
        nNR = jpq.tc("a_Screenshot");
        nNS = jpq.tc("a_Select_Default_Skill");
        nNT = jpq.tc("a_Select_Gank_Skill");
        nNU = jpq.tc("a_Select_Previous_Skill");
        nNV = jpq.tc("a_Select_Revive_Skill");
        nNW = jpq.tc("a_Set_Camera_Speed");
        nNX = jpq.tc("a_Toggle_Camera_Relation");
        nNY = jpq.tc("a_Toggle_Camera_View");
        nNZ = jpq.tc("a_Toggle_Enable_Alternative_Attack");
        nOa = jpq.tc("a_Toggle_Invert_Mouse");
        nOb = jpq.tc("a_Toggle_Move_Camera");
        nOc = jpq.tc("a_Toggle_Third_Person_View");
        nOd = jpq.tc("a_Toggle_Unsheathe_Object");
        nOe = jpq.tc("a_Trigger_Current_Item");
        nOf = jpq.tc("a_Unsheathe_Object");
        nOg = jpq.tc("a_Crouch");
        nOh = jpq.tc("a_Move_Forward");
        nOi = jpq.tc("a_Move_Backward");
        nOj = jpq.tc("a_Move_Left");
        nOk = jpq.tc("a_Move_Right");
        nOl = jpq.tc("a_Move_Up");
        nOm = jpq.tc("a_Move_Down");
        nOn = jpq.tc("a_Move_Faster");
        nOo = jpq.tc("a_Move_Slower");
        nOp = jpq.tc("a_Toggle_AutoCrouch");
        nOq = jpq.tc("a_Toggle_AutoRun");
        nOr = jpq.tc("a_Lean_Left");
        nOs = jpq.tc("a_Lean_Right");
        nOt = jpq.tc("a_Rotate_Along_X_Axis");
        nOu = jpq.tc("a_Rotate_Along_Y_Axis");
        nOv = jpq.tc("a_Rotate_Along_Z_Axis");
        nOw = jpq.tc("a_Rotate_Up");
        nOx = jpq.tc("a_Rotate_Down");
        nOy = jpq.tc("a_Rotate_Left");
        nOz = jpq.tc("a_Rotate_Right");
        nOA = jpq.tc("a_Alternative_Use");
        nOB = jpq.tc("a_Gank");
        nOC = jpq.tc("a_Parry");
        nOD = jpq.tc("a_Revive");
        nOE = jpq.tc("a_Use");
        nOF = jpq.tc("a_Rest");
        nOG = jpq.tc("a_Add_fixed_modifier");
        nOH = jpq.tc("a_Add_random_modifier");
        nOI = jpq.tc("a_Do_Camera_Front_View");
        nOJ = jpq.tc("a_Do_Camera_Back_View");
        nOK = jpq.tc("a_Do_Camera_Left_View");
        nOL = jpq.tc("a_Do_Camera_Right_View");
        nOM = jpq.tc("a_TestAction1");
        nON = jpq.tc("a_TestAction2");
        nOO = jpq.tc("a_TestAction3");
        nOP = jpq.tc("a_TestAction4");
        nOQ = jpq.tc("a_Toggle_First_Person_Hands");
    }

    private static int tc(String string) {
        assert (string != null);
        int n = nOR.getType(string);
        if (n <= 0) {
            return -1;
        }
        return n;
    }

    public static String[] dPs() {
        ArrayList arrayList = lcn.emv();
        jpq.a(nOR.eqq(), arrayList);
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public static void dPt() {
        List<jos> list = joj.dOL();
        boolean bl = false;
        int n = list.size();
        for (int j = 0; j < n; ++j) {
            int n2;
            if (!list.get((int)j).Name.startsWith("a_") || (n2 = nOR.getType(list.get((int)j).Name)) > 0) continue;
            bl = true;
        }
        if (bl) assert (false);
    }

    private static void a(ler ler2, List list) {
        ler ler3 = nOR.g(ler2);
        while (ler3 != null) {
            list.add(ler3.getName());
            jpq.a(ler3, list);
            ler3 = nOR.h(ler3);
        }
    }

    static {
        nOR = lea.enS();
    }
}

