/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cdb
 *  en
 *  ep
 *  lcw
 *  lkv
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class ayc {
    private static final String TC = "SFWorldRelicsStaticData";
    private static final String cvm = "Relics";
    private static final String cvn = "Relic";
    private static final String cvo = "ChestResourceName";
    private static final String cvp = "RelicID";
    private static final String cvq = "WorldObjectResourceName";
    private static final String cvr = "MaximumNumber";
    private static final String cvs = "DecayTime";
    private static final String cvt = "ActiveSpecialEffectName";
    private static final String cvu = "InactiveSpecialEffectName";
    private static final String cvv = "DestroySpecialEffectName";
    private static final String cvw = "Scope";
    private static final String cvx = "Testing";
    private static final String cvy = "TestingPosition";
    private static final String cvz = "SpawnInWater";
    private static final String cvA = "DistanceCheck";
    private static final String cvB = "RelicChestTimeToLive";
    private static final String cvC = "TimeBetweenChests";
    private static final String cvD = "DelayConfing";
    private static final String cvE = "PlaceRelic";
    private static final String cvF = "StealRelic";
    private static final String cvG = "SacrificeRelic";
    private static final String cvH = "UnlockRelicChest";
    private static final String cvI = "Type";
    private static final String cvJ = "Value";
    private static final String cvK = "Buffs";
    private static final String cvL = "TimeToLive";
    private static final String cvM = "Special";
    private static final String cvN = "HealEffectMagnitude";
    private static final String cvO = "CriticalHits";
    private static final String cvP = "PlayerEffect";
    public static boolean avz = false;
    public static boolean cvQ = false;
    public static boolean cvR = false;
    public static float cvS = 0.0f;
    public static ljq cvT = null;
    public static double cvU = 3600.0;
    public static double cvV = 3000.0;
    public static double cvW = 10.0;
    public static double cvX = 10.0;
    public static double cvY = 10.0;
    public static double cvZ = 10.0;
    public static int cwa = -1;
    public static int cwb = -1;
    public static int cwc = -1;
    public static int cwd = -1;
    private Map<Integer, a> cwe = lcn.emw();
    private b cwf = null;

    public void a(int n, int n2, int n3, int n4, List<aml> list, int n5, int n6, int n7, int n8) {
        assert (!this.cwe.containsKey(n));
        this.cwe.put(n, new a(this, n, n2, n3, n4, list, n5, n6, n7, n8));
    }

    public Collection<a> Zw() {
        return this.cwe.values();
    }

    public a iJ(int n) {
        return this.cwe.get(n);
    }

    public a iK(int n) {
        for (a a2 : this.cwe.values()) {
            if (a2.lF() != n) continue;
            return a2;
        }
        return null;
    }

    public void a(int n, Map<Integer, Float> map, float f, boolean bl) {
        this.cwf = new b(this, n, map, f, bl);
    }

    public Float Zx() {
        return this.cwf.cwo.get(354);
    }

    public Float Zy() {
        return this.cwf.cwo.get(386);
    }

    public Float Zz() {
        return this.cwf.cwo.get(402);
    }

    public float ZA() {
        return this.cwf.cwp;
    }

    public int getTimeToLive() {
        return this.cwf.cwn;
    }

    public boolean ZB() {
        return this.cwf.cwq;
    }

    public static float a(cbx cbx2, boolean bl, boolean bl2, float f) {
        lea.epQ();
        if (!avz) {
            return f;
        }
        if (cbx2 == null) {
            return f;
        }
        if (!cbx2.UB()) {
            return f;
        }
        if (!bl) {
            return f;
        }
        if (bl2) {
            return f;
        }
        return ayc.f(cbx2) ? lea.epQ().ZA() * f : f;
    }

    public static boolean f(cbx cbx2) {
        lea.epQ();
        if (!avz) {
            return false;
        }
        if (!cbx2.UB()) {
            return false;
        }
        en en2 = cbx2.jm();
        if (en2 == null) {
            return false;
        }
        int n = en2.ap(13712);
        return n > 0;
    }

    public static boolean a(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        lea.epQ();
        if (!avz) {
            return bl3;
        }
        if (!bl2) {
            return bl3;
        }
        if (bl) {
            return bl3;
        }
        if (!bl4) {
            return bl3;
        }
        return lea.epQ().ZB() ? true : bl3;
    }

    public static boolean a(brb brb2, int n) {
        return true;
    }

    public static float a(cbx cbx2, float f) {
        return f + f * ayc.a(cbx2, 13840);
    }

    public static float b(cbx cbx2, float f) {
        float f2 = f;
        if ((f += ayc.a(cbx2, 13808)) < 1.0f) {
            if (f > 0.0f) {
                return f;
            }
            return f2;
        }
        assert (false) : "ParryModifier : " + f + " TempModifier : " + f2;
        return f2;
    }

    public static float a(cev cev2, float f) {
        return f + f * ayc.a((cbx)cev2, 13872);
    }

    public static boolean a(cev cev2) {
        return ayc.b((cbx)cev2, 13920);
    }

    public static boolean b(cev cev2) {
        return ayc.b((cbx)cev2, 13888);
    }

    public static boolean c(cev cev2) {
        return ayc.b((cbx)cev2, 13904);
    }

    public static float a(cbx cbx2, int n) {
        lea.epQ();
        if (!avz) {
            return 0.0f;
        }
        if (!(cbx2 instanceof cev)) {
            return 0.0f;
        }
        cev cev2 = (cev)cbx2;
        el el2 = cev2.fi();
        if (el2 == null) {
            return 0.0f;
        }
        return el2.al(n);
    }

    public static boolean b(cbx cbx2, int n) {
        lea.epQ();
        if (!avz) {
            return false;
        }
        if (!(cbx2 instanceof cev)) {
            return false;
        }
        cev cev2 = (cev)cbx2;
        en en2 = cev2.jm();
        if (en2 == null) {
            return false;
        }
        return en2.ag(n);
    }

    public static boolean a(String string, boolean bl, int n) {
        lea.epQ();
        if (!avz) {
            return true;
        }
        if (string == null) {
            return true;
        }
        if (!(string.contains("bow_load") || string.contains("bow_fire") || string.contains("bow_shot"))) {
            return true;
        }
        boolean bl2 = !bl || !byw.nW(n);
        return bl2;
    }

    public static float a(cdb cdb2, float f) {
        return f + f * ayc.a((cbx)cdb2, 13952);
    }

    public static float b(cdb cdb2) {
        return ayc.a((cbx)cdb2, 13936);
    }

    public static float d(cev cev2) {
        if (cev2 == null) {
            return 0.0f;
        }
        cef cef2 = cev2.aLX();
        if (cef2 == null) {
            return 0.0f;
        }
        if (!cef2.aKT()) {
            return 0.0f;
        }
        return ayc.a((cbx)cev2, 13984);
    }

    public static float b(cdb cdb2, float f) {
        return f + f * ayc.a((cbx)cdb2, 13968);
    }

    public static float c(cdb cdb2, float f) {
        return f + ayc.a((cbx)cdb2, 14048);
    }

    public static float d(cdb cdb2, float f) {
        return f + f * ayc.a((cbx)cdb2, 14064);
    }

    public static void eL(String string) {
        Node node10;
        ayc ayc2 = lea.epQ();
        Document document = jsy.tJ(string);
        if (document == null) {
            lfn.b(5, TC, "parseFile() Invalid Document: [" + string + "]");
            assert (false);
            return;
        }
        Node node2 = jsy.a(cvm, (Node)document);
        if (node2 == null) {
            throw new bn(cvm);
        }
        boolean bl = Boolean.parseBoolean(jsy.i(node2, "Enabled"));
        boolean bl2 = Boolean.parseBoolean(jsy.i(node2, cvx));
        boolean bl3 = Boolean.parseBoolean(jsy.i(node2, cvz));
        float f = Float.parseFloat(jsy.i(node2, cvA));
        ljq ljq2 = ljq.Au(jsy.i(node2, cvy));
        double d2 = Double.parseDouble(jsy.i(node2, cvB));
        double d3 = Double.parseDouble(jsy.i(node2, cvC));
        Node node3 = jsy.d(cvD, node2);
        Node node4 = jsy.d(cvE, node3);
        double d4 = Double.parseDouble(jsy.i(node4, "Delay"));
        String string2 = jsy.i(node4, "AnimationState");
        int n = lkv.AG((String)string2);
        Node node5 = jsy.d(cvF, node3);
        double d5 = Double.parseDouble(jsy.i(node5, "Delay"));
        String string3 = jsy.i(node5, "AnimationState");
        int n2 = lkv.AG((String)string3);
        Node node6 = jsy.d(cvG, node3);
        double d6 = Double.parseDouble(jsy.i(node6, "Delay"));
        String string4 = jsy.i(node6, "AnimationState");
        int n3 = lkv.AG((String)string4);
        Node node7 = jsy.d(cvH, node3);
        double d7 = Double.parseDouble(jsy.i(node7, "Delay"));
        String string5 = jsy.i(node7, "AnimationState");
        int n4 = lkv.AG((String)string5);
        Node node8 = jsy.d(cvK, node2);
        String string6 = jsy.i(node8, "AttributeName");
        int n5 = ep.as((String)string6);
        if (n5 == -1) {
            throw new bj("AttributeName Value : " + string6);
        }
        int n6 = Integer.parseInt(jsy.i(node8, cvL));
        Node node9 = jsy.d("Attributes", node8);
        List<Node> list = jsy.c("Attribute", node9);
        if (list == null || list.isEmpty()) {
            throw new bn("Attributes");
        }
        Map<Integer, Float> map = lcn.emw();
        for (Node node10 : list) {
            String string7 = jsy.i(node10, "Name");
            int n7 = ep.as((String)string7);
            if (n5 == -1) {
                throw new bj("AttributeName Value : " + string7);
            }
            float f2 = Float.parseFloat(jsy.i(node10, cvJ));
            map.put(n7, Float.valueOf(f2));
        }
        Node node11 = jsy.d(cvM, node8);
        node10 = jsy.d(cvN, node11);
        float f3 = Float.parseFloat(jsy.i(node10, cvJ));
        Node node12 = jsy.d(cvO, node11);
        boolean bl4 = Boolean.parseBoolean(jsy.i(node12, cvJ));
        List<Node> list2 = jsy.c(cvn, node2);
        if (list2 == null || list2.isEmpty()) {
            throw new bn(cvn);
        }
        for (Node node13 : list2) {
            String string8;
            Object object;
            int n8 = Integer.parseInt(jsy.i(node13, "Build"));
            if (lcw.bcB != n8 && n8 != 0) continue;
            int n9 = Integer.parseInt(jsy.i(node13, "ProwessGain"));
            if (n9 < 0) {
                throw new bj("ProwessGain Value : " + jsy.i(node13, "ProwessGain"));
            }
            int n10 = c.getValueByName(jsy.i(node13, cvp));
            if (n10 == -1) {
                throw new bj("RelicID Value : " + jsy.i(node13, cvp));
            }
            Node node14 = jsy.a(cvo, node13);
            String string9 = jsy.i(node14, cvJ);
            int n11 = lea.enW().getType(string9);
            if (n11 == -1) {
                throw new bj("ChestResourceName Value : " + string9);
            }
            Node node15 = jsy.a(cvq, node13);
            String string10 = jsy.i(node15, cvJ);
            int n12 = lea.enW().getType(string10);
            if (n12 == -1) {
                throw new bj("WorldObjectResourceName Value : " + string10);
            }
            Node node16 = jsy.a(cvP, node13);
            String string11 = jsy.i(node16, cvJ);
            int n13 = del.dr(string11);
            if (n13 == -1) {
                throw new bj("PlayerEffect Value : " + n13);
            }
            int n14 = -1;
            Node node17 = jsy.a(cvv, node13);
            if (node17 != null) {
                object = jsy.i(node17, cvJ);
                n14 = del.dr((String)object);
            }
            if ((object = jsy.a("Attributes", node13)) == null) {
                throw new bj("Attributes");
            }
            List<Node> list3 = jsy.c("Attribute", (Node)object);
            if (list3 == null || list3.isEmpty()) {
                throw new bn("Attribute");
            }
            ArrayList<aml> arrayList = lcn.emv();
            for (Node node18 : list3) {
                string8 = jsy.i(node18, cvw);
                dlp dlp2 = dlp.valueOf(string8);
                String string12 = jsy.i(node18, "Name");
                String string13 = jsy.i(node18, cvI);
                String string14 = jsy.i(node18, cvJ);
                mhk mhk2 = null;
                mhs mhs2 = mhs.getTypeByName(string13);
                if (mhs2 != null) {
                    switch (mhs2) {
                        case FLOAT: {
                            float f4 = Float.parseFloat(string14);
                            mhk2 = new mhn(f4);
                            break;
                        }
                        case BOOLEAN: {
                            boolean bl5 = Boolean.parseBoolean(string14);
                            mhk2 = new mhl(bl5);
                            break;
                        }
                        default: {
                            assert (false) : "Unhandled type : " + (Object)((Object)mhs2);
                            break;
                        }
                    }
                }
                aml aml2 = new aml(dlp2, string12, mhk2);
                aml2.gO(n10);
                arrayList.add(aml2);
            }
            String string15 = jsy.i(node13, cvt);
            int n15 = del.dr(string15);
            if (n15 == -1) {
                throw new bj("ActiveSpecialEffectName Value : " + (String)string15);
            }
            string8 = jsy.i(node13, cvu);
            int n16 = del.dr(string8);
            if (n16 == -1) {
                throw new bj("InactiveSpecialEffectName Value : " + string8);
            }
            ayc2.a(n11, n9, n10, n12, arrayList, n15, n16, n14, n13);
        }
        avz = bl;
        cvQ = bl2;
        cvR = bl3;
        cvS = f;
        cvT = ljq2;
        cvU = d2;
        cvV = d3;
        cvW = d4;
        cvX = d5;
        cvY = d6;
        cvZ = d7;
        cwa = n;
        cwb = n2;
        cwc = n3;
        cwd = n4;
        ayc2.a(n6, map, f3, bl4);
    }
}

