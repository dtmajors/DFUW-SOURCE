/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  kah
 *  lcw
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class juc {
    public static final lju oRy = new lju(0, 1, 0);
    private final jzp oRz = new jzp();
    private final cul oRF = new cul();
    private final les ResourceTree = lea.enW();

    public void eL(String string) {
        if (string == null) {
            throw new bi("FileName is null.");
        }
        Document document = jsy.tJ(string);
        jsy.a(document, oRy);
        try {
            Node node = jsy.d("XML", document);
            this.W(node);
            this.U(node);
            this.V(node);
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private cte b(int n, Node node) {
        List<Node> list;
        cte cte2 = new cte();
        cte2.ResourceType = n;
        cte2.asi = this.m(node, "Quantity");
        cte2.fex = this.l(node, "Attach");
        if (!cte2.fex) {
            cte2.fey = this.m(node, "GroupNumber");
        }
        if (!(list = jsy.c("SFAttribute", node)).isEmpty()) {
            try {
                cte2.DR = this.oRz.bT(list);
            }
            catch (bg bg2) {
                throw new bg("Parsing of attributes for '" + cte2.pa() + "' failed", bg2);
            }
        }
        return cte2;
    }

    private boolean l(Node node, String string) {
        NamedNodeMap namedNodeMap = node.getAttributes();
        if (namedNodeMap == null || namedNodeMap.getLength() == 0) {
            return false;
        }
        Node node2 = namedNodeMap.getNamedItem(string);
        if (node2 == null) {
            return false;
        }
        String string2 = node2.getNodeValue();
        return Boolean.parseBoolean(string2);
    }

    private int m(Node node, String string) {
        NamedNodeMap namedNodeMap = node.getAttributes();
        if (namedNodeMap == null || namedNodeMap.getLength() == 0) {
            return 0;
        }
        Node node2 = namedNodeMap.getNamedItem(string);
        if (node2 == null) {
            return 0;
        }
        String string2 = node2.getNodeValue();
        try {
            return Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    private void U(Node node) {
        List<Node> list = jsy.c("SFUserEquipment", node);
        if (list.isEmpty()) {
            return;
        }
        Map<String, cte[]> map = lea.eoC();
        int n = list.size();
        for (int i2 = 0; i2 < n; ++i2) {
            try {
                Node node2 = list.get(i2);
                Node node3 = jsy.d("SFUserName", node2);
                String string = jsy.m(node3);
                if (string == null || string.trim().equals("")) {
                    throw new bj("Node 'SFUserName' has invalid value.");
                }
                List<Node> list2 = jsy.c("SFResourceName", node2);
                if (list2.isEmpty()) continue;
                cte[] cteArray = this.bN(list2);
                if (map.containsKey(string)) {
                    throw new bp("UserEquipment for user '" + string + "' has already been added.");
                }
                map.put(string, cteArray);
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of userequipment " + i2 + " failed.", bg2);
            }
        }
    }

    private void V(Node node) {
        List<Node> list = jsy.c("SFUserFeature", node);
        if (list.isEmpty()) {
            return;
        }
        Map<String, int[]> map = lea.eoD();
        int n = list.size();
        for (int i2 = 0; i2 < n; ++i2) {
            try {
                int n2;
                Node node2 = list.get(i2);
                Node node3 = jsy.d("SFUserName", node2);
                String string = jsy.m(node3);
                if (string == null || string.trim().equals("")) {
                    throw new bj("Node 'SFUserName' has invalid value.");
                }
                List<Node> list2 = jsy.c("SFResourceName", node2);
                if (list2.isEmpty()) continue;
                ArrayList<Integer> arrayList = lcn.abH(2);
                int n3 = list2.size();
                for (int i3 = 0; i3 < n3; ++i3) {
                    n2 = kah.dv((Node)list2.get(i3));
                    if (n2 <= 0) {
                        throw new bg("ResourceType " + i2 + " is invalid.");
                    }
                    if (!this.ResourceTree.k(n2, cug.fkO, false)) {
                        throw new bg("ResourceType " + i2 + " is not a visual feature.");
                    }
                    arrayList.add(n2);
                }
                int[] nArray = new int[arrayList.size()];
                n2 = nArray.length;
                for (n3 = 0; n3 < n2; ++n3) {
                    nArray[n3] = (Integer)arrayList.get(n3);
                }
                if (map.containsKey(string)) {
                    throw new bp("UserFeature for user '" + string + "' has already been added.");
                }
                map.put(string, nArray);
                continue;
            }
            catch (bg bg2) {
                throw new bg("Parsing of userequipment " + i2 + " failed.", bg2);
            }
        }
    }

    private void W(Node node) {
        float f;
        String string;
        dck dck2;
        int n;
        String string2;
        int n2;
        Node node2 = jsy.a("UseEditorSocket", node);
        if (node2 != null) {
            lcw.qHi = n2 = jsy.t(node2);
        }
        if ((node2 = jsy.a("FailureSkillName", node)) != null && (string2 = jsy.m(node2)) != null && !string2.trim().equals("") && !string2.equalsIgnoreCase("NULL") && (n = lea.enZ().getType(string2)) > 0) {
            dck2 = new dck();
            dck2.SkillType = n;
            dck2.gcT = true;
            cxj.a(dck2);
        }
        if ((node2 = jsy.a("SuccessSkillName", node)) != null && (string = jsy.m(node2)) != null && !string.trim().equals("") && !string.equalsIgnoreCase("NULL") && (n = lea.enZ().getType(string)) >= 0) {
            dck2 = new dck();
            dck2.SkillType = n;
            dck2.gcT = false;
            cxj.a(dck2);
        }
        if ((node2 = jsy.a("ValidateQuests", node)) != null) {
            lcw.qHa = jsy.t(node2);
        }
        if ((node2 = jsy.a("PreloadQuestResources", node)) != null) {
            lcw.qHb = jsy.t(node2);
        }
        if ((node2 = jsy.a("UseProxyForMessages", node)) != null) {
            lcw.qGZ = jsy.t(node2);
        }
        if ((node2 = jsy.a("TryToConvertRequests", node)) != null) {
            lcw.qHc = jsy.t(node2);
        }
        if ((node2 = jsy.a("ContinueOnProxyError", node)) != null) {
            lcw.qHd = jsy.t(node2);
        }
        if ((node2 = jsy.a("DoDecapitate", node)) != null) {
            ctg.feE = n2 = jsy.t(node2);
        }
        if ((node2 = jsy.a("DoHeadbash", node)) != null) {
            ctg.feL = n2 = jsy.t(node2);
        }
        if ((node2 = jsy.a("EnableGlobalRegeneration", node)) != null) {
            ctg.feN = n2 = jsy.t(node2);
        }
        if ((node2 = jsy.a("EnableNewbieProtection", node)) != null) {
            ctg.feO = n2 = jsy.t(node2);
        }
        if ((node2 = jsy.a("EnableMonstersEnterGankMode", node)) != null) {
            arw.bRY = n2 = jsy.t(node2);
        }
        if ((node2 = jsy.a("EnableIdle", node)) != null) {
            arw.bRW = n2 = jsy.t(node2);
        }
        if ((node2 = jsy.a("EnableGlobalSpawning", node)) != null) {
            arw.bRV = n2 = jsy.t(node2);
        }
        if ((node2 = jsy.a("EnableBattleRoyal", node)) != null) {
            arw.bRT = n2 = jsy.t(node2);
        }
        if ((node2 = jsy.a("MonstersHardCap", node)) != null) {
            arj.bPG = n2 = jsy.r(node2);
        }
        if ((node2 = jsy.a("EnableSelfDamageAffectingAlignmentSuspicious", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.feP = n2;
        }
        if ((node2 = jsy.a("EnableSpellIngredientConstraints", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.feQ = n2;
        }
        if ((node2 = jsy.a("EnterDeath", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.feR = n2;
        }
        if ((node2 = jsy.a("EnterGankMode", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.feS = n2;
        }
        if ((node2 = jsy.a("OverrideChargingTimers", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.feT = n2;
        }
        if ((node2 = jsy.a("OverrideCraftingTimers", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.feU = n2;
        }
        if ((node2 = jsy.a("OverrideEnchantmentTimer", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.feV = n2;
        }
        if ((node2 = jsy.a("OverrideRestartBlockingTimers", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.feX = n2;
        }
        if ((node2 = jsy.a("OverrideTeleportTimers", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.feY = n2;
        }
        if ((node2 = jsy.a("SetupWorld", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.ffc = n2;
        }
        if ((node2 = jsy.a("ShowNaturalSkillsOnHotbar", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.ffd = n2;
        }
        if ((node2 = jsy.a("SkipCheckingConstraints", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.ffe = n2;
        }
        if ((node2 = jsy.a("SkipConsumingAttributes", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.fff = n2;
        }
        if ((node2 = jsy.a("SkipConsumingResources", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.ffg = n2;
        }
        if ((node2 = jsy.a("SkipInvulnerabilityAfterSpawning", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.ffi = n2;
        }
        if ((node2 = jsy.a("TargetSelf", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.ffj = n2;
        }
        if ((node2 = jsy.a("UseShortCorpseTimer", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.ffl = n2;
        }
        if ((node2 = jsy.a("UseShortGankModeTimer", node)) != null) {
            n2 = jsy.t(node2) ? 1 : 0;
            ctg.ffm = n2;
        }
        if ((node2 = jsy.a("AreaOfInterestRadius", node)) != null && (f = jsy.o(node2)) >= 5.0f) {
            in.agb = f;
        }
        if ((node2 = jsy.a("PlayerSkillLevel", node)) != null) {
            float f2 = jsy.o(node2);
            if (f2 < 1.0f || f2 > 100.0f) {
                lfn.b(5, "SFGamelogicConfigParser", "parseConfigData() PlayerSkillLevel " + f2 + " is invalid.");
            } else {
                ctg.ffw = f2;
            }
        }
        if ((node2 = jsy.a("UseShortGankModeTimer", node)) != null) {
            boolean bl;
            ctg.ffm = bl = jsy.t(node2);
        }
        if ((node2 = jsy.a("TargetCircleEnabled", node)) != null) {
            boolean bl;
            ctg.ffN = bl = jsy.t(node2);
        }
        if ((node2 = jsy.a("EnableCharacterCreationTutorialArea", node)) != null) {
            lcw.qFp = jsy.t(node2);
        }
    }

    private cte[] bN(List list) {
        assert (list != null);
        assert (!list.isEmpty());
        ArrayList<cte> arrayList = lcn.abH(list.size());
        int n = 0;
        boolean bl = false;
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            try {
                Comparable comparable;
                Node node = (Node)list.get(i2);
                String string = jsy.m(node);
                if (string == null || string.trim().equals("")) {
                    throw new bj("Node '" + node.getNodeName() + "' has invalid value.");
                }
                n = this.ResourceTree.getType(string);
                if (n <= 0) {
                    throw new bg("Resource " + i2 + " with Name='" + string + "' and Type=" + n + " is invalid.");
                }
                bl = this.ResourceTree.isDescendant(n, cug.fjk) ? true : (this.ResourceTree.isDescendant(n, cug.fjj) ? true : (this.ResourceTree.isDescendant(n, cug.fjP) ? true : (this.ResourceTree.isDescendant(n, cug.fnn) ? true : (this.ResourceTree.isDescendant(n, cug.fkI) ? true : (this.ResourceTree.isDescendant(n, cug.fmO) ? true : this.ResourceTree.isDescendant(n, cug.fiL))))));
                if (bl) {
                    comparable = (lgw)this.ResourceTree.acv(n);
                    if (this.ResourceTree.g((ler)comparable) == null) {
                        if (!this.oRF.b((lgw)comparable)) continue;
                        cte cte2 = this.b(n, node);
                        arrayList.add(cte2);
                        continue;
                    }
                    int n3 = this.m(node, "Quantity");
                    if (n3 < 0) {
                        throw new bg("Resource '" + string + "' has invalid quantity.");
                    }
                    int n4 = this.m(node, "GroupNumber");
                    if (n4 < 0) {
                        throw new bg("Resource '" + string + "' has invalid groupnumber.");
                    }
                    this.oRF.a((lgw)comparable, arrayList, n3, false, n4);
                    continue;
                }
                comparable = this.b(n, node);
                arrayList.add((cte)comparable);
                continue;
            }
            catch (bg bg2) {
                lfn.b(5, "SFGamelogicConfigParser", "parseSFResourceNameNodes() Cause: " + bg2.getMessage());
                throw new bg("Parsing of resourcetype " + i2 + " (" + n + ") failed.", bg2);
            }
        }
        Collections.sort(arrayList);
        return arrayList.toArray(new cte[arrayList.size()]);
    }
}

