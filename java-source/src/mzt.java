/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class mzt {
    private boolean EVl = false;
    private Map<String, List<jrw>> nWv = lcn.emw();

    public void Au(boolean bl) {
        this.EVl = bl;
    }

    public void av(jrw jrw2) {
        jxa jxa2 = new jxa();
        this.nWv.clear();
        ArrayList<jrw> arrayList = lcn.emv();
        FileFilter fileFilter = new FileFilter(this){
            final /* synthetic */ mzt EVm;
            {
                this.EVm = mzt2;
            }

            public boolean accept(File file) {
                if (file.isFile() && !file.getName().endsWith(".xml")) {
                    return false;
                }
                String string = file.getParentFile().getName();
                return !string.equals("audio") && !string.equals("shader") && !string.equals("detailtexture");
            }
        };
        jry.a(jrw2, fileFilter, arrayList, true);
        for (jrw jrw3 : arrayList) {
            if (!jrw3.isFile()) continue;
            String string = jrw3.getName().toLowerCase();
            List<Object> list = null;
            String string2 = jxa2.s(jrw3);
            if (string2 != null) {
                list = this.nWv.get(string2);
                if (list == null) {
                    list = lcn.emv();
                    this.nWv.put(string2, list);
                }
                list.add(jrw3);
                if (string2.endsWith(".sfm")) {
                    list = this.nWv.get(string2 = string2.substring(0, string2.lastIndexOf(".")) + ".x");
                    if (list == null) {
                        list = lcn.emv();
                        this.nWv.put(string2, list);
                    }
                    list.add(jrw3);
                }
            }
            if (list != null) continue;
            list = lcn.emv();
            this.nWv.put(string, list);
            list.add(jrw3);
        }
        lfn.b(0, this.getClass().getSimpleName(), "populateCache() : done");
    }

    public void clearCache() {
        assert (this.nWv != null);
        this.nWv.clear();
    }

    public List<jrw> a(jrw jrw2, jrw jrw3, mjd mjd2, boolean bl) {
        if (jrw2 == null || jrw3 == null || !jrw3.isDirectory()) {
            if (jrw2 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "createNewMeshXML() : MeshFile is null!");
            }
            if (jrw3 == null) {
                lfn.b(5, this.getClass().getSimpleName(), "createNewMeshXML() : SaveDir is null.");
            }
            if (jrw3 != null && !jrw3.isDirectory()) {
                lfn.b(5, this.getClass().getSimpleName(), "createNewMeshXML() : SaveDir does not exist: " + jrw3);
            }
            return null;
        }
        String string = jrw2.getName();
        String string2 = jrw2.getName();
        int n2 = string2.lastIndexOf(".");
        if (n2 > 0) {
            string2 = string2.substring(0, n2);
        }
        string2 = string2 + ".xml";
        jrw jrw4 = new jrw(jrw3 + "/" + string2);
        jrw jrw5 = new jrw(lcw.qLb + "worldbuilder/templates/" + "mesh_template.xml");
        List<jrw> list = null;
        if (bl && ((list = this.d(new jrw(lcw.qLb + File.separator + "xml/"), jrw2.getName(), true)) == null || list.isEmpty())) {
            lfn.b(0, this.getClass().getSimpleName(), "createNewMeshXML() : SFFile not found. Creating new from Template");
        }
        if (list == null || list.isEmpty()) {
            list = lcn.emv();
            list.add(jrw4);
            Document document = this.aw(jrw5);
            assert (document != null);
            this.w(document, mjd2.ezz());
            this.y(document, mjd2.ezx().ezA());
            if (mjd2.ezy() == mjd.a.DzK) {
                this.y(document);
            }
            this.x(document, string);
            this.c(document, jrw4);
        }
        return list;
    }

    private List<jrw> d(jrw jrw2, String string, boolean bl) {
        List<Object> list = null;
        string = string.toLowerCase();
        if (!jrw2.isDirectory()) {
            lfn.b(5, this.getClass().getSimpleName(), "findFile() : [" + jrw2 + "] is not directory!");
            return null;
        }
        if (this.EVl && !this.nWv.isEmpty() && (list = this.nWv.get(string)) != null && !list.isEmpty()) {
            lfn.b(0, this.getClass().getSimpleName(), "findFile() : Using Cache. Found [" + list.size() + "] files matching in cache");
            return list;
        }
        list = lcn.emv();
        ArrayList<jrw> arrayList = lcn.emv();
        jry.a(jrw2, null, arrayList, bl);
        String string2 = string;
        int n2 = string2.lastIndexOf(".");
        string2 = string2.substring(0, n2);
        string2 = string2 + ".xml";
        for (jrw jrw3 : arrayList) {
            if (!jrw3.getName().equalsIgnoreCase(string2)) continue;
            list.add(jrw3);
        }
        return list;
    }

    public jrw a(jrw jrw2, jrw jrw3, String[] stringArray, String[] stringArray2) {
        if (jrw2 == null || jrw3 == null || !jrw3.isDirectory()) {
            lfn.b(5, this.getClass().getSimpleName(), "createMeshXMLFile() : MeshFile = " + jrw2 + ", SaveDir = " + jrw3);
            if (jrw2 != null && jrw3 != null) {
                lfn.b(5, this.getClass().getSimpleName(), "createMeshXMLFile() : MeshFile.isFile = " + jrw2.isFile() + ", SaveDir.isDirectory = " + jrw3.isDirectory());
            }
            return null;
        }
        String string = jrw2.getName();
        int n2 = string.lastIndexOf(".");
        if (n2 > 0) {
            string = string.substring(0, n2);
        }
        string = string + ".xml";
        jrw jrw4 = new jrw(jrw3 + "/" + string);
        Document document = null;
        if (jrw4.exists()) {
            document = this.aw(jrw4);
        } else {
            jrw jrw5 = new jrw(lcw.qLb + "worldbuilder/templates/" + "animation_template.xml");
            document = this.aw(jrw5);
        }
        this.a(document, stringArray, stringArray2);
        this.c(document, jrw4);
        return jrw4;
    }

    private void c(Document document, jrw jrw2) {
        if (document == null || jrw2 == null) assert (false) : "Document not parsed, or ConfigFile == null !";
        jsz.a(document, jrw2);
    }

    private Document aw(jrw jrw2) {
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            bo2.printStackTrace();
        }
        if (document == null) {
            lfn.b(5, this.getClass().getSimpleName(), "parseConfigurationFile() Invalid Document: [" + jrw2 + "]");
        }
        return document;
    }

    private void w(Document document, String string) {
        String string2 = "ShaderDefault.xml";
        Node node = jsy.a("SFObject", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "getActiveGlobalShader() : XML SFFile is not SFObject file! -> " + document.getNamespaceURI());
            assert (false);
            return;
        }
        node = jsy.a("RenderInformation", node);
        node = jsy.a("Shaders", node);
        Node node2 = jsy.a("ActiveVersion", node);
        String string3 = jsy.m(node2);
        node = jsy.a(string3, node);
        if (!jsy.t(node = jsy.a("GlobalShader", node))) {
            lfn.b(4, "SFMeshFileparser", "getActiveGlobalShader() : MeshFile not using GlobalShader. Returning DefaultShader [" + string2 + "]");
            return;
        }
        Node node3 = jry.g(node);
        node3.setNodeValue(string);
    }

    private void x(Document document, String string) {
        Object var3_3 = null;
        Node node = jsy.a("SFObject", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "getActiveMeshFilename() : XML FILE is not a SFObject file! ->" + document.getNamespaceURI());
            assert (false);
            return;
        }
        node = jsy.a("RenderInformation", node);
        node = jsy.a("FileName", node);
        Node node2 = jsy.a("ActiveVersion", node);
        String string2 = jsy.m(node2);
        node = jsy.a(string2, node);
        Node node3 = jry.g(node);
        node3.setNodeValue(string);
    }

    private void a(Document document, String[] stringArray, String[] stringArray2) {
        Element element;
        int n2;
        jta jta2 = new jta();
        Object var5_5 = null;
        Node node = jsy.a("SFObject", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "getActiveMeshFilename() : XML FILE is not a SFObject file! ->" + document.getNamespaceURI());
            assert (false);
            return;
        }
        node = jsy.a("RenderInformation", node);
        node = jsy.a("FileName", node);
        Node node2 = jsy.a("ActiveVersion", node);
        String string = jsy.m(node2);
        Node node3 = jsy.a(string, node);
        node3.appendChild(jta2.a(document, false));
        Node node4 = jsy.a("Meshes", node3);
        assert (node4 != null);
        Element element2 = document.createElement("Meshes");
        element2.appendChild(jta2.a(document, stringArray.length, "NumberOfSets"));
        for (n2 = 0; n2 < stringArray.length; ++n2) {
            element = document.createElement("Set" + n2);
            element.appendChild(jta2.c(document, stringArray[n2] + ".sfam"));
            element2.appendChild(element);
        }
        node3.replaceChild(element2, node4);
        node4 = jsy.a("Animations", node3);
        assert (node4 != null);
        element2 = document.createElement("Animations");
        element2.appendChild(jta2.a(document, stringArray2.length, "NumberOfSets"));
        for (n2 = 0; n2 < stringArray2.length; ++n2) {
            element = document.createElement("Set" + n2);
            element.appendChild(jta2.c(document, stringArray2[n2]));
            element2.appendChild(element);
        }
        node3.replaceChild(element2, node4);
    }

    private void y(Document document, String string) {
        Object var3_3 = null;
        Node node = jsy.a("SFObject", (Node)document);
        if (node == null) {
            lfn.b(5, this.getClass().getName(), "getActiveMeshFilename() : XML FILE is not a SFObject file! ->" + document.getNamespaceURI());
            assert (false);
            return;
        }
        node = jsy.a("PhysicsInformation", node);
        node = jsy.a("PhysicsObjectType", node);
        assert (node instanceof Element);
        assert (string != null);
        ((Element)node).setAttribute("Value", string);
    }

    public void y(Document document) {
        Node node = jsy.a("SFObject", (Node)document);
        if (node != null) {
            jta jta2 = new jta();
            Node node2 = jsy.a("Extras", node = jsy.a("RenderInformation", node));
            if (node2 != null) {
                lfn.b(5, this.getClass().getSimpleName(), "addTileExtrasNode() : ExtrasNode already exists for SFFile [" + document.getNamespaceURI() + "]. Not adding.");
                return;
            }
            node2 = document.createElement("Extras");
            node2.appendChild(jta2.a(document, true, "Veg"));
            node2.appendChild(jta2.a(document, true, "DetailTextures"));
            node.appendChild(node2);
        }
    }
}

