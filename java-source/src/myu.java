/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  dqk
 *  jxb
 *  jzc
 *  lcw
 */
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class myu {
    private String bP = "[a-zA-Z][a-fA-F]{0,1}[0-9]{2}";
    private String EUD = "[a-zA-Z][a-fA-F]{0,1}[0-9]{2}_water";
    private String EUE = "water_level";
    private String EUF = "_waterplain_coast";
    private String EUG = "_surf";
    private String EUH = "water_level_textured";
    private Node EUI = null;
    private jxb oXe = new jxb(ldv.rfe);
    protected jzc par = new jzc();
    private int EUJ = 0;

    public void af(jrw jrw2) {
        if (!jrw2.isDirectory()) {
            lfn.b(5, this.getClass().getName(), "addCoastalPlanes() : SFFile [" + jrw2 + "] is not a directory!");
            return;
        }
        ArrayList arrayList = lcn.emv();
        ArrayList<jrw> arrayList2 = lcn.emv();
        jry.a(jrw2, (FileFilter)new jsl("xml"), arrayList2, true);
        for (jrw jrw3 : arrayList2) {
            if (!this.F(jrw3)) continue;
            this.aj(jrw3);
        }
    }

    public void ag(jrw jrw2) {
        if (!jrw2.isDirectory()) {
            lfn.b(5, this.getClass().getName(), "setSeaTerrainTileWaterMeshType() : SFFile [" + jrw2 + "] is not a directory!");
            return;
        }
        ArrayList arrayList = lcn.emv();
        ArrayList<jrw> arrayList2 = lcn.emv();
        jry.a(jrw2, (FileFilter)new jsl("xml"), arrayList2, true);
        for (jrw jrw3 : arrayList2) {
            if (!this.F(jrw3)) continue;
            this.ak(jrw3);
        }
    }

    public void ah(jrw jrw2) {
        if (!jrw2.isDirectory()) {
            lfn.b(5, this.getClass().getName(), "addCoastalPlanes() : SFFile [" + jrw2 + "] is not a directory!");
            return;
        }
        ArrayList arrayList = lcn.emv();
        ArrayList<jrw> arrayList2 = lcn.emv();
        jry.a(jrw2, (FileFilter)new jsl("xml"), arrayList2, true);
        for (jrw jrw3 : arrayList2) {
            if (!this.F(jrw3)) continue;
            this.ai(jrw3);
        }
    }

    private boolean F(jrw jrw2) {
        String string = jry.tu(jrw2.getName());
        return Pattern.matches(this.bP, string);
    }

    private Node ai(jrw jrw2) {
        Object object;
        Object object2;
        Object object3;
        if (jrw2.isDirectory()) {
            return null;
        }
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "isTileOS() : Could not Parse SFFile [" + jrw2 + "]. Exception = \n" + bo2);
            return null;
        }
        Node node = jsy.a("SFObjectSpace", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "SFFile [" + jrw2 + "] is invalid! Doc = " + document.getDocumentElement());
            assert (false);
            return null;
        }
        if (!node.hasChildNodes()) {
            return null;
        }
        NodeList nodeList = node.getChildNodes();
        dqk dqk2 = null;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        for (int i = 0; i < nodeList.getLength(); ++i) {
            if (nodeList.item(i).getNodeType() == 3 || nodeList.item(i).getNodeType() == 8) continue;
            object3 = this.oXe.bk(nodeList.item(i));
            if (object3 == null) {
                lfn.b(0, this.getClass().getName(), "traverseNodes() : Returned Object is null for Node = " + nodeList.item(i));
                continue;
            }
            if (!(object3 instanceof dqk)) continue;
            lfn.b(0, this.getClass().getName(), "traverseNodes() : Got MeshObject " + object3);
            object2 = ((dqk)object3).getObjectDescriptionFilename();
            object2 = jry.tu((String)object2);
            object2 = ((String)object2).toLowerCase();
            if (Pattern.matches("terrain_" + this.bP, (CharSequence)object2)) {
                jrw jrw3;
                lfn.b(0, this.getClass().getName(), "addNewNode() : Matched [" + (String)object2 + "]");
                object = new jrw(lcw.qLb + "/" + "xml/" + "terrain" + "/" + (String)object2 + "_waterplain_coast.xml");
                if (((File)object).exists()) {
                    bl = true;
                    bl3 = true;
                }
                if ((jrw3 = new jrw(lcw.qLb + "/" + "xml/" + "terrain" + "/" + (String)object2 + "_surf.xml")).exists()) {
                    bl2 = true;
                    bl3 = true;
                }
                dqk2 = (dqk)object3;
                continue;
            }
            if (((String)object2).contains(this.EUE)) {
                bl3 = true;
                document.getDocumentElement().removeChild(nodeList.item(i));
                continue;
            }
            if (((String)object2).contains(this.EUF)) {
                bl3 = true;
                document.getDocumentElement().removeChild(nodeList.item(i));
                continue;
            }
            if (!((String)object2).contains(this.EUG)) continue;
            bl3 = true;
            document.getDocumentElement().removeChild(nodeList.item(i));
        }
        if (bl) {
            String string = jry.tu(jrw2.getName());
            string = string.toLowerCase();
            string = "terrain/terrain_" + string + "_waterplain_coast.xml";
            lfn.b(0, this.getClass().getName(), "addNewNode() : NewOSName = " + string);
            if (dqk2 == null) {
                lfn.b(0, "SFObjectSpaceManipulator", "addCoastalPlaneNode(): TileMesh = null");
                assert (false);
                return null;
            }
            dqk2.setObjectDescriptionFilename(string);
            dqk2.setObjectType(5);
            object3 = new ldv(0, 0, 47);
            dqk2.setGUID((ldv)object3);
            object2 = this.par.a(document, dqk2, false);
            object = jsy.a("DescriptionFilename", (Node)object2);
            if (object == null) {
                lfn.b(5, this.getClass().getName(), "addNewNode() : Could not create new Node!");
                assert (false);
                return null;
            }
            node.appendChild((Node)object2);
        }
        if (bl2) {
            String string = jry.tu(jrw2.getName());
            string = string.toLowerCase();
            string = "terrain/terrain_" + string + "_surf.xml";
            lfn.b(0, this.getClass().getName(), "addNewNode() : NewOSName = " + string);
            if (dqk2 == null) {
                lfn.b(0, "SFObjectSpaceManipulator", "addCoastalPlaneNode(): TileMesh = null");
                assert (false);
                return null;
            }
            dqk2.setObjectDescriptionFilename(string);
            dqk2.setObjectType(5);
            object3 = new ldv(0, 0, 48);
            dqk2.setGUID((ldv)object3);
            object2 = this.par.a(document, dqk2, false);
            object = jsy.a("DescriptionFilename", (Node)object2);
            if (object == null) {
                lfn.b(5, this.getClass().getName(), "addNewNode() : Could not create new Node!");
                assert (false);
                return null;
            }
            node.appendChild((Node)object2);
            lfn.b(0, this.getClass().getSimpleName(), "addCoastalPlaneNode() Adding Surf: = " + string);
        }
        if (bl3) {
            jsz.a(document, jrw2);
        }
        return null;
    }

    private Node aj(jrw jrw2) {
        lfn.b(0, this.getClass().getName(), "setTileMeshType() : here");
        if (jrw2.isDirectory()) {
            return null;
        }
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "isTileOS() : Could not Parse SFFile [" + jrw2 + "]. Exception = \n" + bo2);
            return null;
        }
        Node node = jsy.a("SFObjectSpace", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "SFFile [" + jrw2 + "] is invalid! Doc = " + document.getDocumentElement());
            assert (false);
            return null;
        }
        if (node.hasChildNodes()) {
            NodeList nodeList = node.getChildNodes();
            dqk dqk2 = null;
            for (int i = 0; i < nodeList.getLength(); ++i) {
                if (nodeList.item(i).getNodeType() == 3 || nodeList.item(i).getNodeType() == 8) continue;
                amf amf2 = this.oXe.bk(nodeList.item(i));
                if (amf2 == null) {
                    lfn.b(0, this.getClass().getName(), "traverseNodes() : Returned Object is null for Node = " + nodeList.item(i));
                    continue;
                }
                if (!(amf2 instanceof dqk)) continue;
                lfn.b(0, this.getClass().getName(), "traverseNodes() : Got MeshObject " + amf2);
                String string = ((dqk)amf2).getObjectDescriptionFilename();
                string = jry.tu(string);
                string = string.toLowerCase();
                if (!Pattern.matches("terrain_" + this.bP, string)) continue;
                lfn.b(0, this.getClass().getName(), "addNewNode() : Matched [" + string + "]");
                dqk2 = (dqk)amf2;
                document.getDocumentElement().removeChild(nodeList.item(i));
            }
            if (dqk2 == null) {
                lfn.b(5, this.getClass().getName(), "traverseNodes() : Found no Tile for " + jrw2);
                return null;
            }
            dqk2.setObjectType(24);
            Element element = this.par.a(document, dqk2, false);
            node.appendChild(element);
            jsz.a(document, jrw2);
            lfn.b(0, this.getClass().getName(), "setTileMeshType() : Wrote TerrinTile Mesh Type for SFFile [" + jrw2 + "]");
        }
        return null;
    }

    private Node ak(jrw jrw2) {
        lfn.b(0, this.getClass().getName(), "setSeaTileWaterMeshType() : here");
        if (jrw2.isDirectory()) {
            return null;
        }
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "isTileOS() : Could not Parse SFFile [" + jrw2 + "]. Exception = \n" + bo2);
            return null;
        }
        Node node = jsy.a("SFObjectSpace", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "SFFile [" + jrw2 + "] is invalid! Doc = " + document.getDocumentElement());
            assert (false);
            return null;
        }
        if (node.hasChildNodes()) {
            NodeList nodeList = node.getChildNodes();
            dqk dqk2 = null;
            for (int i = 0; i < nodeList.getLength(); ++i) {
                if (nodeList.item(i).getNodeType() == 3 || nodeList.item(i).getNodeType() == 8) continue;
                amf amf2 = this.oXe.bk(nodeList.item(i));
                if (amf2 == null) {
                    lfn.b(0, this.getClass().getName(), "setSeaTileWaterMeshType() : Returned Object is null for Node = " + nodeList.item(i));
                    continue;
                }
                if (!(amf2 instanceof dqk)) continue;
                lfn.b(0, this.getClass().getName(), "setSeaTileWaterMeshType() : Got MeshObject " + amf2);
                String string = ((dqk)amf2).getObjectDescriptionFilename();
                string = jry.tu(string);
                string = string.toLowerCase();
                if (!string.equalsIgnoreCase(this.EUH)) continue;
                lfn.b(0, this.getClass().getName(), "setSeaTileWaterMeshType() : Matched [" + string + "]");
                dqk2 = (dqk)amf2;
                document.getDocumentElement().removeChild(nodeList.item(i));
            }
            if (dqk2 == null) {
                lfn.b(5, this.getClass().getName(), "setSeaTileWaterMeshType() : Found no Tile for " + jrw2);
                return null;
            }
            dqk2.setObjectType(5);
            Element element = this.par.a(document, dqk2, false);
            node.appendChild(element);
            jsz.a(document, jrw2);
            lfn.b(0, this.getClass().getName(), "setSeaTileWaterMeshType() : Wrote TerrinTile Mesh Type for SFFile [" + jrw2 + "]");
        }
        return null;
    }

    public void al(jrw jrw2) {
        this.EUJ = 0;
        if (!jrw2.isDirectory()) {
            lfn.b(5, this.getClass().getName(), "addOSTypeNodes() : SFFile [" + jrw2 + "] is not a directory!");
            return;
        }
        ArrayList arrayList = lcn.emv();
        ArrayList<jrw> arrayList2 = lcn.emv();
        jry.a(jrw2, (FileFilter)new jsl("xml"), arrayList2, true);
        for (jrw jrw3 : arrayList2) {
            if (!this.F(jrw3)) continue;
            this.am(jrw3);
        }
        lfn.b(0, this.getClass().getSimpleName(), "addOSTypeNodes() : Fixed [" + this.EUJ + "] files.");
    }

    public boolean am(jrw jrw2) {
        if (jrw2.isDirectory()) {
            return false;
        }
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "isTileOS() : Could not Parse SFFile [" + jrw2 + "]. Exception = \n" + bo2);
            return false;
        }
        Node node = jsy.a("SFObjectSpace", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "SFFile [" + jrw2 + "] is invalid! Doc = " + document.getDocumentElement());
            assert (false);
            return false;
        }
        jta jta2 = new jta();
        Node node2 = jsy.a("ObjectSpaceType", node);
        if (node2 != null) {
            lfn.b(5, this.getClass().getSimpleName(), "addOSTypeNode() : OSType Node already exists for SFFile [" + jrw2 + "]. Not adding.");
            return false;
        }
        if (this.F(jrw2)) {
            lfn.b(0, this.getClass().getSimpleName(), "addOSTypeNode() : SFFile [" + jrw2 + "] is TileOS. Setting Correct Type");
            node.appendChild(jta2.a(document, 1, "ObjectSpaceType"));
        } else {
            node.appendChild(jta2.a(document, 0, "ObjectSpaceType"));
        }
        ++this.EUJ;
        jsz.a(document, jrw2);
        return true;
    }
}

