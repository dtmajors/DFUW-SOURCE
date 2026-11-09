/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lkv
 */
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jyf {
    private final boolean bC = false;
    lju fzk = new lju(0, 2);
    String bhl;

    public lks vB(String string) {
        Document document = null;
        try {
            document = jsy.tJ("xml-files/object/animation/states/" + string);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            return null;
        }
        return this.u(document, jry.tn(string));
    }

    private lks u(Document document, String string) {
        lks lks2 = null;
        Node node = jsy.a("SFAnimationStateTemplate", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "SFANIMATIONSTATE_TEMPLATE [" + string + "] is invalid!");
            assert (false);
            return null;
        }
        lju lju2 = jsy.c(document);
        if (lju2.equals(this.fzk)) {
            lks2 = this.b(node, lju2);
            lks2.cd(string);
        } else if (lju2.equals(new lju(0, 3))) {
            lks2 = this.b(node, lju2);
            lks2.cd(string);
        } else {
            lfn.b(5, this.getClass().getName(), "Cannot Load. Wrong Version: " + lju2);
        }
        return lks2;
    }

    private lks b(Node node, lju lju2) {
        lks lks2 = new lks();
        Node node2 = null;
        String string = null;
        node2 = jsy.a("Name", node);
        if (node2 != null) {
            string = jsy.m(node2);
            lks2.setName(string);
        }
        node2 = jsy.a("AnimationStateList", node);
        NodeList nodeList = node2.getChildNodes();
        lkr lkr2 = null;
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            node2 = nodeList.item(i2);
            if (!node2.getNodeName().equals("AnimationState") || (lkr2 = lju2.equals(new lju(0, 3)) ? this.cu(node2) : this.cv(node2)) == null) continue;
            this.a(lkr2, this.bhl);
            lks2.b(lkr2);
        }
        return lks2;
    }

    private lkr cu(Node node) {
        List<lkp> list;
        List list2;
        List list3;
        String string = null;
        lkr lkr2 = new lkr();
        NamedNodeMap namedNodeMap = node.getAttributes();
        Node node2 = namedNodeMap.getNamedItem("ID");
        if (node2 != null) {
            lkr2.adf(Integer.parseInt(node2.getNodeValue()));
        }
        if ((node2 = namedNodeMap.getNamedItem("Loop")) != null) {
            lkr2.setLooping(Boolean.parseBoolean(node2.getNodeValue()));
        }
        if ((node2 = namedNodeMap.getNamedItem("Partial")) != null) {
            lkr2.yC(Boolean.parseBoolean(node2.getNodeValue()));
        }
        if ((node2 = namedNodeMap.getNamedItem("Duration")) != null) {
            lkr2.nE(Float.parseFloat(node2.getNodeValue()));
        }
        if ((node2 = namedNodeMap.getNamedItem("RemovePartial")) != null) {
            lkr2.yD(Boolean.parseBoolean(node2.getNodeValue()));
        }
        if ((node2 = namedNodeMap.getNamedItem("SetName")) != null) {
            lkr2.setSetName(node2.getNodeValue());
        }
        if ((node2 = namedNodeMap.getNamedItem("PlaybackType")) != null) {
            lkr2.adh(Integer.parseInt(node2.getNodeValue()));
        }
        if ((node2 = namedNodeMap.getNamedItem("Speed")) != null) {
            lkr2.iF(Float.parseFloat(node2.getNodeValue()));
        }
        if ((node2 = namedNodeMap.getNamedItem("StopAtPosition")) != null) {
            lkr2.yE(Boolean.parseBoolean(node2.getNodeValue()));
        }
        if ((node2 = namedNodeMap.getNamedItem("FallbackState")) != null) {
            lkr2.yG(Boolean.parseBoolean(node2.getNodeValue()));
        }
        if ((node2 = namedNodeMap.getNamedItem("HideWeapon")) != null) {
            lkr2.yH(Boolean.parseBoolean(node2.getNodeValue()));
        }
        if ((node2 = namedNodeMap.getNamedItem("StopPositionNormalized")) != null) {
            float f = Float.parseFloat(node2.getNodeValue());
            if (f > 0.7f && f < 0.95f) {
                f = 0.95f;
            }
            lkr2.nF(f);
        }
        if ((node2 = jsy.a(string = "AlternativeSets", node)) != null && (list3 = this.cy(node2)) != null && !list3.isEmpty()) {
            lkr2.ca(list3);
        }
        if ((node2 = jsy.a(string = "ChainedStates", node)) != null && (list2 = this.cz(node2)) != null && !list2.isEmpty()) {
            int[] nArray = new int[list2.size()];
            int n = 0;
            for (String string2 : list2) {
                nArray[n] = Integer.parseInt(string2);
                ++n;
            }
            lkr2.aX(nArray);
        }
        if ((node2 = jsy.a(string = "EffectList", node)) != null && (list = this.cx(node2)) != null && !list.isEmpty()) {
            lkr2.cb(list);
        }
        return lkr2;
    }

    private lkr cv(Node node) {
        assert (false);
        String string = null;
        lkr lkr2 = new lkr();
        Node node2 = jsy.a("StateID", node);
        if (node2 != null) {
            lkr2.adf(jsy.r(node2));
        }
        if ((node2 = jsy.a("StateLoop", node)) != null) {
            lkr2.setLooping(jsy.t(node2));
        }
        if ((node2 = jsy.a("StatePurePartial", node)) != null) {
            lkr2.yC(jsy.t(node2));
        }
        if ((node2 = jsy.a("StateDuration", node)) != null) {
            lkr2.nE(jsy.o(node2));
        }
        node2 = jsy.a("StateInfoList", node);
        NodeList nodeList = node2.getChildNodes();
        Node node3 = null;
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            List<Object> list;
            node2 = nodeList.item(i2);
            if (!node2.getNodeName().equals("StateInfo")) continue;
            node3 = jsy.a("AnimationSetID", node2);
            if (node3 != null && !lkr2.isPartial()) {
                lkr2.setSetName(jsy.m(node3));
            }
            if ((node3 = jsy.a("AnimationExtraSetID", node2)) != null && lkr2.isPartial()) {
                lkr2.setSetName(jsy.m(node3));
            }
            if ((node3 = jsy.a("MainSetPlaybackType", node2)) != null && !lkr2.isPartial()) {
                lkr2.adh(jsy.r(node3));
            }
            if ((node3 = jsy.a("ExtraSetPlaybackType", node2)) != null && lkr2.isPartial()) {
                lkr2.adh(jsy.r(node3));
            }
            if ((node3 = jsy.a("ExtraSetPlaybackSpeed", node2)) != null && lkr2.isPartial()) {
                lkr2.iF(jsy.o(node3));
            }
            if ((node3 = jsy.a("MainSetPlaybackSpeed", node2)) != null && !lkr2.isPartial()) {
                lkr2.iF(jsy.o(node3));
            }
            if ((node3 = jsy.a(string = "MainSetAlternativeSets", node2)) != null && !lkr2.isPartial() && (list = this.cw(node3)) != null && !list.isEmpty()) {
                lkr2.ca(list);
            }
            if ((node3 = jsy.a(string = "ExtraSetAlternativeSets", node2)) != null && lkr2.isPartial() && (list = this.cw(node3)) != null && !list.isEmpty()) {
                lkr2.ca(list);
            }
            if ((node3 = jsy.a(string = "EffectList", node2)) == null || (list = this.cx(node3)) == null || list.isEmpty()) continue;
            lkr2.cb(list);
        }
        return lkr2;
    }

    private List<String> cw(Node node) {
        ArrayList<String> arrayList = null;
        List<Node> list = jsy.c("AltSetID", node);
        if (list != null && !list.isEmpty()) {
            arrayList = lcn.emv();
            for (Node node2 : list) {
                String string = jsy.m(node2);
                if (string != null) {
                    arrayList.add(string);
                    continue;
                }
                lfn.b(5, this.getClass().getName(), "getAlternativeSets() : Node AltSetID, is invalid!");
                assert (false);
            }
        }
        return arrayList;
    }

    private List<lkp> cx(Node node) {
        ArrayList<lkp> arrayList = null;
        List<Node> list = jsy.c("Effect", node);
        if (list != null && !list.isEmpty()) {
            arrayList = lcn.emv();
            Iterator<Node> iterator = list.iterator();
            while (iterator.hasNext()) {
                ljq ljq2;
                lkp lkp2 = new lkp();
                Node node2 = iterator.next();
                NamedNodeMap namedNodeMap = node2.getAttributes();
                Node node3 = namedNodeMap.getNamedItem("ID");
                if (node3 != null) {
                    lkp2.ade(Integer.parseInt(node3.getNodeValue()));
                }
                if ((node3 = namedNodeMap.getNamedItem("StartTime")) != null) {
                    lkp2.setStartTime(Float.parseFloat(node3.getNodeValue()));
                }
                if ((node3 = namedNodeMap.getNamedItem("BoneName")) != null) {
                    lkp2.yX(node3.getNodeValue());
                }
                if ((ljq2 = jsy.w(node3 = jsy.a("Offset", node2))) != null) {
                    lkp2.setOffset(ljq2);
                } else {
                    lfn.b(5, this.getClass().getName(), "getAnimationStateEffects() : Node Offset, is invalid!");
                    assert (false);
                }
                arrayList.add(lkp2);
            }
        }
        return arrayList;
    }

    private void a(lkr lkr2, String string) {
        if (string == null) {
            lfn.b(5, this.getClass().getSimpleName(), "addAnimationSpecialEffects() : AnimationFIlename is null!");
            assert (false);
            return;
        }
        String string2 = this.U(string, lkr2.etO());
        DecimalFormat decimalFormat = new DecimalFormat("##");
        decimalFormat.setMinimumIntegerDigits(2);
        for (int i2 = 1; i2 < 5; ++i2) {
            String string3 = decimalFormat.format(i2);
            String string4 = string2 + string3;
            if (!del.iI(string4)) break;
            lkp lkp2 = new lkp();
            lkp2.ade(del.dr(string4));
            List<lkp> list = lkr2.etZ();
            if (list == null) {
                list = lcn.abH(2);
                lkr2.cb(list);
            }
            list.add(lkp2);
        }
    }

    public String U(String string, int n) {
        String string2 = string.toLowerCase();
        int n2 = string2.lastIndexOf(".");
        string2 = string2.substring(0, n2);
        String string3 = lkv.adr((int)n);
        String string4 = "se_animaudio:" + string2 + ":" + string3 + ":";
        return string4;
    }

    private List cy(Node node) {
        ArrayList<String> arrayList = null;
        List<Node> list = jsy.c("AlternativeSet", node);
        if (list != null && !list.isEmpty()) {
            arrayList = lcn.emv();
            for (Node node2 : list) {
                String string = node2.getAttributes().getNamedItem("SetName").getNodeValue();
                if (string != null) {
                    arrayList.add(string);
                    continue;
                }
                lfn.b(5, this.getClass().getName(), "getAlternativeSets() : Node AltSetID, is invalid!");
                assert (false);
            }
        }
        return arrayList;
    }

    private List cz(Node node) {
        ArrayList<String> arrayList = null;
        List<Node> list = jsy.c("ChainedState", node);
        if (list != null && !list.isEmpty()) {
            arrayList = lcn.emv();
            for (Node node2 : list) {
                String string = node2.getAttributes().getNamedItem("StateID").getNodeValue();
                if (string != null) {
                    arrayList.add(string);
                    continue;
                }
                lfn.b(5, this.getClass().getName(), "getChainedStates() : Node ChainedState, is invalid!");
                assert (false);
            }
        }
        return arrayList;
    }

    public void cx(String string) {
        this.bhl = string;
    }
}

