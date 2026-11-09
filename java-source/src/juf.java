/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cug
 *  cxd
 *  cxg
 *  ep
 *  lcw
 */
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class juf {
    private static final String oRK = ".dds";
    private static final String oRL = ".png";
    private static final String oRM = ".bmp";
    private static final lhu oRN = new lhu(32, 32, "gui/resources/doom_01.dds");
    private final jzp oRz = new jzp();
    private final Map oRO = lcn.emw();
    private final List oRP = lcn.abH(100);
    private final List oRQ = lcn.abH(100);
    private final List oRR = lcn.abH(100);
    private final int bnM = 1616;
    private final les ResourceTree = lea.enW();
    private Set<String> oRS;
    private static String oRT = null;
    private static final lgs oRU = new lgs(0, 0, 32, 32);
    private static final boolean oRV = false;
    private static final boolean oRW = true;

    public void We(int n) {
        if (n <= 0) {
            return;
        }
        int n2 = cug.va((int)n);
        if (n2 <= 0) {
            return;
        }
        les les2 = lea.enW();
        lgw lgw2 = (lgw)les2.acv(cug.fjk);
        assert (lgw2 != null);
        this.a(lgw2, les2, n2);
    }

    private void a(lgw lgw2, les les2, int n) {
        lgw lgw3 = (lgw)les2.g(lgw2);
        while (lgw3 != null) {
            if (lgw3.getType() != cug.fmT && lgw3.getType() != cug.fkF && lgw3.getType() != cug.fjt) {
                this.b(lgw3, n);
                this.a(lgw3, les2, n);
            }
            lgw3 = (lgw)les2.h(lgw3);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void b(lgw lgw2, int n) {
        lhu lhu2 = lgw2.atw();
        if (lhu2 == null) {
            return;
        }
        String string = lhu2.Name.replaceAll("//", "/");
        if (string.equalsIgnoreCase("gui/resources/doom_01.dds")) {
            return;
        }
        if (string.equalsIgnoreCase("gui/resources/doom_01.dds")) {
            return;
        }
        if (!string.endsWith(oRK)) {
            return;
        }
        String string2 = cug.c((int)n, (int)lgw2.getType(), (String)string);
        if (string2 == null) {
            return;
        }
        if (lhu2.Name.equals(string2)) {
            return;
        }
        try {
            boolean bl = this.a(string2, lgw2);
            if (bl) return;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void ub(String string) {
        this.a(string, new lju(0, 1, 0), 1, lea.enS());
        this.oRO.clear();
        jpq.anZ();
        jpq.dPt();
    }

    public void uc(String string) {
        this.a(string, new lju(0, 1, 0), 2, lea.enT());
        this.oRO.clear();
        bfk.anZ();
    }

    public void ud(String string) {
        this.a(string, new lju(0, 1, 0), 3, lea.enU());
        this.oRO.clear();
        bkd.anZ();
    }

    public void ue(String string) {
        this.a(string, new lju(0, 1, 0), 4, lea.enV());
        this.oRO.clear();
    }

    public void uf(String string) {
        if (oRT == null) {
            oRT = "mesh_of_doom.xml";
        }
        this.a(string, new lju(0, 1, 0), 5, lea.enW());
        this.dTq();
        this.oRO.clear();
        cug.anZ();
    }

    public void a(String string, les les2) {
        if (oRT == null) {
            oRT = "mesh_of_doom.xml";
        } else if (les2 == null) {
            return;
        }
        les2.clear();
        this.a(string, new lju(0, 1, 0), 5, les2);
        this.oRO.clear();
    }

    public void ug(String string) {
        this.a(string, new lju(0, 1, 0), 6, lea.enZ());
        this.oRO.clear();
        cxd.bfL().initialize();
        if (lcw.qHF != 20) {
            cxg.bfN();
        }
    }

    private void dTq() {
        String string = "xml-files/gamelogicinfo/resourcetree_extra.xml";
        try {
            Document document = jsy.tJ("xml-files/gamelogicinfo/resourcetree_extra.xml");
            Element element = document.getDocumentElement();
            NodeList nodeList = element.getElementsByTagName("ResourceTreeExtra");
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                lgw lgw2;
                Element element2 = (Element)nodeList.item(i2);
                String string2 = element2.getAttribute("Parent");
                if (string2 == null || (lgw2 = (lgw)lea.enW().zx(string2)) == null) continue;
                NodeList nodeList2 = element2.getElementsByTagName("SFListItem");
                for (int i3 = 0; i3 < nodeList2.getLength(); ++i3) {
                    Node node = nodeList2.item(i3);
                    lgw lgw3 = this.ab(node);
                    lea.enW().a((ler)lgw2, lgw3, null);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void a(String string, lju lju2, int n, les les2) {
        if (!jry.tj(string)) {
            return;
        }
        try {
            Document document = jsy.tJ(string);
            jsy.a(document, lju2);
            NodeList nodeList = document.getElementsByTagName("SFListItems");
            Node node = null;
            try {
                node = nodeList.item(0);
            }
            catch (Throwable throwable) {
                throw new bn("Node SFListItems was not found.");
            }
            this.a(node, n, les2);
        }
        catch (Exception exception) {
            throw new bs("Parsing of file '" + string + "' to load " + les2.eqn() + " failed.", exception);
        }
    }

    private void a(Node node, int n, les les2) {
        assert (node != null) : "RootNode is null!";
        assert (les2 != null) : "Tree is null!";
        ler ler2 = null;
        try {
            Node node2 = jsy.d("SFListItem", node);
            switch (n) {
                case 1: {
                    ler2 = this.X(node2);
                    break;
                }
                case 2: {
                    ler2 = this.Y(node2);
                    break;
                }
                case 3: {
                    ler2 = this.Z(node2);
                    break;
                }
                case 4: {
                    ler2 = this.aa(node2);
                    break;
                }
                case 5: {
                    ler2 = this.ab(node2);
                    break;
                }
                case 6: {
                    ler2 = this.ac(node2);
                    break;
                }
                default: {
                    assert (false);
                    break;
                }
            }
            les2.a(null, ler2, null);
            this.a(node2, n, ler2, les2);
        }
        catch (bg bg2) {
            throw new bg("Parsing of node failed: " + ler2 + ". ListItemType=" + n, bg2);
        }
    }

    private void a(Node node, int n, ler ler2, les les2) {
        int n2;
        assert (node != null) : "ItemNode is null!";
        assert (ler2 != null) : "ParentItem is null!";
        assert (les2 != null) : "Tree is null!";
        List<Node> list = jsy.c("SFListItem", node);
        if (list.isEmpty()) {
            return;
        }
        ArrayList<ldi> arrayList = lcn.abH(list.size());
        Node node2 = null;
        ler ler3 = null;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            node2 = list.get(i2);
            assert (node2 != null) : "ChildItemNode is null!";
            try {
                ler3 = null;
                switch (n) {
                    case 2: {
                        ler3 = this.Y(node2);
                        break;
                    }
                    case 1: {
                        ler3 = this.X(node2);
                        break;
                    }
                    case 3: {
                        ler3 = this.Z(node2);
                        break;
                    }
                    case 4: {
                        ler3 = this.aa(node2);
                        break;
                    }
                    case 5: {
                        ler3 = this.ab(node2);
                        break;
                    }
                    case 6: {
                        ler3 = this.ac(node2);
                        break;
                    }
                    default: {
                        assert (false);
                        break;
                    }
                }
            }
            catch (bg bg2) {
                if (ler3 == null) {
                    throw new bg("Parsing of childnode " + i2 + " for node '" + ler2.getName() + "' failed.", bg2);
                }
                throw new bg("Parsing of node failed: " + ler3 + ". ListItemType=" + n, bg2);
            }
            assert (ler3 != null) : "ChildItem is null!";
            arrayList.add((ldi)ler3);
            this.oRO.put(ler3, node2);
        }
        Collections.sort(arrayList);
        ler ler4 = null;
        for (n2 = arrayList.size() - 1; n2 >= 0; --n2) {
            ler3 = (ler)arrayList.get(n2);
            ler4 = n2 == arrayList.size() - 1 ? null : (ler)arrayList.get(n2 + 1);
            les2.a(ler2, ler3, ler4);
        }
        for (n2 = 0; n2 < arrayList.size(); ++n2) {
            ler3 = (ler)arrayList.get(n2);
            node2 = (Node)this.oRO.get(ler3);
            assert (node2 != null);
            this.a(node2, n, ler3, les2);
        }
    }

    private lby X(Node node) {
        assert (node != null);
        lby lby2 = new lby();
        this.a(node, lby2);
        Node node2 = jsy.d("SFBooleanAction", node);
        boolean bl = jsy.t(node2);
        lby2.yd(bl);
        node2 = jsy.d("SFDefaultAxisValue", node);
        float f = jsy.o(node2);
        lby2.na(f);
        node2 = jsy.d("SFTriggerOnActionStart", node);
        boolean bl2 = jsy.t(node2);
        lby2.ye(bl2);
        node2 = jsy.d("SFTriggerOnActionStop", node);
        boolean bl3 = jsy.t(node2);
        lby2.yf(bl3);
        node2 = jsy.d("SFInputTimerLength", node);
        double d2 = jsy.q(node2);
        if (d2 < 0.0 && d2 != -2.0 && d2 != -3.0) {
            throw new bj("Node 'SFInputTimerLength' has invalid value.");
        }
        if (!(d2 != -3.0 || bl2 && bl3)) {
            throw new bj("Action has infinite togglable inputtimer, so it must be triggered both on start and on stop.");
        }
        lby2.dP(d2);
        node2 = jsy.d("SFRepeatAction", node);
        boolean bl4 = jsy.t(node2);
        lby2.yg(bl4);
        return lby2;
    }

    private ldi Y(Node node) {
        List<Node> list;
        String string;
        int n;
        assert (node != null) : "ItemNode is null!";
        ldi ldi2 = new ldi();
        Node node2 = jsy.d("SFName", node);
        String string2 = jsy.m(node2);
        if (string2 == null || string2.trim().equals("")) {
            throw new bj("Node 'SFName' has invalid value.");
        }
        ldi2.setName(string2);
        if (string2.equalsIgnoreCase("Effect")) {
            ldi2.setType(0);
        } else {
            n = ep.as((String)string2);
            if (n <= 0) {
                throw new bj("EffectName '" + string2 + "' is invalid.");
            }
            ldi2.setType(n);
        }
        node2 = jsy.d("SFChildOrder", node);
        n = jsy.r(node2);
        if (n < 0) {
            throw new bj("Node 'SFChildOrder' has invalid value.");
        }
        ldi2.acu(n);
        node2 = jsy.a("SFProtectionName", node);
        String string3 = jsy.m(node2);
        if (string3 == null || string3.trim().equals("")) {
            throw new bj("Node 'SFProtectionName' has invalid value for effect '" + ldi2.getName() + "'");
        }
        if (ldi2.getType() > 0) {
            int n2 = ep.as((String)string3);
            if (n2 > 0) {
                ldi2.acd(n2);
            } else {
                throw new bj("Node 'SFProtectionName' has invalid value for effect '" + ldi2.getName() + "'");
            }
        }
        if ((lcw.ena() || lcw.enb() || lcw.qHF == 20) && (string = jsy.m(node2 = jsy.d("SFEffectIcon", node))) != null && !string.trim().equals("")) {
            ldi2.op(string);
            ldi2.a(new lhu(lcw.qPa, string));
        }
        if ((list = jsy.c("SFAttributeAlteration", node)) != null && list.size() > 0) {
            lce[] lceArray = new lce[list.size()];
            for (int i2 = 0; i2 < list.size(); ++i2) {
                Node node3 = list.get(i2);
                try {
                    lceArray[i2] = new lce();
                    node2 = jsy.d("SFAttributeName", node3);
                    lceArray[i2].bnM = this.oRz.cI(node2);
                    node2 = jsy.d("SFMagnitudeFraction", node3);
                    lceArray[i2].qvU = jsy.o(node2);
                    continue;
                }
                catch (bg bg2) {
                    throw new bg("Parsing of AttributeAlteration " + i2 + " for effect '" + string2 + "' failed.", bg2);
                }
            }
            ldi2.a(lceArray);
        }
        return ldi2;
    }

    private ldu Z(Node node) {
        assert (node != null) : "ItemNode is null!";
        ldu ldu2 = new ldu();
        this.a(node, ldu2);
        return ldu2;
    }

    private lfl aa(Node node) {
        assert (node != null) : "ItemNode is null!";
        lfl lfl2 = new lfl();
        Node node2 = jsy.d("SFName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFName' has invalid value.");
        }
        int n = amh.dn(string);
        if (n <= 0) {
            throw new bj("ObjectName '" + string + "' is invalid.");
        }
        lfl2.setName(string);
        lfl2.setType(n);
        return lfl2;
    }

    private lgw ab(Node node) {
        assert (node != null);
        lgw lgw2 = new lgw();
        this.a(node, (ler)lgw2);
        try {
            String string;
            Node node2 = jsy.d("SFIconFileName", node);
            String string2 = jsy.m(node2);
            if (string2 == null || string2.trim().equals("")) {
                throw new bj("Node 'SFIconFileName' contains invalid value for resource '" + lgw2.getName() + "'");
            }
            lgw2.op(string2);
            if (string2.equalsIgnoreCase("NULL")) {
                lgw2.a(oRN);
                assert (lgw2.atw() != null);
            } else if (lcw.ena() || lcw.enb() || lcw.qHF == 20) {
                try {
                    boolean bl = this.a(string2, lgw2);
                    if (!bl) {
                        throw new bj("Could not create icon SFTexture for resource '" + lgw2.getName() + "'");
                    }
                }
                catch (Exception exception) {
                    throw new bg("Creation of icon SFTexture for resource '" + lgw2.getName() + " failed.", exception);
                }
            }
            if ((string = jsy.m(node2 = jsy.d("SFTargetingIconFileName", node))) == null || string.trim().equals("")) {
                throw new bj("Node 'SFTargetingIconFileName' contains invalid value for resource '" + lgw2.getName() + "'");
            }
            if (string.equalsIgnoreCase("NULL")) {
                string = null;
            } else {
                lgw2.Ac(string);
                lgw2.f(new lhu(lcw.qPq.rmN, lcw.qPq.H, string));
            }
            node2 = jsy.d("SFMeshFileName", node);
            String string3 = jsy.m(node2);
            if (string3 == null || string3.trim().equals("")) {
                throw new bj("Node 'SFMeshFileName' contains invalid value for resource '" + lgw2.getName() + "'");
            }
            if (string3.equalsIgnoreCase("NULL")) {
                string3 = oRT;
            }
            lgw2.jC(string3);
            node2 = jsy.d("SFActivatableActionName", node);
            String string4 = jsy.m(node2);
            if (string4 == null || string4.trim().equals("")) {
                throw new bj("Node 'SFActivatableActionName' contains invalid value for resource '" + lgw2.getName() + "'");
            }
            bqm.a a2 = bqm.a.getActivatableAction(string4);
            if (a2 == null) {
                throw new bj("ActivatableActionName '" + string4 + "' is invalid for resource '" + lgw2.getName() + "'");
            }
            lgw2.a(a2);
            node2 = jsy.d("SFHasResourceFile", node);
            boolean bl = jsy.t(node2);
            lgw2.ys(bl);
            node2 = jsy.d("SFStackable", node);
            boolean bl2 = jsy.t(node2);
            lgw2.yt(bl2);
            node2 = jsy.d("SFLayerName", node);
            String string5 = jsy.m(node2);
            if (string5 == null || string5.trim().equals("")) {
                throw new bj("Node 'SFLayerName' contains invalid value for resource " + lgw2.getName());
            }
            cak.c c2 = cak.c.findLayerType(string5);
            if (c2 == null) {
                throw new bj("LayerName '" + string5 + "' is invalid for resource '" + lgw2.getName() + "'");
            }
            lgw2.b(c2);
            node2 = jsy.d("SFBaseCostValue", node);
            float f = jsy.o(node2);
            if (f < 0.0f) {
                throw new bj("BaseCostValue is invalid.");
            }
            lgw2.np(f);
        }
        catch (bg bg2) {
            throw new bg("Parsing of nodes for resource '" + lgw2.getName() + "' failed.", bg2);
        }
        return lgw2;
    }

    private ler ac(Node node) {
        assert (node != null);
        lhg lhg2 = new lhg();
        this.a(node, lhg2);
        try {
            Node node2 = jsy.d("SFShowInGui", node);
            boolean bl = jsy.t(node2);
            lhg2.yu(bl);
            if (!lcw.enf() || 12 == lcw.qHF) {
                node2 = jsy.d("SFIconDimension", node);
                lhf lhf2 = jsy.p(node2);
                if (lhf2 == null) {
                    throw new bj("Node 'SFIconDimension' has invalid value for skill " + lhg2.getName());
                }
                node2 = jsy.d("SFIconFileName", node);
                String string = jsy.m(node2);
                lhg2.a(new lhu(lhf2.rmN, lhf2.H, string));
            }
            node2 = jsy.d("SFActivatable", node);
            boolean bl2 = jsy.t(node2);
            lhg2.yv(bl2);
            node2 = jsy.d("SFDeselectAfterUse", node);
            boolean bl3 = jsy.t(node2);
            lhg2.yw(bl3);
            node2 = jsy.d("SFCategoryName", node);
            String string = jsy.m(node2);
            if (string == null || string.trim().equals("")) {
                throw new bj("Node 'SFCategoryName' has invalid value.");
            }
            cxd.g g2 = cxd.g.getCategoryType(string);
            if (g2 == null) {
                throw new bj("CategoryName '" + string + "' is invalid.");
            }
            lhg2.a(g2);
            node2 = jsy.d("SFModeName", node);
            String string2 = jsy.m(node2);
            if (string2 == null || string2.trim().equals("")) {
                throw new bj("Node 'SFModeName' has invalid value.");
            }
            cxd.h h2 = cxd.h.getModeType(string2);
            if (h2 == null) {
                throw new bj("ModeName '" + string2 + "' is invalid.");
            }
            lhg2.b(h2);
            node2 = jsy.d("SFEffectImmunity", node);
            float f = jsy.o(node2);
            if (f < 0.0f) {
                throw new bj("EffectImmunity is invalid.");
            }
            lhg2.nq(f);
            node2 = jsy.d("SFDisableParry", node);
            boolean bl4 = jsy.t(node2);
            lhg2.yx(bl4);
            List<Node> list = jsy.c("SFResistanceInfo", node);
            if (list == null || list.isEmpty()) {
                return lhg2;
            }
            boolean bl5 = false;
            boolean bl6 = false;
            dcg[] dcgArray = new dcg[list.size()];
            int n = dcgArray.length;
            for (int i2 = 0; i2 < n; ++i2) {
                Node node3 = list.get(i2);
                node2 = jsy.d("SFResistanceName", node3);
                String string3 = jsy.m(node2);
                if (string3 == null || string3.trim().equals("")) {
                    throw new bj("Node 'SFResistanceName' has invalid value.");
                }
                int n2 = dcg.iD(string3);
                if (n2 <= 0) {
                    throw new bj("ResistanceName '" + string3 + "' is invalid.");
                }
                node2 = jsy.d("SFResistanceSkillName", node3);
                String string4 = jsy.m(node2);
                if (string4 == null) {
                    throw new bj("Node 'SFResistanceSkillName' has null value.");
                }
                dcgArray[i2] = new dcg();
                dcgArray[i2].gcP = n2;
                dcgArray[i2].SkillName = string4;
            }
            lhg2.a(dcgArray);
        }
        catch (bg bg2) {
            throw new bg("Parsing of nodes for skill '" + lhg2.getName() + "' failed.", bg2);
        }
        return lhg2;
    }

    private void a(Node node, ler ler2) {
        assert (node != null);
        assert (ler2 != null);
        Node node2 = jsy.d("SFName", node);
        String string = jsy.m(node2);
        if (string == null || string.trim().equals("")) {
            throw new bj("Node 'SFName' has invalid value.");
        }
        ler2.setName(string);
        node2 = jsy.d("SFValue", node);
        int n = jsy.r(node2);
        if (n < 0) {
            throw new bj("Node 'SFValue' has invalid value.");
        }
        ler2.setType(n);
        node2 = jsy.d("SFChildOrder", node);
        int n2 = jsy.r(node2);
        if (n2 < 0) {
            throw new bj("Node 'SFChildOrder' has invalid value.");
        }
        ler2.acu(n2);
        node2 = jsy.d("SFDescription", node);
        String string2 = jsy.m(node2);
        if (string2 == null) {
            string2 = "";
        }
        ler2.setDescription(string2);
    }

    private boolean a(String string, lgw lgw2) {
        lgs lgs2;
        lgs lgs3;
        if (string == null || string.trim().equals("")) {
            return false;
        }
        int n = string.lastIndexOf(47);
        if (n == -1) {
            n = string.lastIndexOf(92);
        }
        n = n == -1 ? 0 : ++n;
        int n2 = string.length() - oRK.length();
        if (!(n2 >= 0 && string.substring(n2).equals(oRK) || (n2 = string.length() - oRM.length()) >= 0 && string.substring(n2).equals(oRM) || (n2 = string.length() - oRL.length()) >= 0 && string.substring(n2).equals(oRL))) {
            n2 = -1;
        }
        if (n2 < 0) {
            return false;
        }
        String string2 = string.substring(n, n2);
        if (!cug.ie((String)string2) || lcw.qOR) {
            lgw2.a(new lhu(32, 32, string));
            lgw2.b(lcw.enh());
            lgs lgs4 = new lgs(0, 0, 32, 32);
            lgw2.z(lgs4);
            lgw2.A(lgs4);
            return true;
        }
        String string3 = "bitmap/" + string2 + "_s.bmp";
        lcf lcf2 = null;
        if (lcw.qOR) {
            try {
                lcf2 = lio.Aq(string3);
            }
            catch (FileNotFoundException fileNotFoundException) {
                lcf2 = null;
            }
            catch (Exception exception) {
                lcf2 = null;
            }
        }
        if (lcf2 == null) {
            lcf2 = lcw.enh();
            lgs3 = oRU;
            lgs2 = oRU;
        } else {
            lgs3 = this.a(lcf2);
            lgs2 = this.a(lcf2, lgs3);
        }
        lgw2.a(new lhu(lcf2.getWidth(), lcf2.getHeight(), string));
        lgw2.b(lcf2);
        lgw2.z(lgs3);
        lgw2.A(lgs2);
        return true;
    }

    private lgs a(lcf lcf2) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5 = lcf2.getWidth() / 2;
        int n6 = lcf2.getHeight() / 2;
        int n7 = 0;
        for (n4 = 0; n4 < n6 && (n7 = lcf2.an(n4, false)) >= lcf2.getWidth(); ++n4) {
        }
        int n8 = 0;
        for (n3 = lcf2.getHeight() - 1; n3 >= n6 && (n8 = lcf2.an(n3, false)) >= lcf2.getWidth(); --n3) {
        }
        int n9 = 0;
        for (n2 = 0; n2 < n5 && (n9 = lcf2.ao(n2, false)) >= lcf2.getHeight(); ++n2) {
        }
        int n10 = 0;
        for (n = lcf2.getWidth() - 1; n >= n5 && (n10 = lcf2.ao(n, false)) >= lcf2.getHeight(); --n) {
        }
        this.a(lcf2, n7, n4);
        this.a(lcf2, n8, n3);
        this.a(lcf2, n2, n9);
        this.a(lcf2, n, n10);
        return new lgs(n2, n4, n - n2, n3 - n4);
    }

    private lgs a(lcf lcf2, lgs lgs2) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5 = lcf2.getWidth() / 2;
        int n6 = lcf2.getHeight() / 2;
        for (n4 = lgs2.cg; n4 < n6 && lcf2.an(n4, false) >= lcf2.getWidth(); ++n4) {
        }
        for (n3 = lgs2.cjG(); n3 >= n6 && lcf2.an(n3, false) >= lcf2.getWidth(); --n3) {
        }
        for (n2 = lgs2.cf; n2 < n5 && lcf2.ao(n2, false) >= lcf2.getHeight(); ++n2) {
        }
        for (n = lgs2.erB(); n >= n5 && lcf2.ao(n, false) >= lcf2.getHeight(); --n) {
        }
        return new lgs(n2, n4, n - n2, n3 - n4);
    }

    private void a(lcf lcf2, int n, int n2) {
        if (n >= lcf2.getWidth() || n2 >= lcf2.getHeight()) {
            return;
        }
        if (!this.b(lcf2, n - 1, n2)) {
            return;
        }
        if (!this.b(lcf2, n + 1, n2)) {
            return;
        }
        if (!this.b(lcf2, n, n2 - 1)) {
            return;
        }
        if (!this.b(lcf2, n, n2 + 1)) {
            return;
        }
        lcf2.i(n, n2, true);
    }

    private boolean b(lcf lcf2, int n, int n2) {
        if (n < 0 || n >= lcf2.getWidth()) {
            return true;
        }
        if (n2 < 0 || n2 >= lcf2.getHeight()) {
            return true;
        }
        return lcf2.fN(n, n2);
    }
}

