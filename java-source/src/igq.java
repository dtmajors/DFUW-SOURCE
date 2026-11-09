/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 */
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class igq {
    public static final jlo<List<ign>, List<ign>, List<ign>, Boolean> lTF = new jlo();
    public static final jll<ign> lTG = new jll();
    public static final jll<ign> lTH = new jll();
    private static boolean lTI = false;
    private static Map<Integer, ign> lTJ = lcn.emw();
    private static Map<igm, List<ign>> lTK = lcn.emw();
    private static HashSet<ign> lTL = new HashSet();
    private static int lTM = 0;
    private static int lTN = 0;
    private static int lTO = 0;
    private static int lTP = 0;
    private static int lTQ = 0;
    private static int lTR = 0;
    private static Map<igm, Integer> lTS = lcn.emw();
    private static Map<igm, Integer> lTT = lcn.emw();
    private static Map<igm, Integer> lTU = lcn.emw();
    private static Map<igm, Integer> lTV = lcn.emw();
    private static Map<igm, Integer> lTW = lcn.emw();
    private static Map<igm, Integer> lTX = lcn.emw();
    private static Set<ign> lTY = lcn.emx();

    public static void cUf() {
        Object object;
        Object object22;
        Iterator iterator;
        if (lTI) {
            return;
        }
        lTI = true;
        les les2 = lea.enW();
        Map<Integer, cgr> map = lea.eps().aOa();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        for (cgr object4 : map.values()) {
            n = Math.max(n, object4.eyG);
            n2 = Math.max(n2, object4.eyL);
            n3 = Math.max(n3, object4.adk);
            iterator = new ign(object4);
            lTJ.put(((ign)((Object)iterator)).getId(), (ign)((Object)iterator));
            if (((ign)((Object)iterator)).cTI() == igm.lSL) {
                lTL.add((ign)((Object)iterator));
            }
            if (((ign)((Object)iterator)).cTq().Name.equals("st_19_feat_tracker")) {
                lTY.add((ign)((Object)iterator));
            }
            if (object4.eyU.aOG() == cgi.LIFE_MODE_CHANGES) {
                cho cho2 = (cho)object4.eyU;
                if (les2.isDescendant(cho2.ResourceType, cug.fgG)) {
                    igj.lSw.add(cho2.ResourceType);
                }
            }
            if (!((ign)((Object)iterator)).cTM() || ((ign)((Object)iterator)).cTT()) continue;
            ++lTN;
            lTT.put(((ign)((Object)iterator)).cTI(), igq.e(((ign)((Object)iterator)).cTI()) + 1);
            lTP += ((ign)((Object)iterator)).cTF();
            lTV.put(((ign)((Object)iterator)).cTI(), igq.g(((ign)((Object)iterator)).cTI()) + ((ign)((Object)iterator)).cTF());
        }
        for (ign ign4 : lTJ.values()) {
            if (!(ign4.cTq().eyU instanceof chk)) continue;
            iterator = (chk)ign4.cTq().eyU;
            if (((chk)((Object)iterator)).ezZ == null || ((chk)((Object)iterator)).ezZ.isEmpty()) continue;
            for (Object object22 : ((chk)((Object)iterator)).ezZ) {
                object = lTJ.get(object22);
                if (object == null) continue;
                ign4.cTz().add((ign)object);
                ((ign)object).lSS = ign4;
                ign4.qe(true);
            }
        }
        for (ign ign2 : lTJ.values()) {
            if (ign2.cTq().eyK == null) continue;
            for (cgw cgw2 : ign2.cTq().eyK.aCN) {
                switch (cgw2.ezk) {
                    case eyz: {
                        object22 = lea.eps().hm(cgw2.ezl);
                        if (object22 == null) {
                            lfn.b(5, "SFFeatsWindow", "_initializeFeats() Feat " + ign2.getTitle() + ": " + cgw2.ezl + " does not exist in the feat tree. Please inform designers or Chris.");
                            break;
                        }
                        object = lTJ.get(((cgr)object22).adk);
                        ((ign)object).qe(true);
                        ign2.cTC().add((ign)object);
                        ((ign)object).cTB().add(ign2);
                        ign2.qe(true);
                        break;
                    }
                    case eyA: {
                        object22 = lea.eps().hl(cgw2.ezl);
                        if (object22 == null || ((cgu)object22).eyH == null) break;
                        for (cgr cgr2 : ((cgu)object22).eyH.values()) {
                            ign ign3 = lTJ.get(cgr2.adk);
                            if (ign3.cTq().bdP) continue;
                            ign3.qe(true);
                            ign2.cTC().add(ign3);
                            ign3.cTB().add(ign2);
                            ign2.qe(true);
                        }
                        break;
                    }
                    case eyB: {
                        object22 = lea.eps().ho(cgw2.ezl);
                        if (object22 == null || ((cgq)object22).eyF == null) break;
                        for (cgu cgu2 : ((cgq)object22).eyF.values()) {
                            for (cgr cgr3 : cgu2.eyH.values()) {
                                ign ign4 = lTJ.get(cgr3.adk);
                                if (ign4.cTq().bdP) continue;
                                ign4.qe(true);
                                ign2.cTC().add(ign4);
                                ign4.cTB().add(ign2);
                                ign2.qe(true);
                            }
                        }
                        break;
                    }
                }
            }
        }
        for (Iterator<Object> iterator2 : igm.values()) {
            object22 = lcn.emv();
            lTK.put((igm)((Object)iterator2), (List<ign>)object22);
        }
        for (ign ign5 : lTJ.values()) {
            lTK.get((Object)ign5.cTI()).add(ign5);
        }
    }

    public static ign QK(int n) {
        return lTJ.get(n);
    }

    public static void k(ign ign2) {
        lTL.remove(ign2);
    }

    public static boolean cUg() {
        return lTL.isEmpty();
    }

    public static Collection<ign> cUh() {
        return Collections.unmodifiableCollection(lTJ.values());
    }

    public static Collection<ign> b(igm igm2) {
        return Collections.unmodifiableCollection((Collection)lTK.get((Object)igm2));
    }

    public static int cUi() {
        return lTM;
    }

    public static int c(igm igm2) {
        Integer n = lTS.get((Object)igm2);
        return n != null ? n : 0;
    }

    public static int d(igm igm2) {
        double d = igq.e(igm2);
        double d2 = igq.c(igm2);
        double d3 = d2 / d;
        return Math.min((int)(d3 * 100.0), 100);
    }

    public static int cUj() {
        return lTN;
    }

    public static int e(igm igm2) {
        Integer n = lTT.get((Object)igm2);
        return n != null ? n : 0;
    }

    public static int cUk() {
        return lTO;
    }

    public static int f(igm igm2) {
        Integer n = lTU.get((Object)igm2);
        return n != null ? n : 0;
    }

    public static int cTF() {
        return lTP;
    }

    public static int g(igm igm2) {
        Integer n = lTV.get((Object)igm2);
        return n != null ? n : 0;
    }

    public static int cUl() {
        return lTQ;
    }

    public static int h(igm igm2) {
        Integer n = lTW.get((Object)igm2);
        return n != null ? n : 0;
    }

    public static int i(igm igm2) {
        int n = igq.e(igm2);
        return n > 0 ? Math.max(0, Math.min(igq.h(igm2) * 100 / n, 100)) : 0;
    }

    public static int cUm() {
        return lTR;
    }

    public static int j(igm igm2) {
        Integer n = lTX.get((Object)igm2);
        return n != null ? n : 0;
    }

    public static void l(ign ign2) {
        if (!ign2.cTM()) {
            return;
        }
        if (!ign2.cTT()) {
            lTS.put(ign2.cTI(), igq.c(ign2.cTI()) + 1);
            ++lTM;
            lTU.put(ign2.cTI(), igq.f(ign2.cTI()) + ign2.cTF());
            lTO += ign2.cTF();
        } else {
            lTW.put(ign2.cTI(), igq.h(ign2.cTI()) + 1);
            ++lTQ;
            lTX.put(ign2.cTI(), igq.j(ign2.cTI()) + ign2.cTF());
            lTR += ign2.cTF();
        }
    }

    public static boolean cUn() {
        for (ign ign2 : lTY) {
            if (ign2.isCompleted()) continue;
            return false;
        }
        return true;
    }
}

