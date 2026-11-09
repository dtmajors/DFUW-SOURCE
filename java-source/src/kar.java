/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  cbx
 *  cdb
 *  cug
 *  ep
 *  lcw
 */
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class kar {
    private final jta oQa = new jta();
    private final kal oRX = new kal();
    private kbs pbd = null;
    private final les dqt = lea.enU();
    private final les ResourceTree = lea.enW();
    private final les aqN = lea.enZ();

    public kar() {
        this.pbd = new kbs(this);
    }

    public void a(cbx cbx2, String string, String string2) {
        this.a(cbx2, string, string2, null);
    }

    public void a(cbx cbx2, String string, String string2, ase ase2) {
        String string3 = lcw.qLb + string + string2 + ".xml";
        lfn.b(0, "SFResourceWriter", "writeResource() FilePath: '" + string3 + "'");
        Document document = this.oQa.dSD();
        Element element = this.oQa.a(document, "SFResource", new lju(0, 3, 0));
        document.appendChild(element);
        switch (cbx2.getObjectType()) {
            case 30: {
                this.a(document, (Node)element, cbx2, string);
                break;
            }
            case 111: 
            case 112: 
            case 125: {
                this.a(document, element, (cdw)cbx2, string, ase2);
                break;
            }
            case 114: {
                this.a(document, (Node)element, (cev)cbx2, string);
                break;
            }
            default: {
                lfn.b(5, "SFResourceWriter", "writeResource() Invalid ObjectType provided: " + cbx2.getObjectType());
                assert (false);
                return;
            }
        }
        jsz.a(document, new jrw(string3));
    }

    private void a(Document document, Node node, cbx cbx2, String string) {
        Object object;
        if (cbx2.isInitialized()) {
            node.appendChild(this.oQa.b(document, cbx2.getGUID(), "SFObjectGUID"));
        }
        node.appendChild(this.c(document, cbx2.getObjectType(), "SFObjectName"));
        node.appendChild(this.e(document, cbx2.az()));
        node.appendChild(this.oQa.a(document, cbx2.vf(), "SFQuantity"));
        if (cbx2.aAG() != null) {
            object = this.a(document, cbx2.aAG());
            node.appendChild((Node)object);
        } else if (cbx2.aIh() != null) {
            object = this.a(document, cbx2.aIh());
            node.appendChild((Node)object);
        }
        for (ej ej2 : cbx2.fi().getAttributeMap().values()) {
            if (!ep.aE((int)ej2.getType())) continue;
            Element element = this.oRX.a(document, ej2, cbx2);
            node.appendChild(element);
        }
    }

    private void a(Document document, Node node, cdb cdb2, String string) {
        this.a(document, node, (cbx)cdb2, string);
        String string2 = null;
        string2 = this.ResourceTree.isDescendant(cdb2.az(), cug.fgG) ? "inventory_monster.xml" : "Inventory_player.xml";
        Element element = document.createElement("SFInventoryManager");
        element.appendChild(this.oQa.a(document, string2, "SFInventoryFileName"));
        node.appendChild(element);
        for (cxc cxc2 : cdb2.aJz().jl().values()) {
            Element element2 = document.createElement("SFSkill");
            element2.appendChild(this.oQa.a(document, cxc2.getName(), "SFSkillName"));
            element2.appendChild(this.oQa.a(document, cxc2.Bt(), "SFSkillLevel"));
            node.appendChild(element2);
        }
    }

    private void a(Document document, Node node, cdw cdw2, String string, ase ase2) {
        this.a(document, node, cdw2, string);
        String string2 = cug.uR((int)cdw2.az());
        if (string2 != null) {
            node.appendChild(this.oQa.a(document, string2, "SFObjectStateManagerFileName"));
        }
        if (ase2 != null) {
            Element element = document.createElement("MonsterInfo");
            this.b(document, element, cdw2, string, ase2);
            node.appendChild(element);
        }
    }

    private void a(Document document, Node node, cev cev2, String string) {
        this.a(document, node, (cdb)cev2, string);
        String string2 = cug.uR((int)cev2.az());
        if (string2 != null) {
            node.appendChild(this.oQa.a(document, string2, "SFObjectStateManagerFileName"));
        }
    }

    private void b(Document document, Node node, cdw cdw2, String string, ase ase2) {
        boolean bl;
        float f2;
        Object object;
        Object object2;
        int n;
        Element element = null;
        String string2 = ase2.Ti();
        if (string2 != null) {
            element = this.oQa.a(document, string2, "LevelUpName");
            node.appendChild(element);
        }
        if ((n = ase2.getAlignment()) != 0) {
            element = this.oQa.a(document, n, "Alignment");
            node.appendChild(element);
        }
        if (ase2.Th() != null) {
            element = document.createElement("KillOnSightList");
            for (int i2 = 0; i2 < ase2.Th().size(); ++i2) {
                String string3 = null;
                object2 = ase2.Th().iterator();
                while (object2.hasNext()) {
                    object = (Integer)object2.next();
                    string3 = lea.enW().getName((Integer)object);
                    Element element2 = this.oQa.a(document, string3, "SFResourceName");
                    element.appendChild(element2);
                }
            }
            node.appendChild(element);
        }
        if (ase2.Tj() != ase.a.bTK) {
            element = this.oQa.a(document, ase2.Tj().toString(), "Type");
            node.appendChild(element);
        }
        if ((double)(f2 = ase2.Tg()) != 30.0) {
            element = this.oQa.a(document, f2, "HearingRange");
            node.appendChild(element);
        }
        if (bl = ase2.To()) {
            element = this.oQa.a(document, bl, "SenseOfSmell");
            node.appendChild(element);
        }
        if ((object2 = ase2.Tf()) != arw.b.bSs) {
            element = this.oQa.a(document, ((arw.b)((Object)object2)).SB(), "FieldOfView");
            node.appendChild(element);
        }
        if ((object = ase2.Tk()) != arw.c.bSA) {
            element = this.oQa.a(document, ((Enum)object).toString(), "VisionType");
            node.appendChild(element);
        }
    }

    private Element c(Document document, int n, String string) {
        return this.oQa.a(document, amh.bxE[n], string);
    }

    public Element e(Document document, int n) {
        return this.oQa.a(document, this.ResourceTree.getName(n), "SFResourceName");
    }

    private Element a(Document document, bvd bvd2) {
        Element element = document.createElement("SFMeshObjectInfo");
        element.appendChild(this.oQa.a(document, bvd2.aza().name(), "SFMeshName"));
        if (bvd2.isInitialized()) {
            element.appendChild(this.oQa.b(document, bvd2.getGUID(), "SFObjectGUID"));
        }
        return element;
    }

    private Element a(Document document, cbv cbv2) {
        Element element = document.createElement("SFMeshObjectInfo");
        element.appendChild(this.oQa.a(document, cbv2.aza().name(), "SFMeshName"));
        if (cbv2.aHa() != null) {
            element.appendChild(this.oQa.a(document, cbv2.aHa(), "SFShaderName"));
        }
        if (cbv2.aIf() != null) {
            element.appendChild(this.oQa.a(document, cbv2.aIf(), "SFTintColor"));
        }
        return element;
    }

    private Element f(Document document, int n) {
        return this.oQa.a(document, this.aqN.getName(n), "SFSkillName");
    }

    private Element a(Document document, alm alm2) {
        Element element = document.createElement("SFExtraAbility");
        element.appendChild(this.oQa.a(document, alm2.DO(), "SFExtraAbilityName"));
        switch (alm2.getType()) {
            case 5: {
                this.a(document, (alo)alm2, element);
                break;
            }
            default: {
                lfn.b(5, "SFResourceWriter", "createSFExtraAbilityElement() Invalid extraabilitytype provided: '" + alm2.DO() + "'");
                return null;
            }
        }
        return element;
    }

    private void a(Document document, alo alo2, Element element) {
        this.a(document, (alm)alo2, element);
        element.appendChild(this.oQa.a(document, alo2.getFunctionName(), "SFFunctionName"));
    }

    private void a(Document document, alm alm2, Element element) {
        assert (alm2 != null);
        if (alm2.getGUID() != null) {
            element.appendChild(this.oQa.b(document, alm2.getGUID(), "SFObjectGUID"));
        }
    }
}

