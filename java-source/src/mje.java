/*
 * Decompiled with CFR.
 */
import java.awt.Dimension;
import java.awt.Point;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class mje {
    public static s DAv;
    public static final String DAw = "gizmos\\gizmo_arrows01.xml";
    public static final String DAx = "gizmos\\gizmo_rotate01.xml";
    public static final String DAy = "gizmos\\gizmo_light01.xml";
    public static final String DAz = "gizmos\\gizmo_collection_01.xml";
    public static final String DAA = "gizmos\\gizmo_spawnpoint_01.xml";
    public static final String DAB = "gizmos\\gizmo_elevator_01.xml";
    public static final String DAC = "gizmos\\gizmo_ambienteffect_01.xml";
    public static final String DAD = "gizmos\\gizmo_clan_city_marker_01.xml";
    public static final String DAE = "gizmos\\gizmo_road_marker_01.xml";
    public static final String DAF = "gizmos\\gizmo_sound_emitter_01.xml";
    public static final String DAG = "gizmos\\gizmo_plane.xml";
    public static boolean DAH;
    public static boolean DAI;
    public static final String DAJ = "final";
    public static final String DAK = "terrain_";
    public static final int DAL = 1;
    public static final int DAM = 2;
    public static final int DAN = 3;
    public static final int DAO = 4;
    public static final int DAP = 5;
    public static final int DAQ = 6;
    public static a DAR;
    public static ldv gUd;
    public static ldv DAS;
    public static ldv DAT;
    public static ldv DAU;
    public static String DAV;
    public static ldv DAW;
    public static boolean DAX;
    public static boolean DAY;
    public static boolean DAZ;
    public static boolean DBa;
    public static boolean DBb;
    public static boolean DBc;
    public static boolean DBd;
    public static long DBe;
    public static float DBf;
    public static boolean DBg;
    public static boolean DBh;
    public static boolean DBi;
    public static boolean DBj;
    public static boolean DBk;
    public static ljq DBl;
    public static ljq DBm;
    public static float DBn;
    public static float DBo;
    public static boolean DBp;
    public static boolean DBq;
    public static boolean DBr;
    public static String DBs;
    public static String DBt;
    public static final String DBu = "W:\\worldbuilder\\LatestBuild";
    public static final String DBv = "W:\\worldbuilder\\LatestBuild";
    public static boolean DBw;
    public static final lju DBx;
    public static final String DBy = "Go worldbuilders go!";
    public static boolean ri;
    public static final Map<String, List<lbz>> DBz;
    public static boolean DBA;
    public static eh DBB;
    public static ldv DBC;
    public static ljq DBD;
    public static Vector<kun> DBE;
    private static String DBF;
    public static final boolean DBG = false;
    public static boolean DBH;
    public static boolean DBI;
    public static Point PositionRenderWindow;
    public static Point DBJ;
    public static Dimension MainWindowSize;
    public static String DBK;
    public static jrw DBL;
    public static jrw DBM;
    public static final mjd[] DBN;
    public static boolean DBO;
    public static boolean DBP;
    public static boolean DBQ;
    public static boolean DBR;
    public static boolean DBS;
    public static boolean DBT;
    public static boolean DBU;
    public static boolean DBV;
    public static boolean DBW;
    public static boolean DBX;
    public static boolean DBY;
    public static List<String> DBZ;
    public static List<String> DCa;
    public static Set<String> DCb;
    public static boolean DCc;
    public static boolean DCd;
    public static boolean DCe;
    public static boolean DCf;
    public static double DCg;
    public static Map<ldv, List<ldv>> DCh;
    public static Map<ldv, ldv> DCi;
    public static Map<ldv, String> DCj;
    public static List<mjc> DCk;
    public static int DCl;
    public static boolean DCm;

    private mje() {
    }

    public static synchronized void BZ(String string) {
        DBF = string;
    }

    public static synchronized String ezB() {
        return DBF;
    }

    public static ldv ezC() {
        return gUd;
    }

    public static void ezD() {
        DCh.clear();
        for (Map.Entry<ldv, ldv> entry : DCi.entrySet()) {
            List<ldv> list = DCh.get(entry.getValue());
            if (list == null) {
                list = lcn.emv();
                DCh.put(entry.getValue(), list);
            }
            list.add(entry.getKey());
        }
    }

    static {
        DAH = true;
        DAI = false;
        DAR = a.DCn;
        gUd = null;
        DAS = null;
        DAT = null;
        DAU = null;
        DAV = null;
        DAX = true;
        DAY = true;
        DAZ = false;
        DBa = false;
        DBb = false;
        DBc = true;
        DBd = true;
        DBe = 10L;
        DBf = 1440.0f;
        DBg = true;
        DBh = true;
        DBi = true;
        DBj = false;
        DBk = false;
        DBl = new ljq();
        DBm = new ljq();
        DBn = 450.0f;
        DBo = 0.1f;
        DBp = true;
        DBq = true;
        DBr = false;
        DBs = "\\\\apollon\\work\\dfart\\dfdata";
        DBt = "\\\\styx\\www\\tools\\htdocs\\xml\\skilltree_beta\\skills\\trees\\resourcetree.xml";
        DBw = false;
        DBx = new lju(0, 9, 113);
        ri = true;
        DBz = lcn.emw();
        DBA = true;
        DBE = new Vector();
        DBF = "no string";
        DBH = false;
        DBI = true;
        DBK = null;
        DBL = null;
        DBM = null;
        DBN = new mjd[]{new mjd(mjd.a.DzI, mjd.b.DzY, "shaderdefault.xml", "Default"), new mjd(mjd.a.DzJ, mjd.b.DzY, "shaderdefault.xml", "Dummy"), new mjd(mjd.a.DzK, mjd.b.DzY, "shaderterraindetailnormal.xml", "Terrain tile"), new mjd(mjd.a.DzL, mjd.b.DzY, "shadertreepinevp.xml", "Trees (swaying)"), new mjd(mjd.a.DzO, mjd.b.DAc, "shaderdefault.xml", "Tombstone Object"), new mjd(mjd.a.DzM, mjd.b.DzZ, "shaderwatermoat.xml", "Water Object"), new mjd(mjd.a.DzN, mjd.b.DAa, "shaderwatermoat.xml", "Waterfall Object"), new mjd(mjd.a.DzP, mjd.b.DAd, "shaderdefault.xml", "Ladder"), new mjd(mjd.a.DzQ, mjd.b.DAg, "shaderdefault.xml", "Tank"), new mjd(mjd.a.DzR, mjd.b.DAh, "shaderdefault.xml", "Small Boat (non-controllable)"), new mjd(mjd.a.DzS, mjd.b.DAi, "shaderdefault.xml", "Large Boat (controllable)"), new mjd(mjd.a.DzT, mjd.b.DAj, "shaderdefault.xml", "Elevator"), new mjd(mjd.a.DzU, mjd.b.DAe, "shaderdefault.xml", "Character, NPC, or Monster"), new mjd(mjd.a.DzV, mjd.b.DAf, "shaderdefault.xml", "Mount"), new mjd(mjd.a.DzW, mjd.b.DAk, "shaderdefault.xml", "Buildable/Spawnable objects")};
        DBO = false;
        DBP = false;
        DBQ = false;
        DBR = false;
        DBS = false;
        DBT = false;
        DBU = false;
        DBV = false;
        DBW = false;
        DBX = false;
        DBY = false;
        DCc = false;
        DCd = false;
        DCe = false;
        DCf = true;
        DCg = -1.0;
        DCh = lcn.emw();
        DCi = lcn.emw();
        DCj = lcn.emw();
        DCk = lcn.emv();
        DCl = 1;
        DCm = false;
    }
}

