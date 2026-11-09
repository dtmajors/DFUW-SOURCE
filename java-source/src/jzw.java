/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  brg
 *  bri
 *  cug
 *  kah
 */
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.Annotations;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class jzw {
    public static final lju eM = new lju(0, 3, 0);
    private ldw oYR = ldx.enG().aci(0);
    private static les ResourceTree = lea.enW();

    public brl e(jrw jrw2, boolean bl) {
        String string = jry.tr(jrw2.getAbsolutePath());
        return this.M(string, bl);
    }

    public brl M(String string, boolean bl) {
        brl brl2 = new brl(true);
        this.a(brl2, string, bl);
        return brl2;
    }

    public brl a(String[] stringArray, boolean bl) {
        brl brl2 = new brl(true);
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            this.a(brl2, stringArray[i2], bl);
        }
        return brl2;
    }

    public void a(brl brl2, String[] stringArray) {
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            this.a(brl2, stringArray[i2]);
        }
    }

    public bri vM(String string) {
        String string2 = "xml-files/server/resource/" + string;
        Document document = jsy.tJ(string2);
        jsy.a(document, eM);
        NodeList nodeList = document.getElementsByTagName("SFInventory");
        if (nodeList.getLength() == 0) {
            throw new bg("SFFile '" + string2 + "' contains no '" + "SFInventory" + "' node.");
        }
        Node node = nodeList.item(0);
        String string3 = jsy.c(node, "ClassName");
        if (string3 == null || string3.trim().equals("")) {
            throw new bj("Attribute 'ClassName' has invalid value.");
        }
        if (!bqm.gb(string3)) {
            throw new bj("InventoryClassName '" + string3 + "' is invalid.");
        }
        bri bri2 = this.vN(string3);
        if (bri2 == null) {
            throw new bg("InventoryClassName '" + string3 + "' is invalid.");
        }
        try {
            String string4 = jsy.c(node, "InventoryName");
            if (string4 == null || string4.trim().equals("")) {
                throw new bj("Attribute 'InventoryName' has invalid value.");
            }
            bqm.b b2 = bqm.b.getInventoryType(string4);
            if (b2 == null) {
                throw new bj("InventoryName '" + string4 + "' is invalid.");
            }
            bri2.a(b2);
            if (bri2 instanceof brg) {
                brg brg2 = (brg)bri2;
                List<Node> list = jsy.c("SFLayer", node);
                if (list.isEmpty()) {
                    throw new bj("No 'SFLayer' nodes found.");
                }
                for (int i2 = 0; i2 < list.size(); ++i2) {
                    brw brw2 = this.cT(list.get(i2));
                    brg2.a(brw2);
                }
            }
            return bri2;
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string2 + "' failed.", bg2);
        }
    }

    private void a(brl brl2, String string, boolean bl) {
        assert (brl2 != null);
        assert (string != null);
        try {
            Object object;
            Object object2;
            Document document = jsy.tJ(string);
            jsy.a(document, eM);
            NodeList nodeList = document.getElementsByTagName("SFInteractionInventory");
            if (nodeList.getLength() == 0) {
                throw new bg("SFFile '" + string + "' contains no '" + "SFInteractionInventory" + "' node.");
            }
            Node node = nodeList.item(0);
            if (!bl) {
                object2 = jsy.d("SFInventoryGUID", node);
                object = jsy.D((Node)object2);
                if (object == null) {
                    throw new bj("Node 'SFInventoryGUID' has invalid value.");
                }
                brl2.setGUID((ldv)object);
            }
            if (!(object2 = jsy.c("SFItemRepresentation", node)).isEmpty()) {
                object = brl2.aun().awe();
                int n = object2.size();
                for (int i2 = 0; i2 < n; ++i2) {
                    boolean bl2;
                    brt brt2 = this.e((Node)object2.get(i2), bl);
                    if (bl) {
                        brt2.setGUID(this.oYR.bzv());
                    }
                    if (bl2 = brl2.a((brm)brt2, (brs)object)) continue;
                    throw new bg("ItemRepresentation " + brt2.getGUID() + " failed to be added to inventory.");
                }
            }
        }
        catch (bg bg2) {
            throw new bg("Parsing of file '" + string + "' failed.", bg2);
        }
    }

    private bri vN(String string) {
        assert (string != null);
        if (string.equalsIgnoreCase("SFInventoryPlayerServer")) {
            return new brg();
        }
        if (string.equalsIgnoreCase("SFInventoryStorageServer")) {
            return new brk();
        }
        return null;
    }

    private brt e(Node node, boolean bl) {
        float f;
        Node node2;
        assert (node != null);
        ldv ldv2 = null;
        if (!bl && (ldv2 = jsy.D(node2 = jsy.d("SFGUID", node))) == null) {
            throw new bj("Node 'SFGUID' has invalid value.");
        }
        node2 = jsy.d("SFResourceName", node);
        int n = kah.dv((Node)node2);
        if (n <= 0) {
            throw new bj("Node 'SFResourceName' with value '" + jsy.m(node2) + "' is invalid.");
        }
        lgw lgw2 = (lgw)ResourceTree.acv(n);
        if (lgw2 == null) {
            throw new bg("No listitem found for resource " + n);
        }
        brt brt2 = new brt();
        brt2.setGUID(ldv2);
        brt2.l(n);
        float f2 = lgw2.erL();
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        brt2.aa(f2 * (float)cug.uF((int)lgw2.getType()));
        float f3 = cug.mr((int)n);
        if (f3 < 0.0f) {
            brt2.setWeight(1.0f);
        }
        brt2.setWeight(f3);
        node2 = jsy.a("SFMaxQuantity", node);
        if (node2 != null) {
            f = jsy.o(node2);
            if (f < 1.0f) {
                throw new bg("MaxQuantity of resource '" + lgw2.getName() + "' is invalid.");
            }
            brt2.kR((int)f);
            brt2.do(brt2.aqI());
        } else {
            brt2.kR(1000000000);
            brt2.do(brt2.aqI());
        }
        node2 = jsy.a("SFRegenerationRate", node);
        if (node2 != null) {
            f = jsy.o(node2);
            if (f <= 0.0f) {
                throw new bg("MaxQuantity of resource '" + lgw2.getName() + "' is invalid.");
            }
            brt2.de(f);
        } else {
            brt2.de(1.0f);
        }
        return brt2;
    }

    private brw cT(Node node) {
        assert (node != null);
        String string = jsy.c(node, "LayerName");
        if (string == null || string.trim().equals("")) {
            throw new bj("Attribute 'LayerName' has invalid value.");
        }
        cak.c c2 = cak.c.findLayerType(string);
        if (c2 == null) {
            throw new bj("LayerName '" + string + "' is invalid.");
        }
        int n = jsy.d(node, "LayerSlotCount");
        if (n <= 0 || n > 6) {
            throw new bj("Attribute 'LayerSlotCount' has invalid value.");
        }
        brx[] brxArray = new brx[n];
        int n2 = brxArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            brxArray[i2] = new brx();
            brxArray[i2].aCJ = i2;
        }
        brw brw2 = new brw();
        brw2.bpW = c2;
        brw2.dJd = brxArray;
        return brw2;
    }

    private void a(brl brl2, String string) {
        XStream xStream = new XStream(new DomDriver());
        xStream.setClassLoader(r.cr);
        Annotations.configureAliases(xStream, muu.class);
        String string2 = "";
        try {
            string2 = jry.ti(string);
        }
        catch (Exception exception) {
            throw new bg("Exception caught.", exception);
        }
        Object object = xStream.fromXML(string2);
        assert (object instanceof muu[]);
        muu[] muuArray = (muu[])object;
        brs brs2 = brl2.aun().awe();
        for (int i2 = 0; i2 < muuArray.length; ++i2) {
            muu muu2 = muuArray[i2];
            bsc bsc2 = new bsc();
            bsc2.setGUID(this.oYR.bzv());
            int n = lea.enZ().getType(muu2.SkillName);
            if (n < 0) {
                throw new bj("SkillName '" + muu2.SkillName + "' is invalid.");
            }
            bsc2.eI(n);
            bsc2.ag(1.0f);
            cuo cuo2 = cxj.yw(n);
            if (cuo2 == null) {
                throw new bg("No trainingrule found for skill '" + bsc2.Bu() + "'");
            }
            bsc2.aa(cuo2.TrainingCost);
            boolean bl = brl2.a(bsc2, brs2);
            if (bl) continue;
            throw new bg("SkillRepresentation " + bsc2.getGUID() + " failed to be added to inventory.");
        }
    }
}

