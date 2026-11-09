/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  dta
 *  jxb
 *  lcr
 *  lcw
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jxd {
    private jsa nWd = null;
    private final lju fzk = new lju(0, 1);
    private jwk oYT;
    private jxb oXe;
    private String oYU = "xml-files/objectspace/";
    private ldv Rr = null;
    private boolean oYV = false;
    private cuh Yx = null;
    private final boolean bC = false;
    private ldw gZO = null;
    private boolean oYW = false;
    private jww oYX;
    private final String bP = "[a-zA-Z][a-fA-F]{0,1}[0-9]{2}";
    private final String nUS = "terrain_";
    private ldv hac = null;
    private final String[] oYY = new String[]{"sidewalks_human_capital", "human_castlewall_", "water_level", "waterplain", "waterplane", "moat", "pond", "lake", "capital_sidewalks_", "capital_wall", "river", "waterfall", "mahirim_capital_logs", "mahirim_capital_bridges", "mahirim_capital_formwork", "mahirim_capital_towers", "mahirim_moontower"};
    private boolean oYZ;
    private boolean oZa;
    private boolean oZb;
    private boolean oZc;
    private boolean oYS;

    public jxd() {
        this.oYU = this.oYU.toLowerCase();
    }

    public void b(jsa jsa2) {
        this.nWd = jsa2;
        if (this.nWd != null) {
            this.Yx = this.nWd.dSa();
        }
    }

    private ldv bY(int n, int n2) {
        assert (this.gZO != null) : "GUIDServer is null!";
        if (n != this.gZO.enD().enw()) assert (false) : "This is OS [" + this.gZO.enD().enw() + "], Trying to create GUID for OS [" + n + "]";
        return this.gZO.Wk(n2);
    }

    private void lK(ldv ldv2) {
        assert (this.gZO != null) : "GUIDServer is null!";
        if (ldv2.enw() != this.gZO.enD().enw()) {
            // empty if block
        }
        this.gZO.lK(ldv2);
    }

    private ldv lL(ldv ldv2) {
        assert (this.gZO != null) : "GUIDServer is null!";
        return ldx.enG().fS(ldv2.ib(), ldv2.enw()).lL(ldv2);
    }

    private final boolean tn(ldv ldv2) {
        assert (this.gZO != null) : "GUIDServer is null!";
        return this.gZO.tn(ldv2);
    }

    public void vc(String string) {
        Document document = null;
        try {
            document = jsy.tJ("xml-files/objectspace/" + string);
        }
        catch (bo bo2) {
            return;
        }
        this.h(document, string);
        this.gZO = null;
        mje.ezD();
    }

    private void h(Document document, String string) {
        boolean bl;
        assert (this.nWd != null) : "Cannot Load OS if IOModuleManager is null!";
        Node node = jsy.a("SFObjectSpace", (Node)document);
        if (node == null) {
            assert (false);
            return;
        }
        Map<ldv, amf> map = null;
        lju lju2 = jsy.c(document);
        if (!this.fzk.b(lju2)) assert (false);
        int n = 0;
        String string2 = "ObjectSpaceType";
        Node node2 = jsy.a(string2, node);
        if (node2 != null) {
            n = jsy.r(node2);
        }
        if (n == 3 && !lcw.qHe) {
            return;
        }
        node2 = jsy.a("ObjectSpaceGuid", node);
        if (node2 != null) {
            int bl2 = jsy.r(node2);
            this.gZO = n == 8 && lcw.enb() ? ldx.enG().fS(7000, bl2) : (n == 9 && lcw.enb() || n == 15 && lcw.enb() ? ldx.enG().fS(1024, bl2) : ldx.enG().aci(bl2));
            this.Rr = this.bY(bl2, 0);
            if (this.tn(this.Rr) && this.Wn(n) && n != 9) {
                return;
            }
        } else assert (false);
        boolean bl3 = true;
        node2 = jsy.a("Active", node);
        if (node2 != null) {
            bl = jsy.t(node2);
        }
        boolean bl4 = false;
        node2 = jsy.a("Locked", node);
        if (node2 != null) {
            bl4 = jsy.t(node2);
        }
        if (this.Rr != null) {
            dta dta2 = new dta();
            dta2.setGUID(this.Rr);
            dta2.setObjectDescriptionFilename(string);
            dta2.setActive(bl);
            dta2.aB(bl4);
            dta2.Ca(n);
            if (this.hac != null) {
                dta2.ob(this.hac);
            }
            this.oXe = new jxb(this.Rr);
            this.oXe.a(this.nWd);
            this.oXe.a(this.Yx);
            this.oYT = new jwk(this.Rr);
            map = lcn.emw();
            this.n(document, string);
            this.a(document, node, map);
            this.R(map);
            for (amf amf2 : map.values()) {
                if (!(amf2 instanceof bdl)) continue;
                this.oYT.a((bdl)((Object)amf2));
            }
            this.S(map);
            if (this.Wn(n) && !this.tn(this.Rr)) {
                this.nWd.f(dta2);
                this.lK(this.Rr);
                grk grk2 = new grk();
                grk2.Kz(3);
                grk2.setActive(dta2.isActive());
                grk2.aB(dta2.isLocked());
                grk2.on(dta2.getGUID());
                grk2.f(lcr.qzt);
                this.nWd.a(grk2);
                dta2.setActive(true);
                dta2.aB(false);
            }
        } else {
            return;
        }
    }

    private void R(Map<ldv, amf> map) {
        btk btk2;
        ldv ldv2;
        Iterator<amf> iterator = map.values().iterator();
        amf amf2 = null;
        if (iterator != null) {
            while (iterator.hasNext()) {
                amf2 = iterator.next();
                if (!(amf2 instanceof btk) || (ldv2 = (btk2 = (btk)amf2).getGUID()).tV(lcr.qzh)) continue;
                this.lK(ldv2);
            }
        }
        iterator = map.values().iterator();
        amf2 = null;
        if (iterator != null) {
            while (iterator.hasNext()) {
                amf2 = iterator.next();
                if (!(amf2 instanceof btk) || !(ldv2 = (btk2 = (btk)amf2).getGUID()).tV(lcr.qzh)) continue;
                ldv2 = this.lL(this.Rr);
                btk2.setGUID(ldv2);
                this.lK(ldv2);
            }
        }
    }

    private boolean Wn(int n) {
        switch (n) {
            case 7: {
                return false;
            }
        }
        return true;
    }

    private void S(Map<ldv, amf> map) {
        Iterator<amf> iterator = null;
        Object var3_3 = null;
        amf amf2 = null;
        iterator = map.values().iterator();
        if (iterator != null) {
            while (iterator.hasNext()) {
                Object object;
                Object object2;
                amf amf3;
                amf2 = iterator.next();
                if (amf2 instanceof btk) {
                    amf3 = (btk)amf2;
                    this.nWd.t(amf3);
                    continue;
                }
                if (!(amf2 instanceof dul)) continue;
                amf3 = (dul)amf2;
                ldv ldv2 = ((dul)amf3).Bq();
                ldv ldv3 = this.bY(this.Rr.enw(), ldv2.enx());
                btk btk2 = (btk)map.get(ldv2);
                if (btk2 == null) {
                    object2 = map.get(ldv3);
                    if (object2 == null) {
                        lfn.b(0, "SFObjectSpaceParser", "traverseObjectCollection(): object collection did not contain an object for startpoint " + ldv3);
                    } else if (object2 instanceof btk) {
                        btk2 = (btk)object2;
                    } else {
                        lfn.b(0, "SFObjectSpaceParser", "traverseObjectCollection(): Expected SFLogicObject, got " + object2.getClass().getName() + " GUID=" + ((amf)object2).getGUID());
                    }
                }
                object2 = ((dul)amf3).Br();
                ldv ldv4 = this.bY(this.Rr.enw(), ((ldv)object2).enx());
                btk btk3 = (btk)map.get(object2);
                if (btk3 == null) {
                    object = map.get(ldv4);
                    if (object == null) {
                        lfn.b(0, "SFObjectSpaceParser", "traverseObjectCollection(): object collection did not contain an object for endpoint " + ldv4);
                    } else if (object instanceof btk) {
                        btk3 = (btk)object;
                    } else {
                        lfn.b(0, "SFObjectSpaceParser", "traverseObjectCollection(): Expected SFLogicObject, got " + object.getClass().getName() + " GUID=" + ((amf)object).getGUID());
                    }
                }
                if (btk2 != null && btk3 != null) {
                    object = (geg)this.nWd.d(769);
                    ((dxq)object).on(this.Rr);
                    ((dxq)object).f(this.Rr);
                    ((geg)object).blo = btk2.getGUID();
                    ((geg)object).blp = btk3.getGUID();
                    ((geg)object).gqN = ((dul)amf3).getRelationType();
                    this.nWd.a((dxq)object);
                    continue;
                }
                lfn.b(5, this.getClass().getSimpleName(), "Found no Object for StartPointGUID " + ldv2 + ", or EndPointGUID " + object2);
                lfn.b(5, this.getClass().getSimpleName(), "Found no Object for StartPointGUID " + ldv3 + ", or EndPointGUID " + ldv4);
            }
        } else {
            lfn.b(5, this.getClass().getSimpleName(), "Iterator is NULL!");
        }
    }

    private void a(Document document, Node node, Map<ldv, amf> map) {
        if (node.hasChildNodes()) {
            NodeList nodeList = node.getChildNodes();
            int n = nodeList.getLength();
            for (int i2 = 0; i2 < n; ++i2) {
                int n2;
                int n3;
                Object object;
                Object object2;
                Object object3;
                if (nodeList.item(i2).getNodeType() == 3 || nodeList.item(i2).getNodeType() == 8 || (object3 = this.oXe.bk(nodeList.item(i2))) == null) continue;
                Node node2 = jsy.a("Guid", nodeList.item(i2));
                if (node2 != null) {
                    object2 = ((amf)object3).getGUID();
                    object = (Attr)node2.getAttributes().getNamedItem("GroupOS");
                    if (object != null) {
                        n3 = Integer.parseInt(object.getValue());
                        object = (Attr)node2.getAttributes().getNamedItem("GroupID");
                        if (object != null) {
                            n2 = Integer.parseInt(object.getValue());
                            mje.DCi.put((ldv)object2, new ldv(((ldv)object2).ib(), n3, n2));
                        }
                    }
                    if ((object = (Attr)node2.getAttributes().getNamedItem("Category")) != null) {
                        String string = String.valueOf(object.getValue());
                        mje.DCj.put((ldv)object2, string);
                    }
                }
                if (object3 instanceof btl) {
                    lfn.b(5, this.getClass().getSimpleName(), "traverseNodes() : Logicobject loading not supported!");
                    continue;
                }
                if (object3 instanceof bdm && (nodeList.item(i2).getNodeName().equals("SFObjectModuleCollectionDescription") || nodeList.item(i2).getNodeName().equals("SFObjectCollectionDescription"))) {
                    object2 = null;
                    if (((amf)object3).getObjectDescriptionFilename() == null) {
                        this.oYT.cT(false);
                        object2 = this.oYT.a(nodeList.item(i2), (bdm)object3);
                        if (object2 == null) {
                            lfn.b(5, this.getClass().getSimpleName(), "traverseNodes() : Error!");
                            assert (false);
                            throw new bs("Collection is null!");
                        }
                        object2.d(new ljq(0.0f, 0.0f, 0.0f));
                        this.oYT.cT(true);
                        if (this.oYV) {
                            object = null;
                            List<amf> list = ((bdl)((Object)object2)).ame();
                            for (n2 = 0; n2 < list.size(); ++n2) {
                                object = list.get(n2);
                                map.put(((amf)object).getGUID(), (amf)object);
                                if (!(object instanceof dqk)) continue;
                            }
                        }
                    } else assert (false) : "Wrong NodeName [" + nodeList.item(i2) + "] for non-inline Collection!";
                    if (object2 != null) {
                        object3 = object2;
                    } else {
                        lfn.b(5, this.getClass().getSimpleName(), "Returned NULL SFModuleCollection");
                    }
                } else if (object3 instanceof bdm) {
                    this.gZO.lK(((amf)object3).getGUID());
                    object3 = this.oYT.a((bdm)object3);
                } else if (object3 instanceof bpv) {
                    if (!this.oYV) {
                        this.oYX = new jww(this.Rr, this.nWd);
                        this.oYX.a((bpv)object3);
                        if (lcw.qHe) {
                            object2 = this.oYX.b((bpv)object3);
                            ((amf)object2).setGUID(((amf)object3).getGUID());
                            ((amf)object2).setObjectType(45);
                            object3 = object2;
                        }
                    }
                } else if (object3 instanceof lhj) {
                    assert (false) : "Wrong type of parsing for specialEffect, idjits!";
                    object2 = (lhj)object3;
                    object = (glh)this.nWd.d(13057);
                    ((dxq)object).on(lcr.qEa);
                    ((dxq)object).f(lcr.qAE);
                    ((glh)object).setDuration(-2.0f);
                    ((glh)object).setTargetPosition(((lhj)object2).getTargetPosition());
                    n3 = 8;
                    if (((lhj)object2).getSourcePosition() != null) {
                        ((glh)object).setSourcePosition(((lhj)object2).getSourcePosition());
                        n3 |= 2;
                    }
                    ((glh)object).JQ(n3);
                    ((glh)object).setSpecialEffectType(del.dr(((lhj)object2).getSpecialEffectName()));
                    this.nWd.a((dxq)object);
                    object3 = null;
                }
                if (object3 instanceof dqk && !this.c((dqk)object3)) {
                    lfn.b(5, this.getClass().getSimpleName(), "traverseNodes() : Object [" + object3 + "] is not within WorldBounds!!");
                    object3 = null;
                }
                if (object3 instanceof dqn) {
                    if (((amf)object3).getGUID().ib() == 1024) {
                        ((dqn)object3).setServerObject(false);
                        ((dqn)object3).ju(((amf)object3).getGUID());
                    } else if (lcw.ena()) {
                        ((dqn)object3).setServerObject(false);
                        ((dqn)object3).ju(((amf)object3).getGUID());
                    }
                }
                if (object3 == null) continue;
                map.put(((amf)object3).getGUID(), (amf)object3);
            }
        }
    }

    private boolean c(dqk dqk2) {
        ljq ljq2 = dqk2.av();
        return ljq2.esH();
    }

    private void n(Document document, String string) {
        Node node = jsy.a("SFObjectSpace", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getSimpleName(), "SFFile [" + string + "] is invalid. Contains no SFObjectSpace node!");
            return;
        }
        NodeList nodeList = document.getElementsByTagName("Guid");
        int n = nodeList.getLength();
        for (int i2 = 0; i2 < n; ++i2) {
            Node node2 = nodeList.item(i2);
            int n2 = jsy.r(node2);
            ldv ldv2 = new ldv(this.Rr.ib(), this.Rr.enw(), n2);
            this.lK(ldv2);
        }
    }

    public ldv A(jrw jrw2) {
        Document document;
        String string;
        block3: {
            string = "ObjectSpaceFile [" + jrw2 + "] could not be parsed!";
            Object var3_3 = null;
            document = null;
            try {
                document = jsy.n(jrw2);
            }
            catch (bo bo2) {
                lfn.b(5, this.getClass().getSimpleName(), "getObjectSpaceGUID() : " + string);
                if ($assertionsDisabled) break block3;
                throw new AssertionError();
            }
        }
        if (document == null) assert (false) : string;
        return this.t(document);
    }

    public ldv t(Document document) {
        Node node = jsy.a("SFObjectSpace", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getSimpleName(), "ObjectSpace [" + document.getDocumentURI() + "] is invalid! Doc = " + document.getDocumentElement());
            assert (false);
            return null;
        }
        lju lju2 = jsy.c(document);
        if (!this.fzk.b(lju2)) {
            lfn.b(5, this.getClass().getSimpleName(), "\n######################################## LOAD ERROR ########################################\nSFWorlddataFileParser: Version (" + lju2.getMajor() + "," + lju2.getMinor() + ") not supported! Could not load world data!" + "\n######################################## LOAD ERROR ########################################\n");
            assert (false);
            return null;
        }
        int n = 0;
        Node node2 = jsy.a("ObjectSpaceGuid", node);
        if (node2 == null) {
            lfn.b(5, this.getClass().getSimpleName(), "getObjectSpaceGUID() : Did not find ObjectSpace GUID Node!");
            assert (false);
        }
        int n2 = jsy.r(node2);
        this.gZO = n == 8 && lcw.enb() ? ldx.enG().fS(7000, n2) : ldx.enG().aci(n2);
        this.Rr = this.bY(n2, 0);
        return this.Rr;
    }

    public int u(Document document) {
        Node node = jsy.a("SFObjectSpace", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getSimpleName(), "ObjectSpace [" + document.getDocumentURI() + "] is invalid! Doc = " + document.getDocumentElement());
            assert (false);
            return -1;
        }
        lju lju2 = jsy.c(document);
        if (!this.fzk.b(lju2)) {
            lfn.b(5, this.getClass().getSimpleName(), "\n######################################## LOAD ERROR ########################################\nSFWorlddataFileParser: Version (" + lju2.getMajor() + "," + lju2.getMinor() + ") not supported! Could not load world data!" + "\n######################################## LOAD ERROR ########################################\n");
            assert (false);
            return -1;
        }
        int n = 0;
        String string = "ObjectSpaceType";
        Node node2 = jsy.a(string, node);
        if (node2 == null) {
            lfn.b(0, this.getClass().getSimpleName(), "Node [" + string + "] not found");
            assert (false);
            return -1;
        }
        n = jsy.r(node2);
        return n;
    }

    public ljq B(jrw jrw2) {
        Document document;
        ljq ljq2;
        String string;
        block4: {
            string = "ObjectSpaceFile [" + jrw2 + "] could not be parsed!";
            ljq2 = null;
            document = null;
            try {
                document = jsy.n(jrw2);
            }
            catch (bo bo2) {
                lfn.b(5, this.getClass().getSimpleName(), "getTilePositionFromObjectSpace() : " + string);
                if ($assertionsDisabled) break block4;
                throw new AssertionError();
            }
        }
        if (document == null) assert (false) : string;
        this.oYW = true;
        Map<ldv, amf> map = this.a(jrw2, document, jrw2.getName(), true);
        for (amf amf2 : map.values()) {
            if (!(amf2 instanceof dqk) || !this.tv(amf2.getObjectDescriptionFilename())) continue;
            ljq2 = ((dqk)amf2).av();
        }
        return ljq2;
    }

    public boolean C(jrw jrw2) {
        Document document;
        String string;
        block4: {
            string = "ObjectSpaceFile [" + jrw2 + "] could not be parsed!";
            document = null;
            try {
                document = jsy.n(jrw2);
            }
            catch (bo bo2) {
                lfn.b(5, this.getClass().getSimpleName(), "getTilePositionFromObjectSpace() : " + string);
                if ($assertionsDisabled) break block4;
                throw new AssertionError();
            }
        }
        if (document == null) assert (false) : string;
        this.oYW = true;
        Map<ldv, amf> map = this.a(jrw2, document, jrw2.getName(), true);
        for (amf amf2 : map.values()) {
            if (!(amf2 instanceof dqk) || !this.tv(amf2.getObjectDescriptionFilename())) continue;
            return amf2.getObjectType() == 24;
        }
        return false;
    }

    public boolean D(jrw jrw2) {
        Document document;
        String string;
        block4: {
            string = "ObjectSpaceFile [" + jrw2 + "] could not be parsed!";
            Object var3_3 = null;
            document = null;
            try {
                document = jsy.n(jrw2);
            }
            catch (bo bo2) {
                lfn.b(5, this.getClass().getSimpleName(), "getTilePositionFromObjectSpace() : " + string);
                if ($assertionsDisabled) break block4;
                throw new AssertionError();
            }
        }
        if (document == null) assert (false) : string;
        this.oYW = true;
        Map<ldv, amf> map = this.a(jrw2, document, jrw2.getName(), true);
        for (amf amf2 : map.values()) {
            if (!(amf2 instanceof dqk) || !this.tv(amf2.getObjectDescriptionFilename())) continue;
            String string2 = amf2.getObjectDescriptionFilename();
            string2 = lcw.qLb + "/" + "xml/" + string2;
            jrw jrw3 = new jrw(string2);
            string2 = jrw3.getName();
            if (!jrw3.exists()) continue;
            return true;
        }
        return false;
    }

    public boolean E(jrw jrw2) {
        int n;
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
        }
        return document != null && (n = this.u(document)) == 1;
    }

    public Map<ldv, amf> b(jrw jrw2, String string, boolean bl) {
        return this.a(jrw2, string, bl, false);
    }

    public Map<ldv, amf> c(jrw jrw2, String string, boolean bl) {
        this.oYS = true;
        Map<ldv, amf> map = this.a(jrw2, string, bl, false);
        this.oYS = false;
        return map;
    }

    public Map<ldv, amf> a(jrw jrw2, String string, boolean bl, boolean bl2) {
        this.oYZ = bl2;
        this.oZa = bl2;
        this.oZb = true;
        this.oZc = true;
        Document document = jsy.tK("xml-files/objectspace/" + string);
        if (document != null) {
            return this.a(jrw2, document, string, bl);
        }
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            bo2.printStackTrace();
        }
        if (document != null) {
            return this.a(jrw2, document, string, bl);
        }
        lfn.b(5, this.getClass().getSimpleName(), "Document returned was NULL!");
        return null;
    }

    public Map<ldv, amf> f(jrw jrw2, String string) {
        this.oYZ = false;
        this.oZa = false;
        this.oZb = false;
        this.oZc = false;
        Document document = jsy.tK("xml-files/objectspace/" + string);
        if (document != null) {
            return this.a(jrw2, document, string, false);
        }
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            bo2.printStackTrace();
        }
        if (document != null) {
            return this.a(jrw2, document, string, false);
        }
        lfn.b(5, this.getClass().getSimpleName(), "Document returned was NULL!");
        return null;
    }

    public Map<ldv, amf> c(jrw jrw2, boolean bl) {
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            bo2.printStackTrace();
        }
        if (document != null) {
            return this.a(jrw2, document, jrw2.getName(), bl);
        }
        lfn.b(5, this.getClass().getSimpleName(), "Document returned was NULL!");
        return null;
    }

    private Map<ldv, amf> a(jrw jrw2, Document document, String string, boolean bl) {
        String string2;
        int n;
        this.oYV = true;
        NodeList nodeList = document.getElementsByTagName("SFObjectSpace");
        Map<ldv, amf> map = lcn.emw();
        if (nodeList == null) {
            lfn.b(5, this.getClass().getSimpleName(), "ObjectSpace file [" + string + "] is invalid!");
            return map;
        }
        Node node = nodeList.item(0);
        lju lju2 = jsy.c(document);
        if (lju2.getMajor() != 0 || lju2.getMinor() != 1) {
            lfn.b(5, this.getClass().getSimpleName(), "\n######################################## LOAD ERROR ########################################\nSFWorlddataFileParser: Version (" + lju2.getMajor() + "," + lju2.getMinor() + ") not supported! Could not load world data!\n######################################## LOAD ERROR ########################################\n");
            return map;
        }
        int n2 = 0;
        Node node2 = jsy.a("ObjectSpaceType", node);
        if (node2 != null) {
            n2 = jsy.r(node2);
        }
        nodeList = document.getElementsByTagName("ObjectSpaceGuid");
        int n3 = nodeList.getLength();
        for (int i2 = 0; i2 < n3; ++i2) {
            n = jsy.r(nodeList.item(0));
            this.gZO = ldx.enG().aci(n);
            this.Rr = this.bY(n, 0);
        }
        nodeList = document.getElementsByTagName("ObjectSpaceName");
        try {
            string2 = jsy.m(nodeList.item(0));
        }
        catch (Throwable throwable) {
            string2 = "noname";
        }
        if (this.Rr != null) {
            this.oXe = new jxb(this.Rr);
            this.oXe.uZ(this.oYS);
            this.oXe.a(this.nWd);
            this.oYT = new jwk(this.Rr);
            map = lcn.emw();
            if (this.F(jrw2) && bl || this.oYW) {
                this.a(document, node, map, string);
            } else {
                this.a(document, node, map);
                this.R(map);
                boolean bl2 = false;
                n3 = 0;
                n = 0;
                boolean bl3 = false;
                boolean bl4 = false;
                for (amf amf2 : map.values()) {
                    String string3;
                    if (amf2 instanceof bdl) {
                        this.oYT.a((bdl)((Object)amf2));
                    }
                    if (this.oYZ) {
                        if (amf2 instanceof dsn) {
                            n3 = 1;
                        } else if (amf2 instanceof dqk && (string3 = ((dqk)amf2).getObjectDescriptionFilename()).contains("clan_cities")) {
                            bl2 = true;
                        }
                    }
                    if (this.oZa && amf2 instanceof dqk && (string3 = ((dqk)amf2).getObjectDescriptionFilename().toLowerCase()).contains("player_housing")) {
                        n = 1;
                    }
                    if (this.oZb && amf2 instanceof dqk && ((string3 = ((dqk)amf2).getObjectDescriptionFilename().toLowerCase()).contains("sea_fortress_base_01") || string3.contains("sea_fortress_new_base_01"))) {
                        bl3 = true;
                    }
                    if (!this.oZc || !(amf2 instanceof dqk) || !(string3 = ((dqk)amf2).getObjectDescriptionFilename().toLowerCase()).contains("trading_route_base")) continue;
                    bl4 = true;
                }
                if (bl2 && n3 != 0) {
                    lfn.b(0, this.getClass().getSimpleName(), "getObjectsFromdocument() : ObjectSpace [" + string + "] is a City OS! Skipping!");
                    map.clear();
                }
                if (n != 0) {
                    lfn.b(0, this.getClass().getSimpleName(), "getObjectsFromdocument() : ObjectSpace [" + string + "] is a Village OS! Skipping!");
                    map.clear();
                }
                if (bl3) {
                    lfn.b(0, this.getClass().getSimpleName(), "getObjectsFromdocument() : ObjectSpace [" + string + "] is a Fortress OS! Skipping!");
                    map.clear();
                }
                if (bl4) {
                    lfn.b(0, this.getClass().getSimpleName(), "getObjectsFromdocument() : ObjectSpace [" + string + "] is a TradeRoute OS! Skipping!");
                    map.clear();
                }
            }
            return map;
        }
        lfn.b(5, this.getClass().getSimpleName(), " COULD NOT FIND OS GUID !!");
        return map;
    }

    private void a(Document document, Node node, Map<ldv, amf> map, String string) {
        if (node.hasChildNodes()) {
            NodeList nodeList = node.getChildNodes();
            ArrayList<Node> arrayList = lcn.abH(nodeList.getLength());
            int n = arrayList.size();
            for (int i2 = 0; i2 < n; ++i2) {
                arrayList.add(nodeList.item(i2));
            }
            string = jry.tu(string);
            for (Node node2 : arrayList) {
                dqk dqk2;
                if (!node2.getNodeName().equals("SFWorldMeshObject") || (dqk2 = this.oXe.bl(node2)) == null) continue;
                String string2 = dqk2.getObjectDescriptionFilename();
                string2 = lcw.qLb + "/" + "xml/" + string2;
                jrw jrw2 = new jrw(string2);
                string2 = jrw2.getName();
                if (!jrw2.exists()) {
                    lfn.b(4, this.getClass().getSimpleName(), "getTileMeshFromTileOS() : Object [" + jrw2 + "] does not exist!");
                }
                string2 = jry.tu(string2).toLowerCase();
                for (int i3 = 0; i3 < this.oYY.length; ++i3) {
                    String string3 = this.oYY[i3];
                    if (!string2.contains(string3)) continue;
                }
                map.put(dqk2.getGUID(), (amf)dqk2);
            }
        }
    }

    private boolean F(jrw jrw2) {
        String string = jry.tu(jrw2.getName());
        return Pattern.matches("[a-zA-Z][a-fA-F]{0,1}[0-9]{2}", string);
    }

    private boolean tv(String string) {
        String string2 = jry.tu(string);
        if (!(string2 = string2.toLowerCase()).startsWith("terrain_")) {
            return false;
        }
        return Pattern.matches("[a-zA-Z][a-fA-F]{0,1}[0-9]{2}", string2 = string2.substring("terrain_".length()));
    }

    public final boolean dUx() {
        return this.oYW;
    }

    public final void va(boolean bl) {
        this.oYW = bl;
    }

    public ldv bQt() {
        return this.hac;
    }

    public void ob(ldv ldv2) {
        this.hac = ldv2;
    }
}

