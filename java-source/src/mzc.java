/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  lcw
 */
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class mzc {
    private jxd oXG;
    private Map<ldv, jrw> EUT = lcn.emw();
    private int EUU = 0;
    private jrw EUV;

    public mzc() {
        this.oXG = new jxd();
    }

    private ldv afV(int n2) {
        return ldx.enG().aci(n2).enA();
    }

    public boolean cH(List<jrw> list) {
        this.EUV = new jrw(lcw.qLb + "xml-files/objectspace/guid_fixed/");
        lfn.b(0, this.getClass().getName(), "Starting Resolving OS Conflicts");
        this.cJ(list);
        List<jrw> list2 = this.eTs();
        for (int i = 0; i < list.size(); ++i) {
            this.ap(list.get(i));
        }
        lfn.b(0, this.getClass().getName(), "Finished Resolving OS Conflicts. Found [" + this.EUU + "] Conflicts");
        return false;
    }

    public void cI(List<jrw> list) {
        this.EUV = new jrw(lcw.qLb + "xml-files/objectspace/guid_fixed/");
        lfn.b(0, this.getClass().getName(), "Starting adding used OS GUIDs to List");
        this.cJ(list);
        Set<ldv> set = lcn.emx();
        for (jrw jrw2 : list) {
            boolean bl;
            Document document;
            block4: {
                document = null;
                try {
                    document = jsy.n(jrw2);
                }
                catch (bo bo2) {
                    lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
                    if ($assertionsDisabled) break block4;
                    throw new AssertionError();
                }
            }
            if (document == null) assert (false) : "Doc is null!";
            ldv ldv2 = this.oXG.t(document);
            if (ldv2 != null && (bl = set.add(ldv2))) continue;
        }
        lfn.b(0, this.getClass().getName(), "Finished adding used OS GUIDs to List. Files = " + list.size() + ", OSGUIDs = " + set.size());
        mzg mzg2 = new mzg();
        mzg2.w(set);
    }

    private void cJ(List<jrw> list) {
        Iterator<jrw> iterator = list.iterator();
        while (iterator.hasNext()) {
            ldv ldv2;
            jrw jrw2 = iterator.next();
            Document document = null;
            try {
                document = jsy.n(jrw2);
            }
            catch (bo bo2) {
                lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
            }
            if (document == null || (ldv2 = this.oXG.t(document)) == null) continue;
            int n2 = ldv2.enw();
            if (n2 >= 100 && n2 <= 1123) {
                int n3 = this.oXG.u(document);
                if (n3 == 1) {
                    iterator.remove();
                    continue;
                }
                if (n3 == -1) {
                    lfn.b(5, this.getClass().getSimpleName(), "removeReservedGUIDsFromList() : No Type found for file " + jrw2);
                    continue;
                }
                lfn.b(5, this.getClass().getName(), "removeOSGUIDsFromArray() : SFFile [" + jrw2 + "] is not Tile, but has GUID in Tile GUID range!");
                continue;
            }
            if (n2 < 0 || n2 > 99) continue;
            lfn.b(5, this.getClass().getName(), "removeOSGUIDsFromArray() : SFFile [" + jrw2 + "] has an Illegal (used as Static) OS GUID = " + ldv2 + ", Removing from File-list.");
            iterator.remove();
        }
    }

    private List<jrw> eTs() {
        ArrayList<jrw> arrayList = lcn.emv();
        jry.a(this.EUV, (FileFilter)new jsl("xml"), arrayList, true);
        for (jrw jrw2 : arrayList) {
            this.ap(jrw2);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void ap(jrw jrw2) {
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            lfn.b(5, this.getClass().getName(), "Document Parse Exception: " + bo2);
        }
        if (document == null) {
            lfn.b(5, this.getClass().getName(), "Could not parse SFFile[" + jrw2 + "]. Document returned was NULL");
            return;
        }
        ldv ldv2 = this.oXG.t(document);
        if (ldv2 == null) {
            lfn.b(5, this.getClass().getName(), "Could not Find OSGUID");
            return;
        }
        int n2 = ldv2.enw();
        if (this.EUT.containsKey(ldv2)) {
            jrw jrw3 = this.EUT.get(ldv2);
            if (jrw2.getName().equals(jrw3.getName())) {
                lfn.b(3, this.getClass().getName(), "addFileToMapAndResolveConflicts() : OldFile [" + jrw3.getName() + "] and TheFile [" + jrw2.getName() + "] are the Same, and with same GUID. Not Touching TheFile.");
                return;
            }
        }
        if (n2 >= 100 && n2 <= 1123) {
            return;
        }
        if (n2 >= 0 && n2 <= 99) {
            return;
        }
        if (n2 >= 15000 && n2 <= 49999 && !this.EUT.containsKey(ldv2)) {
            this.EUT.put(ldv2, jrw2);
            return;
        }
        if (n2 >= 2000 && n2 <= 2999 || n2 >= 15000 && n2 <= 49999 && this.EUT.containsKey(ldv2)) {
            n2 = 15000;
            ldv2 = this.afV(n2);
            if (this.EUT.containsKey(ldv2)) {
                ++this.EUU;
                lfn.b(0, this.getClass().getSimpleName(), "addFileToMapAndResolveConflicts() : Conflict for SFFile [" + jrw2 + "], GUID " + ldv2);
            }
            while (true) {
                if (!this.EUT.containsKey(ldv2)) {
                    this.EUT.put(ldv2, jrw2);
                    this.d(document, ldv2);
                    jsz.a(document, jrw2);
                    return;
                }
                ldv2 = this.afV(++n2);
            }
        }
        lfn.b(5, this.getClass().getName(), "addFileToMapAndResolveConflicts() : TheFile [" + jrw2 + "] has a MESSED UP GUID [" + n2 + "], so not writing new GUID for file");
    }

    private void d(Document document, ldv ldv2) {
        if (document != null) {
            Node node = jsy.a("ObjectSpaceGuid", document);
            if (node != null) {
                node = this.i(node);
                node.setNodeValue(Integer.toString(ldv2.enw()));
            } else {
                lfn.b(0, this.getClass().getName(), "No ObjectSpaceGuid node found.");
            }
        }
    }

    private Node i(Node node) {
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

    public void aq(jrw jrw2) {
        int n2;
        Document document = null;
        try {
            document = jsy.n(jrw2);
        }
        catch (bo bo2) {
            // empty catch block
        }
        if (document == null) {
            lfn.b(5, this.getClass().getName(), "Document Parse Error");
            return;
        }
        NodeList nodeList = document.getElementsByTagName("Guid");
        int n3 = 15000;
        for (n2 = 0; n2 < nodeList.getLength(); ++n2) {
            Node node = jry.i(nodeList.item(n2));
            if (node == null) {
                assert (false);
                return;
            }
            node.setNodeValue(Integer.toString(n3));
            ++n3;
        }
        n2 = nodeList.getLength();
        nodeList = document.getElementsByTagName("LocalID");
        for (int i = 0; i < nodeList.getLength(); ++i) {
            Node node = jry.i(nodeList.item(i));
            if (node == null) {
                assert (false);
                return;
            }
            node.setNodeValue(Integer.toString(n3));
            ++n3;
        }
        lfn.b(0, this.getClass().getSimpleName(), "reorganizeGuidsForObjectSpace() : Nr Of Guid Nodes = " + n2 + ", LocalIDs = " + nodeList.getLength());
        jsz.b(document, jrw2.getAbsolutePath());
    }
}

