/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  jxb
 *  lcr
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class mzh {
    private Map EUT = lcn.emw();
    private int EUU = 0;
    private double EUX = 0.0;
    private ljq EUY = new ljq();
    private boolean EUZ = false;

    private ldv afV(int n2) {
        return ldx.enG().aci(n2).enA();
    }

    public List a(jrw[] jrwArray, double d2, ljq ljq2) {
        this.EUY = ljq2;
        ArrayList arrayList = lcn.emv();
        this.EUX = d2;
        lfn.b(0, this.getClass().getName(), "Starting Multiplying Coords");
        for (int i = 0; i < jrwArray.length; ++i) {
            arrayList.addAll(this.ar(jrwArray[i]));
        }
        lfn.b(0, this.getClass().getName(), "Finished Multiplying Coords. Found [" + this.EUU + "] OSGUID Conflicts");
        return arrayList;
    }

    private List ar(jrw jrw2) {
        ArrayList arrayList = lcn.emv();
        assert (this.EUX > 0.0) : "Cannot multiply with null or less!";
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
        }
        if (document != null) {
            ldv ldv2 = this.t(document);
            if (ldv2 != null) {
                lfn.b(0, this.getClass().getName(), "Adding OSGUID " + ldv2 + " and file [" + jrw2 + "] to Map");
                int n2 = ldv2.enw();
                while (this.EUT.containsKey(ldv2)) {
                    ldv2 = this.afV(++n2);
                    lfn.b(0, this.getClass().getName(), "Found DUPE for: OSGUID " + ldv2 + " and file [" + jrw2 + "] to Map");
                    ++this.EUU;
                }
                this.EUT.put(ldv2, jrw2);
                if (this.EUU > 0) {
                    this.d(document, ldv2);
                }
                this.b(document, arrayList, "Position");
                this.b(document, arrayList, "TargetPosition");
                this.b(document, arrayList, "SourcePosition");
                this.b(document, arrayList, "PlanePos");
                this.a(jrw2, document);
            } else {
                lfn.b(5, this.getClass().getName(), "Not ObjectSpace Processing file[" + jrw2 + "] anyway. Rescaling but not moving positions");
                this.b(document, arrayList, "Position");
                this.b(document, arrayList, "TargetPosition");
                this.b(document, arrayList, "SourcePosition");
                this.b(document, arrayList, "PlanePos");
                this.a(jrw2, document);
            }
        } else {
            lfn.b(5, this.getClass().getName(), "Could not parse SFFile[" + jrw2 + "]. Document returned was NULL");
        }
        return arrayList;
    }

    private void b(Document document, List list, String string) {
        Node node;
        Object object;
        NodeList nodeList = document.getElementsByTagName(string);
        if (nodeList != null && nodeList.getLength() != 0) {
            object = null;
            node = null;
            double d2 = 0.0;
            Node node2 = null;
            double d3 = this.EUY.x;
            double d4 = this.EUY.y;
            double d5 = this.EUY.rlV;
            double d6 = 0.0;
            int n2 = nodeList.getLength();
            for (int i = 0; i < n2; ++i) {
                object = nodeList.item(i);
                node2 = jsy.a("SFVector3", (Node)object);
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("X");
                d6 = d2 = (double)Float.parseFloat(node.getNodeValue());
                d2 += d3;
                node.setNodeValue(Float.toString((float)(d2 *= this.EUX)));
                node = namedNodeMap.getNamedItem("Y");
                d2 = Float.parseFloat(node.getNodeValue());
                d2 += d4;
                node.setNodeValue(Float.toString((float)(d2 *= this.EUX)));
                node = namedNodeMap.getNamedItem("Z");
                d6 = d2 = (double)Float.parseFloat(node.getNodeValue());
                d2 += d5;
                node.setNodeValue(Float.toString((float)(d2 *= this.EUX)));
            }
        }
        if ((object = document.getElementsByTagName("SFWorldMeshObject")) != null && object.getLength() != 0) {
            node = null;
            dqk dqk2 = null;
            int n3 = object.getLength();
            for (int i = 0; i < n3; ++i) {
                node = object.item(i);
                jxb jxb2 = new jxb(lcr.qzr);
                dqk2 = jxb2.bl(node);
                list.add(dqk2);
            }
        }
    }

    private void d(Document document, ldv ldv2) {
        boolean bl = false;
        if (document != null) {
            Node node = jsy.a("ObjectSpaceGuid", document);
            if (node != null) {
                node = this.i(node);
                node.setNodeValue(Integer.toString(ldv2.enw()));
            } else {
                lfn.b(0, this.getClass().getName(), "No ObjectSpaceGuid node found");
            }
        }
    }

    public Node i(Node node) {
        if (node != null) {
            NodeList nodeList = node.getChildNodes();
            Node node2 = null;
            for (int i = 0; i < nodeList.getLength(); ++i) {
                node2 = nodeList.item(i);
                if (!node2.getNodeName().equals("SFInteger")) continue;
                NamedNodeMap namedNodeMap = node2.getAttributes();
                node = namedNodeMap.getNamedItem("Value");
                return node;
            }
            lfn.print("SFXMLFileParser: Did not find SFInteger Node for: " + node.getNodeName() + " !");
        }
        return null;
    }

    private ldv t(Document document) {
        ldv ldv2 = null;
        int n2 = 0;
        if (document != null) {
            Node node = jsy.a("ObjectSpaceGuid", document);
            if (node != null) {
                n2 = jsy.r(node);
                ldv2 = this.afV(n2);
            } else {
                lfn.b(0, this.getClass().getName(), "No ObjectSpaceGuid node found");
            }
        }
        return ldv2;
    }

    private void a(jrw jrw2, Document document) {
        if (!this.EUZ) {
            boolean bl;
            String string = jrw2.getParent();
            String string2 = jrw2.getName();
            String string3 = string + "/" + "wb-scaled/";
            jrw jrw3 = new jrw(string3);
            if (!jrw3.exists() && !(bl = jrw3.mkdir())) {
                lfn.b(5, "SFXMLFileWriter", "BackupTheOldFile() : Could not make backup directory [" + jrw3 + "] !");
                string3 = string;
            }
            jrw2 = new jrw(string3 + string2);
        }
        jsz.a(document, jrw2);
    }

    public void At(boolean bl) {
        this.EUZ = bl;
    }
}

