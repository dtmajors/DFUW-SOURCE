/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class mzs {
    lfn ga = lfn.eqw();
    private boolean EVk = false;

    public List au(jrw jrw2) {
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
        }
        if (document != null) {
            List list = this.x(document);
            assert (!this.EVk) : "You must correct errors in the ConfigFile [" + jrw2 + "]";
            return list;
        }
        lfn.b(5, "SFScatterConfigParser", "parseScatterConfigurationFile() : Invalid Document! [" + jrw2 + "]");
        return null;
    }

    private List x(Document document) {
        ArrayList arrayList = lcn.emv();
        Node node = jsy.a("SFEnvironmentScatterConfig", (Node)document);
        assert (node != null);
        String string = "VegetationScatterList";
        Node node2 = jsy.a(string, node);
        assert (node2 != null) : "Node [" + string + "] was not found";
        List<Node> list = jsy.c("VegetationScatter", node2);
        assert (!list.isEmpty()) : "ScatterObjectList has no SFScatterObject!";
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            arrayList.addAll(this.fu(list.get(i)));
        }
        return arrayList;
    }

    private List fu(Node node) {
        ArrayList<Object> arrayList = lcn.emv();
        String string = "";
        String string2 = "VegetationTextureName";
        Node node2 = jsy.a(string2, node);
        assert (node2 != null) : "Node [" + string2 + "] was not found";
        string = jsy.m(node2);
        Object object = lcw.qLb + "texture/" + string;
        Object object2 = new jrw((String)object);
        if (!((File)object2).exists()) {
            lfn.b(5, "*.SFVegetationScatterConfigParser", "parseVegetationInfo() : VegetationMesh [" + string + "] doesnt exist!");
            this.EVk = true;
        } else {
            lfn.b(0, "*.SFVegetationScatterConfigParser", "Texture SFFile [" + string + "]");
        }
        string2 = "VegetationInfoList";
        node2 = jsy.a(string2, node);
        assert (node2 != null) : "Node [" + string2 + "] was not found";
        object = jsy.c("VegetationInfo", node2);
        object2 = null;
        assert (!object.isEmpty()) : "VegetationScatterList has no VegetationInfo!";
        int n2 = object.size();
        for (int i = 0; i < n2; ++i) {
            object2 = new ljs();
            ((ljs)object2).a(this.fv((Node)object.get(i)));
            ((ljs)object2).setTextureName(string);
            arrayList.add(object2);
        }
        return arrayList;
    }

    private ljt fv(Node node) {
        ljt ljt2 = new ljt();
        String string = "Align";
        Node node2 = jsy.a(string, node);
        assert (node2 != null) : "Node [" + string + "] was not found";
        ljt2.yz(jsy.t(node2));
        string = "DensitySpace";
        node2 = jsy.a(string, node);
        assert (node2 != null) : "Node [" + string + "] was not found";
        ljt2.ny(jsy.o(node2));
        string = "MinRotation";
        node2 = jsy.a(string, node);
        assert (node2 != null) : "Node [" + string + "] was not found";
        ljt2.nA(jsy.o(node2));
        string = "MaxRotation";
        node2 = jsy.a(string, node);
        assert (node2 != null) : "Node [" + string + "] was not found";
        ljt2.nz(jsy.o(node2));
        string = "Ratio";
        node2 = jsy.a(string, node);
        assert (node2 != null) : "Node [" + string + "] was not found";
        ljt2.nx(jsy.o(node2));
        string = "MeshName";
        node2 = jsy.a(string, node);
        assert (node2 != null) : "Node [" + string + "] was not found";
        String string2 = jsy.m(node2);
        string2 = lcw.qLb + "xml/" + string2;
        jrw jrw2 = new jrw(string2);
        if (!jrw2.exists()) {
            lfn.b(5, "SFVegetationScatterConfigParser", "parseVegetationInfo() : VegetationMesh [" + string2 + "] doesnt exist!");
            this.EVk = true;
        } else {
            lfn.b(0, "SFVegetationScatterConfigParser", "XML: " + string2);
        }
        ljt2.setMeshName(jsy.m(node2));
        string = "PositionOffset";
        node2 = jsy.a(string, node);
        assert (node2 != null) : "Node [" + string + "] was not found";
        ljt2.eD(jsy.w(node2));
        return ljt2;
    }
}

